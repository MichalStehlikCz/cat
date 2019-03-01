package com.provys.catalogue.impl;

import com.provys.catalogue.api.Entity;
import com.provys.provysobject.impl.ProvysNmObjectLoaderImpl;
import com.provys.provysobject.impl.ProvysObjectLoadRunner;

import javax.annotation.Nonnull;
import java.math.BigInteger;
import java.util.Collection;

public abstract class EntityLoaderBase<S>
        extends ProvysNmObjectLoaderImpl<Entity, EntityValue, EntityProxy, EntityManagerImpl, S>
        implements EntityLoader {

    @SuppressWarnings("WeakerAccess") // method overridden in loaders in other packages
    @Nonnull
    protected abstract ProvysObjectLoadRunner<Entity, EntityValue, EntityProxy, EntityManagerImpl, S>
    getLoadRunnerByEntityGrpId(EntityManagerImpl manager, BigInteger parentId);

    @Nonnull
    @Override
    public Collection<EntityProxy> loadByEntityGrpId(EntityManagerImpl manager, BigInteger entityGrpId) {
        return getLoadRunnerByEntityGrpId(manager, entityGrpId).run();
    }

}
