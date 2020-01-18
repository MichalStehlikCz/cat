package com.provys.catalogue.dbloader.jakarta;

import com.provys.catalogue.dbloader.*;
import com.provys.provysdb.dbsqlbuilder.SqlAdmin;

import javax.annotation.Nonnull;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

@ApplicationScoped
class CatalogueDbLoaderFactory {

    @Produces
    @ApplicationScoped
    @Nonnull
    EntityGrpDbLoader getEntityGrpLoader(SqlAdmin dbSql) {
        return new EntityGrpDbLoader(dbSql);
    }

    @Produces
    @ApplicationScoped
    @Nonnull
    EntityDbLoader getEntityLoader(SqlAdmin dbSql) {
        return new EntityDbLoader(dbSql);
    }

    @Produces
    @ApplicationScoped
    @Nonnull
    AttrGrpDbLoader getAttrGrpLoader(SqlAdmin dbSql) {
        return new AttrGrpDbLoader(dbSql);
    }

    @Produces
    @ApplicationScoped
    @Nonnull
    AttrDbLoader getAttrLoader(SqlAdmin dbSql) {
        return new AttrDbLoader(dbSql);
    }

    @Produces
    @ApplicationScoped
    @Nonnull
    DomainDbLoader getDomainLoader(SqlAdmin dbSql) {
        return new DomainDbLoader(dbSql);
    }
}
