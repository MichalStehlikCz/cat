package com.provys.catalogue.dbloader;

import com.provys.catalogue.api.EntityGrp;
import com.provys.catalogue.dbloader.db.tables.records.KerEntitygrpTbRecord;
import com.provys.catalogue.impl.EntityGrpManagerImpl;
import com.provys.catalogue.impl.EntityGrpProxy;
import com.provys.catalogue.impl.EntityGrpValue;
import com.provys.provysdb.ProvysDBContext;
import com.provys.provysobject.impl.ProvysObjectLoadRunner;
import org.jooq.Condition;
import org.jooq.impl.DSL;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.math.BigInteger;
import java.util.List;
import java.util.Objects;

import static com.provys.catalogue.dbloader.db.Tables.KER_ENTITYGRP_TB;

class EntityGrpDbLoadRunner extends ProvysObjectLoadRunner<EntityGrp, EntityGrpValue, EntityGrpProxy, EntityGrpManagerImpl, KerEntitygrpTbRecord> {

    @Nonnull
    private final ProvysDBContext dbContext;
    @Nullable
    private final Condition condition;

    EntityGrpDbLoadRunner(EntityGrpManagerImpl manager, ProvysDBContext dbContext, @Nullable Condition condition) {
        super(manager);
        this.dbContext = Objects.requireNonNull(dbContext);
        this.condition = condition;
    }

    @Nonnull
    @Override
    protected List<KerEntitygrpTbRecord> select() {
        List<KerEntitygrpTbRecord> result;
        try (var dsl = dbContext.createDSL()) {
            result = dsl.selectFrom(KER_ENTITYGRP_TB).
                    where(condition == null ? DSL.noCondition() : condition).
                    fetch().into(KerEntitygrpTbRecord.class);
        }
        return result;
    }

    @Nonnull
    @Override
    protected BigInteger getId(KerEntitygrpTbRecord sourceObject) {
        return sourceObject.getEntitygrpId();
    }

    @Nonnull
    @Override
    protected EntityGrpValue createValueObject(KerEntitygrpTbRecord sourceObject) {
        return new EntityGrpValue(sourceObject.getEntitygrpId(), sourceObject.getNameNm(),
                (sourceObject.getParentId() == null) ? null : getManager().getOrAddById(sourceObject.getParentId()),
                sourceObject.getName(), sourceObject.getNote(), sourceObject.getOrd());
    }
}
