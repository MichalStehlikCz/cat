package com.provys.catalogue.api;

import javax.annotation.Nonnull;
import java.util.Collection;

public interface Entity extends GenEntity, Comparable<Entity> {
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
