package com.provys.catalogue.impl;

import com.provys.common.exception.InternalException;
import com.provys.provysobject.impl.ProvysNmObjectValueBuilder;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigInteger;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.processing.Generated;
import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbPropertyOrder;
import javax.json.bind.annotation.JsonbTransient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Generated(
        value = "com.provys.provysobject.generator.impl.GeneratorEntity",
        date = "2019-12-12T18:05:32.509850"
)
@JsonbPropertyOrder({"id", "nameNm", "name", "dataTypeNm", "dataLength", "dataPrecision", "note", "allowed", "qVisible", "lVisible", "validateCd", "lFormatCd", "natOrder"})
@XmlRootElement(
        name = "DOMAIN"
)
@XmlAccessorType(XmlAccessType.NONE)
@SuppressWarnings({"WeakerAccess", "unused", "UnusedReturnValue"})
public class GenDomainValueBuilder extends ProvysNmObjectValueBuilder<GenDomainValueBuilder, GenDomainValue> {
    private static final Logger LOG = LogManager.getLogger(GenDomainValueBuilder.class);

    @JsonbProperty("NAME")
    @XmlElement(
            name = "NAME"
    )
    @Nullable
    private String name;

    private boolean updName = false;

    @JsonbProperty("DATATYPE_NM")
    @XmlElement(
            name = "DATATYPE_NM"
    )
    @Nullable
    private String dataTypeNm;

    private boolean updDataTypeNm = false;

    @JsonbProperty("DATALENGTH")
    @XmlElement(
            name = "DATALENGTH"
    )
    @Nullable
    private Integer dataLength;

    private boolean updDataLength = false;

    @JsonbProperty("DATAPRECISION")
    @XmlElement(
            name = "DATAPRECISION"
    )
    @Nullable
    private Integer dataPrecision;

    private boolean updDataPrecision = false;

    @JsonbProperty("NOTE")
    @XmlElement(
            name = "NOTE"
    )
    @Nullable
    private String note;

    private boolean updNote = false;

    @JsonbProperty("ALLOWED")
    @XmlElement(
            name = "ALLOWED"
    )
    @Nullable
    private Boolean allowed;

    private boolean updAllowed = false;

    @JsonbProperty("QVISIBLE")
    @XmlElement(
            name = "QVISIBLE"
    )
    @Nullable
    private Boolean qVisible;

    private boolean updQVisible = false;

    @JsonbProperty("LVISIBLE")
    @XmlElement(
            name = "LVISIBLE"
    )
    @Nullable
    private Boolean lVisible;

    private boolean updLVisible = false;

    @JsonbProperty("VALIDATE_CD")
    @XmlElement(
            name = "VALIDATE_CD"
    )
    @Nullable
    private String validateCd;

    private boolean updValidateCd = false;

    @JsonbProperty("LFORMAT_CD")
    @XmlElement(
            name = "LFORMAT_CD"
    )
    @Nullable
    private String lFormatCd;

    private boolean updLFormatCd = false;

    @JsonbProperty("NATORDER")
    @XmlElement(
            name = "NATORDER"
    )
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

    @JsonbProperty("DOMAIN_ID")
    @XmlElement(
            name = "DOMAIN_ID"
    )
    @Override
    @Nullable
    public BigInteger getId() {
        return super.getId();
    }

    @JsonbProperty("DOMAIN_ID")
    @Override
    @Nonnull
    public GenDomainValueBuilder setId(BigInteger id) {
        return super.setId(id);
    }

    @JsonbProperty("NAME_NM")
    @XmlElement(
            name = "NAME_NM"
    )
    @Override
    @Nullable
    public String getNameNm() {
        return super.getNameNm();
    }

    @JsonbProperty("NAME_NM")
    @Override
    @Nonnull
    public GenDomainValueBuilder setNameNm(String nameNm) {
        return super.setNameNm(nameNm);
    }

    @Nullable
    public String getName() {
        return name;
    }

    public GenDomainValueBuilder setName(String name) {
        this.name = Objects.requireNonNull(name);
        this.updName = true;
        return self();
    }

    @JsonbTransient
    public boolean isUpdName() {
        return updName;
    }

    public void setUpdName(boolean updName) {
        if (!this.updName && updName) {
            throw new InternalException(LOG, "Cannot directly set update flag updName; set value instead");
        }
        this.updName = updName;
        if (!updName) {
            this.name = null;
        }
    }

    @Nullable
    public String getDataTypeNm() {
        return dataTypeNm;
    }

    public GenDomainValueBuilder setDataTypeNm(@Nullable String dataTypeNm) {
        this.dataTypeNm = dataTypeNm;
        this.updDataTypeNm = true;
        return self();
    }

    @JsonbTransient
    public boolean isUpdDataTypeNm() {
        return updDataTypeNm;
    }

    public void setUpdDataTypeNm(boolean updDataTypeNm) {
        this.updDataTypeNm = updDataTypeNm;
        if (!updDataTypeNm) {
            this.dataTypeNm = null;
        }
    }

    @Nullable
    public Integer getDataLength() {
        return dataLength;
    }

    public GenDomainValueBuilder setDataLength(@Nullable Integer dataLength) {
        this.dataLength = dataLength;
        this.updDataLength = true;
        return self();
    }

    @JsonbTransient
    public boolean isUpdDataLength() {
        return updDataLength;
    }

    public void setUpdDataLength(boolean updDataLength) {
        this.updDataLength = updDataLength;
        if (!updDataLength) {
            this.dataLength = null;
        }
    }

    @Nullable
    public Integer getDataPrecision() {
        return dataPrecision;
    }

    public GenDomainValueBuilder setDataPrecision(@Nullable Integer dataPrecision) {
        this.dataPrecision = dataPrecision;
        this.updDataPrecision = true;
        return self();
    }

    @JsonbTransient
    public boolean isUpdDataPrecision() {
        return updDataPrecision;
    }

    public void setUpdDataPrecision(boolean updDataPrecision) {
        this.updDataPrecision = updDataPrecision;
        if (!updDataPrecision) {
            this.dataPrecision = null;
        }
    }

    @Nullable
    public String getNote() {
        return note;
    }

    public GenDomainValueBuilder setNote(@Nullable String note) {
        this.note = note;
        this.updNote = true;
        return self();
    }

    @JsonbTransient
    public boolean isUpdNote() {
        return updNote;
    }

    public void setUpdNote(boolean updNote) {
        this.updNote = updNote;
        if (!updNote) {
            this.note = null;
        }
    }

    @Nullable
    public Boolean isAllowed() {
        return allowed;
    }

    public GenDomainValueBuilder setAllowed(Boolean allowed) {
        this.allowed = Objects.requireNonNull(allowed);
        this.updAllowed = true;
        return self();
    }

    @JsonbTransient
    public boolean isUpdAllowed() {
        return updAllowed;
    }

    public void setUpdAllowed(boolean updAllowed) {
        if (!this.updAllowed && updAllowed) {
            throw new InternalException(LOG, "Cannot directly set update flag updAllowed; set value instead");
        }
        this.updAllowed = updAllowed;
        if (!updAllowed) {
            this.allowed = null;
        }
    }

    @Nullable
    public Boolean isqVisible() {
        return qVisible;
    }

    public GenDomainValueBuilder setqVisible(Boolean qVisible) {
        this.qVisible = Objects.requireNonNull(qVisible);
        this.updQVisible = true;
        return self();
    }

    @JsonbTransient
    public boolean isUpdQVisible() {
        return updQVisible;
    }

    public void setUpdQVisible(boolean updQVisible) {
        if (!this.updQVisible && updQVisible) {
            throw new InternalException(LOG, "Cannot directly set update flag updQVisible; set value instead");
        }
        this.updQVisible = updQVisible;
        if (!updQVisible) {
            this.qVisible = null;
        }
    }

    @Nullable
    public Boolean islVisible() {
        return lVisible;
    }

    public GenDomainValueBuilder setlVisible(Boolean lVisible) {
        this.lVisible = Objects.requireNonNull(lVisible);
        this.updLVisible = true;
        return self();
    }

    @JsonbTransient
    public boolean isUpdLVisible() {
        return updLVisible;
    }

    public void setUpdLVisible(boolean updLVisible) {
        if (!this.updLVisible && updLVisible) {
            throw new InternalException(LOG, "Cannot directly set update flag updLVisible; set value instead");
        }
        this.updLVisible = updLVisible;
        if (!updLVisible) {
            this.lVisible = null;
        }
    }

    @Nullable
    public String getValidateCd() {
        return validateCd;
    }

    public GenDomainValueBuilder setValidateCd(@Nullable String validateCd) {
        this.validateCd = validateCd;
        this.updValidateCd = true;
        return self();
    }

    @JsonbTransient
    public boolean isUpdValidateCd() {
        return updValidateCd;
    }

    public void setUpdValidateCd(boolean updValidateCd) {
        this.updValidateCd = updValidateCd;
        if (!updValidateCd) {
            this.validateCd = null;
        }
    }

    @Nullable
    public String getlFormatCd() {
        return lFormatCd;
    }

    public GenDomainValueBuilder setlFormatCd(@Nullable String lFormatCd) {
        this.lFormatCd = lFormatCd;
        this.updLFormatCd = true;
        return self();
    }

    @JsonbTransient
    public boolean isUpdLFormatCd() {
        return updLFormatCd;
    }

    public void setUpdLFormatCd(boolean updLFormatCd) {
        this.updLFormatCd = updLFormatCd;
        if (!updLFormatCd) {
            this.lFormatCd = null;
        }
    }

    @Nullable
    public Boolean isNatOrder() {
        return natOrder;
    }

    public GenDomainValueBuilder setNatOrder(Boolean natOrder) {
        this.natOrder = Objects.requireNonNull(natOrder);
        this.updNatOrder = true;
        return self();
    }

    @JsonbTransient
    public boolean isUpdNatOrder() {
        return updNatOrder;
    }

    public void setUpdNatOrder(boolean updNatOrder) {
        if (!this.updNatOrder && updNatOrder) {
            throw new InternalException(LOG, "Cannot directly set update flag updNatOrder; set value instead");
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
                Objects.equals(dataTypeNm, that.dataTypeNm) &&
                Objects.equals(dataLength, that.dataLength) &&
                Objects.equals(dataPrecision, that.dataPrecision) &&
                Objects.equals(note, that.note) &&
                Objects.equals(allowed, that.allowed) &&
                Objects.equals(qVisible, that.qVisible) &&
                Objects.equals(lVisible, that.lVisible) &&
                Objects.equals(validateCd, that.validateCd) &&
                Objects.equals(lFormatCd, that.lFormatCd) &&
                Objects.equals(natOrder, that.natOrder);
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