package com.provys.catalogue.impl;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.provys.catalogue.api.Entity;
import com.provys.catalogue.api.EntityGrp;
import com.provys.common.datatype.DtUid;
import java.lang.Override;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nonnull;
import javax.xml.bind.annotation.XmlRootElement;

@JsonSerialize(
        converter = GenEntityGrpProxySerializationConverter.class
)
@XmlRootElement(
        name = "ENTITYGRP"
)
public class EntityGrpProxy extends GenEntityGrpProxy implements EntityGrp {
    EntityGrpProxy(EntityGrpManagerImpl manager, DtUid id) {
        super(manager, id);
    }

    @Nonnull
    @Override
    protected EntityGrpProxy self() {
        return this;
    }

    @Nonnull
    @Override
    public EntityGrp selfAsObject() {
        return this;
    }

    @Nonnull
    @Override
    public Collection<EntityGrp> getChildren() {
        return getManager().getByParentId(getId());
    }

    @Nonnull
    @Override
    public Collection<Entity> getEntities() {
        return getManager().getRepository().getEntityManager().getByEntityGrpId(getId());
    }

    @Nonnull
    @Override
    public List<Integer> getFullOrd() {
        var result = getParent().map(EntityGrp::getFullOrd).orElse(new ArrayList<>(5));
        result.add(getOrd());
        return result;
    }

    /**
     * Compares entity groups by their order within the same parent and by their parents starting from root. Parent is
     * considered before its children. If all is the same, order is determined by name of entity group.
     *
     * @param other is other entity group to be compared with
     * @return -1 if full ordering of this is before other, 0 if both objects are the same and 1 if this object is after
     * other
     */
    @Override
    public int compareTo(EntityGrp other) {
        if (this == other) {
            return 0;
        }
        if (other.getParent() == getParent()) {
            // most common comparison - comparing two children of the same parent
            int result = Integer.compare(getOrd(), other.getOrd());
            if (result == 0) {
                result = getName().compareTo(other.getName());
            }
            return result;
        }
        // calculate full path from root and compare paths...
        List<Integer> myFullOrd = getFullOrd();
        List<Integer> otherFullOrd = other.getFullOrd();
        for (int i = 0; i < myFullOrd.size(); i++) {
            if (i >= otherFullOrd.size()) {
                // same start but other is shorter -> other is before this (parent before child)
                return 1;
            }
            if (myFullOrd.get(i) < otherFullOrd.get(i)) {
                return -1;
            } else if (myFullOrd.get(i) > otherFullOrd.get(i)) {
                return 1;
            }
        }
        if (myFullOrd.size() < otherFullOrd.size()) {
            // start same but this is shorter -> this is before other (parent before child)
            return -1;
        }
        // both objects are the same based on ord
        return getName().compareTo(other.getName());
    }
}
