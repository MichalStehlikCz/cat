package com.provys.catalogue.impl;

import com.provys.catalogue.api.Entity;
import com.provys.catalogue.api.EntityGrp;
import com.provys.provysobject.impl.ProvysNmObjectProxyImpl;

import javax.annotation.Nonnull;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class EntityGrpProxy
        extends ProvysNmObjectProxyImpl<EntityGrp, EntityGrpValue, EntityGrpProxy, EntityGrpManagerImpl>
        implements EntityGrp {

    EntityGrpProxy(EntityGrpManagerImpl manager, BigInteger id) {
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
    public Optional<BigInteger> getParentId() {
        return validateValueObject().getParentId();
    }

    @Nonnull
    @Override
    public Optional<EntityGrp> getParent() {
        return validateValueObject().getParent();
    }

    @Nonnull
    @Override
    public String getName() {
        return validateValueObject().getName();
    }

    @Nonnull
    @Override
    public Optional<String> getNote() {
        return validateValueObject().getNote();
    }

    @Override
    public int getOrd() {
        return validateValueObject().getOrd();
    }

    @Nonnull
    @Override
    public Collection<EntityGrp> getChildren() {
        return getManager().getByParentId(getId());
    }

    @Nonnull
    @Override
    public Collection<Entity> getEntities() {
        return null;
    }

    @Nonnull
    @Override
    public List<Integer> getFullOrd() {
        return validateValueObject().getFullOrd();
    }

    @Override
    public int compareTo(EntityGrp other) {
        if (this == other) {
            return 0;
        }
        return validateValueObject().compareTo(other);
    }
}
