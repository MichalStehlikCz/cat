package com.provys.catalogue.impl;

import java.lang.Override;
import javax.annotation.Nonnull;
import javax.annotation.processing.Generated;
import javax.json.bind.adapter.JsonbAdapter;

@Generated(
        value = "com.provys.provysobject.generator.impl.GeneratorEntity",
        date = "2019-12-11T19:17:49.633630300"
)
public class JsonbDomainValueAdapter implements JsonbAdapter<DomainValue, DomainValueBuilder> {
    @Override
    @Nonnull
    public DomainValueBuilder adaptToJson(DomainValue value) {
        return new DomainValueBuilder(value);
    }

    @Override
    @Nonnull
    public DomainValue adaptFromJson(DomainValueBuilder builder) {
        return builder.build();
    }
}