package com.provys.catalogue.impl;

import com.ctc.wstx.api.WstxOutputProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

class DomainProxyTest {

    private static final DomainProxy SAMPLE_PROXY;
    static {
        var manager = mock(DomainManagerImpl.class);
        SAMPLE_PROXY = new DomainProxy(manager, BigInteger.valueOf(10000000599L));
        var value = new GenDomainValueBuilder()
                .setId(BigInteger.valueOf(10000000599L))
                .setNameNm("NUMBER")
                .setAllowed(true)
                .setDataLength(38)
                .setDataTypeNm("NUMBER")
                .setlFormatCd("STD::NUMBER")
                .setlVisible(true)
                .setName("NUMBER")
                .setNatOrder(true)
                .setNote("Numbers")
                .setqVisible(true)
                .setValidateCd("STD::NUMBER")
                .build();
        SAMPLE_PROXY.setValueObject(value);
    }
    private static final String SAMPLE_JSON = "{\"DOMAIN_ID\":10000000599,\"NAME_NM\":\"NUMBER\"," +
            "\"NAME\":\"NUMBER\",\"DATATYPE_NM\":\"NUMBER\",\"DATALENGTH\":38,\"NOTE\":\"Numbers\"," +
            "\"ALLOWED\":true,\"QVISIBLE\":true,\"LVISIBLE\":true,\"VALIDATE_CD\":\"STD::NUMBER\"," +
            "\"LFORMAT_CD\":\"STD::NUMBER\",\"NATORDER\":true}";
    private static final String SAMPLE_XML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><DOMAIN>" +
            "<DOMAIN_ID>10000000599</DOMAIN_ID><NAME_NM>NUMBER</NAME_NM><NAME>NUMBER</NAME>" +
            "<DATATYPE_NM>NUMBER</DATATYPE_NM><DATALENGTH>38</DATALENGTH><DATAPRECISION/><NOTE>Numbers</NOTE>" +
            "<ALLOWED>true</ALLOWED><QVISIBLE>true</QVISIBLE><LVISIBLE>true</LVISIBLE>" +
            "<VALIDATE_CD>STD::NUMBER</VALIDATE_CD><LFORMAT_CD>STD::NUMBER</LFORMAT_CD><NATORDER>true</NATORDER>" +
            "</DOMAIN>";

    @Test
    void toJsonTest() throws JsonProcessingException {
        var mapper = new ObjectMapper();
        mapper.setAnnotationIntrospector(
                AnnotationIntrospector.pair(new JacksonAnnotationIntrospector(),
                        new JaxbAnnotationIntrospector(TypeFactory.defaultInstance())))
                .registerModules(new Jdk8Module(), new JavaTimeModule())
                .setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        assertThat(mapper.writeValueAsString(SAMPLE_PROXY)).isEqualTo(SAMPLE_JSON);
    }

    @Test
    void fromJsonTest() {
        var mapper = new ObjectMapper();
        assertThatThrownBy(() -> mapper.readValue(SAMPLE_JSON, DomainProxy.class))
                .isInstanceOf(JsonProcessingException.class);
    }

    @Test
    void toXmlTest() throws JsonProcessingException {
        var mapper = new XmlMapper();
        mapper.enable(ToXmlGenerator.Feature.WRITE_XML_DECLARATION);
        mapper.getFactory()
                .getXMLOutputFactory()
                .setProperty(WstxOutputProperties.P_USE_DOUBLE_QUOTES_IN_XML_DECL, true);
        mapper.setAnnotationIntrospector(
                AnnotationIntrospector.pair(new JacksonAnnotationIntrospector(),
                new JaxbAnnotationIntrospector(TypeFactory.defaultInstance())));
        mapper.registerModules(new Jdk8Module(), new JavaTimeModule());
        assertThat(mapper.writeValueAsString(SAMPLE_PROXY)).isEqualTo(SAMPLE_XML);
    }

    @Test
    void fromXmlTest() {
        var mapper = new XmlMapper();
        assertThatThrownBy(() -> mapper.readValue(SAMPLE_XML, DomainProxy.class))
                .isInstanceOf(JsonProcessingException.class);
    }
}