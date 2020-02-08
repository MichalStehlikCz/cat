package com.provys.catalogue.dbloader;

import com.provys.catalogue.EntityGrp;
import com.provys.catalogue.EntityGrpMeta;
import com.provys.catalogue.impl.EntityGrpManagerImpl;
import com.provys.catalogue.impl.EntityGrpProxy;
import com.provys.catalogue.impl.GenEntityGrpValue;
import com.provys.catalogue.impl.GenEntityGrpValueBuilder;
import com.provys.provysdb.dbcontext.DbResultSet;
import com.provys.provysdb.dbcontext.DbRowMapper;
import com.provys.provysdb.dbsqlbuilder.DbSql;
import com.provys.provysdb.sqlbuilder.Condition;
import com.provys.provysobject.impl.ProvysObjectLoadRunner;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

class EntityGrpDbLoadRunner extends ProvysObjectLoadRunner<EntityGrp, GenEntityGrpValue, EntityGrpProxy, EntityGrpManagerImpl> {
    private static final EntityGrpDbMapper MAPPER = new EntityGrpDbMapper();

    @Nonnull
    private final DbSql dbSql;

    @Nullable
    private final Condition condition;

    EntityGrpDbLoadRunner(EntityGrpManagerImpl manager, DbSql dbSql,
            @Nullable Condition condition) {
        super(manager);
        this.dbSql = Objects.requireNonNull(dbSql);
        this.condition = condition;
    }

    @Nonnull
    @Override
    protected List<GenEntityGrpValue> select() {
        return dbSql.select()
                .from(EntityGrpMeta.FROM_CLAUSE)
                .column(EntityGrpMeta.COL_ENTITYGRP_ID)
                .column(EntityGrpMeta.COL_PARENT_ID)
                .column(EntityGrpMeta.COL_NAME_NM)
                .column(EntityGrpMeta.COL_NAME)
                .column(EntityGrpMeta.COL_NOTE)
                .column(EntityGrpMeta.COL_ORD)
                .where(condition)
                .prepare()
                .fetch(MAPPER);
    }

    private static class EntityGrpDbMapper implements DbRowMapper<GenEntityGrpValue> {
        public GenEntityGrpValue map(DbResultSet dbResultSet, long line) {
            return new GenEntityGrpValueBuilder()
                .setId(dbResultSet.getNonnullDtUid(1))
                .setParentId(dbResultSet.getNullableDtUid(2))
                .setNameNm(dbResultSet.getNonnullString(3))
                .setName(dbResultSet.getNonnullString(4))
                .setNote(dbResultSet.getNullableString(5))
                .setOrd(dbResultSet.getNonnullInteger(6))
                .build();
        }
    }
}
