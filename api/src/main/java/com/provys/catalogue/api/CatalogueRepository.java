package com.provys.catalogue.api;

import com.provys.provysobject.ProvysRepository;

import javax.annotation.Nonnull;

public interface CatalogueRepository extends ProvysRepository {

    @Nonnull
    EntityGrpManager getEntityGrpManager();

    @Nonnull
    EntityManager getEntityManager();

    @Nonnull
    AttrGrpManager getAttrGrpManager();

    @Nonnull
    AttrManager getAttrManager();

    @Nonnull
    DomainManager getDomainManager();
}
