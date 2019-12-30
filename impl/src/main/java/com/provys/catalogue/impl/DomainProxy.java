package com.provys.catalogue.impl;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.provys.catalogue.api.Domain;
import com.provys.common.datatype.DtDate;
import com.provys.common.datatype.DtDateTime;
import com.provys.common.datatype.DtUid;
import com.provys.common.exception.InternalException;
import java.lang.Override;
import java.lang.SuppressWarnings;
import java.math.BigInteger;
import javax.annotation.Nonnull;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@JsonSerialize(
        converter = GenDomainProxySerializationConverter.class
)
@XmlRootElement(
        name = "DOMAIN"
)
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
                return DtDate.class;
            case "DATETIME":
                return DtDateTime.class;
            case "CHAR":
                return optional ? Character.class : char.class;
            case "INTEGER":
                return optional ? Integer.class : int.class;
            case "UID":
            case "REF":
                return DtUid.class;
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
