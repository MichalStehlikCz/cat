package com.provys.catalogue.dbloader;

import com.provys.catalogue.impl.DomainLoaderBase;
import com.provys.catalogue.impl.DomainManagerImpl;
import com.provys.provysdb.dbcontext.ProvysDbContext;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.jooq.Record13;
import org.jooq.impl.DSL;

@ApplicationScoped
public class DomainDbLoader extends DomainLoaderBase<Record13<BigInteger, String, String, String, Integer, Integer, String, Boolean, Boolean, Boolean, String, String, Boolean>> {
    @Nonnull
    private final ProvysDbContext dbContext;

    @Inject
    DomainDbLoader(ProvysDbContext dbContext) {
        this.dbContext = Objects.requireNonNull(dbContext);
    }

    @Nonnull
    @Override
    protected DomainDbLoadRunner getLoadRunnerByNameNm(DomainManagerImpl manager, String nameNm) {
        return new DomainDbLoadRunner(manager, dbContext, DSL.field("NAME_NM", String.class).eq(nameNm));
    }

    @Nonnull
    @Override
    protected DomainDbLoadRunner getLoadRunnerById(DomainManagerImpl manager, BigInteger id) {
        return new DomainDbLoadRunner(manager, dbContext, DSL.field("DOMAIN_ID", BigInteger.class).eq(id));
    }

    @Nonnull
    @Override
    protected DomainDbLoadRunner getLoadRunnerAll(DomainManagerImpl manager) {
        return new DomainDbLoadRunner(manager, dbContext, null);
    }
}