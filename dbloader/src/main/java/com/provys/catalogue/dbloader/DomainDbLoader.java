package com.provys.catalogue.dbloader;

import com.provys.catalogue.dbloader.db.tables.records.KerDomainTbRecord;
import com.provys.catalogue.impl.DomainLoaderBase;
import com.provys.catalogue.impl.DomainManagerImpl;
import com.provys.provysdb.ProvysDBContext;

import javax.annotation.Nonnull;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.math.BigInteger;
import java.util.Objects;

import static com.provys.catalogue.dbloader.db.Tables.KER_DOMAIN_TB;

@ApplicationScoped
public class DomainDbLoader extends DomainLoaderBase<KerDomainTbRecord> {

    @Nonnull
    private final ProvysDBContext dbContext;

    @Inject
    DomainDbLoader(ProvysDBContext dbContext) {
        this.dbContext = Objects.requireNonNull(dbContext);
    }

    @Nonnull
    @Override
    protected DomainDbLoadRunner getLoadRunnerByNameNm(DomainManagerImpl domainManager, String nameNm) {
        return new DomainDbLoadRunner(domainManager, dbContext, KER_DOMAIN_TB.NAME_NM.eq(nameNm));
    }

    @Nonnull
    @Override
    protected DomainDbLoadRunner getLoadRunnerById(DomainManagerImpl domainManager, BigInteger id) {
        return new DomainDbLoadRunner(domainManager, dbContext, KER_DOMAIN_TB.DOMAIN_ID.eq(id));
    }

    @Nonnull
    @Override
    protected DomainDbLoadRunner getLoadRunnerAll(DomainManagerImpl domainManager) {
        return new DomainDbLoadRunner(domainManager, dbContext, null);
    }

}
