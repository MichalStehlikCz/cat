package com.provys.catalogue.api;

import com.provys.common.datatype.DtUid;
import com.provys.provysobject.ProvysObject;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.processing.Generated;

@Generated(
        value = "com.provys.provysobject.generator.impl.GeneratorEntity",
        date = "2020-01-26T16:33:11.706984600"
)
interface GenAttrGrp extends ProvysObject {
    /**
     * @return Entity (object referenced by attribute ENTITY_ID)
     */
    @Nonnull
    Entity getEntity();

    /**
     * @return Entity Id (attribute ENTITY_ID)
     */
    @Nonnull
    DtUid getEntityId();

    /**
     * @return Internal name (attribute NAME_NM)
     */
    @Nonnull
    String getNameNm();

    /**
     * @return Name (attribute NAME)
     */
    @Nonnull
    String getName();

    /**
     * @return Is custom (attribute ISCUSTOM)
     */
    boolean isIsCustom();

    /**
     * @return Ord (attribute ORD)
     */
    int getOrd();

    /**
     * @return Note (attribute NOTE)
     */
    @Nonnull
    Optional<String> getNote();
}
