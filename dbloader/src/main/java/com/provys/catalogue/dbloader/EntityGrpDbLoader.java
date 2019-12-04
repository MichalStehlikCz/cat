package com.provys.catalogue.dbloader;

import com.provys.catalogue.api.EntityGrpMeta;
import com.provys.catalogue.impl.EntityGrpLoaderBase;
import com.provys.catalogue.impl.EntityGrpManagerImpl;
import com.provys.provysdb.dbsqlbuilder.DbSql;
import com.provys.provysdb.dbsqlbuilder.SqlAdmin;

import javax.annotation.Nonnull;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.math.BigInteger;
import java.util.Objects;

@ApplicationScoped
public class EntityGrpDbLoader extends EntityGrpLoaderBase {

    @Nonnull
    private final DbSql dbSql;

    @Inject
    EntityGrpDbLoader(SqlAdmin dbSql) {
        this.dbSql = Objects.requireNonNull(dbSql);
    }

    @Nonnull
    @Override
    protected EntityGrpDbLoadRunner getLoadRunnerByParentId(EntityGrpManagerImpl manager, BigInteger parentId) {
        return new EntityGrpDbLoadRunner(manager, dbSql,
                dbSql.eq(EntityGrpMeta.PARENT_ID, dbSql.bind("parent_id", parentId)));
    }

    @Nonnull
    @Override
    protected EntityGrpDbLoadRunner getLoadRunnerByNameNm(EntityGrpManagerImpl manager, String nameNm) {
        return new EntityGrpDbLoadRunner(manager, dbSql,
                dbSql.eq(EntityGrpMeta.NAME_NM, dbSql.bind("name_nm", nameNm)));
    }

    @Nonnull
    @Override
    protected EntityGrpDbLoadRunner getLoadRunnerById(EntityGrpManagerImpl manager, BigInteger id) {
        return new EntityGrpDbLoadRunner(manager, dbSql,
                dbSql.eq(EntityGrpMeta.ENTITYGRP_ID, dbSql.bind("entitygrp_id", id)));
    }

    @Nonnull
    @Override
    protected EntityGrpDbLoadRunner getLoadRunnerAll(EntityGrpManagerImpl manager) {
        return new EntityGrpDbLoadRunner(manager, dbSql, null);
    }
}
