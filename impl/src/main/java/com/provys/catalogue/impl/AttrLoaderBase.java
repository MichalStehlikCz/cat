package com.provys.catalogue.impl;

import com.provys.catalogue.api.Attr;
import com.provys.provysobject.impl.ProvysObjectLoadRunner;
import com.provys.provysobject.impl.ProvysObjectLoaderImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;
import java.math.BigInteger;
import java.util.Collection;

public abstract class AttrLoaderBase extends ProvysObjectLoaderImpl<Attr, AttrValue, AttrProxy, AttrManagerImpl>
        implements AttrLoader  {

    private static final Logger LOG = LogManager.getLogger(AttrLoaderBase.class);

    @SuppressWarnings("WeakerAccess") // method overridden in loaders in other packages
    @Nonnull
    protected abstract ProvysObjectLoadRunner<Attr, AttrValue, AttrProxy, AttrManagerImpl>
    getLoadRunnerByEntityId(AttrManagerImpl manager, BigInteger entityId);

    @Override
    public Collection<AttrProxy> loadByEntityId(AttrManagerImpl manager, BigInteger entityId) {
        LOG.info("Load ATTR by entity Id {}", entityId);
        return getLoadRunnerByEntityId(manager, entityId).run();
    }

    @SuppressWarnings("WeakerAccess") // method overridden in loaders in other packages
    @Nonnull
    protected abstract ProvysObjectLoadRunner<Attr, AttrValue, AttrProxy, AttrManagerImpl>
    getLoadRunnerByAttrGrpId(AttrManagerImpl manager, BigInteger attrGrpId);

    @Override
    public Collection<AttrProxy> loadByAttrGrpId(AttrManagerImpl manager, BigInteger attrGrpId) {
        LOG.info("Load ATTR by attribute group Id {}", attrGrpId);
        return getLoadRunnerByAttrGrpId(manager, attrGrpId).run();
    }
}
