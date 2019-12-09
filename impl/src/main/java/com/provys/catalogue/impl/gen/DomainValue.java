package com.provys.catalogue.impl.gen;

import com.provys.catalogue.api.DomainBase;
import com.provys.provysobject.impl.ProvysNmObjectValue;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigInteger;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.json.bind.annotation.JsonbProperty;

public class DomainValue extends ProvysNmObjectValue implements DomainBase {
    @Nonnull
    private final String name;

    @Nullable
    private final String dataTypeNm;

    @Nullable
    private final Integer dataLength;

    @Nullable
    private final Integer dataPrecision;

    @Nullable
    private final String note;

    private final boolean allowed;

    private final boolean qVisible;

    private final boolean lVisible;

    @Nullable
    private final String validateCd;

    @Nullable
    private final String lFormatCd;

    private final boolean natOrder;

    public DomainValue(BigInteger id, String nameNm, String name, @Nullable String dataTypeNm,
                       @Nullable Integer dataLength, @Nullable Integer dataPrecision, @Nullable String note,
                       boolean allowed, boolean qVisible, boolean lVisible, @Nullable String validateCd,
                       @Nullable String lFormatCd, boolean natOrder) {
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

    @Nonnull
    @Override
    @JsonbProperty("NAME")
    public String getName() {
        return name;
    }

    @Nonnull
    @Override
    @JsonbProperty("DATATYPE_NM")
    public Optional<String> getDataTypeNm() {
        return Optional.ofNullable(dataTypeNm);
    }

    @Nonnull
    @Override
    public Optional<Integer> getDataLength() {
        return Optional.ofNullable(dataLength);
    }

    @Nonnull
    @Override
    public Optional<Integer> getDataPrecision() {
        return Optional.ofNullable(dataPrecision);
    }

    @Nonnull
    @Override
    public Optional<String> getNote() {
        return Optional.ofNullable(note);
    }

    @Override
    public boolean isAllowed() {
        return allowed;
    }

    @Override
    public boolean isQVisible() {
        return qVisible;
    }

    @Override
    public boolean isLVisible() {
        return lVisible;
    }

    @Nonnull
    @Override
    public Optional<String> getValidateCd() {
        return Optional.ofNullable(validateCd);
    }

    @Nonnull
    @Override
    public Optional<String> getLFormatCd() {
        return Optional.ofNullable(lFormatCd);
    }

    @Override
    public boolean isNatOrder() {
        return natOrder;
    }

    @Override
    @SuppressWarnings("squid:S1206")
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DomainValue)) return false;
        if (!super.equals(o)) return false;
        DomainValue that = (DomainValue) o;
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