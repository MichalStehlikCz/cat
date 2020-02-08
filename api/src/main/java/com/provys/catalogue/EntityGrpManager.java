package com.provys.catalogue;

import com.provys.common.datatype.DtUid;
import com.provys.provysobject.ProvysNmObjectManager;

import javax.annotation.Nonnull;
import java.util.Collection;

public interface EntityGrpManager extends ProvysNmObjectManager<EntityGrp> {

    @Nonnull
    Collection<EntityGrp> getByParentId(DtUid parentId);
}
