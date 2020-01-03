package com.provys.catalogue.api;

public interface Attr extends GenAttr, Comparable<Attr> {
    /**
     * @return order of attribute in entity
     */
    int getOrdInEntity();
}
