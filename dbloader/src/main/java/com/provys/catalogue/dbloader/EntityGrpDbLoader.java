package com.provys.catalogue.dbloader;

import com.provys.catalogue.dbloader.db.tables.records.KerEntitygrpTbRecord;
import com.provys.catalogue.impl.EntityGrpLoaderBase;
import com.provys.catalogue.impl.EntityGrpManagerImpl;
import com.provys.provysdb.dbcontext.ProvysDbContext;

import javax.annotation.Nonnull;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.math.BigInteger;
import java.util.Objects;

import static com.provys.catalogue.dbloader.db.Tables.KER_ENTITYGRP_TB;

@ApplicationScoped
public class EntityGrpDbLoader extends EntityGrpLoaderBase<KerEntitygrpTbRecord> {

    @Nonnull
    private final ProvysDbContext dbContext;

    @Inject
    EntityGrpDbLoader(ProvysDbContext dbContext) {
        this.dbContext = Objects.requireNonNull(dbContext);
    }

    @Nonnull
    @Override
    protected EntityGrpDbLoadRunner getLoadRunnerByParentId(EntityGrpManagerImpl manager, BigInteger parentId) {
        return new EntityGrpDbLoadRunner(manager, dbContext, KER_ENTITYGRP_TB.PARENT_ID.eq(parentId));
    }

    @Nonnull
    @Override
    protected EntityGrpDbLoadRunner getLoadRunnerByNameNm(EntityGrpManagerImpl manager, String nameNm) {
        return new EntityGrpDbLoadRunner(manager, dbContext, KER_ENTITYGRP_TB.NAME_NM.eq(nameNm));
    }

    @Nonnull
    @Override
    protected EntityGrpDbLoadRunner getLoadRunnerById(EntityGrpManagerImpl manager, BigInteger id) {
        return new EntityGrpDbLoadRunner(manager, dbContext, KER_ENTITYGRP_TB.ENTITYGRP_ID.eq(id));
    }

    @Nonnull
    @Override
    protected EntityGrpDbLoadRunner getLoadRunnerAll(EntityGrpManagerImpl manager) {
        return new EntityGrpDbLoadRunner(manager, dbContext, null);
    }

}
