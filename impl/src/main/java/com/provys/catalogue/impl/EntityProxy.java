package com.provys.catalogue.impl;

import com.provys.catalogue.api.Entity;
import com.provys.provysobject.impl.ProvysNmObjectProxy;

import javax.annotation.Nonnull;
import java.math.BigInteger;

public class EntityProxy extends ProvysNmObjectProxy<EntityValue, Entity, EntityManagerImpl>
        implements Entity {

    public EntityProxy(EntityManagerImpl manager, BigInteger id) {
        super(manager, id);
    }

    @Nonnull
    @Override
    protected Entity self() {
        return this;
    }

    @Override
    protected void loadValue() {

    }

    @Override
    public int compareTo(Entity o) {
        return 0;
    }
}
