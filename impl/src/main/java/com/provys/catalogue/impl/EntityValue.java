package com.provys.catalogue.impl;

import com.provys.catalogue.api.Entity;
import com.provys.catalogue.api.EntityGrp;
import com.provys.provysobject.impl.ProvysNmObjectValue;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.math.BigInteger;
import java.util.Objects;
import java.util.Optional;

public class EntityValue extends ProvysNmObjectValue {

    @Nonnull
    private final String name;
    private final boolean custom;
    private final boolean used;
    private final boolean objectClass;
    @Nullable
    private final String table;
    @Nullable
    private final Entity ancestor;
    @Nullable
    private final EntityGrp entityGrp;
    @Nullable
    private final String note;
    @Nullable
    private final String customNote;
    @Nullable
    private final String structureDoc;
    @Nullable
    private final String usageDoc;
    @Nullable
    private final String behaviourDoc;
    @Nullable
    private final String implDoc;

    public EntityValue(BigInteger id, String nameNm, String name, boolean custom, boolean used,
                       boolean objectClass, @Nullable String table, @Nullable Entity ancestor,
                       @Nullable EntityGrp entityGrp, @Nullable String note, @Nullable String customNote,
                       @Nullable String structureDoc, @Nullable String usageDoc, @Nullable String behaviourDoc,
                       @Nullable String implDoc) {
        super(id, nameNm);
        this.name = Objects.requireNonNull(name);
        this.custom = custom;
        this.used = used;
        this.objectClass = objectClass;
        this.table = table;
        this.ancestor = ancestor;
        this.entityGrp = entityGrp;
        this.note = note;
        this.customNote = customNote;
        this.structureDoc = structureDoc;
        this.usageDoc = usageDoc;
        this.behaviourDoc = behaviourDoc;
        this.implDoc = implDoc;
    }

    @Nonnull
    String getName() {
        return name;
    }

    /**
     * @return if entity is custom
     */
    boolean isCustom() {
        return custom;
    }

    /**
     * @return if entity is used on given installation
     */
    boolean isUsed() {
        return used;
    }

    /**
     * @return if entity is object class (instances of this entity can be created, attribute OBJECTCLASS)
     */
    boolean isObjectClass() {
        return objectClass;
    }

    /**
     * @return table used to store objects of this type (attribute TABLE_NM)
     */
    @Nonnull
    Optional<String> getTable() {
        return Optional.ofNullable(table);
    }

    /**
     * @return id of entity this entity is specialisation of (attribute ANCESTOR_ID)
     */
    @Nonnull
    Optional<BigInteger> getAncestorId() {
        return getAncestor().map(Entity::getId);
    }

    /**
     * @return entity that is ancestor (superclasss) of this entity (entity with Id ANCESTOR_ID)
     */
    @Nonnull
    Optional<Entity> getAncestor() {
        return Optional.ofNullable(ancestor);
    }

    /**
     * @return id of entity group this entity belongs to (attribute ENTITYGRP_ID)
     */
    @Nonnull
    Optional<BigInteger> getEntityGrpId() {
        return getEntityGrp().map(EntityGrp::getId);
    }

    /**
     * @return entity group this entity belongs to (entity group with Id ENTITYGRP_ID)
     */
    @Nonnull
    Optional<EntityGrp> getEntityGrp() {
        return Optional.ofNullable(entityGrp);
    }

    /**
     * @return note related to this entity (attribute NOTE)
     */
    @Nonnull
    Optional<String> getNote() {
        return Optional.ofNullable(note);
    }

    /**
     * @return custom note related to this entity (attribute CUSTOMNOTE)
     */
    @Nonnull
    Optional<String> getCustomNote() {
        return Optional.ofNullable(customNote);
    }

    /**
     * @return structure documentation related to this entity (attribute STRUCTUREDOC)
     */
    @Nonnull
    Optional<String> getStructureDoc() {
        return Optional.ofNullable(structureDoc);
    }

    /**
     * @return usage documentation related to this entity (attribute USAGEDOC)
     */
    @Nonnull
    Optional<String> getUsageDoc() {
        return Optional.ofNullable(usageDoc);
    }

    /**
     * @return behaviour documentation related to this entity (attribute BEHAVIOURDOC)
     */
    @Nonnull
    Optional<String> getBehaviourDoc() {
        return Optional.ofNullable(behaviourDoc);
    }

    /**
     * @return documentation related to implementation of this entity (attribute IMPLDOC)
     */
    @Nonnull
    Optional<String> getImplDoc() {
        return Optional.ofNullable(implDoc);
    }

    private int compareEntityGrp(Entity other) {
        if (getEntityGrp().isEmpty()) {
            if (other.getEntityGrp().isEmpty()) {
                return 0;
            } else {
                return 1;
            }
        }
        if (other.getEntityGrp().isEmpty()) {
            return -1;
        }
        return getEntityGrp().orElseThrow().compareTo(other.getEntityGrp().orElseThrow());
    }

    /**
     * Compares entities by their entity group, if in same entity group, by their name
     *
     * @param other is other entity to be compared to
     * @return -1 if ordering of this is before other, 0 if both objects are the same and 1 if this object is after
     * the other
     */
    int compareTo(Entity other) {
        int result = compareEntityGrp(other);
        if (result == 0) {
            result = getName().compareTo(other.getName());
        }
        return result;
    }

    @Override
    @SuppressWarnings("squid:S1206") // Id is sufficient for hashCode
    public boolean equals(@Nullable Object o) {
        if (this == o) return true;
        if (!(o instanceof EntityValue)) return false;
        if (!super.equals(o)) return false;
        EntityValue that = (EntityValue) o;
        return isCustom() == that.isCustom() &&
                isUsed() == that.isUsed() &&
                isObjectClass() == that.isObjectClass() &&
                getName().equals(that.getName()) &&
                Objects.equals(getTable(), that.getTable()) &&
                Objects.equals(getAncestor(), that.getAncestor()) &&
                Objects.equals(getEntityGrp(), that.getEntityGrp()) &&
                Objects.equals(getNote(), that.getNote()) &&
                Objects.equals(getCustomNote(), that.getCustomNote()) &&
                Objects.equals(getStructureDoc(), that.getStructureDoc()) &&
                Objects.equals(getUsageDoc(), that.getUsageDoc()) &&
                Objects.equals(getBehaviourDoc(), that.getBehaviourDoc()) &&
                Objects.equals(getImplDoc(), that.getImplDoc());
    }

    @Override
    public String toString() {
        return "EntityValue{" +
                "name='" + name + '\'' +
                ", custom=" + custom +
                ", used=" + used +
                ", objectClass=" + objectClass +
                ", table='" + table + '\'' +
                ", ancestor=" + ancestor +
                ", entityGrp=" + entityGrp +
                ", note='" + note + '\'' +
                ", customNote='" + customNote + '\'' +
                ", structureDoc='" + structureDoc + '\'' +
                ", usageDoc='" + usageDoc + '\'' +
                ", behaviourDoc='" + behaviourDoc + '\'' +
                ", implDoc='" + implDoc + '\'' +
                '}';
    }
}
