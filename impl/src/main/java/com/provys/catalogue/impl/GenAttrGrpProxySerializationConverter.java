package com.provys.catalogue.impl;

import com.fasterxml.jackson.databind.util.StdConverter;
import java.lang.Override;

class GenAttrGrpProxySerializationConverter extends StdConverter<AttrGrpProxy, GenAttrGrpValue> {
    @Override
    public GenAttrGrpValue convert(AttrGrpProxy proxy) {
        return proxy.validateValueObject();
    }
}