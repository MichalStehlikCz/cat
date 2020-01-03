package com.provys.catalogue.api;

import javax.annotation.Nonnull;
import java.util.Collection;
import java.util.List;

public interface EntityGrp extends GenEntityGrp, Comparable<EntityGrp> {

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
