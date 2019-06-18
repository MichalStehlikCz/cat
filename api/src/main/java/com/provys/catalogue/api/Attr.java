package com.provys.catalogue.api;

import com.provys.provysobject.ProvysObject;

import javax.annotation.Nonnull;
import java.math.BigInteger;
import java.util.Optional;

public interface Attr extends ProvysObject {

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
}
