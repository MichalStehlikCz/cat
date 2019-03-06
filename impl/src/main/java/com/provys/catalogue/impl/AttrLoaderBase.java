package com.provys.catalogue.impl;

import com.provys.catalogue.api.Attr;
import com.provys.provysobject.impl.ProvysObjectLoadRunner;
import com.provys.provysobject.impl.ProvysObjectLoaderImpl;

import javax.annotation.Nonnull;
import java.math.BigInteger;
import java.util.Collection;

public abstract class AttrLoaderBase<S> extends ProvysObjectLoaderImpl<Attr, AttrValue, AttrProxy, AttrManagerImpl, S>
        implements AttrLoader  {

    @SuppressWarnings("WeakerAccess") // method overridden in loaders in other packages
    @Nonnull
    protected abstract ProvysObjectLoadRunner<Attr, AttrValue, AttrProxy, AttrManagerImpl, S>
    getLoadRunnerByEntityId(AttrManagerImpl manager, BigInteger entityId);

    @Override
    public Collection<AttrProxy> loadByEntityId(AttrManagerImpl manager, BigInteger entityId) {
        return getLoadRunnerByEntityId(manager, entityId).run();
    }
}
