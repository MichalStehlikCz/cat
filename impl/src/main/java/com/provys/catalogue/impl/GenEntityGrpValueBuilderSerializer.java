package com.provys.catalogue.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.lang.Override;
import java.lang.SuppressWarnings;
import javax.annotation.processing.Generated;

@Generated(
        value = "com.provys.provysobject.generator.impl.GeneratorEntity",
        date = "2020-01-03T20:21:05.208836800"
)
class GenEntityGrpValueBuilderSerializer extends JsonSerializer<GenEntityGrpValueBuilder> {
    @Override
    @SuppressWarnings("squid:S3776")
    public void serialize(GenEntityGrpValueBuilder builder, JsonGenerator generator,
                          SerializerProvider serializerProvider) throws IOException {
        generator.writeStartObject();
        if (builder.getId() != null) {
            generator.writeFieldName("ENTITYGRP_ID");
            generator.writeNumber(builder.getId().getValue());
        }
        if (builder.getNameNm() != null) {
            generator.writeStringField("NAME_NM", builder.getNameNm());
        }
        if (builder.isUpdParentId()) {
            var value = builder.getParentId();
            if (value == null) {
                generator.writeNullField("PARENT_ID");
            } else {
                generator.writeFieldName("PARENT_ID");
                generator.writeNumber(value.getValue());
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
        if (builder.isUpdNote()) {
            var value = builder.getNote();
            if (value == null) {
                generator.writeNullField("NOTE");
            } else {
                generator.writeStringField("NOTE", value);
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
        generator.writeEndObject();
    }
}