package com.provys.catalogue.impl;

import com.provys.catalogue.api.Entity;
import com.provys.catalogue.api.EntityManager;
import com.provys.provysobject.impl.ProvysNmObjectManagerImpl;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class EntityManagerImpl extends ProvysNmObjectManagerImpl<CatalogueRepositoryImpl, Entity, EntityValue,
        EntityProxy, EntityManagerImpl, EntityLoader> implements EntityManager {

    private final Map<BigInteger, Set<Entity>> entityByEntityGrpId;

    EntityManagerImpl(CatalogueRepositoryImpl repository, EntityLoader loader, int initialCapacity) {
        super(repository, loader, initialCapacity);
        entityByEntityGrpId = new ConcurrentHashMap<>(10);
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
        // check if Id is valid entity group Id
        getRepository().getEntityGrpManager().getById(entityGrpId);
        Set<Entity> entities = entityByEntityGrpId.get(entityGrpId);
        if (entities == null) {
            entities = Collections.synchronizedSet(new HashSet<>(getLoader().loadByEntityGrpId(this, entityGrpId)));
            var old = entityByEntityGrpId.putIfAbsent(entityGrpId, entities);
            if (old != null) {
                entities = old;
            }
        }
        return Collections.unmodifiableSet(entities);
    }

    @Nonnull
    @Override
    protected EntityProxy getNewProxy(BigInteger id) {
        return new EntityProxy(this, id);
    }

    /**
     * Adds entityByEntityGrp index management
     *
     * @param proxy is proxy being modified; it is already verified that this proxy is registered at the manager
     * @param oldValue is old value associated with proxy
     * @param newValue is new value associated with proxy
     * @param deleted if new value is null, this flag indicates if it is just release of data from cache or delete from
     *                database
     */
    @Override
    protected void doRegisterChange(EntityProxy proxy, @Nullable EntityValue oldValue, @Nullable EntityValue newValue,
                                    boolean deleted) {
        super.doRegisterChange(proxy, oldValue, newValue, deleted);
        // manage entityGrpId change
        if ((oldValue != null) && oldValue.getEntityGrp().isPresent() &&
                ((newValue == null) || (!oldValue.getEntityGrp().equals(newValue.getEntityGrp())))) {
            var entityGrpId = oldValue.getEntityGrpId().orElseThrow(); // should not throw - condition above verifies
            // that entity group is specified
            var entityGrpSet = entityByEntityGrpId.get(entityGrpId);
            if (entityGrpSet != null) {
                // we track this entity group content...
                if ((newValue == null) && !deleted) {
                    // entity was released from cache - group content would not be complete...
                    entityByEntityGrpId.remove(entityGrpId);
                } else {
                    // deleted or moved entity group is removed from parent
                    entityGrpSet.remove(proxy);
                }
            }
        }
        if ((newValue != null) && (newValue.getEntityGrp().isPresent()) &&
                ((oldValue == null) || (!newValue.getEntityGrp().equals(oldValue.getEntityGrp())))) {
            var entityGrpSet = entityByEntityGrpId.get(newValue.getEntityGrpId().orElseThrow()); // should not throw...
            if (entityGrpSet != null) {
                // we track this parent group
                entityGrpSet.add(proxy);
            }

        }
    }
}
