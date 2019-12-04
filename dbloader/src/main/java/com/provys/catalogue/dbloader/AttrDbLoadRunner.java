package com.provys.catalogue.dbloader;

import com.provys.catalogue.api.Attr;
import com.provys.catalogue.api.AttrManager;
import com.provys.catalogue.api.AttrType;
import com.provys.catalogue.impl.AttrManagerImpl;
import com.provys.catalogue.impl.AttrProxy;
import com.provys.catalogue.impl.AttrValue;
import com.provys.provysdb.dbcontext.DbResultSet;
import com.provys.provysdb.dbcontext.DbRowMapper;
import com.provys.provysdb.dbsqlbuilder.DbSql;
import com.provys.provysobject.impl.ProvysObjectLoadRunner;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.math.BigInteger;
import java.util.List;
import java.util.Objects;
import com.provys.provysdb.sqlbuilder.Condition;

class AttrDbLoadRunner extends ProvysObjectLoadRunner<Attr, AttrValue, AttrProxy, AttrManagerImpl> {

    @Nonnull
    private final DbSql dbSql;
    @Nullable
    private final Condition condition;

    AttrDbLoadRunner(AttrManagerImpl manager, DbSql dbSql, @Nullable Condition condition) {
        super(manager);
        this.dbSql = Objects.requireNonNull(dbSql);
        this.condition = condition;
    }

    private class AttrDbMapper implements DbRowMapper<AttrValue> {

        @Override
        public AttrValue map(DbResultSet dbResultSet, long l) {
            return new AttrValue(
                    dbResultSet.getNonnullDtUid(1),
                    getManager().getRepository().getEntityManager().getOrAddById(dbResultSet.getNonnullDtUid(2)),
                    dbResultSet.getNonnullString(3),
                    dbResultSet.getNonnullString(4),
                    dbResultSet.getNullableString(5),
                    dbResultSet.getOptionalDtUid(6)
                            .map(attrGrpId -> getManager().getRepository().getAttrGrpManager().getById(attrGrpId))
                            .orElse(null),
                    dbResultSet.getNonnullInteger(7),
                    dbResultSet.getNullableString(8),
                    AttrType.valueOf(dbResultSet.getNonnullString(9)),
                    getManager().getRepository().getDomainManager().getOrAddById(dbResultSet.getNonnullDtUid(10)),
                    dbResultSet.getNullableString(11),
                    dbResultSet.getNonnullBoolean(12),
                    dbResultSet.getNullableString(13)
                    );
        }
    }

    @Nonnull
    @Override
    protected List<AttrValue> select() {
        return dbSql.select()
                .from("ker_attr_tb", AttrManager.TABLE_ALIAS)
                .column("attr_id", BigInteger.class)
                .column("entity_id", BigInteger.class)
                .column("name_nm", String.class)
                .column("name", String.class)
                .column("propernameroot", String.class)
                .column("attrgrp_id", BigInteger.class)
                .column("ord", Integer.class)
                .column("note", String.class)
                .column("attrtype", String.class)
                .column("domain_id", BigInteger.class)
                .column("subdomain_nm", String.class)
                .column("mandatory", Boolean.class)
                .column("defvalue", String.class)
                .where(condition)
                .prepare()
                .fetch(new AttrDbMapper());
    }
}
