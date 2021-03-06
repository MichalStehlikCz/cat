package com.provys.catalogue;

import com.provys.common.datatype.DtUid;
import com.provys.provysobject.ProvysObjectManager;

import javax.annotation.Nonnull;
import java.util.Collection;
import java.util.Optional;

public interface AttrGrpManager extends ProvysObjectManager<AttrGrp> {

    /**
     * Get collection of attribute groups belonging to specified entity.
     *
     * @param entityId is Id of entity attribute groups should belong to
     * @return collection of attribute groups belonging to given entity
     */
    @Nonnull
    Collection<AttrGrp> getByEntityId(DtUid entityId);

    /**
     * Retrieve attribute group for entity and internal name. Throw an exception if not found.
     *
     * @param entityId is UID of entity owning the attribute group
     * @param nameNm is internal name of attribute group to be returned
     * @return attribute group of given entity with specified internal name
     */
    @Nonnull
    AttrGrp getByEntityIdNameNm(DtUid entityId, String nameNm);

    /**
     * Retrieve attribute group for entity and internal name if it exists.
     *
     * @param entityId is UID of entity owning the attribute group
     * @param nameNm is internal name of attribute group to be returned
     * @return attribute group of given entity with specified internal name, empty optional if no such attribute group
     * exists
     */
    @Nonnull
    Optional<AttrGrp> getByEntityIdNameNmIfExists(DtUid entityId, String nameNm);
}
