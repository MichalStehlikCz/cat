package com.provys.catalogue.api;

import com.provys.provysobject.ProvysObjectRepository;

import javax.annotation.Nonnull;

public interface CatalogueRepository extends ProvysObjectRepository {

    @Nonnull
    EntityGrpManager getEntityGrpManager();

    @Nonnull
    EntityManager getEntityManager();
}
