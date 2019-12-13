package com.provys.catalogue.impl;

import com.provys.common.exception.InternalException;
import java.lang.Override;
import javax.annotation.Nonnull;
import javax.annotation.processing.Generated;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Generated(
        value = "com.provys.provysobject.generator.impl.GeneratorEntity",
        date = "2019-12-12T16:09:16.394692200"
)
class XmlDomainProxyAdapter extends XmlAdapter<DomainValueBuilder, DomainProxy> {
    private static final Logger LOG = LogManager.getLogger(XmlDomainProxyAdapter.class);

    @Override
    @Nonnull
    public DomainValueBuilder marshal(DomainProxy proxy) {
        return new com.provys.catalogue.impl.DomainValueBuilder(proxy.validateValueObject());
    }

    @Override
    @Nonnull
    public DomainProxy unmarshal(DomainValueBuilder builder) {
        throw new InternalException(LOG, "Cannot deserialize DomainProxy from JSON");
    }
}