package com.provys.catalogue.impl;

import com.provys.catalogue.api.Attr;
import com.provys.catalogue.api.AttrManager;
import com.provys.provysobject.impl.ProvysObjectManagerImpl;

import javax.annotation.Nonnull;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Optional;

public class AttrManagerImpl extends ProvysObjectManagerImpl<CatalogueRepositoryImpl, Attr, AttrValue, AttrProxy,
        AttrManagerImpl, AttrLoader> implements AttrManager {

    AttrManagerImpl(CatalogueRepositoryImpl repository, AttrLoader loader, int initialCapacity) {
        super(repository, loader, initialCapacity);
    }

    @Nonnull
    @Override
    public Collection<Attr> getByEntityId(BigInteger entityId) {
        return null;
    }

    @Nonnull
    @Override
    public Attr getByEntityIdNameNm(BigInteger entityId, String nameNm) {
        return null;
    }

    @Nonnull
    @Override
    public Optional<Attr> getByEntityIdNameNmIfExists(BigInteger entityId, String nameNm) {
        return Optional.empty();
    }

    @Nonnull
    @Override
    protected AttrManagerImpl self() {
        return null;
    }

    @Nonnull
    @Override
    protected AttrProxy getNewProxy(BigInteger bigInteger) {
        return null;
    }

    @Nonnull
    @Override
    public String getEntityNm() {
        return null;
    }
}
