package com.provys.catalogue.api;

import com.provys.provysobject.ProvysNmObject;

import javax.annotation.Nonnull;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface EntityGrp extends ProvysNmObject, Comparable<EntityGrp> {

    /**
     * @return parent entity group (entity group with Id PARENT_ID)
     */
    @Nonnull
    Optional<EntityGrp> getParent();

    /**
     * @return name (attribute NAME)
     */
    @Nonnull
    String getName();

    /**
     * @return note (attribute NOTE)
     */
    @Nonnull
    Optional<String> getNote();

    /**
     * @return order (attribute ORD)
     */
    int getOrd();

    /**
     * @return child entity groups (PARENT_ID points to this entity group, read-only collection)
     */
    @Nonnull
    Collection<EntityGrp> getChildren();

    /**
     * @return entities in given entity group (ENTITYGRP_ID points to this entity group, read-only collection)
     */
    @Nonnull
    Collection<Entity> getEntities();

    /**
     * @return ordering of given entity group (using ord column in full hierarchy of parents)
     */
    @Nonnull
    List<Integer> getFullOrd();
}
