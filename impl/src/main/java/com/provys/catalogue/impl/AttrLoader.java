package com.provys.catalogue.impl;

import com.provys.catalogue.Attr;
import com.provys.common.datatype.DtUid;
import com.provys.provysobject.impl.ProvysObjectLoader;

import java.util.Collection;

public interface AttrLoader extends ProvysObjectLoader<Attr, GenAttrValue, AttrProxy, AttrManagerImpl> {

    Collection<AttrProxy> loadByEntityId(AttrManagerImpl manager, DtUid entityId);
    Collection<AttrProxy> loadByAttrGrpId(AttrManagerImpl manager, DtUid attrGrpId);
}
