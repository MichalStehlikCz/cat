package com.provys.catalogue.api;

import com.provys.provysobject.ProvysNmObjectManager;

import javax.annotation.Nonnull;
import java.math.BigInteger;
import java.util.Collection;

public interface EntityGrpManager extends ProvysNmObjectManager<EntityGrp> {

    @Nonnull
    Collection<EntityGrp> getByParentId(BigInteger parentId);
}
