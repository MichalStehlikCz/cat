package com.provys.catalogue.impl;

import com.provys.catalogue.api.AttrGrp;
import com.provys.catalogue.api.AttrType;
import com.provys.catalogue.api.Domain;
import com.provys.catalogue.api.Entity;
import com.provys.provysobject.impl.ProvysObjectValue;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.math.BigInteger;
import java.util.Objects;
import java.util.Optional;

public class AttrGrpValue extends ProvysObjectValue {

    @Nonnull
    private final Entity entity;
    @Nonnull
    private final String nameNm;
    @Nonnull
    private final String name;
    private final int ord;
    @Nullable
    private final String note;

    public AttrGrpValue(BigInteger id, Entity entity, String nameNm, String name, int ord, @Nullable String note)
    {
        super(id);
        this.entity = Objects.requireNonNull(entity);
        this.nameNm = Objects.requireNonNull(nameNm);
        this.name = Objects.requireNonNull(name);
        this.ord = ord;
        this.note = note;
    }

    @Nonnull
    BigInteger getEntityId() {
        return getEntity().getId();
    }

    /**
     * @return entity (corresponding to ENTITY_ID value)
     */
    @Nonnull
    Entity getEntity() {
        return entity;
    }

    /**
     * @return internal name of attribute (attribute NAME_NM)
     */
    @Nonnull
    String getNameNm() {
        return nameNm;
    }

    /**
     * @return name of attribute (attribute NAME)
     */
    @Nonnull
    String getName() {
        return name;
    }

    /**
     * @return order of attribute group (attribute ORD)
     */
    int getOrd() {
        return ord;
    }

    /**
     * @return note related to attribute (attribute NOTE)
     */
    @Nonnull
    Optional<String> getNote() {
        return Optional.ofNullable(note);
    }

    /**
     * Compares attribute groups by their entities, then by ord and if all is the same, by name within same entity
     *
     * @param other other attribute group
     * @return -1 if ordering of this is before other, 0 if both objects are the same and 1 if this object is after
     * the other
     */
    int compareTo(AttrGrp other) {
        int result = getEntity().compareTo(other.getEntity());
        if (result == 0) {
            result = Integer.compare(getOrd(), other.getOrd());
            if (result == 0) {
                result = getName().compareTo(other.getName());
            }
        }
        return result;
    }

    @Override
    @SuppressWarnings("squid:S1206") // using Id for hashing is sufficient
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AttrGrpValue)) return false;
        if (!super.equals(o)) return false;
        AttrGrpValue attrGrpValue = (AttrGrpValue) o;
        return getEntity().equals(attrGrpValue.getEntity()) &&
                getNameNm().equals(attrGrpValue.getNameNm()) &&
                getName().equals(attrGrpValue.getName()) &&
                (getOrd() == attrGrpValue.getOrd()) &&
                Objects.equals(getNote(), attrGrpValue.getNote());
    }
}
