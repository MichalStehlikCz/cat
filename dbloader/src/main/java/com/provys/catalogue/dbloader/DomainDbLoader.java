package com.provys.catalogue.dbloader;

import com.provys.catalogue.api.DomainMeta;
import com.provys.catalogue.impl.DomainLoaderBase;
import com.provys.catalogue.impl.DomainManagerImpl;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.provys.provysdb.dbsqlbuilder.SqlAdmin;

@ApplicationScoped
public class DomainDbLoader extends DomainLoaderBase {
    @Nonnull
    private final SqlAdmin dbSql;

    @Inject
    DomainDbLoader(SqlAdmin dbSql) {
        this.dbSql = Objects.requireNonNull(dbSql);
    }

    @Nonnull
    @Override
    protected DomainDbLoadRunner getLoadRunnerByNameNm(DomainManagerImpl manager, String nameNm) {
        return new DomainDbLoadRunner(manager, dbSql, dbSql.eq(DomainMeta.NAME_NM, dbSql.bind("name_nm", nameNm)));
    }

    @Nonnull
    @Override
    protected DomainDbLoadRunner getLoadRunnerById(DomainManagerImpl manager, BigInteger id) {
        return new DomainDbLoadRunner(manager, dbSql, dbSql.eq(DomainMeta.DOMAIN_ID, dbSql.bind("domain_id", id)));
    }

    @Nonnull
    @Override
    protected DomainDbLoadRunner getLoadRunnerAll(DomainManagerImpl manager) {
        return new DomainDbLoadRunner(manager, dbSql, null);
    }
}