package com.provys.catalogue;

import com.provys.common.datatype.DtUid;
import com.provys.provysobject.ProvysNmObjectManager;

import javax.annotation.Nonnull;
import java.util.Collection;

public interface EntityManager extends ProvysNmObjectManager<Entity> {

    @Nonnull
    Collection<Entity> getByEntityGrpId(DtUid entityGrpId);
}
