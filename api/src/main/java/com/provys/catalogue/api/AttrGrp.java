package com.provys.catalogue.api;

import javax.annotation.Nonnull;
import java.util.Collection;

public interface AttrGrp extends GenAttrGrp, Comparable<AttrGrp> {

    /**
     * @return list of groups attributes
     */
    @Nonnull
    Collection<Attr> getAttrs();
}
