package com.provys.catalogue.api;

import com.provys.provysobject.ProvysObject;

import javax.annotation.Nonnull;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Optional;

public interface AttrGrp extends ProvysObject, Comparable<AttrGrp> {

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
     * @return internal name of attribute group (attribute NAME_NM)
     */
    @Nonnull
    String getNameNm();

    /**
     * @return name of attribute group (attribute NAME)
     */
    @Nonnull
    String getName();

    /**
     * @return order of attribute group (attribute NAME)
     */
    int getOrd();

    /**
     * @return note related to attribute group (attribute NOTE)
     */
    @Nonnull
    Optional<String> getNote();

    /**
     * @return list of groups attributes
     */
    @Nonnull
    Collection<Attr> getAttrs();
}
