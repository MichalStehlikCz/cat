package com.provys.catalogue.impl;

import com.provys.catalogue.api.*;

import javax.annotation.Nonnull;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Objects;

@ApplicationScoped
public class CatalogueRepositoryImpl implements CatalogueRepository {

    private final EntityGrpManagerImpl entityGrpManager;
    private final EntityManagerImpl entityManager;
    private final AttrGrpManagerImpl attrGrpManager;
    private final AttrManagerImpl attrManager;
    private final DomainManagerImpl domainManager;

    @SuppressWarnings("unused") // needed by some CDI implementations
    protected CatalogueRepositoryImpl() {
        entityGrpManager = null;
        entityManager = null;
        attrGrpManager = null;
        attrManager = null;
        domainManager = null;
    }

    @SuppressWarnings("CdiInjectionPointsInspection")
    @Inject
    CatalogueRepositoryImpl(EntityGrpLoader entityGrpLoader, EntityLoader entityLoader, AttrGrpLoader attrGrpLoader,
                            AttrLoader attrLoader, DomainLoader domainLoader) {
        this.entityGrpManager = new EntityGrpManagerImpl(this, Objects.requireNonNull(entityGrpLoader), 10);
        this.entityManager = new EntityManagerImpl(this, Objects.requireNonNull(entityLoader), 100);
        this.attrGrpManager = new AttrGrpManagerImpl(this, Objects.requireNonNull(attrGrpLoader), 10);
        this.attrManager = new AttrManagerImpl(this, Objects.requireNonNull(attrLoader), 1000);
        this.domainManager = new DomainManagerImpl(this, Objects.requireNonNull(domainLoader), 20);
    }

    @Nonnull
    @Override
    public EntityGrpManagerImpl getEntityGrpManager() {
        return Objects.requireNonNull(entityGrpManager,
                "Catalogue repository not properly initialized - entityGrpManager is null");
    }

    @Nonnull
    @Override
    public EntityManagerImpl getEntityManager() {
        return Objects.requireNonNull(entityManager,
                "Catalogue repository not properly initialized - entityManager is null");
    }

    @Nonnull
    @Override
    public AttrGrpManager getAttrGrpManager() {
        return Objects.requireNonNull(attrGrpManager,
                "Catalogue repository not properly initialized - attrGrpManager is null");
    }

    @Nonnull
    @Override
    public AttrManagerImpl getAttrManager() {
        return Objects.requireNonNull(attrManager,
                "Catalogue repository not properly initialized - attrManager is null");
    }

    @Nonnull
    @Override
    public DomainManagerImpl getDomainManager() {
        return Objects.requireNonNull(domainManager,
                "Catalogue repository not properly initialized - domainManager is null");
    }

}
