package com.provys.catalogue;

import javax.annotation.Nonnull;

public interface Attr extends GenAttr, Comparable<Attr> {
    /**
     * @return order of attribute in entity
     */
    int getOrdInEntity();

    /**
     * @return proper name of attribute - either constructed from properNameRoot or just by upper-casing first letter
     * and lower-casing the rest
     */
    @Nonnull
    String getcProperName();

    /**
     * @return Java property name for to this attribute
     */
    @Nonnull
    String getcJavaPropertyName();

    /**
     * @return Java getter name for to this attribute
     */
    @Nonnull
    String getcJavaGetterName();

    /**
     * @return Java setter name for to this attribute
     */
    @Nonnull
    String getcJavaSetterName();
}
