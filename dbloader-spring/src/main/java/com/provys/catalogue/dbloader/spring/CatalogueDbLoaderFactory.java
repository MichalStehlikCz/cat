package com.provys.catalogue.dbloader.spring;

import com.provys.catalogue.dbloader.*;
import com.provys.provysdb.dbsqlbuilder.SqlAdmin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Nonnull;

@Configuration
class CatalogueDbLoaderFactory {

    @Bean
    @Nonnull
    EntityGrpDbLoader getEntityGrpLoader(SqlAdmin dbSql) {
        return new EntityGrpDbLoader(dbSql);
    }

    @Bean
    @Nonnull
    EntityDbLoader getEntityLoader(SqlAdmin dbSql) {
        return new EntityDbLoader(dbSql);
    }

    @Bean
    @Nonnull
    AttrGrpDbLoader getAttrGrpLoader(SqlAdmin dbSql) {
        return new AttrGrpDbLoader(dbSql);
    }

    @Bean
    @Nonnull
    AttrDbLoader getAttrLoader(SqlAdmin dbSql) {
        return new AttrDbLoader(dbSql);
    }

    @Bean
    @Nonnull
    DomainDbLoader getDomainLoader(SqlAdmin dbSql) {
        return new DomainDbLoader(dbSql);
    }
}