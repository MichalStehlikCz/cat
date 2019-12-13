package com.provys.catalogue.impl;

import com.provys.common.exception.InternalException;
import java.lang.Override;
import javax.annotation.Nonnull;
import javax.annotation.processing.Generated;
import javax.json.bind.adapter.JsonbAdapter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Generated(
        value = "com.provys.provysobject.generator.impl.GeneratorEntity",
        date = "2019-12-12T16:09:45.485332300"
)
public class JsonbDomainProxyAdapter implements JsonbAdapter<DomainProxy, DomainValueBuilder> {
    private static final Logger LOG = LogManager.getLogger(JsonbDomainProxyAdapter.class);

    @Override
    @Nonnull
    public DomainValueBuilder adaptToJson(DomainProxy proxy) {
        return new com.provys.catalogue.impl.DomainValueBuilder(proxy.validateValueObject());
    }

    @Override
    @Nonnull
    public DomainProxy adaptFromJson(DomainValueBuilder builder) {
        throw new InternalException(LOG, "Cannot deserialize DomainProxy from JSON");
    }
}