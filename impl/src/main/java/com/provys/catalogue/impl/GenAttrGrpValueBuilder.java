package com.provys.catalogue.impl;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.provys.common.datatype.DtUid;
import com.provys.common.exception.InternalException;
import com.provys.provysobject.impl.ProvysObjectValueBuilder;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.processing.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Generated(
        value = "com.provys.provysobject.generator.impl.GeneratorEntity",
        date = "2020-01-04T08:38:02.018720300"
)
@XmlRootElement(
        name = "ATTRGRP"
)
@XmlAccessorType(XmlAccessType.NONE)
@JsonSerialize(
        using = GenAttrGrpValueBuilderSerializer.class
)
@SuppressWarnings({"WeakerAccess", "unused", "UnusedReturnValue"})
public class GenAttrGrpValueBuilder extends ProvysObjectValueBuilder<GenAttrGrpValueBuilder, GenAttrGrpValue> {
    private static final Logger LOG = LogManager.getLogger(GenAttrGrpValueBuilder.class);

    @Nullable
    private DtUid entityId;

    private boolean updEntityId = false;

    @Nullable
    private String nameNm;

    private boolean updNameNm = false;

    @Nullable
    private String name;

    private boolean updName = false;

    @Nullable
    private Boolean isCustom;

    private boolean updIsCustom = false;

    @Nullable
    private Integer ord;

    private boolean updOrd = false;

    @Nullable
    private String note;

    private boolean updNote = false;

    public GenAttrGrpValueBuilder() {
    }

    public GenAttrGrpValueBuilder(GenAttrGrpValue value) {
        super(value);
        setEntityId(value.getEntityId());
        setNameNm(value.getNameNm());
        setName(value.getName());
        setIsCustom(value.isIsCustom());
        setOrd(value.getOrd());
        setNote(value.getNote().orElse(null));
    }

    public GenAttrGrpValueBuilder(GenAttrGrpValueBuilder value) {
        super(value);
        this.entityId = value.entityId;
        this.updEntityId = value.updEntityId;
        this.nameNm = value.nameNm;
        this.updNameNm = value.updNameNm;
        this.name = value.name;
        this.updName = value.updName;
        this.isCustom = value.isCustom;
        this.updIsCustom = value.updIsCustom;
        this.ord = value.ord;
        this.updOrd = value.updOrd;
        this.note = value.note;
        this.updNote = value.updNote;
    }

    @XmlElement(
            name = "ATTRGRP_ID"
    )
    @Override
    @Nullable
    public DtUid getId() {
        return super.getId();
    }

    @XmlElement(
            name = "ENTITY_ID"
    )
    @Nullable
    public DtUid getEntityId() {
        return entityId;
    }

    public GenAttrGrpValueBuilder setEntityId(DtUid entityId) {
        this.entityId = Objects.requireNonNull(entityId);
        this.updEntityId = true;
        return self();
    }

    public boolean isUpdEntityId() {
        return updEntityId;
    }

    public void setUpdEntityId(boolean updEntityId) {
        if (!this.updEntityId && updEntityId) {
            throw new InternalException(LOG, "Cannot directly set update flag updEntityId; set value instead");
        }
        this.updEntityId = updEntityId;
        if (!updEntityId) {
            this.entityId = null;
        }
    }

    @XmlElement(
            name = "NAME_NM"
    )
    @Nullable
    public String getNameNm() {
        return nameNm;
    }

    public GenAttrGrpValueBuilder setNameNm(String nameNm) {
        this.nameNm = Objects.requireNonNull(nameNm);
        this.updNameNm = true;
        return self();
    }

    public boolean isUpdNameNm() {
        return updNameNm;
    }

    public void setUpdNameNm(boolean updNameNm) {
        if (!this.updNameNm && updNameNm) {
            throw new InternalException(LOG, "Cannot directly set update flag updNameNm; set value instead");
        }
        this.updNameNm = updNameNm;
        if (!updNameNm) {
            this.nameNm = null;
        }
    }

    @XmlElement(
            name = "NAME"
    )
    @Nullable
    public String getName() {
        return name;
    }

    public GenAttrGrpValueBuilder setName(String name) {
        this.name = Objects.requireNonNull(name);
        this.updName = true;
        return self();
    }

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

    @XmlElement(
            name = "ISCUSTOM"
    )
    @Nullable
    public Boolean isIsCustom() {
        return isCustom;
    }

    public GenAttrGrpValueBuilder setIsCustom(Boolean isCustom) {
        this.isCustom = Objects.requireNonNull(isCustom);
        this.updIsCustom = true;
        return self();
    }

    public boolean isUpdIsCustom() {
        return updIsCustom;
    }

    public void setUpdIsCustom(boolean updIsCustom) {
        if (!this.updIsCustom && updIsCustom) {
            throw new InternalException(LOG, "Cannot directly set update flag updIsCustom; set value instead");
        }
        this.updIsCustom = updIsCustom;
        if (!updIsCustom) {
            this.isCustom = null;
        }
    }

    @XmlElement(
            name = "ORD"
    )
    @Nullable
    public Integer getOrd() {
        return ord;
    }

    public GenAttrGrpValueBuilder setOrd(Integer ord) {
        this.ord = Objects.requireNonNull(ord);
        this.updOrd = true;
        return self();
    }

    public boolean isUpdOrd() {
        return updOrd;
    }

    public void setUpdOrd(boolean updOrd) {
        if (!this.updOrd && updOrd) {
            throw new InternalException(LOG, "Cannot directly set update flag updOrd; set value instead");
        }
        this.updOrd = updOrd;
        if (!updOrd) {
            this.ord = null;
        }
    }

    @XmlElement(
            name = "NOTE"
    )
    @Nullable
    public String getNote() {
        return note;
    }

    public GenAttrGrpValueBuilder setNote(@Nullable String note) {
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

    @Override
    @Nonnull
    public GenAttrGrpValueBuilder self() {
        return this;
    }

    @Override
    @Nonnull
    public GenAttrGrpValueBuilder copy() {
        return new GenAttrGrpValueBuilder(this);
    }

    @Override
    @Nonnull
    public GenAttrGrpValue build() {
        return new GenAttrGrpValue(Objects.requireNonNull(getId(), "ATTRGRP_ID must be specified for build")
                , Objects.requireNonNull(getEntityId(), "ENTITY_ID must be specified for build")
                , Objects.requireNonNull(getNameNm(), "NAME_NM must be specified for build")
                , Objects.requireNonNull(getName(), "NAME must be specified for build")
                , Objects.requireNonNull(isIsCustom(), "ISCUSTOM must be specified for build")
                , Objects.requireNonNull(getOrd(), "ORD must be specified for build")
                , getNote()
        );
    }

    @Override
    @SuppressWarnings("squid:S1206")
    public boolean equals(@Nullable Object o) {
        if (this == o) return true;
        if (!(o instanceof GenAttrGrpValueBuilder)) return false;
        if (!super.equals(o)) return false;
        GenAttrGrpValueBuilder that = (GenAttrGrpValueBuilder) o;
        return Objects.equals(entityId, that.entityId) &&
                (updEntityId == that.updEntityId) &&
                Objects.equals(nameNm, that.nameNm) &&
                (updNameNm == that.updNameNm) &&
                Objects.equals(name, that.name) &&
                (updName == that.updName) &&
                Objects.equals(isCustom, that.isCustom) &&
                (updIsCustom == that.updIsCustom) &&
                Objects.equals(ord, that.ord) &&
                (updOrd == that.updOrd) &&
                Objects.equals(note, that.note) &&
                (updNote == that.updNote);
    }

    @Override
    public String toString() {
        return "AttrGrpValueBuilder{" +
                "  entityId =" + entityId +
                ", updEntityId = " + updEntityId +
                ", nameNm ='" + nameNm + '\'' +
                ", updNameNm = " + updNameNm +
                ", name ='" + name + '\'' +
                ", updName = " + updName +
                ", isCustom =" + isCustom +
                ", updIsCustom = " + updIsCustom +
                ", ord =" + ord +
                ", updOrd = " + updOrd +
                ", note ='" + note + '\'' +
                ", updNote = " + updNote +
                "} " + super.toString();
    }
}