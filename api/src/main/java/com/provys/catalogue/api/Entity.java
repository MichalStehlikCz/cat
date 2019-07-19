package com.provys.catalogue.api;

import com.provys.provysobject.ProvysNmObject;

import javax.annotation.Nonnull;
import java.math.BigInteger;
import java.util.Collection;
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
     * @return view used to access objects of this type (attribute VIEW_NM)
     */
    @Nonnull
    Optional<String> getView();

    /**
     * @return PG package used to manipulate objects of this type (attribute PGPACKAGE_NM)
     */
    @Nonnull
    Optional<String> getPgPackage();

    /**
     * @return CP package used to manipulate objects of this type (attribute CPPACKAGE_NM)
     */
    @Nonnull
    Optional<String> getCpPackage();

    /**
     * @return Ep package used to access objects of this type (attribute EPPACKAGE_NM)
     */
    @Nonnull
    Optional<String> getEpPackage();

    /**
     * @return FP package used to access objects of this type (attribute FPPACKAGE_NM)
     */
    @Nonnull
    Optional<String> getFpPackage();

    /**
     * @return id of entity that is ancestor (parent) of this entity (attribute ANCESTOR_ID)
     */
    @Nonnull
    Optional<BigInteger> getAncestorId();

    /**
     * @return entity that is ancestor (superclass) of this entity (entity with Id ANCESTOR_ID)
     */
    @Nonnull
    Optional<Entity> getAncestor();

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

    /**
     * @return list of entity attribute groups
     */
    @Nonnull
    Collection<AttrGrp> getAttrGrps();

    /**
     * @return list of entity attributes
     */
    @Nonnull
    Collection<Attr> getAttrs();
}
