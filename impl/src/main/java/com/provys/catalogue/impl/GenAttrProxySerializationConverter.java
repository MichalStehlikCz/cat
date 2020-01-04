package com.provys.catalogue.impl;

import com.fasterxml.jackson.databind.util.StdConverter;
import java.lang.Override;

class GenAttrProxySerializationConverter extends StdConverter<AttrProxy, GenAttrValue> {
    @Override
    public GenAttrValue convert(AttrProxy proxy) {
        return proxy.validateValueObject();
    }
}