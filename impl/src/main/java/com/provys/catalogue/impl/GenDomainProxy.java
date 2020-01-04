package com.provys.catalogue.impl;

import com.provys.catalogue.api.Domain;
import com.provys.common.datatype.DtUid;
import com.provys.provysobject.impl.ProvysNmObjectProxyImpl;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.processing.Generated;

@Generated(
        value = "com.provys.provysobject.generator.impl.GeneratorEntity",
        date = "2020-01-04T08:49:37.855960100"
)
abstract class GenDomainProxy extends ProvysNmObjectProxyImpl<Domain, GenDomainValue, DomainProxy, DomainManagerImpl> {
    GenDomainProxy(DomainManagerImpl manager, DtUid id) {
        super(manager, id);
    }

    @Nonnull
    public String getName() {
        return validateValueObject().getName();
    }

    @Nonnull
    public Optional<String> getDataTypeNm() {
        return validateValueObject().getDataTypeNm();
    }

    @Nonnull
    public Optional<Integer> getDataLength() {
        return validateValueObject().getDataLength();
    }

    @Nonnull
    public Optional<Integer> getDataPrecision() {
        return validateValueObject().getDataPrecision();
    }

    @Nonnull
    public Optional<String> getNote() {
        return validateValueObject().getNote();
    }

    public boolean isAllowed() {
        return validateValueObject().isAllowed();
    }

    public boolean isqVisible() {
        return validateValueObject().isqVisible();
    }

    public boolean islVisible() {
        return validateValueObject().islVisible();
    }

    @Nonnull
    public Optional<String> getValidateCd() {
        return validateValueObject().getValidateCd();
    }

    @Nonnull
    public Optional<String> getlFormatCd() {
        return validateValueObject().getlFormatCd();
    }

    public boolean isNatOrder() {
        return validateValueObject().isNatOrder();
    }
}