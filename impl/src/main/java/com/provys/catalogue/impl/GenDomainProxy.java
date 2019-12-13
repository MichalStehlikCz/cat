package com.provys.catalogue.impl;

import com.provys.catalogue.api.Domain;
import com.provys.provysobject.impl.ProvysNmObjectProxyImpl;
import java.lang.Integer;
import java.lang.String;
import java.math.BigInteger;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.processing.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Generated(
        value = "com.provys.provysobject.generator.impl.GeneratorEntity",
        date = "2019-12-12T18:20:33.025333800"
)
@XmlAccessorType(XmlAccessType.NONE)
abstract class GenDomainProxy extends ProvysNmObjectProxyImpl<Domain, DomainValue, DomainProxy, DomainManagerImpl> {
    GenDomainProxy(DomainManagerImpl manager, BigInteger id) {
        super(manager, id);
    }

    @XmlElement(
            name = "DOMAIN_ID"
    )
    public BigInteger getId() {
        return super.getId();
    }

    @Nonnull
    @XmlElement(
            name = "NAME"
    )
    public String getName() {
        return validateValueObject().getName();
    }

    @Nonnull
    @XmlElement(
            name = "DATATYPE_NM"
    )
    public Optional<String> getDataTypeNm() {
        return validateValueObject().getDataTypeNm();
    }

    @Nonnull
    @XmlElement(
            name = "DATALENGTH"
    )
    public Optional<Integer> getDataLength() {
        return validateValueObject().getDataLength();
    }

    @Nonnull
    @XmlElement(
            name = "DATAPRECISION"
    )
    public Optional<Integer> getDataPrecision() {
        return validateValueObject().getDataPrecision();
    }

    @Nonnull
    @XmlElement(
            name = "NOTE"
    )
    public Optional<String> getNote() {
        return validateValueObject().getNote();
    }

    @XmlElement(
            name = "ALLOWED"
    )
    public boolean isAllowed() {
        return validateValueObject().isAllowed();
    }

    @XmlElement(
            name = "QVISIBLE"
    )
    public boolean isqVisible() {
        return validateValueObject().isqVisible();
    }

    @XmlElement(
            name = "LVISIBLE"
    )
    public boolean islVisible() {
        return validateValueObject().islVisible();
    }

    @Nonnull
    @XmlElement(
            name = "VALIDATE_CD"
    )
    public Optional<String> getValidateCd() {
        return validateValueObject().getValidateCd();
    }

    @Nonnull
    @XmlElement(
            name = "LFORMAT_CD"
    )
    public Optional<String> getlFormatCd() {
        return validateValueObject().getlFormatCd();
    }

    @XmlElement(
            name = "NATORDER"
    )
    public boolean isNatOrder() {
        return validateValueObject().isNatOrder();
    }
}