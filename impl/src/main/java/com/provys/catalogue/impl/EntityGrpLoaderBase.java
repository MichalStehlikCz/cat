package com.provys.catalogue.impl;

import com.provys.catalogue.api.EntityGrp;
import com.provys.provysobject.impl.ProvysNmObjectLoaderImpl;
import com.provys.provysobject.impl.ProvysObjectLoadRunner;

import javax.annotation.Nonnull;
import java.math.BigInteger;
import java.util.Collection;

public abstract class EntityGrpLoaderBase<S>
        extends ProvysNmObjectLoaderImpl<EntityGrp, EntityGrpValue, EntityGrpProxy, EntityGrpManagerImpl, S>
        implements EntityGrpLoader {

    @Nonnull
    protected abstract ProvysObjectLoadRunner<EntityGrp, EntityGrpValue, EntityGrpProxy, EntityGrpManagerImpl, S>
    getLoadRunnerByParentId(EntityGrpManagerImpl manager, BigInteger parentId);

    @Nonnull
    @Override
    public Collection<EntityGrpProxy> loadByParentId(EntityGrpManagerImpl manager, BigInteger parentId) {
        return getLoadRunnerByParentId(manager, parentId).run();
    }

}
