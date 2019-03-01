package com.provys.catalogue.api;

import com.provys.provysobject.ProvysNmObject;

import javax.annotation.Nonnull;
import java.math.BigInteger;
import java.util.Optional;

/**
 * Represents PROVYS entity object (entity ENTITY)
 */
public interface Entity extends ProvysNmObject, Comparable<Entity> {

    /**
     * @return name of entity (attribute NAME)
     */
    @Nonnull
    String getName();

    /**
     * @return if entity is custom
     */
    boolean isCustom();

    /**
     * @return if entity is used on given installation
     */
    boolean isUsed();

    /**
     * @return if entity is object class (instances of this entity can be created, attribute OBJECTCLASS)
     */
    boolean isObjectClass();

    /**
     * @return table used to store objects of this type (attribute TABLE_NM)
     */
    @Nonnull
    Optional<String> getTable();

    /**
     * @return id of entity group this entity belongs to (attribute ENTITYGRP_ID)
     */
    @Nonnull
    Optional<BigInteger> getEntityGrpId();

    /**
     * @return entity group this entity belongs to (entity group with Id ENTITYGRP_ID)
     */
    @Nonnull
    Optional<EntityGrp> getEntityGrp();

    /**
     * @return note related to this entity (attribute NOTE)
     */
    @Nonnull
    Optional<String> getNote();

    /**
     * @return custom note related to this entity (attribute CUSTOMNOTE)
     */
    @Nonnull
    Optional<String> getCustomNote();

    /**
     * @return structure documentation related to this entity (attribute STRUCTUREDOC)
     */
    @Nonnull
    Optional<String> getStructureDoc();

    /**
     * @return usage documentation related to this entity (attribute USAGEDOC)
     */
    @Nonnull
    Optional<String> getUsageDoc();

    /**
     * @return behaviour documentation related to this entity (attribute BEHAVIOURDOC)
     */
    @Nonnull
    Optional<String> getBehaviourDoc();

    /**
     * @return documentation related to implementation of this entity (attribute IMPLDOC)
     */
    @Nonnull
    Optional<String> getImplDoc();
}
