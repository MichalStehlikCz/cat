package com.provys.catalogue.impl;

import com.provys.provysobject.impl.ProvysNmObjectValue;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.math.BigInteger;
import java.util.Objects;
import java.util.Optional;

public class DomainValue extends ProvysNmObjectValue {

    @Nonnull
    private final String name;
    @Nullable
    private final String dataType;
    @Nullable
    private final Short dataLength;
    @Nullable
    private final Byte dataPrecision;
    private final boolean qVisible;
    private final boolean lVisible;
    @Nullable
    private final String validateCd;
    @Nullable
    private final String lFormatCd;
    private final boolean natOrder;
    @Nullable
    private final String note;
    private final boolean allowed;

    DomainValue(BigInteger id, String nameNm, String name, @Nullable String dataType, @Nullable Short dataLength,
                       @Nullable Byte dataPrecision, boolean qVisible, boolean lVisible, @Nullable String validateCd,
                       @Nullable String lFormatCd, boolean natOrder, @Nullable String note, boolean allowed) {
        super(id, nameNm);
        this.name = name;
        this.dataType = dataType;
        this.dataLength = dataLength;
        this.dataPrecision = dataPrecision;
        this.qVisible = qVisible;
        this.lVisible = lVisible;
        this.validateCd = validateCd;
        this.lFormatCd = lFormatCd;
        this.natOrder = natOrder;
        this.note = note;
        this.allowed = allowed;
    }

    /**
     * @return name of domain (attribute NAME)
     */
    @Nonnull
    String getName() {
        return name;
    }

    /**
     * @return data type (attribute DATATYPE_NM)
     */
    @Nonnull
    Optional<String> getDataType() {
        return Optional.ofNullable(dataType);
    }

    /**
     * @return data length - number of characters / number of digits (attribute DATALENGTH)
     */
    @Nonnull
    Optional<Short> getDataLength() {
        return Optional.ofNullable(dataLength);
    }

    /**
     * @return precision - number of digits after decimal point (attribute DATAPRECISION)
     */
    @Nonnull
    Optional<Byte> getDataPrecision() {
        return Optional.ofNullable(dataPrecision);
    }

    /**
     * @return default query visibility (attribute QVISIBLE)
     */
    boolean isQVisible() {
        return qVisible;
    }

    /**
     * @return default XML list visibility (attribute LVISIBLE)
     */
    boolean isLVisible() {
        return lVisible;
    }

    /**
     * @return validation code (attribute VALIDATE_CD)
     */
    @Nonnull
    Optional<String> getValidateCd() {
        return Optional.ofNullable(validateCd);
    }

    /**
     * @return formatting for XML list (attribute LFORMAT_CD)
     */
    @Nonnull
    Optional<String> getLFormatCd() {
        return Optional.ofNullable(lFormatCd);
    }

    /**
     * @return if domain has native ordering (can be used in ORDER BY without conversion to string value) (attribute
     * NATORDER)
     */
    boolean isNatOrder() {
        return natOrder;
    }

    /**
     * @return note (attribute NOTE)
     */
    @Nonnull
    Optional<String> getNote() {
        return Optional.ofNullable(note);
    }

    /**
     * @return if domain is allowed; not allowed domains are only maintained for backward compatibility (attribute
     * ALLOWED)
     */
    boolean isAllowed() {
        return allowed;
    }

    @Override
    @SuppressWarnings("squid:S1206") // Id is sufficient for hashcode
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DomainValue)) return false;
        if (!super.equals(o)) return false;
        DomainValue that = (DomainValue) o;
        return qVisible == that.qVisible &&
                lVisible == that.lVisible &&
                isNatOrder() == that.isNatOrder() &&
                isAllowed() == that.isAllowed() &&
                getName().equals(that.getName()) &&
                Objects.equals(getDataType(), that.getDataType()) &&
                Objects.equals(getDataLength(), that.getDataLength()) &&
                Objects.equals(getDataPrecision(), that.getDataPrecision()) &&
                Objects.equals(getValidateCd(), that.getValidateCd()) &&
                Objects.equals(lFormatCd, that.lFormatCd) &&
                Objects.equals(getNote(), that.getNote());
    }
}
