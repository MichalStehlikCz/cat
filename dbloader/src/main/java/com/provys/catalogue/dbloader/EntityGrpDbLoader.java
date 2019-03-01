package com.provys.catalogue.dbloader;

import com.provys.catalogue.api.EntityGrp;
import com.provys.catalogue.dbloader.db.tables.records.KerEntitygrpTbRecord;
import com.provys.catalogue.impl.EntityGrpLoaderBase;
import com.provys.catalogue.impl.EntityGrpManagerImpl;
import com.provys.catalogue.impl.EntityGrpProxy;
import com.provys.catalogue.impl.EntityGrpValue;
import com.provys.provysdb.ProvysDBContext;
import com.provys.provysobject.impl.ProvysObjectLoadRunner;
import org.jooq.Condition;
import org.jooq.impl.DSL;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.math.BigInteger;
import java.util.List;
import java.util.Objects;

import static com.provys.catalogue.dbloader.db.Tables.KER_ENTITYGRP_TB;

@ApplicationScoped
public class EntityGrpDbLoader extends EntityGrpLoaderBase<KerEntitygrpTbRecord> {

    @Nonnull
    private final ProvysDBContext dbContext;

    @Inject
    EntityGrpDbLoader(ProvysDBContext dbContext) {
        this.dbContext = Objects.requireNonNull(dbContext);
    }

    @Nonnull
    @Override
    protected LoadRunner getLoadRunnerByParentId(EntityGrpManagerImpl manager, BigInteger parentId) {
        return new LoadRunner(manager, dbContext, KER_ENTITYGRP_TB.PARENT_ID.eq(parentId));
    }

    @Nonnull
    @Override
    protected LoadRunner getLoadRunnerByNameNm(EntityGrpManagerImpl manager, String nameNm) {
        return new LoadRunner(manager, dbContext, KER_ENTITYGRP_TB.NAME_NM.eq(nameNm));
    }

    @Nonnull
    @Override
    protected LoadRunner getLoadRunnerById(EntityGrpManagerImpl manager, BigInteger id)
    {
        return new LoadRunner(manager, dbContext, KER_ENTITYGRP_TB.ENTITYGRP_ID.eq(id));
    }

    @Nonnull
    @Override
    protected LoadRunner getLoadRunnerAll(EntityGrpManagerImpl manager) {
        return new LoadRunner(manager, dbContext, null);
    }

    private static class LoadRunner extends ProvysObjectLoadRunner<EntityGrp, EntityGrpValue, EntityGrpProxy,
            EntityGrpManagerImpl, KerEntitygrpTbRecord> {

        @Nonnull
        private final ProvysDBContext dbContext;
        @Nullable
        private final Condition condition;

        LoadRunner(EntityGrpManagerImpl manager, ProvysDBContext dbContext, @Nullable Condition condition) {
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
}
