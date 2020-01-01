package com.provys.catalogue.dbloader;

import com.provys.catalogue.api.Domain;
import com.provys.catalogue.api.DomainMeta;
import com.provys.catalogue.impl.DomainManagerImpl;
import com.provys.catalogue.impl.DomainProxy;
import com.provys.catalogue.impl.GenDomainValue;
import com.provys.catalogue.impl.GenDomainValueBuilder;
import com.provys.provysdb.dbcontext.DbResultSet;
import com.provys.provysdb.dbcontext.DbRowMapper;
import com.provys.provysdb.dbsqlbuilder.DbSql;
import com.provys.provysdb.sqlbuilder.Condition;
import com.provys.provysobject.impl.ProvysObjectLoadRunner;
import java.lang.Override;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

class DomainDbLoadRunner extends ProvysObjectLoadRunner<Domain, GenDomainValue, DomainProxy, DomainManagerImpl> {
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

    @Nonnull
    @Override
    protected List<GenDomainValue> select() {
        return dbSql.select()
                .from(DomainMeta.FROM_CLAUSE)
                .column(DomainMeta.COL_DOMAIN_ID)
                .column(DomainMeta.COL_NAME_NM)
                .column(DomainMeta.COL_NAME)
                .column(DomainMeta.COL_DATATYPE_NM)
                .column(DomainMeta.COL_DATALENGTH)
                .column(DomainMeta.COL_DATAPRECISION)
                .column(DomainMeta.COL_NOTE)
                .column(DomainMeta.COL_ALLOWED)
                .column(DomainMeta.COL_QVISIBLE)
                .column(DomainMeta.COL_LVISIBLE)
                .column(DomainMeta.COL_VALIDATE_CD)
                .column(DomainMeta.COL_LFORMAT_CD)
                .column(DomainMeta.COL_NATORDER)
                .where(condition)
                .prepare()
                .fetch(MAPPER);
    }

    private static class DomainDbMapper implements DbRowMapper<GenDomainValue> {
        public GenDomainValue map(DbResultSet dbResultSet, long line) {
            return new GenDomainValueBuilder()
                    .setId(dbResultSet.getNonnullDtUid(1))
                    .setNameNm(dbResultSet.getNonnullString(2))
                    .setName(dbResultSet.getNonnullString(3))
                    .setDataTypeNm(dbResultSet.getNullableString(4))
                    .setDataLength(dbResultSet.getNullableInteger(5))
                    .setDataPrecision(dbResultSet.getNullableInteger(6))
                    .setNote(dbResultSet.getNullableString(7))
                    .setAllowed(dbResultSet.getNonnullBoolean(8))
                    .setqVisible(dbResultSet.getNonnullBoolean(9))
                    .setlVisible(dbResultSet.getNonnullBoolean(10))
                    .setValidateCd(dbResultSet.getNullableString(11))
                    .setlFormatCd(dbResultSet.getNullableString(12))
                    .setNatOrder(dbResultSet.getNonnullBoolean(13))
                    .build();
        }
    }
}