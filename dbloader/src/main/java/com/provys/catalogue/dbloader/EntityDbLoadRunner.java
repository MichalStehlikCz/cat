package com.provys.catalogue.dbloader;

import com.provys.catalogue.api.*;
import com.provys.catalogue.impl.EntityManagerImpl;
import com.provys.catalogue.impl.EntityProxy;
import com.provys.catalogue.impl.EntityValue;
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

class EntityDbLoadRunner extends ProvysObjectLoadRunner<Entity, EntityValue, EntityProxy, EntityManagerImpl> {

    @Nonnull
    private final DbSql dbSql;
    @Nullable
    private final Condition condition;

    EntityDbLoadRunner(EntityManagerImpl manager, DbSql dbSql, @Nullable Condition condition) {
        super(manager);
        this.dbSql = Objects.requireNonNull(dbSql);
        this.condition = condition;
    }

    private class EntityDbMapper implements DbRowMapper<EntityValue> {

        @Override
        public EntityValue map(DbResultSet dbResultSet, long l) {
            return new EntityValue(
                    dbResultSet.getNonnullDtUid(1),
                    dbResultSet.getNonnullString(2),
                    dbResultSet.getNonnullString(3),
                    dbResultSet.getNonnullBoolean(4),
                    dbResultSet.getNonnullBoolean(5),
                    dbResultSet.getNonnullBoolean(6),
                    dbResultSet.getNullableString(7),
                    dbResultSet.getNullableString(8),
                    dbResultSet.getNullableString(9),
                    dbResultSet.getNullableString(10),
                    dbResultSet.getNullableString(11),
                    dbResultSet.getNullableString(12),
                    dbResultSet.getOptionalDtUid(13)
                            .map(ancestorId -> getManager().getOrAddById(ancestorId))
                            .orElse(null),
                    dbResultSet.getOptionalDtUid(14)
                            .map(entityGrpId -> getManager().getRepository().getEntityGrpManager().getOrAddById(entityGrpId))
                            .orElse(null),
                    dbResultSet.getNullableString(15),
                    dbResultSet.getNullableString(16),
                    dbResultSet.getNullableString(17),
                    dbResultSet.getNullableString(18),
                    dbResultSet.getNullableString(19),
                    dbResultSet.getNullableString(20)
            );
        }
    }

    @Nonnull
    @Override
    protected List<EntityValue> select() {
        return dbSql.select()
                .from(dbSql.name("ker_entity_tb"), EntityMeta.TABLE_ALIAS)
                .column("entity_id", BigInteger.class)
                .column("name_nm", String.class)
                .column("name", String.class)
                .column("iscustom", Boolean.class)
                .column("isused", Boolean.class)
                .column("objectclass", Boolean.class)
                .column("table_nm", String.class)
                .column("view_nm", String.class)
                .column("pgpackage_nm", String.class)
                .column("cppackage_nm", String.class)
                .column("eppackage_nm", String.class)
                .column("fppackage_nm", String.class)
                .column("ancestor_id", BigInteger.class)
                .column("entitygrp_id", BigInteger.class)
                .column("note", String.class)
                .column("customnote", String.class)
                .column("structuredoc", String.class)
                .column("usagedoc", String.class)
                .column("behaviourdoc", String.class)
                .column("impldoc", String.class)
                .where(condition)
                .prepare()
                .fetch(new EntityDbMapper());
    }
}