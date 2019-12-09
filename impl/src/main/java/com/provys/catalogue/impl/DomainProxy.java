package com.provys.catalogue.impl;

import com.provys.catalogue.api.Domain;
import com.provys.catalogue.impl.gen.GenDomainProxy;
import com.provys.common.exception.InternalException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Nonnull;

public class DomainProxy extends GenDomainProxy implements Domain {

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
                switch (getDataTypeNm().orElseThrow(
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
