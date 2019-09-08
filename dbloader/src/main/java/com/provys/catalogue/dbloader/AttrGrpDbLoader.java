package com.provys.catalogue.dbloader;

import com.provys.catalogue.dbloader.db.tables.records.KerAttrgrpTbRecord;
import com.provys.catalogue.impl.AttrGrpLoaderBase;
import com.provys.catalogue.impl.AttrGrpManagerImpl;
import com.provys.provysdb.dbcontext.ProvysDbContext;

import javax.annotation.Nonnull;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.math.BigInteger;
import java.util.Objects;

import static com.provys.catalogue.dbloader.db.Tables.KER_ATTRGRP_TB;

@ApplicationScoped
public class AttrGrpDbLoader extends AttrGrpLoaderBase<KerAttrgrpTbRecord> {

    @Nonnull
    private final ProvysDbContext dbContext;

    @Inject
    AttrGrpDbLoader(ProvysDbContext dbContext) {
        this.dbContext = Objects.requireNonNull(dbContext);
    }

    @Nonnull
    @Override
    protected AttrGrpDbLoadRunner getLoadRunnerByEntityId(AttrGrpManagerImpl attrGrpManager, BigInteger entityId) {
        return new AttrGrpDbLoadRunner(attrGrpManager, dbContext, KER_ATTRGRP_TB.ENTITY_ID.eq(entityId));
    }

    @Nonnull
    @Override
    protected AttrGrpDbLoadRunner getLoadRunnerById(AttrGrpManagerImpl attrGrpManager, BigInteger id) {
        return new AttrGrpDbLoadRunner(attrGrpManager, dbContext, KER_ATTRGRP_TB.ATTRGRP_ID.eq(id));
    }

    @Nonnull
    @Override
    protected AttrGrpDbLoadRunner getLoadRunnerAll(AttrGrpManagerImpl attrGrpManager) {
        return new AttrGrpDbLoadRunner(attrGrpManager, dbContext, null);
    }
}
