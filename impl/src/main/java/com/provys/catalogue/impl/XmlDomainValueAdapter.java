package com.provys.catalogue.impl;

import java.lang.Override;
import javax.annotation.Nonnull;
import javax.annotation.processing.Generated;
import javax.xml.bind.annotation.adapters.XmlAdapter;

@Generated(
        value = "com.provys.provysobject.generator.impl.GeneratorEntity",
        date = "2019-12-11T19:19:34.686174500"
)
class XmlDomainValueAdapter extends XmlAdapter<DomainValueBuilder, DomainValue> {
    @Override
    @Nonnull
    public DomainValueBuilder marshal(DomainValue value) {
        return new com.provys.catalogue.impl.DomainValueBuilder(value);
    }

    @Override
    @Nonnull
    public DomainValue unmarshal(DomainValueBuilder builder) {
        return builder.build();
    }
}