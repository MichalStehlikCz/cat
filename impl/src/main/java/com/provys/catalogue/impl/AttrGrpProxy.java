package com.provys.catalogue.impl;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.provys.catalogue.api.Attr;
import com.provys.catalogue.api.AttrGrp;
import com.provys.common.datatype.DtUid;
import java.lang.Override;
import java.util.Collection;
import javax.annotation.Nonnull;
import javax.xml.bind.annotation.XmlRootElement;

@JsonSerialize(
        converter = GenAttrGrpProxySerializationConverter.class
)
@XmlRootElement(
        name = "ATTRGRP"
)
public class AttrGrpProxy extends GenAttrGrpProxy implements AttrGrp {
    AttrGrpProxy(AttrGrpManagerImpl manager, DtUid id) {
        super(manager, id);
    }

    @Nonnull
    @Override
    protected AttrGrpProxy self() {
        return this;
    }

    @Nonnull
    @Override
    public AttrGrp selfAsObject() {
        return this;
    }

    @Override
    @Nonnull
    public Collection<Attr> getAttrs() {
        return getManager().getRepository().getAttrManager().getByAttrGrpId(getId());
    }

    /**
     * Compares attribute groups by their entities, then by ord and if all is the same, by name within same entity
     *
     * @param other other attribute group
     * @return -1 if ordering of this is before other, 0 if both objects are the same and 1 if this object is after
     * the other
     */
    @Override
    public int compareTo(AttrGrp other) {
        if (this == other) {
            return 0;
        }
        int result = getEntity().compareTo(other.getEntity());
        if (result == 0) {
            result = Integer.compare(getOrd(), other.getOrd());
            if (result == 0) {
                result = getName().compareTo(other.getName());
            }
        }
        return result;
    }
}
