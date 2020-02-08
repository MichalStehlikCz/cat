package com.provys.catalogue;

import javax.annotation.Nonnull;
import java.util.Collection;

public interface Entity extends GenEntity, Comparable<Entity> {

    /**
     * @return effective proper name for this entity; either proper name if one is specified or internal name with first
     * letter upper-case and the rest lower-case
     */
    @Nonnull
    String getcProperName();

    /**
     * @return list of entity attribute groups
     */
    @Nonnull
    Collection<AttrGrp> getAttrGrps();

    /**
     * @return list of entity attributes
     */
    @Nonnull
    Collection<Attr> getAttrs();
}
