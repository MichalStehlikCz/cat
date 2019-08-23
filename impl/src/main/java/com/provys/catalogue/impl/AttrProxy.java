package com.provys.catalogue.impl;

import com.provys.catalogue.api.*;
import com.provys.provysobject.impl.ProvysObjectProxyImpl;

import javax.annotation.Nonnull;
import java.math.BigInteger;
import java.util.Objects;
import java.util.Optional;

public class AttrProxy extends ProvysObjectProxyImpl<Attr, AttrValue, AttrProxy, AttrManagerImpl> implements Attr {

    AttrProxy(AttrManagerImpl manager, BigInteger id) {
        super(manager, id);
    }

    @Nonnull
    @Override
    protected AttrProxy self() {
        return this;
    }

    @Nonnull
    @Override
    public Attr selfAsObject() {
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

    @Nonnull
    @Override
    public Optional<String> getProperNameRoot() {
        return validateValueObject().getProperNameRoot();
    }

    @Nonnull
    @Override
    public String getJavaName() {
        return validateValueObject().getJavaName();
    }

    @Nonnull
    @Override
    public Optional<BigInteger> getAttrGrpId() {
        return validateValueObject().getAttrGrpId();
    }

    @Nonnull
    @Override
    public Optional<AttrGrp> getAttrGrp() {
        return validateValueObject().getAttrGrp();
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

    @Nonnull
    @Override
    public AttrType getAttrType() {
        return validateValueObject().getAttrType();
    }

    @Nonnull
    @Override
    public Domain getDomain() {
        return validateValueObject().getDomain();
    }

    @Nonnull
    @Override
    public Optional<String> getSubdomainNm() {
        return validateValueObject().getSubdomainNm();
    }

    @Override
    public boolean getMandatory() {
        return validateValueObject().getMandatory();
    }

    @Override
    @Nonnull
    public Optional<String> getDefValue() {
        return validateValueObject().getDefValue();
    }

    @Override
    public int getOrdInEntity() {
        // we have to select all attributes of given entity
        var attrs = getManager().getByEntityId(getEntityId());
        int result = 0;
        // and calculate how many of them are before our attribute
        for (var attr : attrs) {
            if (attr.compareTo(this) < 0) {
                result++;
            }
        }
        return result;
    }

    @Override
    public int compareTo(Attr other) {
        if (other == this) {
            return 0;
        }
        return validateValueObject().compareTo(Objects.requireNonNull(other));
    }
}
