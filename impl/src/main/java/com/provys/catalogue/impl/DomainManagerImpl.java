package com.provys.catalogue.impl;

import com.provys.catalogue.api.Domain;
import com.provys.catalogue.api.DomainManager;
import com.provys.provysobject.impl.ProvysNmObjectManagerImpl;

import javax.annotation.Nonnull;
import java.math.BigInteger;

public class DomainManagerImpl extends ProvysNmObjectManagerImpl<CatalogueRepositoryImpl, Domain, DomainValue,
        DomainProxy, DomainManagerImpl, DomainLoader> implements DomainManager {

    DomainManagerImpl(CatalogueRepositoryImpl repository, DomainLoader loader, int initialCapacity) {
        super(repository, loader, initialCapacity, 0);
    }

    @Nonnull
    @Override
    protected DomainManagerImpl self() {
        return this;
    }

    @Nonnull
    @Override
    protected DomainProxy getNewProxy(BigInteger id) {
        return new DomainProxy(this, id);
    }

    @Nonnull
    @Override
    public String getEntityNm() {
        return "DOMAIN";
    }
}