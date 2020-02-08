package com.provys.catalogue;

import com.provys.provysobject.ProvysNmObject;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.processing.Generated;

@Generated("com.provys.provysobject.generator.impl.GeneratorEntity")
interface GenDomain extends ProvysNmObject {
    /**
     * @return Name (attribute NAME)
     */
    @Nonnull
    String getName();

    /**
     * @return Data type (attribute DATATYPE_NM)
     */
    @Nonnull
    Optional<String> getDataTypeNm();

    /**
     * @return Data length (attribute DATALENGTH)
     */
    @Nonnull
    Optional<Integer> getDataLength();

    /**
     * @return Data precision (attribute DATAPRECISION)
     */
    @Nonnull
    Optional<Integer> getDataPrecision();

    /**
     * @return Note (attribute NOTE)
     */
    @Nonnull
    Optional<String> getNote();

    /**
     * @return Allowed (attribute ALLOWED)
     */
    boolean isAllowed();

    /**
     * @return Usable in query (attribute QVISIBLE)
     */
    boolean isqVisible();

    /**
     * @return Usable in lists (attribute LVISIBLE)
     */
    boolean islVisible();

    /**
     * @return Validation (attribute VALIDATE_CD)
     */
    @Nonnull
    Optional<String> getValidateCd();

    /**
     * @return List format (attribute LFORMAT_CD)
     */
    @Nonnull
    Optional<String> getlFormatCd();

    /**
     * @return Native ordering (attribute NATORDER)
     */
    boolean isNatOrder();
}
