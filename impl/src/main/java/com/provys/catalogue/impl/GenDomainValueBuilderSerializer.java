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
        date = "2020-01-03T20:22:04.111863400"
)
class GenDomainValueBuilderSerializer extends JsonSerializer<GenDomainValueBuilder> {
    @Override
    @SuppressWarnings("squid:S3776")
    public void serialize(GenDomainValueBuilder builder, JsonGenerator generator,
                          SerializerProvider serializerProvider) throws IOException {
        generator.writeStartObject();
        if (builder.getId() != null) {
            generator.writeFieldName("DOMAIN_ID");
            generator.writeNumber(builder.getId().getValue());
        }
        if (builder.getNameNm() != null) {
            generator.writeStringField("NAME_NM", builder.getNameNm());
        }
        if (builder.isUpdName()) {
            var value = builder.getName();
            if (value == null) {
                generator.writeNullField("NAME");
            } else {
                generator.writeStringField("NAME", value);
            }
        }
        if (builder.isUpdDataTypeNm()) {
            var value = builder.getDataTypeNm();
            if (value == null) {
                generator.writeNullField("DATATYPE_NM");
            } else {
                generator.writeStringField("DATATYPE_NM", value);
            }
        }
        if (builder.isUpdDataLength()) {
            var value = builder.getDataLength();
            if (value == null) {
                generator.writeNullField("DATALENGTH");
            } else {
                generator.writeNumberField("DATALENGTH", value);
            }
        }
        if (builder.isUpdDataPrecision()) {
            var value = builder.getDataPrecision();
            if (value == null) {
                generator.writeNullField("DATAPRECISION");
            } else {
                generator.writeNumberField("DATAPRECISION", value);
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
        if (builder.isUpdAllowed()) {
            var value = builder.isAllowed();
            if (value == null) {
                generator.writeNullField("ALLOWED");
            } else {
                generator.writeBooleanField("ALLOWED", value);
            }
        }
        if (builder.isUpdQVisible()) {
            var value = builder.isqVisible();
            if (value == null) {
                generator.writeNullField("QVISIBLE");
            } else {
                generator.writeBooleanField("QVISIBLE", value);
            }
        }
        if (builder.isUpdLVisible()) {
            var value = builder.islVisible();
            if (value == null) {
                generator.writeNullField("LVISIBLE");
            } else {
                generator.writeBooleanField("LVISIBLE", value);
            }
        }
        if (builder.isUpdValidateCd()) {
            var value = builder.getValidateCd();
            if (value == null) {
                generator.writeNullField("VALIDATE_CD");
            } else {
                generator.writeStringField("VALIDATE_CD", value);
            }
        }
        if (builder.isUpdLFormatCd()) {
            var value = builder.getlFormatCd();
            if (value == null) {
                generator.writeNullField("LFORMAT_CD");
            } else {
                generator.writeStringField("LFORMAT_CD", value);
            }
        }
        if (builder.isUpdNatOrder()) {
            var value = builder.isNatOrder();
            if (value == null) {
                generator.writeNullField("NATORDER");
            } else {
                generator.writeBooleanField("NATORDER", value);
            }
        }
        generator.writeEndObject();
    }
}