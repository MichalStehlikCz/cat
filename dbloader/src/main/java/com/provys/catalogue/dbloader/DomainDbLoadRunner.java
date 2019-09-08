package com.provys.catalogue.dbloader;

import com.provys.catalogue.api.Domain;
import com.provys.catalogue.impl.DomainManagerImpl;
import com.provys.catalogue.impl.DomainProxy;
import com.provys.catalogue.impl.gen.DomainValue;
import com.provys.provysdb.dbcontext.ProvysDbContext;
import com.provys.provysobject.impl.ProvysObjectLoadRunner;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.jooq.Condition;
import org.jooq.Record13;
import org.jooq.impl.DSL;

class DomainDbLoadRunner extends ProvysObjectLoadRunner<Domain, DomainValue, DomainProxy, DomainManagerImpl, Record13<BigInteger, String, String, String, Integer, Integer, String, Boolean, Boolean, Boolean, String, String, Boolean>> {
    @Nonnull
    private final ProvysDbContext dbContext;

    @Nullable
    private final Condition condition;

    DomainDbLoadRunner(DomainManagerImpl manager, ProvysDbContext dbContext,
                       @Nullable Condition condition) {
        super(manager);
        this.dbContext = Objects.requireNonNull(dbContext);
        this.condition = condition;
    }

    @Nonnull
    @Override
    protected List<Record13<BigInteger, String, String, String, Integer, Integer, String, Boolean, Boolean, Boolean, String, String, Boolean>> select(
    ) {
        List<Record13<BigInteger, String, String, String, Integer, Integer, String, Boolean, Boolean, Boolean, String, String, Boolean>> result;
        try (var dsl = dbContext.createDSL()) {
            result = dsl.select(DSL.field("DOMAIN_ID", BigInteger.class), DSL.field("NAME_NM", String.class), DSL.field("NAME", String.class), DSL.field("DATATYPE_NM", String.class), DSL.field("DATALENGTH", Integer.class), DSL.field("DATAPRECISION", Integer.class), DSL.field("NOTE", String.class), DSL.field("ALLOWED", Boolean.class), DSL.field("QVISIBLE", Boolean.class), DSL.field("LVISIBLE", Boolean.class), DSL.field("VALIDATE_CD", String.class), DSL.field("LFORMAT_CD", String.class), DSL.field("NATORDER", Boolean.class))
                    .from(DSL.table("KER_DOMAIN_TB"))
                    .where(condition == null ? DSL.noCondition() : condition)
                    .fetch();
        }
        return result;
    }

    @Nonnull
    @Override
    protected BigInteger getId(
            Record13<BigInteger, String, String, String, Integer, Integer, String, Boolean, Boolean, Boolean, String, String, Boolean> sourceObject) {
        return sourceObject.get("DOMAIN_ID", BigInteger.class);
    }

    @Nonnull
    @Override
    protected DomainValue createValueObject(
            Record13<BigInteger, String, String, String, Integer, Integer, String, Boolean, Boolean, Boolean, String, String, Boolean> sourceObject) {
        return new DomainValue(getId(sourceObject), sourceObject.get("NAME_NM", String.class), sourceObject.get("NAME", String.class), sourceObject.get("DATATYPE_NM", String.class), sourceObject.get("DATALENGTH", Integer.class), sourceObject.get("DATAPRECISION", Integer.class), sourceObject.get("NOTE", String.class), sourceObject.get("ALLOWED", Boolean.class), sourceObject.get("QVISIBLE", Boolean.class), sourceObject.get("LVISIBLE", Boolean.class), sourceObject.get("VALIDATE_CD", String.class), sourceObject.get("LFORMAT_CD", String.class), sourceObject.get("NATORDER", Boolean.class));
    }
}