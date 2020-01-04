package com.provys.catalogue.impl;

import com.provys.catalogue.api.AttrGrp;
import com.provys.common.datatype.DtUid;
import com.provys.provysobject.impl.ProvysObjectLoader;

import java.util.Collection;

public interface AttrGrpLoader extends ProvysObjectLoader<AttrGrp, GenAttrGrpValue, AttrGrpProxy, AttrGrpManagerImpl> {

    Collection<AttrGrpProxy> loadByEntityId(AttrGrpManagerImpl manager, DtUid entityId);
}
