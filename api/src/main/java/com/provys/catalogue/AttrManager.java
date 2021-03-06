package com.provys.catalogue;

import com.provys.common.datatype.DtUid;
import com.provys.provysobject.ProvysObjectManager;

import javax.annotation.Nonnull;
import java.util.Collection;
import java.util.Optional;

public interface AttrManager extends ProvysObjectManager<Attr> {

    /**
     * Get collection of attributes belonging to specified entity.
     *
     * @param entityId is Id of entity attributes should belong to
     * @return collection of attributes belonging to given entity
     */
    @Nonnull
    Collection<Attr> getByEntityId(DtUid entityId);

    /**
     * Retrieve attribute for entity and internal name. Throw an exception if not found.
     *
     * @param entityId is UID of entity owning the attribute
     * @param nameNm is internal name of attribute to be returned
     * @return attribute of given entity with specified internal name
     */
    @Nonnull
    Attr getByEntityIdNameNm(DtUid entityId, String nameNm);

    /**
     * Retrieve attribute for entity and internal name if it exists.
     *
     * @param entityId is UID of entity owning the attribute
     * @param nameNm is internal name of attribute to be returned
     * @return attribute of given entity with specified internal name, empty optional if no such attribute exists
     */
    @Nonnull
    Optional<Attr> getByEntityIdNameNmIfExists(DtUid entityId, String nameNm);

    /**
     * Get collection of attributes belonging to specified attribute group.
     *
     * @param attrGrpId is Id of group attributes should belong to
     * @return collection of attributes belonging to given attribute group
     */
    @Nonnull
    Collection<Attr> getByAttrGrpId(DtUid attrGrpId);

}
