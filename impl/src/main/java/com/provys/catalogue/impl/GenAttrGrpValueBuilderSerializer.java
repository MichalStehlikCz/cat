package com.provys.catalogue.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import javax.annotation.processing.Generated;

@Generated("com.provys.provysobject.generator.impl.GeneratorEntity")
class GenAttrGrpValueBuilderSerializer extends JsonSerializer<GenAttrGrpValueBuilder> {
    @Override
    @SuppressWarnings("squid:S3776")
    public void serialize(GenAttrGrpValueBuilder builder, JsonGenerator generator,
            SerializerProvider serializerProvider) throws IOException {
        generator.writeStartObject();
        if (builder.getId() != null) {
            generator.writeFieldName("ATTRGRP_ID");
            generator.writeNumber(builder.getId().getValue());
        }
        if (builder.isUpdEntityId()) {
            var value = builder.getEntityId();
            if (value == null) {
                generator.writeNullField("ENTITY_ID");
            } else {
                generator.writeFieldName("ENTITY_ID");
                generator.writeNumber(value.getValue());
            }
        }
        if (builder.isUpdNameNm()) {
            var value = builder.getNameNm();
            if (value == null) {
                generator.writeNullField("NAME_NM");
            } else {
                generator.writeStringField("NAME_NM", value);
            }
        }
        if (builder.isUpdName()) {
            var value = builder.getName();
            if (value == null) {
                generator.writeNullField("NAME");
            } else {
                generator.writeStringField("NAME", value);
            }
        }
        if (builder.isUpdIsCustom()) {
            var value = builder.isIsCustom();
            if (value == null) {
                generator.writeNullField("ISCUSTOM");
            } else {
                generator.writeBooleanField("ISCUSTOM", value);
            }
        }
        if (builder.isUpdOrd()) {
            var value = builder.getOrd();
            if (value == null) {
                generator.writeNullField("ORD");
            } else {
                generator.writeNumberField("ORD", value);
            }
        }
        if (builder.isUpdNote()) {
            var value = builder.getNote();
            if (value == null) {
                generator.writeNullField("NOTE");
            } else {
                generator.writeStringField("NOTE", value);
            }
        }
        generator.writeEndObject();
    }
}
