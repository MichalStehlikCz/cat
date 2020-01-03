package com.provys.catalogue.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.provys.common.datatype.DtUid;
import com.provys.provysobject.impl.ProvysNmObjectValue;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
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
        date = "2020-01-03T20:17:37.345459600"
)
@SuppressWarnings("ValidExternallyBoundObject")
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(
        propOrder = {"id", "parentId", "nameNm", "name", "note", "ord"}
)
@XmlRootElement(
        name = "ENTITYGRP"
)
public class GenEntityGrpValue extends ProvysNmObjectValue {
    @XmlElement(
            name = "PARENT_ID"
    )
    @Nullable
    private final DtUid parentId;

    @XmlElement(
            name = "NAME"
    )
    @Nonnull
    private final String name;

    @XmlElement(
            name = "NOTE"
    )
    @Nullable
    private final String note;

    @XmlElement(
            name = "ORD"
    )
    private final int ord;

    @JsonCreator
    public GenEntityGrpValue(@JsonProperty("ENTITYGRP_ID") DtUid id,
                             @JsonProperty("PARENT_ID") @Nullable DtUid parentId, @JsonProperty("NAME_NM") String nameNm,
                             @JsonProperty("NAME") String name, @JsonProperty("NOTE") @Nullable String note,
                             @JsonProperty("ORD") int ord) {
        super(id, nameNm);
        this.parentId = parentId;
        this.name = Objects.requireNonNull(name);
        this.note = note;
        this.ord = ord;
    }

    @XmlElement(
            name = "ENTITYGRP_ID"
    )
    @Nonnull
    @Override
    public DtUid getId() {
        return super.getId();
    }

    @Nonnull
    public Optional<DtUid> getParentId() {
        return Optional.ofNullable(parentId);
    }

    @Nonnull
    public String getName() {
        return name;
    }

    @Nonnull
    public Optional<String> getNote() {
        return Optional.ofNullable(note);
    }

    public int getOrd() {
        return ord;
    }

    @Override
    @SuppressWarnings("squid:S1206")
    public boolean equals(@Nullable Object o) {
        if (this == o) return true;
        if (!(o instanceof GenEntityGrpValue)) return false;
        if (!super.equals(o)) return false;
        GenEntityGrpValue that = (GenEntityGrpValue) o;
        return Objects.equals(parentId, that.parentId) &&
                getNameNm().equals(that.getNameNm()) &&
                name.equals(that.name) &&
                Objects.equals(note, that.note) &&
                ord == that.ord;
    }
}