package com.provys.catalogue.impl;

import com.provys.catalogue.Entity;
import com.provys.common.datatype.DtUid;
import com.provys.provysobject.impl.ProvysNmObjectLoader;

import java.util.Collection;

public interface EntityLoader extends ProvysNmObjectLoader<Entity, GenEntityValue, EntityProxy, EntityManagerImpl> {

    Collection<EntityProxy> loadByEntityGrpId(EntityManagerImpl manager, DtUid entityGrpId);
}
