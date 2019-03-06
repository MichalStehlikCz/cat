package com.provys.catalogue.impl;

import com.provys.catalogue.api.Entity;
import com.provys.catalogue.api.EntityManager;
import com.provys.provysobject.impl.ProvysNmObjectManagerImpl;
import com.provys.provysobject.index.IndexNonUnique;

import javax.annotation.Nonnull;
import java.math.BigInteger;
import java.util.*;

public class EntityManagerImpl extends ProvysNmObjectManagerImpl<CatalogueRepositoryImpl, Entity, EntityValue,
        EntityProxy, EntityManagerImpl, EntityLoader> implements EntityManager {

    @Nonnull
    private final IndexNonUnique<EntityValue, EntityProxy, BigInteger> entityByEntityGrpId;

    EntityManagerImpl(CatalogueRepositoryImpl repository, EntityLoader loader, int initialCapacity) {
        super(repository, loader, initialCapacity, 1);
        entityByEntityGrpId = new IndexNonUnique<>("entityByEntityGrpId",
                val -> val.getEntityGrpId().orElse(null));
        addIndex(entityByEntityGrpId);
    }

    @Nonnull
    @Override
    protected EntityManagerImpl self() {
        return this;
    }

    @Nonnull
    @Override
    public String getEntityNm() {
        return "ENTITY";
    }

    @Nonnull
    @Override
    public Collection<Entity> getByEntityGrpId(BigInteger entityGrpId) {
        var entities = entityByEntityGrpId.get(entityGrpId).orElse(null);
        if (entities == null) {
            // check if Id is valid entity group Id
            getRepository().getEntityGrpManager().getById(entityGrpId);
            entities = getLoader().loadByEntityGrpId(this, entityGrpId);
            entityByEntityGrpId.set(entityGrpId, entities);
        }
        return Collections.unmodifiableCollection(entities);
    }

    @Nonnull
    @Override
    protected EntityProxy getNewProxy(BigInteger id) {
        return new EntityProxy(this, id);
    }
}
