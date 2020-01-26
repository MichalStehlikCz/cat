package com.provys.catalogue.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.provys.common.datatype.DtUid;
import com.provys.provysobject.impl.ProvysObjectValue;
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

@Generated(
        value = "com.provys.provysobject.generator.impl.GeneratorEntity",
        date = "2020-01-26T16:33:11.706984600"
)
@SuppressWarnings("ValidExternallyBoundObject")
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(
        propOrder = {"id", "entityId", "nameNm", "name", "isCustom", "ord", "note"}
)
@XmlRootElement(
        name = "ATTRGRP"
)
public class GenAttrGrpValue extends ProvysObjectValue {
    @XmlElement(
            name = "ENTITY_ID"
    )
    @Nonnull
    private final DtUid entityId;

    @XmlElement(
            name = "NAME_NM"
    )
    @Nonnull
    private final String nameNm;

    @XmlElement(
            name = "NAME"
    )
    @Nonnull
    private final String name;

    @XmlElement(
            name = "ISCUSTOM"
    )
    private final boolean isCustom;

    @XmlElement(
            name = "ORD"
    )
    private final int ord;

    @XmlElement(
            name = "NOTE"
    )
    @Nullable
    private final String note;

    @JsonCreator
    public GenAttrGrpValue(@JsonProperty("ATTRGRP_ID") DtUid id,
            @JsonProperty("ENTITY_ID") DtUid entityId, @JsonProperty("NAME_NM") String nameNm,
            @JsonProperty("NAME") String name, @JsonProperty("ISCUSTOM") boolean isCustom,
            @JsonProperty("ORD") int ord, @JsonProperty("NOTE") @Nullable String note) {
        super(id);
        this.entityId = Objects.requireNonNull(entityId);
        this.nameNm = Objects.requireNonNull(nameNm);
        this.name = Objects.requireNonNull(name);
        this.isCustom = isCustom;
        this.ord = ord;
        this.note = note;
    }

    @XmlElement(
            name = "ATTRGRP_ID"
    )
    @Nonnull
    @Override
    public DtUid getId() {
        return super.getId();
    }

    @Nonnull
    public DtUid getEntityId() {
        return entityId;
    }

    @Nonnull
    public String getNameNm() {
        return nameNm;
    }

    @Nonnull
    public String getName() {
        return name;
    }

    public boolean isIsCustom() {
        return isCustom;
    }

    public int getOrd() {
        return ord;
    }

    @Nonnull
    public Optional<String> getNote() {
        return Optional.ofNullable(note);
    }

    @Override
    @SuppressWarnings("squid:S1206")
    public boolean equals(@Nullable Object o) {
        if (this == o) return true;
        if (!(o instanceof GenAttrGrpValue)) return false;
        if (!super.equals(o)) return false;
        GenAttrGrpValue that = (GenAttrGrpValue) o;
        return entityId.equals(that.entityId) &&
                nameNm.equals(that.nameNm) &&
                name.equals(that.name) &&
                isCustom == that.isCustom &&
                ord == that.ord &&
                Objects.equals(note, that.note);
    }
}
