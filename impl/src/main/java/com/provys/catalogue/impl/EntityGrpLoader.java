package com.provys.catalogue.impl;

import com.provys.catalogue.api.EntityGrp;
import com.provys.common.datatype.DtUid;
import com.provys.provysobject.impl.ProvysNmObjectLoader;

import java.util.Collection;

public interface EntityGrpLoader extends ProvysNmObjectLoader<EntityGrp, GenEntityGrpValue, EntityGrpProxy, EntityGrpManagerImpl> {

    Collection<EntityGrpProxy> loadByParentId(EntityGrpManagerImpl manager, DtUid parentId);
}
