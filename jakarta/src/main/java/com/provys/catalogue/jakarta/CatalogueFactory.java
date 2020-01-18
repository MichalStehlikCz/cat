package com.provys.catalogue.jakarta;

import com.provys.catalogue.impl.*;

import javax.annotation.Nonnull;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

@ApplicationScoped
class CatalogueFactory {

    @SuppressWarnings("CdiInjectionPointsInspection") // we supply proper loader library for desired use (db, rest-ws)
    @Produces
    @ApplicationScoped
    @Nonnull
    CatalogueRepositoryImpl getRepository(EntityGrpLoader entityGrpLoader, EntityLoader entityLoader,
                                          AttrGrpLoader attrGrpLoader, AttrLoader attrLoader,
                                          DomainLoader domainLoader) {
        return new CatalogueRepositoryImpl(entityGrpLoader, entityLoader, attrGrpLoader, attrLoader, domainLoader);
    }
}
