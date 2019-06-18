package com.provys.catalogue.dbloader;

import com.provys.catalogue.api.Attr;
import com.provys.catalogue.api.AttrType;
import com.provys.catalogue.dbloader.db.tables.records.KerAttrTbRecord;
import com.provys.catalogue.impl.AttrManagerImpl;
import com.provys.catalogue.impl.AttrProxy;
import com.provys.catalogue.impl.AttrValue;
import com.provys.common.exception.InternalException;
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

import static com.provys.catalogue.dbloader.db.Tables.KER_ATTR_TB;

class AttrDbLoadRunner extends ProvysObjectLoadRunner<Attr, AttrValue, AttrProxy, AttrManagerImpl, KerAttrTbRecord> {

    private static final Logger LOG = LogManager.getLogger(AttrDbLoadRunner.class);

    @Nonnull
    private final ProvysDbContext dbContext;
    @Nullable
    private final Condition condition;

    AttrDbLoadRunner(AttrManagerImpl manager, ProvysDbContext dbContext, @Nullable Condition condition) {
        super(manager);
        this.dbContext = Objects.requireNonNull(dbContext);
        this.condition = condition;
    }


    @Nonnull
    @Override
    protected List<KerAttrTbRecord> select() {
        List<KerAttrTbRecord> result;
        try (var dsl = dbContext.createDSL()) {
            result = dsl.selectFrom(KER_ATTR_TB).
                    where(condition == null ? DSL.noCondition() : condition).
                    fetch().into(KerAttrTbRecord.class);
        }
        return result;
    }

    @Nonnull
    @Override
    protected BigInteger getId(KerAttrTbRecord sourceObject) {
        return sourceObject.getAttrId();
    }

    @Nonnull
    @Override
    protected AttrValue createValueObject(KerAttrTbRecord sourceObject) {
        return new AttrValue(sourceObject.getAttrId(),
                getManager().getRepository().getEntityManager().getOrAddById(sourceObject.getEntityId()),
                sourceObject.getNameNm(), sourceObject.getName(), sourceObject.getNote(),
                AttrType.getAttrTypeByCode(sourceObject.getAttrtype()).orElseThrow(
                        () -> new InternalException(LOG,
                                "Invalid AttrType read from database: " + sourceObject.getAttrtype())),
                getManager().getRepository().getDomainManager().getById(sourceObject.getDomainId()),
                sourceObject.getSubdomainNm(), sourceObject.getMandatory().equals("Y"));
    }
}
