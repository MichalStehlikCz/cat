package com.provys.catalogue.api;

import com.provys.common.datatype.DtUid;
import com.provys.provysobject.ProvysNmObject;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.processing.Generated;

@Generated("com.provys.provysobject.generator.impl.GeneratorEntity")
interface GenEntityGrp extends ProvysNmObject {
    /**
     * @return Parent (object referenced by attribute PARENT_ID)
     */
    @Nonnull
    Optional<EntityGrp> getParent();

    /**
     * @return Parent Id (attribute PARENT_ID)
     */
    @Nonnull
    Optional<DtUid> getParentId();

    /**
     * @return Name (attribute NAME)
     */
    @Nonnull
    String getName();

    /**
     * @return Note (attribute NOTE)
     */
    @Nonnull
    Optional<String> getNote();

    /**
     * @return Ordering (attribute ORD)
     */
    int getOrd();
}
