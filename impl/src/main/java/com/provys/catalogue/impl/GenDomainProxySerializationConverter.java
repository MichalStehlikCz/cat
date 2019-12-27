package com.provys.catalogue.impl;

import com.fasterxml.jackson.databind.util.StdConverter;
import java.lang.Override;

class GenDomainProxySerializationConverter extends StdConverter<DomainProxy, GenDomainValue> {
    @Override
    public GenDomainValue convert(DomainProxy proxy) {
        return proxy.validateValueObject();
    }
}