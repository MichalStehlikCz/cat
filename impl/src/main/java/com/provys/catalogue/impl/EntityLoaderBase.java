package com.provys.catalogue.impl;

import com.provys.catalogue.api.Entity;
import com.provys.common.datatype.DtUid;
import com.provys.provysobject.impl.ProvysNmObjectLoaderImpl;
import com.provys.provysobject.impl.ProvysObjectLoadRunner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;
import java.util.Collection;

public abstract class EntityLoaderBase extends ProvysNmObjectLoaderImpl<Entity, GenEntityValue, EntityProxy, EntityManagerImpl> implements EntityLoader {
    private static final Logger LOG = LogManager.getLogger(EntityLoaderBase.class);

    @SuppressWarnings("WeakerAccess") // method overridden in loaders in other packages
    @Nonnull
    protected abstract ProvysObjectLoadRunner<Entity, GenEntityValue, EntityProxy, EntityManagerImpl>
    getLoadRunnerByEntityGrpId(EntityManagerImpl manager, DtUid parentId);

    @Nonnull
    @Override
    public Collection<EntityProxy> loadByEntityGrpId(EntityManagerImpl manager, DtUid entityGrpId) {
        LOG.info("Load ENTITY by entity group Id {}", entityGrpId);
        return getLoadRunnerByEntityGrpId(manager, entityGrpId).run();
    }
}
