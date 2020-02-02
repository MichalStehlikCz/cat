package com.provys.catalogue.impl;

import com.provys.catalogue.api.EntityGrp;
import com.provys.common.datatype.DtUid;
import com.provys.provysobject.impl.ProvysNmObjectProxyImpl;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.processing.Generated;

@Generated("com.provys.provysobject.generator.impl.GeneratorEntity")
abstract class GenEntityGrpProxy extends ProvysNmObjectProxyImpl<EntityGrp, GenEntityGrpValue, EntityGrpProxy, EntityGrpManagerImpl> {
    GenEntityGrpProxy(EntityGrpManagerImpl manager, DtUid id) {
        super(manager, id);
    }

    @Nonnull
    public Optional<EntityGrp> getParent() {
        return getParentId().map(id -> getManager().getRepository().getEntityGrpManager().getById(id));
    }

    @Nonnull
    public Optional<DtUid> getParentId() {
        return validateValueObject().getParentId();
    }

    @Nonnull
    public String getName() {
        return validateValueObject().getName();
    }

    @Nonnull
    public Optional<String> getNote() {
        return validateValueObject().getNote();
    }

    public int getOrd() {
        return validateValueObject().getOrd();
    }
}
