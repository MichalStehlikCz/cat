package com.provys.catalogue.impl;

import com.provys.catalogue.api.Attr;
import com.provys.catalogue.api.AttrGrp;
import com.provys.catalogue.api.Entity;
import com.provys.provysobject.impl.ProvysObjectProxyImpl;

import javax.annotation.Nonnull;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Objects;
import java.util.Optional;

public class AttrGrpProxy extends ProvysObjectProxyImpl<AttrGrp, AttrGrpValue, AttrGrpProxy, AttrGrpManagerImpl>
        implements AttrGrp {

    AttrGrpProxy(AttrGrpManagerImpl manager, BigInteger id) {
        super(manager, id);
    }

    @Nonnull
    @Override
    protected AttrGrpProxy self() {
        return this;
    }

    @Nonnull
    @Override
    public AttrGrp selfAsObject() {
        return this;
    }

    @Nonnull
    @Override
    public BigInteger getEntityId() {
        return validateValueObject().getEntityId();
    }

    @Nonnull
    @Override
    public Entity getEntity() {
        return validateValueObject().getEntity();
    }

    @Nonnull
    @Override
    public String getNameNm() {
        return validateValueObject().getNameNm();
    }

    @Nonnull
    @Override
    public String getName() {
        return validateValueObject().getName();
    }

    @Override
    public int getOrd() {
        return validateValueObject().getOrd();
    }

    @Nonnull
    @Override
    public Optional<String> getNote() {
        return validateValueObject().getNote();
    }

    @Override
    @Nonnull
    public Collection<Attr> getAttrs() {
        return getManager().getRepository().getAttrManager().getByAttrGrpId(getId());
    }

    @Override
    public int compareTo(AttrGrp other) {
        if (this == other) {
            return 0;
        }
        return validateValueObject().compareTo(Objects.requireNonNull(other));
    }
}
