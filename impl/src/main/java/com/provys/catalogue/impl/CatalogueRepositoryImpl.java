package com.provys.catalogue.impl;

import com.provys.catalogue.api.AttrManager;
import com.provys.catalogue.api.CatalogueRepository;
import com.provys.catalogue.api.DomainManager;
import com.provys.catalogue.api.EntityManager;

import javax.annotation.Nonnull;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Objects;

@ApplicationScoped
public class CatalogueRepositoryImpl implements CatalogueRepository {

    @Nonnull
    private final EntityGrpManagerImpl entityGrpManager;
    @Nonnull
    private final EntityManagerImpl entityManager;
    @Nonnull
    private final AttrManagerImpl attrManager;
    @Nonnull
    private final DomainManagerImpl domainManager;

    @SuppressWarnings({"CdiUnproxyableBeanTypesInspection", "CdiInjectionPointsInspection"})
    @Inject
    CatalogueRepositoryImpl(EntityGrpLoader entityGrpLoader, EntityLoader entityLoader, AttrLoader attrLoader,
                            DomainLoader domainLoader) {
        this.entityGrpManager = new EntityGrpManagerImpl(this, Objects.requireNonNull(entityGrpLoader), 10);
        this.entityManager = new EntityManagerImpl(this, Objects.requireNonNull(entityLoader), 100);
        this.attrManager = new AttrManagerImpl(this, Objects.requireNonNull(attrLoader), 1000);
        this.domainManager = new DomainManagerImpl(this, Objects.requireNonNull(domainLoader), 20);
    }

    @Nonnull
    @Override
    public EntityGrpManagerImpl getEntityGrpManager() {
        return entityGrpManager;
    }

    @Nonnull
    @Override
    public EntityManagerImpl getEntityManager() {
        return entityManager;
    }

    @Nonnull
    @Override
    public AttrManagerImpl getAttrManager() {
        return attrManager;
    }

    @Nonnull
    @Override
    public DomainManagerImpl getDomainManager() {
        return domainManager;
    }

}
