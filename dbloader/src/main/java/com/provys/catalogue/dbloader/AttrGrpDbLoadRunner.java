package com.provys.catalogue.dbloader;

import com.provys.catalogue.api.AttrGrp;
import com.provys.catalogue.api.AttrGrpMeta;
import com.provys.catalogue.impl.*;
import com.provys.provysdb.dbcontext.DbResultSet;
import com.provys.provysdb.dbcontext.DbRowMapper;
import com.provys.provysdb.dbsqlbuilder.DbSql;
import com.provys.provysdb.sqlbuilder.Condition;
import com.provys.provysobject.impl.ProvysObjectLoadRunner;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.math.BigInteger;
import java.util.List;
import java.util.Objects;

class AttrGrpDbLoadRunner extends ProvysObjectLoadRunner<AttrGrp, AttrGrpValue, AttrGrpProxy, AttrGrpManagerImpl> {

    @Nonnull
    private final DbSql dbSql;
    @Nullable
    private final Condition condition;

    AttrGrpDbLoadRunner(AttrGrpManagerImpl manager, DbSql dbSql, @Nullable Condition condition) {
        super(manager);
        this.dbSql = Objects.requireNonNull(dbSql);
        this.condition = condition;
    }

    private class AttrGrpDbMapper implements DbRowMapper<AttrGrpValue> {
        @Override
        public AttrGrpValue map(DbResultSet dbResultSet, long l) {
            return new AttrGrpValue(
                    dbResultSet.getNonnullDtUid(1),
                    getManager().getRepository().getEntityManager().getOrAddById(dbResultSet.getNonnullDtUid(2)),
                    dbResultSet.getNonnullString(3),
                    dbResultSet.getNonnullString(4),
                    dbResultSet.getNonnullInteger(5),
                    dbResultSet.getNullableString(6)
            );
        }
    }

    @Nonnull
    @Override
    protected List<AttrGrpValue> select() {
        return dbSql.select()
                .from(dbSql.name("ker_attrgrp_tb"), AttrGrpMeta.TABLE_ALIAS)
                .column("attrgrp_id", BigInteger.class)
                .column("entity_id", BigInteger.class)
                .column("name_nm", String.class)
                .column("name", String.class)
                .column("ord", Integer.class)
                .column("note", String.class)
                .where(condition)
                .prepare()
                .fetch(new AttrGrpDbMapper());
    }
}
