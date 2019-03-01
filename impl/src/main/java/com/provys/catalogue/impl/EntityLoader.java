package com.provys.catalogue.impl;

import com.provys.catalogue.api.Entity;
import com.provys.provysobject.impl.ProvysNmObjectLoader;

import java.math.BigInteger;
import java.util.Collection;

public interface EntityLoader extends ProvysNmObjectLoader<Entity, EntityValue, EntityProxy, EntityManagerImpl> {

    Collection<EntityProxy> loadByEntityGrpId(EntityManagerImpl manager, BigInteger entityGrpId);
}
