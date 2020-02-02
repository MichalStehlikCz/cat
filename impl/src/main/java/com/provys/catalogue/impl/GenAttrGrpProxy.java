package com.provys.catalogue.impl;

import com.provys.catalogue.api.AttrGrp;
import com.provys.catalogue.api.Entity;
import com.provys.common.datatype.DtUid;
import com.provys.provysobject.impl.ProvysObjectProxyImpl;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.processing.Generated;

@Generated("com.provys.provysobject.generator.impl.GeneratorEntity")
abstract class GenAttrGrpProxy extends ProvysObjectProxyImpl<AttrGrp, GenAttrGrpValue, AttrGrpProxy, AttrGrpManagerImpl> {
    GenAttrGrpProxy(AttrGrpManagerImpl manager, DtUid id) {
        super(manager, id);
    }

    @Nonnull
    public Entity getEntity() {
        return getManager().getRepository().getEntityManager().getById(getEntityId());
    }

    @Nonnull
    public DtUid getEntityId() {
        return validateValueObject().getEntityId();
    }

    @Nonnull
    public String getNameNm() {
        return validateValueObject().getNameNm();
    }

    @Nonnull
    public String getName() {
        return validateValueObject().getName();
    }

    public boolean isIsCustom() {
        return validateValueObject().isIsCustom();
    }

    public int getOrd() {
        return validateValueObject().getOrd();
    }

    @Nonnull
    public Optional<String> getNote() {
        return validateValueObject().getNote();
    }
}
