package com.provys.catalogue.dbloader;

import com.provys.catalogue.api.Domain;
import com.provys.catalogue.dbloader.db.tables.records.KerDomainTbRecord;
import com.provys.catalogue.impl.DomainManagerImpl;
import com.provys.catalogue.impl.DomainProxy;
import com.provys.catalogue.impl.DomainValue;
import com.provys.provysdb.ProvysDbContext;
import com.provys.provysobject.impl.ProvysObjectLoadRunner;
import org.jooq.Condition;
import org.jooq.impl.DSL;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.math.BigInteger;
import java.util.List;
import java.util.Objects;

import static com.provys.catalogue.dbloader.db.Tables.KER_DOMAIN_TB;

class DomainDbLoadRunner
        extends ProvysObjectLoadRunner<Domain, DomainValue, DomainProxy, DomainManagerImpl, KerDomainTbRecord> {

    @Nonnull
    private final ProvysDbContext dbContext;
    @Nullable
    private final Condition condition;

    DomainDbLoadRunner(DomainManagerImpl manager, ProvysDbContext dbContext, @Nullable Condition condition) {
        super(manager);
        this.dbContext = Objects.requireNonNull(dbContext);
        this.condition = condition;
    }

    @Nonnull
    @Override
    protected List<KerDomainTbRecord> select() {
        List<KerDomainTbRecord> result;
        try (var dsl = dbContext.createDSL()) {
            result = dsl.selectFrom(KER_DOMAIN_TB).
                    where(condition == null ? DSL.noCondition() : condition).
                    fetch().into(KerDomainTbRecord.class);
        }
        return result;
    }

    @Nonnull
    @Override
    protected BigInteger getId(KerDomainTbRecord sourceObject) {
        return sourceObject.getDomainId();
    }

    @Nonnull
    @Override
    protected DomainValue createValueObject(KerDomainTbRecord sourceObject) {
        return new DomainValue(sourceObject.getDomainId(), sourceObject.getNameNm(), sourceObject.getName(),
                sourceObject.getDatatypeNm(), sourceObject.getDatalength(), sourceObject.getDataprecision(),
                sourceObject.getQvisible(), sourceObject.getLvisible(), sourceObject.getValidateCd(),
                sourceObject.getLformatCd(), sourceObject.getNatorder(), sourceObject.getNote(),
                sourceObject.getAllowed());
    }
}
