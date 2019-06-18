package com.provys.catalogue.impl;

import com.provys.catalogue.api.AttrType;
import com.provys.catalogue.api.Domain;
import com.provys.catalogue.api.Entity;
import com.provys.provysobject.impl.ProvysObjectValue;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.math.BigInteger;
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
    private final String note;
    @Nonnull
    private final AttrType attrType;
    @Nonnull
    private final Domain domain;
    @Nullable
    private final String subdomainNm;
    private final boolean mandatory;

    public AttrValue(BigInteger id, Entity entity, String nameNm, String name, @Nullable String note, AttrType attrType,
                     Domain domain, @Nullable String subdomainNm, boolean mandatory)
    {
        super(id);
        this.entity = entity;
        this.nameNm = nameNm;
        this.name = name;
        this.note = note;
        this.attrType = attrType;
        this.domain = domain;
        this.subdomainNm = subdomainNm;
        this.mandatory = mandatory;
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
    @Nonnull
    boolean getMandatory() {
        return mandatory;
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
                Objects.equals(getNote(), attrValue.getNote()) &&
                getAttrType() == attrValue.getAttrType() &&
                getDomain().equals(attrValue.getDomain()) &&
                Objects.equals(getSubdomainNm(), attrValue.getSubdomainNm()) &&
                getMandatory() == attrValue.getMandatory();
    }
}
