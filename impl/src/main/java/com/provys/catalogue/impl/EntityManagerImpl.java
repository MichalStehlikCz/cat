package com.provys.catalogue.impl;

import com.provys.catalogue.api.Entity;
import com.provys.catalogue.api.EntityManager;
import com.provys.provysobject.impl.ProvysNmObjectManagerImpl;

import javax.annotation.Nonnull;
import java.math.BigInteger;

public class EntityManagerImpl extends ProvysNmObjectManagerImpl<CatalogueRepositoryImpl, EntityValue, Entity,
        EntityManagerImpl, EntityLoader> implements EntityManager {

    public EntityManagerImpl(CatalogueRepositoryImpl repository, EntityLoader loader, int initialCapacity) {
        super(repository, loader, initialCapacity);
    }

    @Nonnull
    @Override
    protected EntityManagerImpl self() {
        return this;
    }

    @Nonnull
    @Override
    public String getEntityNm() {
        return "ENTITY";
    }

    @Override
    protected Entity getNewProxy(BigInteger id) {
        return new EntityProxy(this, id);
    }
}
