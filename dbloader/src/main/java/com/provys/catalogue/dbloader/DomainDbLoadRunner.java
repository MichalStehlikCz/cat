package com.provys.catalogue.dbloader;

import com.provys.catalogue.api.Domain;
import com.provys.catalogue.api.DomainManager;
import com.provys.catalogue.api.DomainMeta;
import com.provys.catalogue.impl.DomainManagerImpl;
import com.provys.catalogue.impl.DomainProxy;
import com.provys.catalogue.impl.gen.DomainValue;
import com.provys.provysdb.dbcontext.DbResultSet;
import com.provys.provysdb.dbcontext.DbRowMapper;
import com.provys.provysdb.dbsqlbuilder.DbSql;
import com.provys.provysdb.sqlbuilder.Condition;
import com.provys.provysobject.impl.ProvysObjectLoadRunner;

import java.math.BigInteger;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

class DomainDbLoadRunner extends ProvysObjectLoadRunner<Domain, DomainValue, DomainProxy, DomainManagerImpl> {

    private static final DomainDbMapper MAPPER = new DomainDbMapper();

    @Nonnull
    private final DbSql dbSql;

    @Nullable
    private final Condition condition;

    DomainDbLoadRunner(DomainManagerImpl manager, DbSql dbSql, @Nullable Condition condition) {
        super(manager);
        this.dbSql = Objects.requireNonNull(dbSql);
        this.condition = condition;
    }

    private static class DomainDbMapper implements DbRowMapper<DomainValue> {

        @Override
        public DomainValue map(DbResultSet dbResultSet, long l) {
            return new DomainValue(
                    dbResultSet.getNonnullDtUid(1),
                    dbResultSet.getNonnullString(2),
                    dbResultSet.getNonnullString(3),
                    dbResultSet.getNullableString(4),
                    dbResultSet.getNullableInteger(5),
                    dbResultSet.getNullableInteger(6),
                    dbResultSet.getNullableString(7),
                    dbResultSet.getNonnullBoolean(8),
                    dbResultSet.getNonnullBoolean(9),
                    dbResultSet.getNonnullBoolean(10),
                    dbResultSet.getNullableString(11),
                    dbResultSet.getNullableString(12),
                    dbResultSet.getNonnullBoolean(13)
            );
        }
    }

    @Nonnull
    @Override
    protected List<DomainValue> select() {
        return dbSql.select()
                .from(dbSql.name("ker_domain_tb"), DomainMeta.TABLE_ALIAS)
                .column("domain_id", BigInteger.class)
                .column("name_nm", String.class)
                .column("name", String.class)
                .column("datatype_nm", String.class)
                .column("datalength", Integer.class)
                .column("dataprecision", Integer.class)
                .column("note", String.class)
                .column("allowed", Boolean.class)
                .column("qvisible", Boolean.class)
                .column("lvisible", Boolean.class)
                .column("validate_cd", String.class)
                .column("lformat_cd", String.class)
                .column("natorder", Boolean.class)
                .where(condition)
                .prepare()
                .fetch(MAPPER);
    }
}