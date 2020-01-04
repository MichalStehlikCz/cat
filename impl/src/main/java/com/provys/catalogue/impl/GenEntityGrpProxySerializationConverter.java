package com.provys.catalogue.impl;

import com.fasterxml.jackson.databind.util.StdConverter;
import java.lang.Override;

class GenEntityGrpProxySerializationConverter extends StdConverter<EntityGrpProxy, GenEntityGrpValue> {
    @Override
    public GenEntityGrpValue convert(EntityGrpProxy proxy) {
        return proxy.validateValueObject();
    }
}