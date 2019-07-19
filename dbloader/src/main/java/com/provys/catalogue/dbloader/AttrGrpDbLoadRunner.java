package com.provys.catalogue.dbloader;

import com.provys.catalogue.api.AttrGrp;
import com.provys.catalogue.dbloader.db.tables.records.KerAttrgrpTbRecord;
import com.provys.catalogue.impl.*;
import com.provys.provysdb.ProvysDbContext;
import com.provys.provysobject.impl.ProvysObjectLoadRunner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jooq.Condition;
import org.jooq.impl.DSL;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.math.BigInteger;
import java.util.List;
import java.util.Objects;

import static com.provys.catalogue.dbloader.db.Tables.KER_ATTRGRP_TB;

class AttrGrpDbLoadRunner extends ProvysObjectLoadRunner<AttrGrp, AttrGrpValue, AttrGrpProxy, AttrGrpManagerImpl,
        KerAttrgrpTbRecord> {

    private static final Logger LOG = LogManager.getLogger(AttrDbLoadRunner.class);

    @Nonnull
    private final ProvysDbContext dbContext;
    @Nullable
    private final Condition condition;

    AttrGrpDbLoadRunner(AttrGrpManagerImpl manager, ProvysDbContext dbContext, @Nullable Condition condition) {
        super(manager);
        this.dbContext = Objects.requireNonNull(dbContext);
        this.condition = condition;
    }

    @Nonnull
    @Override
    protected List<KerAttrgrpTbRecord> select() {
        List<KerAttrgrpTbRecord> result;
        try (var dsl = dbContext.createDSL()) {
            result = dsl.selectFrom(KER_ATTRGRP_TB).
                    where(condition == null ? DSL.noCondition() : condition).
                    fetch().into(KerAttrgrpTbRecord.class);
        }
        return result;
    }

    @Nonnull
    @Override
    protected BigInteger getId(KerAttrgrpTbRecord sourceObject) {
        return sourceObject.getAttrgrpId();
    }

    @Nonnull
    @Override
    protected AttrGrpValue createValueObject(KerAttrgrpTbRecord sourceObject) {
        return new AttrGrpValue(sourceObject.getAttrgrpId(),
                getManager().getRepository().getEntityManager().getOrAddById(sourceObject.getEntityId()),
                sourceObject.getNameNm(), sourceObject.getName(), sourceObject.getOrd(), sourceObject.getNote());
    }
}
