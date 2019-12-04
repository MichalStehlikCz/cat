package com.provys.catalogue.impl;

import com.provys.catalogue.api.AttrGrp;
import com.provys.provysobject.impl.ProvysObjectLoadRunner;
import com.provys.provysobject.impl.ProvysObjectLoaderImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;
import java.math.BigInteger;
import java.util.Collection;

public abstract class AttrGrpLoaderBase
        extends ProvysObjectLoaderImpl<AttrGrp, AttrGrpValue, AttrGrpProxy, AttrGrpManagerImpl>
        implements AttrGrpLoader  {

    private static final Logger LOG = LogManager.getLogger(AttrLoaderBase.class);

    @SuppressWarnings("WeakerAccess") // method overridden in loaders in other packages
    @Nonnull
    protected abstract ProvysObjectLoadRunner<AttrGrp, AttrGrpValue, AttrGrpProxy, AttrGrpManagerImpl>
    getLoadRunnerByEntityId(AttrGrpManagerImpl manager, BigInteger entityId);

    @Override
    public Collection<AttrGrpProxy> loadByEntityId(AttrGrpManagerImpl manager, BigInteger entityId) {
        LOG.info("Load ATTRGRP by entity Id {}", entityId);
        return getLoadRunnerByEntityId(manager, entityId).run();
    }
}