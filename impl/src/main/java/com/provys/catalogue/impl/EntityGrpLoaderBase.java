package com.provys.catalogue.impl;

import com.provys.catalogue.api.EntityGrp;
import com.provys.common.datatype.DtUid;
import com.provys.provysobject.impl.ProvysNmObjectLoaderImpl;
import com.provys.provysobject.impl.ProvysObjectLoadRunner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;
import java.util.Collection;

public abstract class EntityGrpLoaderBase extends ProvysNmObjectLoaderImpl<EntityGrp, GenEntityGrpValue, EntityGrpProxy, EntityGrpManagerImpl> implements EntityGrpLoader {

    private static final Logger LOG = LogManager.getLogger(EntityGrpLoaderBase.class);

    @Nonnull
    protected abstract ProvysObjectLoadRunner<EntityGrp, GenEntityGrpValue, EntityGrpProxy, EntityGrpManagerImpl>
    getLoadRunnerByParentId(EntityGrpManagerImpl manager, DtUid parentId);

    @Nonnull
    @Override
    public Collection<EntityGrpProxy> loadByParentId(EntityGrpManagerImpl manager, DtUid parentId) {
        LOG.info("Load ENTITYGRP by parent Id {}", parentId);
        return getLoadRunnerByParentId(manager, parentId).run();
    }

}
