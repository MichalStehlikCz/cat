package com.provys.catalogue.api;

import com.provys.provysobject.ProvysObject;

import javax.annotation.Nonnull;
import java.math.BigInteger;
import java.util.Optional;

public interface Attr extends ProvysObject, Comparable<Attr> {

    /**
     * @return entity UID (attribute ENTITY_ID)
     */
    @Nonnull
    BigInteger getEntityId();

    /**
     * @return entity (corresponding to ENTITY_ID value)
     */
    @Nonnull
    Entity getEntity();

    /**
     * @return internal name of attribute (attribute NAME_NM)
     */
    @Nonnull
    String getNameNm();

    /**
     * @return name of attribute (attribute NAME)
     */
    @Nonnull
    String getName();

    /**
     * @return root of propername of attribute (attribute PROPERNAMEROOT)
     */
    @Nonnull
    Optional<String> getProperNameRoot();

    /**
     * @return name of attribute for use in Java (camelcase, derived from propername)
     */
    @Nonnull
    String getJavaName();

    /**
     * @return attribute group UID (attribute ATTRGRP_ID)
     */
    @Nonnull
    Optional<BigInteger> getAttrGrpId();

    /**
     * @return attribute group (corresponding to ATTRGRP_ID value)
     */
    Optional<AttrGrp> getAttrGrp();

    /**
     * @return order of attribute (attribute ORD)
     */
    int getOrd();

    /**
     * @return note related to attribute (attribute NOTE)
     */
    @Nonnull
    Optional<String> getNote();

    /**
     * @return type of attribute (attribute ATTRTYPE)
     */
    @Nonnull
    AttrType getAttrType();

    /**
     * @return domain of attribute
     */
    @Nonnull
    Domain getDomain();

    /**
     * @return subdomain of attribute
     */
    @Nonnull
    Optional<String> getSubdomainNm();

    /**
     * @return mandatory flag of attribute
     */
    boolean getMandatory();

    /**
     * @return default value of attribute
     */
    Optional<String> getDefValue();

    /**
     * @return order of attribute in entity
     */
    int getOrdInEntity();
}
