package com.provys.catalogue.impl;

import com.provys.catalogue.api.Attr;
import com.provys.catalogue.api.AttrGrp;
import com.provys.catalogue.api.Entity;
import com.provys.catalogue.api.EntityGrp;
import com.provys.provysobject.impl.ProvysNmObjectProxyImpl;

import javax.annotation.Nonnull;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class EntityProxy
        extends ProvysNmObjectProxyImpl<Entity, EntityValue, EntityProxy, EntityManagerImpl>
        implements Entity {

    EntityProxy(EntityManagerImpl manager, BigInteger id) {
        super(manager, id);
    }

    @Nonnull
    @Override
    public Entity selfAsObject() {
        return this;
    }

    @Nonnull
    @Override
    protected EntityProxy self() {
        return this;
    }

    @Nonnull
    @Override
    public String getName() {
        return validateValueObject().getName();
    }

    @Override
    public boolean isCustom() {
        return validateValueObject().isCustom();
    }

    @Override
    public boolean isUsed() {
        return validateValueObject().isUsed();
    }

    @Override
    public boolean isObjectClass() {
        return validateValueObject().isObjectClass();
    }

    @Nonnull
    @Override
    public Optional<String> getTable() {
        return validateValueObject().getTable();
    }

    @Nonnull
    @Override
    public Optional<String> getView() {
        return validateValueObject().getView();
    }

    @Nonnull
    @Override
    public Optional<String> getPgPackage() {
        return validateValueObject().getPgPackage();
    }

    @Nonnull
    @Override
    public Optional<String> getCpPackage() {
        return validateValueObject().getCpPackage();
    }

    @Nonnull
    @Override
    public Optional<String> getEpPackage() {
        return validateValueObject().getEpPackage();
    }

    @Nonnull
    @Override
    public Optional<String> getFpPackage() {
        return validateValueObject().getFpPackage();
    }

    @Nonnull
    @Override
    public Optional<BigInteger> getAncestorId() {
        return validateValueObject().getAncestorId();
    }

    @Nonnull
    @Override
    public Optional<Entity> getAncestor() {
        return validateValueObject().getAncestor();
    }

    @Nonnull
    @Override
    public Optional<BigInteger> getEntityGrpId() {
        return validateValueObject().getEntityGrpId();
    }

    @Nonnull
    @Override
    public Optional<EntityGrp> getEntityGrp() {
        return validateValueObject().getEntityGrp();
    }

    @Nonnull
    @Override
    public Optional<String> getNote() {
        return validateValueObject().getNote();
    }

    @Nonnull
    @Override
    public Optional<String> getCustomNote() {
        return validateValueObject().getCustomNote();
    }

    @Nonnull
    @Override
    public Optional<String> getStructureDoc() {
        return validateValueObject().getStructureDoc();
    }

    @Nonnull
    @Override
    public Optional<String> getUsageDoc() {
        return validateValueObject().getUsageDoc();
    }

    @Nonnull
    @Override
    public Optional<String> getBehaviourDoc() {
        return validateValueObject().getBehaviourDoc();
    }

    @Nonnull
    @Override
    public Optional<String> getImplDoc() {
        return validateValueObject().getImplDoc();
    }

    @Nonnull
    @Override
    public Collection<AttrGrp> getAttrGrps() {
        return getManager().getRepository().getAttrGrpManager().getByEntityId(getId());
    }

    @Nonnull
    @Override
    public Collection<Attr> getAttrs() {
        return getManager().getRepository().getAttrManager().getByEntityId(getId());
    }

    @Override
    public int compareTo(Entity other) {
        if (other == this) {
            return 0;
        }
        return validateValueObject().compareTo(Objects.requireNonNull(other));
    }
}
