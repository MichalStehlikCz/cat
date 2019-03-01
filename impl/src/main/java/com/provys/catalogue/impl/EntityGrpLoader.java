package com.provys.catalogue.impl;

import com.provys.catalogue.api.EntityGrp;
import com.provys.provysobject.impl.ProvysNmObjectLoader;

import java.math.BigInteger;
import java.util.Collection;

public interface EntityGrpLoader extends ProvysNmObjectLoader<EntityGrp, EntityGrpValue, EntityGrpProxy,
        EntityGrpManagerImpl> {

    Collection<EntityGrpProxy> loadByParentId(EntityGrpManagerImpl manager, BigInteger parentId);
}
