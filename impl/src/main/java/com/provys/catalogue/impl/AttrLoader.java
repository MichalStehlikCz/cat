package com.provys.catalogue.impl;

import com.provys.catalogue.api.Attr;
import com.provys.provysobject.impl.ProvysObjectLoader;

import java.math.BigInteger;
import java.util.Collection;

public interface AttrLoader extends ProvysObjectLoader<Attr, AttrValue, AttrProxy, AttrManagerImpl> {

    Collection<AttrProxy> loadByEntityId(AttrManagerImpl manager, BigInteger entityId);
    Collection<AttrProxy> loadByAttrGrpId(AttrManagerImpl manager, BigInteger attrGrpId);
}
