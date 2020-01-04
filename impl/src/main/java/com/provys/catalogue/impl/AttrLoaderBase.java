package com.provys.catalogue.impl;

import com.provys.catalogue.api.Attr;
import com.provys.common.datatype.DtUid;
import com.provys.provysobject.impl.ProvysObjectLoadRunner;
import com.provys.provysobject.impl.ProvysObjectLoaderImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;
import java.util.Collection;

public abstract class AttrLoaderBase extends ProvysObjectLoaderImpl<Attr, GenAttrValue, AttrProxy, AttrManagerImpl> implements AttrLoader {

    private static final Logger LOG = LogManager.getLogger(AttrLoaderBase.class);

    @SuppressWarnings("WeakerAccess") // method overridden in loaders in other packages
    @Nonnull
    protected abstract ProvysObjectLoadRunner<Attr, GenAttrValue, AttrProxy, AttrManagerImpl>
    getLoadRunnerByEntityId(AttrManagerImpl manager, DtUid entityId);

    @Override
    public Collection<AttrProxy> loadByEntityId(AttrManagerImpl manager, DtUid entityId) {
        LOG.info("Load ATTR by entity Id {}", entityId);
        return getLoadRunnerByEntityId(manager, entityId).run();
    }

    @SuppressWarnings("WeakerAccess") // method overridden in loaders in other packages
    @Nonnull
    protected abstract ProvysObjectLoadRunner<Attr, GenAttrValue, AttrProxy, AttrManagerImpl>
    getLoadRunnerByAttrGrpId(AttrManagerImpl manager, DtUid attrGrpId);

    @Override
    public Collection<AttrProxy> loadByAttrGrpId(AttrManagerImpl manager, DtUid attrGrpId) {
        LOG.info("Load ATTR by attribute group Id {}", attrGrpId);
        return getLoadRunnerByAttrGrpId(manager, attrGrpId).run();
    }
}
