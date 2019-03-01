package com.provys.catalogue.impl;

import com.provys.catalogue.api.Domain;
import com.provys.provysobject.impl.ProvysNmObjectProxyImpl;

import javax.annotation.Nonnull;
import java.math.BigInteger;
import java.util.Optional;

public class DomainProxy extends ProvysNmObjectProxyImpl<Domain, DomainValue, DomainProxy, DomainManagerImpl>
        implements Domain {

    protected DomainProxy(DomainManagerImpl manager, BigInteger id) {
        super(manager, id);
    }

    @Nonnull
    @Override
    protected DomainProxy self() {
        return this;
    }

    @Nonnull
    @Override
    public Domain selfAsObject() {
        return this;
    }

    @Nonnull
    @Override
    public String getName() {
        return validateValueObject().getName();
    }

    @Nonnull
    @Override
    public Optional<String> getDataType() {
        return validateValueObject().getDataType();
    }

    @Nonnull
    @Override
    public Optional<Short> getDataLength() {
        return validateValueObject().getDataLength();
    }

    @Nonnull
    @Override
    public Optional<Byte> getDataPrecision() {
        return validateValueObject().getDataPrecision();
    }

    @Override
    public boolean isQVisible() {
        return validateValueObject().isQVisible();
    }

    @Override
    public boolean isLVisible() {
        return validateValueObject().isLVisible();
    }

    @Nonnull
    @Override
    public Optional<String> getValidateCd() {
        return validateValueObject().getValidateCd();
    }

    @Nonnull
    @Override
    public Optional<String> getLFormatCd() {
        return validateValueObject().getLFormatCd();
    }

    @Override
    public boolean isNatOrder() {
        return validateValueObject().isNatOrder();
    }

    @Nonnull
    @Override
    public Optional<String> getNote() {
        return validateValueObject().getNote();
    }

    @Override
    public boolean isAllowed() {
        return validateValueObject().isAllowed();
    }
}
