package com.provys.catalogue.dbloader;

import com.provys.catalogue.dbloader.db.tables.records.KerEntityTbRecord;
import com.provys.catalogue.impl.EntityLoaderBase;
import com.provys.catalogue.impl.EntityManagerImpl;
import com.provys.provysdb.dbcontext.ProvysDbContext;

import javax.annotation.Nonnull;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.math.BigInteger;
import java.util.Objects;

import static com.provys.catalogue.dbloader.db.Tables.KER_ENTITY_TB;

@ApplicationScoped
public class EntityDbLoader extends EntityLoaderBase<KerEntityTbRecord> {

    @Nonnull
    private final ProvysDbContext dbContext;

    @Inject
    EntityDbLoader(ProvysDbContext dbContext) {
        this.dbContext = Objects.requireNonNull(dbContext);
    }

    @Nonnull
    @Override
    protected EntityDbLoadRunner getLoadRunnerByEntityGrpId(EntityManagerImpl manager, BigInteger entityGrpId) {
        return new EntityDbLoadRunner(manager, dbContext, KER_ENTITY_TB.ENTITYGRP_ID.eq(entityGrpId));
    }

    @Nonnull
    @Override
    protected EntityDbLoadRunner getLoadRunnerByNameNm(EntityManagerImpl manager, String nameNm) {
        return new EntityDbLoadRunner(manager, dbContext, KER_ENTITY_TB.NAME_NM.eq(nameNm));
    }

    @Nonnull
    @Override
    protected EntityDbLoadRunner getLoadRunnerById(EntityManagerImpl manager, BigInteger id) {
        return new EntityDbLoadRunner(manager, dbContext, KER_ENTITY_TB.ENTITYGRP_ID.eq(id));
    }

    @Nonnull
    @Override
    protected EntityDbLoadRunner getLoadRunnerAll(EntityManagerImpl manager) {
        return new EntityDbLoadRunner(manager, dbContext, null);
    }

}