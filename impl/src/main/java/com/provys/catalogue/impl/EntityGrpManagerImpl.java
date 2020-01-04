package com.provys.catalogue.impl;

import com.provys.catalogue.api.EntityGrp;
import com.provys.catalogue.api.EntityGrpManager;
import com.provys.common.datatype.DtUid;
import com.provys.provysobject.impl.ProvysNmObjectManagerImpl;
import com.provys.provysobject.index.IndexNonUnique;

import javax.annotation.Nonnull;
import java.math.BigInteger;
import java.util.*;

public class EntityGrpManagerImpl extends ProvysNmObjectManagerImpl<CatalogueRepositoryImpl, EntityGrp, GenEntityGrpValue,
        EntityGrpProxy, EntityGrpManagerImpl, EntityGrpLoader> implements EntityGrpManager {

    @Nonnull
    private final IndexNonUnique<GenEntityGrpValue, EntityGrpProxy, DtUid> entityGrpByParentId;

    EntityGrpManagerImpl(CatalogueRepositoryImpl repository, EntityGrpLoader loader, int initialCapacity) {
        super(repository, loader, initialCapacity, 1);
        entityGrpByParentId =  new IndexNonUnique<>("entityGrpByParentId",
                val -> val.getParentId().orElse(null));
        addIndex(entityGrpByParentId);
    }

    @Nonnull
    @Override
    protected EntityGrpManagerImpl self() {
        return this;
    }

    @Nonnull
    @Override
    public String getEntityNm() {
        return "ENTITYGRP";
    }

    @Nonnull
    @Override
    public Collection<EntityGrp> getByParentId(DtUid parentId) {
        // check if Id is valid entity group Id
        getById(parentId);
        var children = entityGrpByParentId.get(parentId).orElse(null);
        if (children == null) {
            children = getLoader().loadByParentId(this, parentId);
            entityGrpByParentId.set(parentId, children);
        }
        return Collections.unmodifiableCollection(children);
    }

    @Nonnull
    @Override
    protected EntityGrpProxy getNewProxy(DtUid id) {
        return new EntityGrpProxy(this, id);
    }
}
