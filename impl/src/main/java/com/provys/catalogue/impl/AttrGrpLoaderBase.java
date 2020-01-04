package com.provys.catalogue.impl;

import com.provys.catalogue.api.AttrGrp;
import com.provys.common.datatype.DtUid;
import com.provys.provysobject.impl.ProvysObjectLoadRunner;
import com.provys.provysobject.impl.ProvysObjectLoaderImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;
import java.util.Collection;

public abstract class AttrGrpLoaderBase extends ProvysObjectLoaderImpl<AttrGrp, GenAttrGrpValue, AttrGrpProxy, AttrGrpManagerImpl> implements AttrGrpLoader {

    private static final Logger LOG = LogManager.getLogger(AttrLoaderBase.class);

    @SuppressWarnings("WeakerAccess") // method overridden in loaders in other packages
    @Nonnull
    protected abstract ProvysObjectLoadRunner<AttrGrp, GenAttrGrpValue, AttrGrpProxy, AttrGrpManagerImpl>
    getLoadRunnerByEntityId(AttrGrpManagerImpl manager, DtUid entityId);

    @Override
    public Collection<AttrGrpProxy> loadByEntityId(AttrGrpManagerImpl manager, DtUid entityId) {
        LOG.info("Load ATTRGRP by entity Id {}", entityId);
        return getLoadRunnerByEntityId(manager, entityId).run();
    }
}