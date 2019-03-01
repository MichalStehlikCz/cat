package com.provys.catalogue.dbloader;

import com.provys.catalogue.api.Entity;
import com.provys.catalogue.dbloader.db.tables.records.KerEntityTbRecord;
import com.provys.catalogue.impl.EntityLoaderBase;
import com.provys.catalogue.impl.EntityManagerImpl;
import com.provys.catalogue.impl.EntityProxy;
import com.provys.catalogue.impl.EntityValue;
import com.provys.provysdb.ProvysDBContext;
import com.provys.provysobject.impl.ProvysObjectLoadRunner;
import org.jooq.Condition;
import org.jooq.impl.DSL;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;
import java.math.BigInteger;
import java.util.List;
import java.util.Objects;

import static com.provys.catalogue.dbloader.db.Tables.KER_ENTITY_TB;

public class EntityDbLoader extends EntityLoaderBase<KerEntityTbRecord> {

    @Nonnull
    private final ProvysDBContext dbContext;

    @Inject
    EntityDbLoader(ProvysDBContext dbContext) {
        this.dbContext = Objects.requireNonNull(dbContext);
    }

    @Nonnull
    @Override
    protected LoadRunner getLoadRunnerByEntityGrpId(EntityManagerImpl manager, BigInteger entityGrpId) {
        return new LoadRunner(manager, dbContext, KER_ENTITY_TB.ENTITYGRP_ID.eq(entityGrpId));
    }

    @Nonnull
    @Override
    protected LoadRunner getLoadRunnerByNameNm(EntityManagerImpl manager, String nameNm) {
        return new LoadRunner(manager, dbContext, KER_ENTITY_TB.NAME_NM.eq(nameNm));
    }

    @Nonnull
    @Override
    protected LoadRunner getLoadRunnerById(EntityManagerImpl manager, BigInteger id)
    {
        return new LoadRunner(manager, dbContext, KER_ENTITY_TB.ENTITYGRP_ID.eq(id));
    }

    @Nonnull
    @Override
    protected LoadRunner getLoadRunnerAll(EntityManagerImpl manager) {
        return new LoadRunner(manager, dbContext, null);
    }

    private static class LoadRunner extends ProvysObjectLoadRunner<Entity, EntityValue, EntityProxy, EntityManagerImpl,
            KerEntityTbRecord> {

        @Nonnull
        private final ProvysDBContext dbContext;
        @Nullable
        private final Condition condition;

        LoadRunner(EntityManagerImpl manager, ProvysDBContext dbContext, @Nullable Condition condition) {
            super(manager);
            this.dbContext = Objects.requireNonNull(dbContext);
            this.condition = condition;
        }

        @Nonnull
        @Override
        protected List<KerEntityTbRecord> select() {
            List<KerEntityTbRecord> result;
            try (var dsl = dbContext.createDSL()) {
                result = dsl.selectFrom(KER_ENTITY_TB).
                        where(condition == null ? DSL.noCondition() : condition).
                        fetch().into(KerEntityTbRecord.class);
            }
            return result;
        }

        @Nonnull
        @Override
        protected BigInteger getId(KerEntityTbRecord sourceObject) {
            return sourceObject.getEntityId();
        }

        @Nonnull
        @Override
        protected EntityValue createValueObject(KerEntityTbRecord sourceObject) {
            return new EntityValue(sourceObject.getEntityId(), sourceObject.getNameNm(), sourceObject.getName(),
                    sourceObject.getIscustom().equals("Y"), sourceObject.getIsused().equals("Y"),
                    sourceObject.getObjectclass().equals("Y"), sourceObject.getTableNm(),
                    (sourceObject.getEntitygrpId() == null) ? null :
                    getManager().getRepository().getEntityGrpManager().getById(sourceObject.getEntitygrpId()),
                    sourceObject.getNote(), sourceObject.getCustomnote(), sourceObject.getStructuredoc(),
                    sourceObject.getUsagedoc(), sourceObject.getBehaviourdoc(), sourceObject.getImpldoc());
        }
    }
}