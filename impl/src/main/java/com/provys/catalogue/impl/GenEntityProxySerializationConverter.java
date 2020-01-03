package com.provys.catalogue.impl;

import com.fasterxml.jackson.databind.util.StdConverter;
import java.lang.Override;

class GenEntityProxySerializationConverter extends StdConverter<EntityProxy, GenEntityValue> {
    @Override
    public GenEntityValue convert(EntityProxy proxy) {
        return proxy.validateValueObject();
    }
}