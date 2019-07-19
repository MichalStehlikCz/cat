package com.provys.catalogue.impl;

import com.provys.catalogue.api.Domain;
import com.provys.common.exception.InternalException;
import com.provys.provysobject.impl.ProvysNmObjectProxyImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

public class DomainProxy extends ProvysNmObjectProxyImpl<Domain, DomainValue, DomainProxy, DomainManagerImpl>
        implements Domain {

    private static final Logger LOG = LogManager.getLogger(DomainProxy.class);

    DomainProxy(DomainManagerImpl manager, BigInteger id) {
        super(manager, id);
    }

    @Nonnull
    @Override
    protected DomainProxy self() {
        return this;
    }

    @Nonnull
    @Override
    public Domain selfAsObject() {
        return this;
    }

    @Nonnull
    @Override
    public String getName() {
        return validateValueObject().getName();
    }

    @Nonnull
    @Override
    public Optional<String> getDataType() {
        return validateValueObject().getDataType();
    }

    @Nonnull
    @Override
    public Optional<Short> getDataLength() {
        return validateValueObject().getDataLength();
    }

    @Nonnull
    @Override
    public Optional<Byte> getDataPrecision() {
        return validateValueObject().getDataPrecision();
    }

    @Override
    public boolean isQVisible() {
        return validateValueObject().isQVisible();
    }

    @Override
    public boolean isLVisible() {
        return validateValueObject().isLVisible();
    }

    @Nonnull
    @Override
    public Optional<String> getValidateCd() {
        return validateValueObject().getValidateCd();
    }

    @Nonnull
    @Override
    public Optional<String> getLFormatCd() {
        return validateValueObject().getLFormatCd();
    }

    @Override
    public boolean isNatOrder() {
        return validateValueObject().isNatOrder();
    }

    @Nonnull
    @Override
    public Optional<String> getNote() {
        return validateValueObject().getNote();
    }

    @Override
    public boolean isAllowed() {
        return validateValueObject().isAllowed();
    }

    @Nonnull
    @Override
    public Class<?> getImplementingClass(boolean optional) {
        switch (getNameNm()) {
            case "BLOB":
                return byte[].class;
            case "BOOLEAN":
                return optional ? Boolean.class : boolean.class;
            case "DATE":
                return LocalDate.class;
            case "DATETIME":
                return LocalDateTime.class;
            case "CHAR":
                return optional ? Character.class : char.class;
            case "INTEGER":
                return optional ? Integer.class : int.class;
            case "UID":
            case "REF":
                return BigInteger.class;
            default:
                switch (getDataType().orElseThrow(
                        () -> new InternalException(LOG, "Implementing class not found for domain " + getNameNm()))) {
                    case "CLOB":
                    case "VARCHAR2":
                    case "NVARCHAR2":
                    case "PASSWORD":
                        return String.class;
                    case "NUMBER":
                        return optional ? Double.class : double.class;
                    default:
                        throw new InternalException(LOG, "Implementing class not found for domain " + getNameNm());
                }
        }
    }
}
