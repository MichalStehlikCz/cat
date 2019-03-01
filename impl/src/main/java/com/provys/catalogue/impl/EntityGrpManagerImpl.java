package com.provys.catalogue.impl;

import com.provys.catalogue.api.EntityGrp;
import com.provys.catalogue.api.EntityGrpManager;
import com.provys.provysobject.impl.ProvysNmObjectManagerImpl;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class EntityGrpManagerImpl extends ProvysNmObjectManagerImpl<CatalogueRepositoryImpl, EntityGrp, EntityGrpValue,
        EntityGrpProxy, EntityGrpManagerImpl, EntityGrpLoader> implements EntityGrpManager {

    private final Map<BigInteger, Set<EntityGrp>> entityGrpByParentId;

    EntityGrpManagerImpl(CatalogueRepositoryImpl repository, EntityGrpLoader loader, int initialCapacity) {
        super(repository, loader, initialCapacity);
        entityGrpByParentId =  new ConcurrentHashMap<>(initialCapacity);
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
    public Collection<EntityGrp> getByParentId(BigInteger parentId) {
        // check if Id is valid entity group Id
        getById(parentId);
        Set<EntityGrp> children = entityGrpByParentId.get(parentId);
        if (children == null) {
            children = Collections.synchronizedSet(new HashSet<>(getLoader().loadByParentId(this, parentId)));
            var old = entityGrpByParentId.putIfAbsent(parentId, children);
            if (old != null) {
                children = old;
            }
        }
        return Collections.unmodifiableSet(children);
    }

    @Nonnull
    @Override
    protected EntityGrpProxy getNewProxy(BigInteger id) {
        return new EntityGrpProxy(this, id);
    }

    /**
     * Adds entityGrpByParent index management
     *
     * @param proxy is proxy being modified; it is already verified that this proxy is registered at the manager
     * @param oldValue is old value associated with proxy
     * @param newValue is new value associated with proxy
     * @param deleted if new value is null, this flag indicates if it is just release of data from cache or delete from
     *                database
     */
    @Override
    protected void doRegisterChange(EntityGrpProxy proxy, @Nullable EntityGrpValue oldValue,
                                    @Nullable EntityGrpValue newValue, boolean deleted) {
        super.doRegisterChange(proxy, oldValue, newValue, deleted);
        // manage parentId change
        if ((oldValue != null) && oldValue.getParent().isPresent() &&
                ((newValue == null) || (!oldValue.getParent().equals(newValue.getParent())))) {
            var parentId = oldValue.getParentId().orElseThrow(); // should not throw - condition above verifies that
            // parent is specified
            var parentSet = entityGrpByParentId.get(parentId);
            if (parentSet != null) {
                // we track this parent group...
                if ((newValue == null) && !deleted) {
                    // entity group was released from cache - parent group would not be complete...
                    entityGrpByParentId.remove(parentId);
                } else {
                    // deleted or moved entity group is removed from parent
                    parentSet.remove(proxy);
                }
            }
        }
        if ((newValue != null) && (newValue.getParent().isPresent()) &&
                ((oldValue == null) || (!newValue.getParent().equals(oldValue.getParent())))) {
            var parentSet = entityGrpByParentId.get(newValue.getParentId().orElseThrow()); // should not throw...
            if (parentSet != null) {
                // we track this parent group
                parentSet.add(proxy);
            }

        }
    }
}
