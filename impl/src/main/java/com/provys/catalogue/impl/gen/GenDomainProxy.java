package com.provys.catalogue.impl.gen;

import com.provys.catalogue.api.Domain;
import com.provys.catalogue.api.DomainBase;
import com.provys.catalogue.impl.DomainManagerImpl;
import com.provys.catalogue.impl.DomainProxy;
import com.provys.provysobject.impl.ProvysNmObjectProxyImpl;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.json.bind.annotation.JsonbProperty;

public abstract class GenDomainProxy extends ProvysNmObjectProxyImpl<Domain, DomainValue, DomainProxy, DomainManagerImpl> implements DomainBase {
    public GenDomainProxy(DomainManagerImpl manager, BigInteger id) {
        super(manager, id);
    }

    @Nonnull
    @Override
    @JsonbProperty("NAME")
    public String getName() {
        return validateValueObject().getName();
    }

    @Nonnull
    @Override
    @JsonbProperty("DATATYPE_NM")
    public Optional<String> getDataTypeNm() {
        return validateValueObject().getDataTypeNm();
    }

    @Nonnull
    @Override
    public Optional<Integer> getDataLength() {
        return validateValueObject().getDataLength();
    }

    @Nonnull
    @Override
    public Optional<Integer> getDataPrecision() {
        return validateValueObject().getDataPrecision();
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
}