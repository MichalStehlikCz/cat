package com.provys.catalogue.impl;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.provys.common.datatype.DtUid;
import com.provys.common.exception.InternalException;
import com.provys.provysobject.impl.ProvysNmObjectValueBuilder;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.processing.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Generated("com.provys.provysobject.generator.impl.GeneratorEntity")
@XmlRootElement(
        name = "DOMAIN"
)
@XmlAccessorType(XmlAccessType.NONE)
@JsonSerialize(
        using = GenDomainValueBuilderSerializer.class
)
@SuppressWarnings({"WeakerAccess", "unused", "UnusedReturnValue"})
public class GenDomainValueBuilder extends ProvysNmObjectValueBuilder<GenDomainValueBuilder, GenDomainValue> {
    @Nullable
    private String name;

    private boolean updName = false;

    @Nullable
    private String dataTypeNm;

    private boolean updDataTypeNm = false;

    @Nullable
    private Integer dataLength;

    private boolean updDataLength = false;

    @Nullable
    private Integer dataPrecision;

    private boolean updDataPrecision = false;

    @Nullable
    private String note;

    private boolean updNote = false;

    @Nullable
    private Boolean allowed;

    private boolean updAllowed = false;

    @Nullable
    private Boolean qVisible;

    private boolean updQVisible = false;

    @Nullable
    private Boolean lVisible;

    private boolean updLVisible = false;

    @Nullable
    private String validateCd;

    private boolean updValidateCd = false;

    @Nullable
    private String lFormatCd;

    private boolean updLFormatCd = false;

    @Nullable
    private Boolean natOrder;

    private boolean updNatOrder = false;

    public GenDomainValueBuilder() {
    }

    public GenDomainValueBuilder(GenDomainValue value) {
        super(value);
        setName(value.getName());
        setDataTypeNm(value.getDataTypeNm().orElse(null));
        setDataLength(value.getDataLength().orElse(null));
        setDataPrecision(value.getDataPrecision().orElse(null));
        setNote(value.getNote().orElse(null));
        setAllowed(value.isAllowed());
        setqVisible(value.isqVisible());
        setlVisible(value.islVisible());
        setValidateCd(value.getValidateCd().orElse(null));
        setlFormatCd(value.getlFormatCd().orElse(null));
        setNatOrder(value.isNatOrder());
    }

    public GenDomainValueBuilder(GenDomainValueBuilder value) {
        super(value);
        this.name = value.name;
        this.updName = value.updName;
        this.dataTypeNm = value.dataTypeNm;
        this.updDataTypeNm = value.updDataTypeNm;
        this.dataLength = value.dataLength;
        this.updDataLength = value.updDataLength;
        this.dataPrecision = value.dataPrecision;
        this.updDataPrecision = value.updDataPrecision;
        this.note = value.note;
        this.updNote = value.updNote;
        this.allowed = value.allowed;
        this.updAllowed = value.updAllowed;
        this.qVisible = value.qVisible;
        this.updQVisible = value.updQVisible;
        this.lVisible = value.lVisible;
        this.updLVisible = value.updLVisible;
        this.validateCd = value.validateCd;
        this.updValidateCd = value.updValidateCd;
        this.lFormatCd = value.lFormatCd;
        this.updLFormatCd = value.updLFormatCd;
        this.natOrder = value.natOrder;
        this.updNatOrder = value.updNatOrder;
    }

    @XmlElement(
            name = "DOMAIN_ID"
    )
    @Override
    @Nullable
    public DtUid getId() {
        return super.getId();
    }

    @XmlElement(
            name = "NAME"
    )
    @Nullable
    public String getName() {
        return name;
    }

    public GenDomainValueBuilder setName(String name) {
        this.name = Objects.requireNonNull(name);
        this.updName = true;
        return self();
    }

    public boolean isUpdName() {
        return updName;
    }

    public void setUpdName(boolean updName) {
        if (!this.updName && updName) {
            throw new InternalException("Cannot directly set update flag updName; set value instead");
        }
        this.updName = updName;
        if (!updName) {
            this.name = null;
        }
    }

    @XmlElement(
            name = "DATATYPE_NM"
    )
    @Nullable
    public String getDataTypeNm() {
        return dataTypeNm;
    }

    public GenDomainValueBuilder setDataTypeNm(@Nullable String dataTypeNm) {
        this.dataTypeNm = dataTypeNm;
        this.updDataTypeNm = true;
        return self();
    }

    public boolean isUpdDataTypeNm() {
        return updDataTypeNm;
    }

    public void setUpdDataTypeNm(boolean updDataTypeNm) {
        this.updDataTypeNm = updDataTypeNm;
        if (!updDataTypeNm) {
            this.dataTypeNm = null;
        }
    }

    @XmlElement(
            name = "DATALENGTH"
    )
    @Nullable
    public Integer getDataLength() {
        return dataLength;
    }

    public GenDomainValueBuilder setDataLength(@Nullable Integer dataLength) {
        this.dataLength = dataLength;
        this.updDataLength = true;
        return self();
    }

    public boolean isUpdDataLength() {
        return updDataLength;
    }

    public void setUpdDataLength(boolean updDataLength) {
        this.updDataLength = updDataLength;
        if (!updDataLength) {
            this.dataLength = null;
        }
    }

    @XmlElement(
            name = "DATAPRECISION"
    )
    @Nullable
    public Integer getDataPrecision() {
        return dataPrecision;
    }

    public GenDomainValueBuilder setDataPrecision(@Nullable Integer dataPrecision) {
        this.dataPrecision = dataPrecision;
        this.updDataPrecision = true;
        return self();
    }

    public boolean isUpdDataPrecision() {
        return updDataPrecision;
    }

    public void setUpdDataPrecision(boolean updDataPrecision) {
        this.updDataPrecision = updDataPrecision;
        if (!updDataPrecision) {
            this.dataPrecision = null;
        }
    }

    @XmlElement(
            name = "NOTE"
    )
    @Nullable
    public String getNote() {
        return note;
    }

    public GenDomainValueBuilder setNote(@Nullable String note) {
        this.note = note;
        this.updNote = true;
        return self();
    }

    public boolean isUpdNote() {
        return updNote;
    }

    public void setUpdNote(boolean updNote) {
        this.updNote = updNote;
        if (!updNote) {
            this.note = null;
        }
    }

    @XmlElement(
            name = "ALLOWED"
    )
    @Nullable
    public Boolean isAllowed() {
        return allowed;
    }

    public GenDomainValueBuilder setAllowed(Boolean allowed) {
        this.allowed = Objects.requireNonNull(allowed);
        this.updAllowed = true;
        return self();
    }

    public boolean isUpdAllowed() {
        return updAllowed;
    }

    public void setUpdAllowed(boolean updAllowed) {
        if (!this.updAllowed && updAllowed) {
            throw new InternalException("Cannot directly set update flag updAllowed; set value instead");
        }
        this.updAllowed = updAllowed;
        if (!updAllowed) {
            this.allowed = null;
        }
    }

    @XmlElement(
            name = "QVISIBLE"
    )
    @Nullable
    public Boolean isqVisible() {
        return qVisible;
    }

    public GenDomainValueBuilder setqVisible(Boolean qVisible) {
        this.qVisible = Objects.requireNonNull(qVisible);
        this.updQVisible = true;
        return self();
    }

    public boolean isUpdQVisible() {
        return updQVisible;
    }

    public void setUpdQVisible(boolean updQVisible) {
        if (!this.updQVisible && updQVisible) {
            throw new InternalException("Cannot directly set update flag updQVisible; set value instead");
        }
        this.updQVisible = updQVisible;
        if (!updQVisible) {
            this.qVisible = null;
        }
    }

    @XmlElement(
            name = "LVISIBLE"
    )
    @Nullable
    public Boolean islVisible() {
        return lVisible;
    }

    public GenDomainValueBuilder setlVisible(Boolean lVisible) {
        this.lVisible = Objects.requireNonNull(lVisible);
        this.updLVisible = true;
        return self();
    }

    public boolean isUpdLVisible() {
        return updLVisible;
    }

    public void setUpdLVisible(boolean updLVisible) {
        if (!this.updLVisible && updLVisible) {
            throw new InternalException("Cannot directly set update flag updLVisible; set value instead");
        }
        this.updLVisible = updLVisible;
        if (!updLVisible) {
            this.lVisible = null;
        }
    }

    @XmlElement(
            name = "VALIDATE_CD"
    )
    @Nullable
    public String getValidateCd() {
        return validateCd;
    }

    public GenDomainValueBuilder setValidateCd(@Nullable String validateCd) {
        this.validateCd = validateCd;
        this.updValidateCd = true;
        return self();
    }

    public boolean isUpdValidateCd() {
        return updValidateCd;
    }

    public void setUpdValidateCd(boolean updValidateCd) {
        this.updValidateCd = updValidateCd;
        if (!updValidateCd) {
            this.validateCd = null;
        }
    }

    @XmlElement(
            name = "LFORMAT_CD"
    )
    @Nullable
    public String getlFormatCd() {
        return lFormatCd;
    }

    public GenDomainValueBuilder setlFormatCd(@Nullable String lFormatCd) {
        this.lFormatCd = lFormatCd;
        this.updLFormatCd = true;
        return self();
    }

    public boolean isUpdLFormatCd() {
        return updLFormatCd;
    }

    public void setUpdLFormatCd(boolean updLFormatCd) {
        this.updLFormatCd = updLFormatCd;
        if (!updLFormatCd) {
            this.lFormatCd = null;
        }
    }

    @XmlElement(
            name = "NATORDER"
    )
    @Nullable
    public Boolean isNatOrder() {
        return natOrder;
    }

    public GenDomainValueBuilder setNatOrder(Boolean natOrder) {
        this.natOrder = Objects.requireNonNull(natOrder);
        this.updNatOrder = true;
        return self();
    }

    public boolean isUpdNatOrder() {
        return updNatOrder;
    }

    public void setUpdNatOrder(boolean updNatOrder) {
        if (!this.updNatOrder && updNatOrder) {
            throw new InternalException("Cannot directly set update flag updNatOrder; set value instead");
        }
        this.updNatOrder = updNatOrder;
        if (!updNatOrder) {
            this.natOrder = null;
        }
    }

    @Override
    @Nonnull
    public GenDomainValueBuilder self() {
        return this;
    }

    @Override
    @Nonnull
    public GenDomainValueBuilder copy() {
        return new GenDomainValueBuilder(this);
    }

    @Override
    @Nonnull
    public GenDomainValue build() {
        return new GenDomainValue(Objects.requireNonNull(getId(), "DOMAIN_ID must be specified for build")
        , Objects.requireNonNull(getNameNm(), "NAME_NM must be specified for build")
        , Objects.requireNonNull(getName(), "NAME must be specified for build")
        , getDataTypeNm()
        , getDataLength()
        , getDataPrecision()
        , getNote()
        , Objects.requireNonNull(isAllowed(), "ALLOWED must be specified for build")
        , Objects.requireNonNull(isqVisible(), "QVISIBLE must be specified for build")
        , Objects.requireNonNull(islVisible(), "LVISIBLE must be specified for build")
        , getValidateCd()
        , getlFormatCd()
        , Objects.requireNonNull(isNatOrder(), "NATORDER must be specified for build")
        );
    }

    @Override
    @SuppressWarnings("squid:S1206")
    public boolean equals(@Nullable Object o) {
        if (this == o) return true;
        if (!(o instanceof GenDomainValueBuilder)) return false;
        if (!super.equals(o)) return false;
        GenDomainValueBuilder that = (GenDomainValueBuilder) o;
        return Objects.equals(name, that.name) &&
                (updName == that.updName) &&
                Objects.equals(dataTypeNm, that.dataTypeNm) &&
                (updDataTypeNm == that.updDataTypeNm) &&
                Objects.equals(dataLength, that.dataLength) &&
                (updDataLength == that.updDataLength) &&
                Objects.equals(dataPrecision, that.dataPrecision) &&
                (updDataPrecision == that.updDataPrecision) &&
                Objects.equals(note, that.note) &&
                (updNote == that.updNote) &&
                Objects.equals(allowed, that.allowed) &&
                (updAllowed == that.updAllowed) &&
                Objects.equals(qVisible, that.qVisible) &&
                (updQVisible == that.updQVisible) &&
                Objects.equals(lVisible, that.lVisible) &&
                (updLVisible == that.updLVisible) &&
                Objects.equals(validateCd, that.validateCd) &&
                (updValidateCd == that.updValidateCd) &&
                Objects.equals(lFormatCd, that.lFormatCd) &&
                (updLFormatCd == that.updLFormatCd) &&
                Objects.equals(natOrder, that.natOrder) &&
                (updNatOrder == that.updNatOrder);
    }

    @Override
    public String toString() {
        return "DomainValueBuilder{" +
                "  name ='" + name + '\'' +
                ", updName = " + updName +
                ", dataTypeNm ='" + dataTypeNm + '\'' +
                ", updDataTypeNm = " + updDataTypeNm +
                ", dataLength =" + dataLength +
                ", updDataLength = " + updDataLength +
                ", dataPrecision =" + dataPrecision +
                ", updDataPrecision = " + updDataPrecision +
                ", note ='" + note + '\'' +
                ", updNote = " + updNote +
                ", allowed =" + allowed +
                ", updAllowed = " + updAllowed +
                ", qVisible =" + qVisible +
                ", updQVisible = " + updQVisible +
                ", lVisible =" + lVisible +
                ", updLVisible = " + updLVisible +
                ", validateCd ='" + validateCd + '\'' +
                ", updValidateCd = " + updValidateCd +
                ", lFormatCd ='" + lFormatCd + '\'' +
                ", updLFormatCd = " + updLFormatCd +
                ", natOrder =" + natOrder +
                ", updNatOrder = " + updNatOrder +
                "} " + super.toString();
    }
}
