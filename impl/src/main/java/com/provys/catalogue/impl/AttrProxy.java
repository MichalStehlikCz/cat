package com.provys.catalogue.impl;

import com.provys.catalogue.api.Attr;
import com.provys.catalogue.api.AttrType;
import com.provys.catalogue.api.Domain;
import com.provys.catalogue.api.Entity;
import com.provys.provysobject.impl.ProvysObjectProxyImpl;

import javax.annotation.Nonnull;
import java.math.BigInteger;
import java.util.Optional;

public class AttrProxy extends ProvysObjectProxyImpl<Attr, AttrValue, AttrProxy, AttrManagerImpl> implements Attr {

    public AttrProxy(AttrManagerImpl manager, BigInteger id) {
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
}
