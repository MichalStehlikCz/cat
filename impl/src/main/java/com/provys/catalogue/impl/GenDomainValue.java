package com.provys.catalogue.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.provys.common.datatype.DtUid;
import com.provys.provysobject.impl.ProvysNmObjectValue;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.processing.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@Generated("com.provys.provysobject.generator.impl.GeneratorEntity")
@SuppressWarnings("ValidExternallyBoundObject")
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(
        propOrder = {"id", "nameNm", "name", "dataTypeNm", "dataLength", "dataPrecision", "note", "allowed", "qVisible", "lVisible", "validateCd", "lFormatCd", "natOrder"}
)
@XmlRootElement(
        name = "DOMAIN"
)
public class GenDomainValue extends ProvysNmObjectValue {
    @XmlElement(
            name = "NAME"
    )
    @Nonnull
    private final String name;

    @XmlElement(
            name = "DATATYPE_NM"
    )
    @Nullable
    private final String dataTypeNm;

    @XmlElement(
            name = "DATALENGTH"
    )
    @Nullable
    private final Integer dataLength;

    @XmlElement(
            name = "DATAPRECISION"
    )
    @Nullable
    private final Integer dataPrecision;

    @XmlElement(
            name = "NOTE"
    )
    @Nullable
    private final String note;

    @XmlElement(
            name = "ALLOWED"
    )
    private final boolean allowed;

    @XmlElement(
            name = "QVISIBLE"
    )
    private final boolean qVisible;

    @XmlElement(
            name = "LVISIBLE"
    )
    private final boolean lVisible;

    @XmlElement(
            name = "VALIDATE_CD"
    )
    @Nullable
    private final String validateCd;

    @XmlElement(
            name = "LFORMAT_CD"
    )
    @Nullable
    private final String lFormatCd;

    @XmlElement(
            name = "NATORDER"
    )
    private final boolean natOrder;

    @JsonCreator
    public GenDomainValue(@JsonProperty("DOMAIN_ID") DtUid id,
            @JsonProperty("NAME_NM") String nameNm, @JsonProperty("NAME") String name,
            @JsonProperty("DATATYPE_NM") @Nullable String dataTypeNm,
            @JsonProperty("DATALENGTH") @Nullable Integer dataLength,
            @JsonProperty("DATAPRECISION") @Nullable Integer dataPrecision,
            @JsonProperty("NOTE") @Nullable String note, @JsonProperty("ALLOWED") boolean allowed,
            @JsonProperty("QVISIBLE") boolean qVisible, @JsonProperty("LVISIBLE") boolean lVisible,
            @JsonProperty("VALIDATE_CD") @Nullable String validateCd,
            @JsonProperty("LFORMAT_CD") @Nullable String lFormatCd,
            @JsonProperty("NATORDER") boolean natOrder) {
        super(id, nameNm);
        this.name = Objects.requireNonNull(name);
        this.dataTypeNm = dataTypeNm;
        this.dataLength = dataLength;
        this.dataPrecision = dataPrecision;
        this.note = note;
        this.allowed = allowed;
        this.qVisible = qVisible;
        this.lVisible = lVisible;
        this.validateCd = validateCd;
        this.lFormatCd = lFormatCd;
        this.natOrder = natOrder;
    }

    @XmlElement(
            name = "DOMAIN_ID"
    )
    @Nonnull
    @Override
    public DtUid getId() {
        return super.getId();
    }

    @Nonnull
    public String getName() {
        return name;
    }

    @Nonnull
    public Optional<String> getDataTypeNm() {
        return Optional.ofNullable(dataTypeNm);
    }

    @Nonnull
    public Optional<Integer> getDataLength() {
        return Optional.ofNullable(dataLength);
    }

    @Nonnull
    public Optional<Integer> getDataPrecision() {
        return Optional.ofNullable(dataPrecision);
    }

    @Nonnull
    public Optional<String> getNote() {
        return Optional.ofNullable(note);
    }

    public boolean isAllowed() {
        return allowed;
    }

    public boolean isqVisible() {
        return qVisible;
    }

    public boolean islVisible() {
        return lVisible;
    }

    @Nonnull
    public Optional<String> getValidateCd() {
        return Optional.ofNullable(validateCd);
    }

    @Nonnull
    public Optional<String> getlFormatCd() {
        return Optional.ofNullable(lFormatCd);
    }

    public boolean isNatOrder() {
        return natOrder;
    }

    @Override
    @SuppressWarnings("squid:S1206")
    public boolean equals(@Nullable Object o) {
        if (this == o) return true;
        if (!(o instanceof GenDomainValue)) return false;
        if (!super.equals(o)) return false;
        GenDomainValue that = (GenDomainValue) o;
        return getNameNm().equals(that.getNameNm()) &&
                name.equals(that.name) &&
                Objects.equals(dataTypeNm, that.dataTypeNm) &&
                Objects.equals(dataLength, that.dataLength) &&
                Objects.equals(dataPrecision, that.dataPrecision) &&
                Objects.equals(note, that.note) &&
                allowed == that.allowed &&
                qVisible == that.qVisible &&
                lVisible == that.lVisible &&
                Objects.equals(validateCd, that.validateCd) &&
                Objects.equals(lFormatCd, that.lFormatCd) &&
                natOrder == that.natOrder;
    }
}
