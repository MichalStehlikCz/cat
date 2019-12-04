package com.provys.catalogue.dbloader;

import com.provys.catalogue.api.EntityGrp;
import com.provys.catalogue.api.EntityGrpMeta;
import com.provys.catalogue.impl.EntityGrpManagerImpl;
import com.provys.catalogue.impl.EntityGrpProxy;
import com.provys.catalogue.impl.EntityGrpValue;
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

class EntityGrpDbLoadRunner extends ProvysObjectLoadRunner<EntityGrp, EntityGrpValue, EntityGrpProxy, EntityGrpManagerImpl> {

    @Nonnull
    private final DbSql dbSql;
    @Nullable
    private final Condition condition;

    EntityGrpDbLoadRunner(EntityGrpManagerImpl manager, DbSql dbSql, @Nullable Condition condition) {
        super(manager);
        this.dbSql = Objects.requireNonNull(dbSql);
        this.condition = condition;
    }

    private class EntityGrpDbMapper implements DbRowMapper<EntityGrpValue> {

        @Override
        public EntityGrpValue map(DbResultSet dbResultSet, long l) {
            return new EntityGrpValue(
                    dbResultSet.getNonnullDtUid(1),
                    dbResultSet.getNonnullString(2),
                    dbResultSet.getOptionalDtUid(3)
                            .map(parentId -> getManager().getOrAddById(parentId))
                            .orElse(null),
                    dbResultSet.getNonnullString(4),
                    dbResultSet.getNullableString(5),
                    dbResultSet.getNonnullInteger(6)
            );
        }
    }
    @Nonnull
    @Override
    protected List<EntityGrpValue> select() {
        return dbSql.select()
                .from(dbSql.name("ker_entitygrp_tb"), EntityGrpMeta.TABLE_ALIAS)
                .column("entitygrp_id", BigInteger.class)
                .column("name_nm", String.class)
                .column("parent_id", BigInteger.class)
                .column("name", String.class)
                .column("note", String.class)
                .column("ord", Integer.class)
                .where(condition)
                .prepare()
                .fetch(new EntityGrpDbMapper());
    }
}
