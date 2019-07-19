package com.provys.catalogue.dbloader;

import com.provys.catalogue.dbloader.db.tables.records.KerAttrTbRecord;
import com.provys.catalogue.impl.*;
import com.provys.provysdb.ProvysDbContext;

import javax.annotation.Nonnull;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.math.BigInteger;
import java.util.Objects;

import static com.provys.catalogue.dbloader.db.Tables.KER_ATTR_TB;

@ApplicationScoped
public class AttrDbLoader extends AttrLoaderBase<KerAttrTbRecord> {

    @Nonnull
    private final ProvysDbContext dbContext;

    @Inject
    AttrDbLoader(ProvysDbContext dbContext) {
        this.dbContext = Objects.requireNonNull(dbContext);
    }

    @Nonnull
    @Override
    protected AttrDbLoadRunner getLoadRunnerByEntityId(AttrManagerImpl attrManager, BigInteger entityId) {
        return new AttrDbLoadRunner(attrManager, dbContext, KER_ATTR_TB.ENTITY_ID.eq(entityId));
    }

    @Nonnull
    @Override
    protected AttrDbLoadRunner getLoadRunnerByAttrGrpId(AttrManagerImpl attrManager, BigInteger attrGrpId) {
        return new AttrDbLoadRunner(attrManager, dbContext, KER_ATTR_TB.ATTRGRP_ID.eq(attrGrpId));
    }

    @Nonnull
    @Override
    protected AttrDbLoadRunner getLoadRunnerById(AttrManagerImpl attrManager, BigInteger id) {
        return new AttrDbLoadRunner(attrManager, dbContext, KER_ATTR_TB.ATTR_ID.eq(id));
    }

    @Nonnull
    @Override
    protected AttrDbLoadRunner getLoadRunnerAll(AttrManagerImpl attrManager) {
        return new AttrDbLoadRunner(attrManager, dbContext, null);
    }
}
