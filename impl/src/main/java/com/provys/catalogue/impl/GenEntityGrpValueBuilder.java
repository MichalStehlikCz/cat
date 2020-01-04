package com.provys.catalogue.impl;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.provys.common.datatype.DtUid;
import com.provys.common.exception.InternalException;
import com.provys.provysobject.impl.ProvysNmObjectValueBuilder;
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
        date = "2020-01-04T08:34:24.278852800"
)
@XmlRootElement(
        name = "ENTITYGRP"
)
@XmlAccessorType(XmlAccessType.NONE)
@JsonSerialize(
        using = GenEntityGrpValueBuilderSerializer.class
)
@SuppressWarnings({"WeakerAccess", "unused", "UnusedReturnValue"})
public class GenEntityGrpValueBuilder extends ProvysNmObjectValueBuilder<GenEntityGrpValueBuilder, GenEntityGrpValue> {
    private static final Logger LOG = LogManager.getLogger(GenEntityGrpValueBuilder.class);

    @Nullable
    private DtUid parentId;

    private boolean updParentId = false;

    @Nullable
    private String name;

    private boolean updName = false;

    @Nullable
    private String note;

    private boolean updNote = false;

    @Nullable
    private Integer ord;

    private boolean updOrd = false;

    public GenEntityGrpValueBuilder() {
    }

    public GenEntityGrpValueBuilder(GenEntityGrpValue value) {
        super(value);
        setParentId(value.getParentId().orElse(null));
        setName(value.getName());
        setNote(value.getNote().orElse(null));
        setOrd(value.getOrd());
    }

    public GenEntityGrpValueBuilder(GenEntityGrpValueBuilder value) {
        super(value);
        this.parentId = value.parentId;
        this.updParentId = value.updParentId;
        this.name = value.name;
        this.updName = value.updName;
        this.note = value.note;
        this.updNote = value.updNote;
        this.ord = value.ord;
        this.updOrd = value.updOrd;
    }

    @XmlElement(
            name = "ENTITYGRP_ID"
    )
    @Override
    @Nullable
    public DtUid getId() {
        return super.getId();
    }

    @XmlElement(
            name = "PARENT_ID"
    )
    @Nullable
    public DtUid getParentId() {
        return parentId;
    }

    public GenEntityGrpValueBuilder setParentId(@Nullable DtUid parentId) {
        this.parentId = parentId;
        this.updParentId = true;
        return self();
    }

    public boolean isUpdParentId() {
        return updParentId;
    }

    public void setUpdParentId(boolean updParentId) {
        this.updParentId = updParentId;
        if (!updParentId) {
            this.parentId = null;
        }
    }

    @XmlElement(
            name = "NAME"
    )
    @Nullable
    public String getName() {
        return name;
    }

    public GenEntityGrpValueBuilder setName(String name) {
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
            name = "NOTE"
    )
    @Nullable
    public String getNote() {
        return note;
    }

    public GenEntityGrpValueBuilder setNote(@Nullable String note) {
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
            name = "ORD"
    )
    @Nullable
    public Integer getOrd() {
        return ord;
    }

    public GenEntityGrpValueBuilder setOrd(Integer ord) {
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

    @Override
    @Nonnull
    public GenEntityGrpValueBuilder self() {
        return this;
    }

    @Override
    @Nonnull
    public GenEntityGrpValueBuilder copy() {
        return new GenEntityGrpValueBuilder(this);
    }

    @Override
    @Nonnull
    public GenEntityGrpValue build() {
        return new GenEntityGrpValue(Objects.requireNonNull(getId(), "ENTITYGRP_ID must be specified for build")
                , getParentId()
                , Objects.requireNonNull(getNameNm(), "NAME_NM must be specified for build")
                , Objects.requireNonNull(getName(), "NAME must be specified for build")
                , getNote()
                , Objects.requireNonNull(getOrd(), "ORD must be specified for build")
        );
    }

    @Override
    @SuppressWarnings("squid:S1206")
    public boolean equals(@Nullable Object o) {
        if (this == o) return true;
        if (!(o instanceof GenEntityGrpValueBuilder)) return false;
        if (!super.equals(o)) return false;
        GenEntityGrpValueBuilder that = (GenEntityGrpValueBuilder) o;
        return Objects.equals(parentId, that.parentId) &&
                (updParentId == that.updParentId) &&
                Objects.equals(name, that.name) &&
                (updName == that.updName) &&
                Objects.equals(note, that.note) &&
                (updNote == that.updNote) &&
                Objects.equals(ord, that.ord) &&
                (updOrd == that.updOrd);
    }

    @Override
    public String toString() {
        return "EntityGrpValueBuilder{" +
                "  parentId =" + parentId +
                ", updParentId = " + updParentId +
                ", name ='" + name + '\'' +
                ", updName = " + updName +
                ", note ='" + note + '\'' +
                ", updNote = " + updNote +
                ", ord =" + ord +
                ", updOrd = " + updOrd +
                "} " + super.toString();
    }
}