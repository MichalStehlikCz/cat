package com.provys.catalogue.spring;

import com.provys.catalogue.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Nonnull;

@Configuration
class CatalogueFactory {

    @Bean
    @Nonnull
    CatalogueRepositoryImpl getRepository(EntityGrpLoader entityGrpLoader, EntityLoader entityLoader,
                                          AttrGrpLoader attrGrpLoader, AttrLoader attrLoader,
                                          DomainLoader domainLoader) {
        return new CatalogueRepositoryImpl(entityGrpLoader, entityLoader, attrGrpLoader, attrLoader, domainLoader);
    }
}