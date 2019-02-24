package com.provys.catalogue.impl;

import com.provys.catalogue.api.CatalogueRepository;
import com.provys.catalogue.api.Entity;
import com.provys.catalogue.api.EntityGrpManager;
import com.provys.catalogue.api.EntityManager;
import com.provys.provysobject.ProvysObject;
import com.provys.provysobject.ProvysObjectManager;
import com.provys.provysobject.impl.ProvysRepositoryImpl;

import javax.annotation.Nonnull;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CatalogueRepositoryImpl extends ProvysRepositoryImpl implements CatalogueRepository {

    @Nonnull
    private final EntityGrpManagerImpl entityGrpManager;
    @Nonnull
    private final EntityManagerImpl entityManager;

    @SuppressWarnings("CdiUnproxyableBeanTypesInspection")
    @Inject
    CatRepositoryImpl(EntityGrpLoader entityGrpLoader, EntityLoader entityLoader) {
        this.entityGrpManager = new EntityGrpManagerImpl(this, Objects.requireNonNull(entityGrpLoader));
        this.entityManager = new EntityManagerImpl(this, entityLoader, 20);
    }

    @Nonnull
    @Override
    public EntityGrpManagerImpl getEntityGrpManager() {
        return entityGrpManager;
    }

    @Nonnull
    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public <T extends ProvysObject> ProvysObjectManager<T> getManager(Class<T> forClass) {
        if (forClass.equals(Entity.class)) {
            return entityManager;
        }
        return null;
    }
}
