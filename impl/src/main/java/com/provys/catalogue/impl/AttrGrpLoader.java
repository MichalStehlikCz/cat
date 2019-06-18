package com.provys.catalogue.impl;

import com.provys.catalogue.api.AttrGrp;
import com.provys.provysobject.impl.ProvysObjectLoader;

import java.math.BigInteger;
import java.util.Collection;

public interface AttrGrpLoader extends ProvysObjectLoader<AttrGrp, AttrGrpValue, AttrGrpProxy, AttrGrpManagerImpl> {

    Collection<AttrGrpProxy> loadByEntityId(AttrGrpManagerImpl manager, BigInteger entityId);
}
