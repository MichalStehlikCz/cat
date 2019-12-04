package com.provys.catalogue.dbloader;

import com.provys.catalogue.api.EntityMeta;
import com.provys.catalogue.impl.EntityLoaderBase;
import com.provys.catalogue.impl.EntityManagerImpl;
import com.provys.provysdb.dbsqlbuilder.DbSql;
import com.provys.provysdb.dbsqlbuilder.SqlAdmin;

import javax.annotation.Nonnull;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.math.BigInteger;
import java.util.Objects;

@ApplicationScoped
public class EntityDbLoader extends EntityLoaderBase {

    @Nonnull
    private final DbSql dbSql;

    @Inject
    EntityDbLoader(SqlAdmin dbSql) {
        this.dbSql = Objects.requireNonNull(dbSql);
    }

    @Nonnull
    @Override
    protected EntityDbLoadRunner getLoadRunnerByEntityGrpId(EntityManagerImpl manager, BigInteger entityGrpId) {
        return new EntityDbLoadRunner(manager, dbSql,
                dbSql.eq(EntityMeta.ENTITYGRP_ID, dbSql.bind("entitygrp_id", entityGrpId)));
    }

    @Nonnull
    @Override
    protected EntityDbLoadRunner getLoadRunnerByNameNm(EntityManagerImpl manager, String nameNm) {
        return new EntityDbLoadRunner(manager, dbSql, dbSql.eq(EntityMeta.NAME_NM, dbSql.bind("name_nm", nameNm)));
    }

    @Nonnull
    @Override
    protected EntityDbLoadRunner getLoadRunnerById(EntityManagerImpl manager, BigInteger id) {
        return new EntityDbLoadRunner(manager, dbSql, dbSql.eq(EntityMeta.ENTITY_ID, dbSql.bind("entity_id", id)));
    }

    @Nonnull
    @Override
    protected EntityDbLoadRunner getLoadRunnerAll(EntityManagerImpl manager) {
        return new EntityDbLoadRunner(manager, dbSql, null);
    }

}