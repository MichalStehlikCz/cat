package com.provys.catalogue.api;

import com.provys.provysobject.ProvysNmObject;

import javax.annotation.Nonnull;
import java.util.Optional;

public interface Domain extends ProvysNmObject {
    /**
     * @return name of domain (attribute NAME)
     */
    @Nonnull
    String getName();

    /**
     * @return data type (attribute DATATYPE_NM)
     */
    @Nonnull
    Optional<String> getDataType();

    /**
     * @return data length - number of characters / number of digits (attribute DATALENGTH)
     */
    @Nonnull
    Optional<Short> getDataLength();

    /**
     * @return precision - number of digits after decimal point (attribute DATAPRECISION)
     */
    @Nonnull
    Optional<Byte> getDataPrecision();

    /**
     * @return default query visibility (attribute QVISIBLE)
     */
    boolean isQVisible();

    /**
     * @return default XML list visibility (attribute LVISIBLE)
     */
    boolean isLVisible();

    /**
     * @return validation code (attribute VALIDATE_CD)
     */
    @Nonnull
    Optional<String> getValidateCd();

    /**
     * @return formatting for XML list (attribute LFORMAT_CD)
     */
    @Nonnull
    Optional<String> getLFormatCd();

    /**
     * @return if domain has native ordering (can be used in ORDER BY without conversion to string value) (attribute
     * NATORDER)
     */
    boolean isNatOrder();

    /**
     * @return note (attribute NOTE)
     */
    @Nonnull
    Optional<String> getNote();

    /**
     * @return if domain is allowed; not allowed domains are only maintained for backward compatibility (attribute
     * ALLOWED)
     */
    boolean isAllowed();

    /**
     * Return Java class this domain is mapped to in StehlaVys framework
     */
    @Nonnull
    Class<?> getImplementingClass(boolean optional);
}
