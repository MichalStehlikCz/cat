package com.provys.catalogue.impl;

import com.provys.catalogue.api.EntityGrp;
import com.provys.provysobject.ProvysObject;
import com.provys.provysobject.impl.ProvysNmObjectValue;
import com.provys.provysobject.impl.ProvysObjectValue;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class EntityGrpValue extends ProvysNmObjectValue {

    @Nullable
    private final EntityGrp parent;
    @Nonnull
    private final String name;
    @Nullable
    private final String note;
    private final int ord;

    public EntityGrpValue(BigInteger id, String nameNm, @Nullable EntityGrp parent, String name, @Nullable String note,
                          int ord) {
        super(id, nameNm);
        this.parent = parent;
        this.name = Objects.requireNonNull(name);
        this.note = note;
        this.ord = ord;
    }

    /**
     * @return parent id (attribute PARENT_ID)
     */
    @Nonnull
    Optional<BigInteger> getParentId() {
        return getParent().map(ProvysObject::getId);
    }

    /**
     * @return parent entity group (entity group with Id PARENT_ID)
     */
    @Nonnull
    Optional<EntityGrp> getParent() {
        return Optional.ofNullable(parent);
    }

    /**
     * @return name (attribute NAME)
     */
    @Nonnull
    String getName() {
        return name;
    }

    /**
     * @return note (attribute NOTE)
     */
    @Nonnull
    Optional<String> getNote() {
        return Optional.ofNullable(note);
    }

    /**
     * @return order (attribute ORD)
     */
    int getOrd() {
        return ord;
    }

    @Nonnull
    List<Integer> getFullOrd() {
        var result = getParent().map(EntityGrp::getFullOrd).orElse(new ArrayList<>(5));
        result.add(getOrd());
        return result;
    }

    /**
     * Compares entity groups by their order within the same parent and by their parents starting from root. Parent is
     * considered before its children. If all is the same, order is determined by name of entity group.
     *
     * @param other is other entity group to be compared with
     * @return -1 if full ordering of this is before other, 0 if both objects are the same and 1 if this object is after
     * other
     */
    int compareTo(EntityGrp other) {
        if (other.getParent() == getParent()) {
            // most common comparison - comparing two children of the same parent
            int result = Integer.compare(getOrd(), other.getOrd());
            if (result == 0) {
                result = getName().compareTo(other.getName());
            }
            return result;
        }
        // calculate full path from root and compare paths...
        List<Integer> myFullOrd = getFullOrd();
        List<Integer> otherFullOrd = other.getFullOrd();
        for (int i = 0; i < myFullOrd.size(); i++) {
            if (i >= otherFullOrd.size()) {
                // same start but other is shorter -> other is before this (parent before child)
                return 1;
            }
            if (myFullOrd.get(i) < otherFullOrd.get(i)) {
                return -1;
            } else if (myFullOrd.get(i) > otherFullOrd.get(i)) {
                return 1;
            }
        }
        if (myFullOrd.size() < otherFullOrd.size()) {
            // start same but this is shorter -> this is before other (parent before child)
            return -1;
        }
        // both objects are the same based on ord
        return getName().compareTo(other.getName());
    }

    @Override
    @SuppressWarnings("squid:S1206") // using Id as hash code is sufficient, no need to add additional fields
    public boolean equals(@Nullable Object o) {
        if (this == o) return true;
        if (!(o instanceof EntityGrpValue)) return false;
        if (!super.equals(o)) return false;
        EntityGrpValue that = (EntityGrpValue) o;
        return getOrd() == that.getOrd() &&
                Objects.equals(getParent(), that.getParent()) &&
                getName().equals(that.getName()) &&
                Objects.equals(getNote(), that.getNote());
    }

    @Override
    public String toString() {
        return "EntityGrpValue{" +
                "id = " + getId() +
                ", nameNm = \"" + getNameNm() + '"' +
                ", parent=" + getParent().map(EntityGrp::toString).orElse("null") +
                ", name=\"" + name + '"' +
                ", note=" + getNote().map(val -> '"' + val + '"').orElse("null") +
                ", ord=" + ord +
                '}';
    }
}
