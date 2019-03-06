package com.provys.catalogue.dbloader;

import com.provys.catalogue.api.Entity;
import com.provys.catalogue.dbloader.db.tables.records.KerEntityTbRecord;
import com.provys.catalogue.impl.EntityManagerImpl;
import com.provys.catalogue.impl.EntityProxy;
import com.provys.catalogue.impl.EntityValue;
import com.provys.provysdb.ProvysDBContext;
import com.provys.provysobject.impl.ProvysObjectLoadRunner;
import org.jooq.Condition;
import org.jooq.impl.DSL;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.math.BigInteger;
import java.util.List;
import java.util.Objects;

import static com.provys.catalogue.dbloader.db.Tables.KER_ENTITY_TB;

class EntityDbLoadRunner extends ProvysObjectLoadRunner<Entity, EntityValue, EntityProxy, EntityManagerImpl,
        KerEntityTbRecord> {

    @Nonnull
    private final ProvysDBContext dbContext;
    @Nullable
    private final Condition condition;

    EntityDbLoadRunner(EntityManagerImpl manager, ProvysDBContext dbContext, @Nullable Condition condition) {
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