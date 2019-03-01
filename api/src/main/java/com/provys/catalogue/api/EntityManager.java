package com.provys.catalogue.api;

import com.provys.provysobject.ProvysNmObjectManager;

import javax.annotation.Nonnull;
import java.math.BigInteger;
import java.util.Collection;

public interface EntityManager extends ProvysNmObjectManager<Entity> {

    @Nonnull
    Collection<Entity> getByEntityGrpId(BigInteger entityGrpId);
}
