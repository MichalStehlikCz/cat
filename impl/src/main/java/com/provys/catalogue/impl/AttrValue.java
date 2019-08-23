package com.provys.catalogue.impl;

import com.provys.catalogue.api.*;
import com.provys.provysobject.impl.ProvysObjectValue;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class AttrValue extends ProvysObjectValue {

    @Nonnull
    private final Entity entity;
    @Nonnull
    private final String nameNm;
    @Nonnull
    private final String name;
    @Nullable
    private final String properNameRoot;
    @Nullable
    private final AttrGrp attrGrp;
    private final int ord;
    @Nullable
    private final String note;
    @Nonnull
    private final AttrType attrType;
    @Nonnull
    private final Domain domain;
    @Nullable
    private final String subdomainNm;
    private final boolean mandatory;
    @Nullable
    private final String defValue;

    public AttrValue(BigInteger id, Entity entity, String nameNm, String name, @Nullable String properNameRoot,
                     @Nullable AttrGrp attrGrp, int ord, @Nullable String note, AttrType attrType, Domain domain,
                     @Nullable String subdomainNm, boolean mandatory, @Nullable String defValue)
    {
        super(id);
        this.entity = Objects.requireNonNull(entity);
        this.nameNm = Objects.requireNonNull(nameNm);
        this.name = Objects.requireNonNull(name);
        this.properNameRoot = properNameRoot;
        this.attrGrp = attrGrp;
        this.ord = ord;
        this.note = note;
        this.attrType = Objects.requireNonNull(attrType);
        this.domain = Objects.requireNonNull(domain);
        this.subdomainNm = subdomainNm;
        this.mandatory = mandatory;
        this.defValue = defValue;
    }

    /**
     * @return entity UID (attribute ENTITY_ID)
     */
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
     * @return root of propername of attribute (attribute PROPERNAMEROOT)
     */
    @Nonnull
    Optional<String> getProperNameRoot() {
        return Optional.ofNullable(properNameRoot);
    }

    /**
     * @return name of attribute for use in Java (camelcase, derived from propername)
     */
    @Nonnull
    String getJavaName() {
        String[] parts = nameNm.split("\\.");
        int index = 0;
        var builder = new StringBuilder();
        if (parts[index].length() == 1) {
            builder.append(parts[index].toLowerCase());
            index++;
        }
        if (parts.length > index) {
            if (parts[index].equalsIgnoreCase(properNameRoot)) {
                builder.append(properNameRoot);
            } else {
                if (index == 0) {
                    builder.append(parts[index].toLowerCase());
                } else {
                    builder.append(Character.toUpperCase(parts[index].charAt(0)))
                            .append(parts[index].substring(1).toLowerCase());
                }
            }
            index++;
        }
        while (parts.length > index) {
            builder.append(Character.toUpperCase(parts[index].charAt(0)))
                    .append(parts[index].substring(1).toLowerCase());
            index++;
        }
        return builder.toString();
    }

    /**
     * @return attribute group UID (attribute ATTRGRP_ID)
     */
    @Nonnull
    Optional<BigInteger> getAttrGrpId() {
        return getAttrGrp().map(AttrGrp::getId);
    }

    /**
     * @return attribute group (corresponding to ATTRGRP_ID value)
     */
    @Nonnull
    Optional<AttrGrp> getAttrGrp() {
        return Optional.ofNullable(attrGrp);
    }

    /**
     * @return order of attribute (attribute ORD)
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
     * @return type of attribute (attribute ATTRTYPE)
     */
    @Nonnull
    AttrType getAttrType() {
        return attrType;
    }

    /**
     * @return domain of attribute (domain referenced by attribute DOMAIN_ID)
     */
    @Nonnull
    Domain getDomain() {
        return domain;
    }

    /**
     * @return subdomain of attribute (attribute SUBDOMAIN_NM)
     */
    @Nonnull
    Optional<String> getSubdomainNm() {
        return Optional.ofNullable(subdomainNm);
    }

    /**
     * @return flag indicating if attribute is mandatory (attribute MANDATORY)
     */
    boolean getMandatory() {
        return mandatory;
    }

    /**
     * @return default value of attribute (attribute DEFVALUE)
     */
    @Nonnull
    Optional<String> getDefValue() {
        return Optional.ofNullable(defValue);
    }

    private int compareAttrGrp(Attr other) {
        if (getAttrGrp().isEmpty()) {
            if (other.getAttrGrp().isEmpty()) {
                return 0;
            } else {
                return 1;
            }
        }
        if (other.getAttrGrp().isEmpty()) {
            return -1;
        }
        return getAttrGrp().orElseThrow().compareTo(other.getAttrGrp().orElseThrow());
    }

    /**
     * Compares attributes by their attribute group, if in the same attribute group, by their order and name
     *
     * @param other is attribute to be compared to
     * @return -1 if ordering of this is before other, 0 if both objects are the same and 1 if this object is after
     * the other
     */
    int compareTo(Attr other) {
        int result = compareAttrGrp(other);
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
        if (!(o instanceof AttrValue)) return false;
        if (!super.equals(o)) return false;
        AttrValue attrValue = (AttrValue) o;
        return getEntity().equals(attrValue.getEntity()) &&
                getNameNm().equals(attrValue.getNameNm()) &&
                getName().equals(attrValue.getName()) &&
                Objects.equals(getAttrGrp(), attrValue.getAttrGrp()) &&
                getOrd() == attrValue.getOrd() &&
                Objects.equals(getNote(), attrValue.getNote()) &&
                getAttrType() == attrValue.getAttrType() &&
                getDomain().equals(attrValue.getDomain()) &&
                Objects.equals(getSubdomainNm(), attrValue.getSubdomainNm()) &&
                getMandatory() == attrValue.getMandatory() &&
                Objects.equals(getDefValue(), attrValue.getDefValue());
    }
}
