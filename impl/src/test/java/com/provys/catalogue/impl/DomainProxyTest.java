package com.provys.catalogue.impl;

import com.provys.common.exception.InternalException;
import org.assertj.core.api.Fail;
import org.junit.jupiter.api.Test;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigInteger;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

class DomainProxyTest {

    private static final DomainProxy SAMPLE_PROXY;
    static {
        var manager = mock(DomainManagerImpl.class);
        SAMPLE_PROXY = new DomainProxy(manager, BigInteger.valueOf(10000000599L));
        var value = new DomainValueBuilder()
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
    private static final String SAMPLE_XML = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><DOMAIN>" +
            "<NAME_NM>NUMBER</NAME_NM><NAME>NUMBER</NAME><DATATYPE_NM>NUMBER</DATATYPE_NM><DATALENGTH>38</DATALENGTH>" +
            "<NOTE>Numbers</NOTE><ALLOWED>true</ALLOWED><QVISIBLE>true</QVISIBLE><LVISIBLE>true</LVISIBLE>" +
            "<VALIDATE_CD>STD::NUMBER</VALIDATE_CD><LFORMAT_CD>STD::NUMBER</LFORMAT_CD><NATORDER>true</NATORDER>" +
            "<DOMAIN_ID>10000000599</DOMAIN_ID><NAME_NM>NUMBER</NAME_NM></DOMAIN>";

    @Test
    void toJsonTest() {
        //noinspection CatchMayIgnoreException
        try (Jsonb jsonb = JsonbBuilder.create()) {
            assertThat(jsonb.toJson(SAMPLE_PROXY)).isEqualTo(SAMPLE_JSON);
        } catch (Exception e) {
            //noinspection ResultOfMethodCallIgnored
            Fail.fail("JSON-B serialisation failed", e);
        }
    }

    @Test
    void fromJsonTest() {
        //noinspection CatchMayIgnoreException
        try (Jsonb jsonb = JsonbBuilder.create()) {
            assertThatThrownBy(() -> jsonb.fromJson(SAMPLE_JSON, DomainProxy.class))
                    .hasCauseInstanceOf(InternalException.class);
        } catch (Exception e) {
            //noinspection ResultOfMethodCallIgnored
            Fail.fail("JSON-B deserialisation failed", e);
        }
    }

    @Test
    void marshalTest() {
        try {
            var context = JAXBContext.newInstance(DomainProxy.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);
            var resultWriter = new StringWriter();
            m.marshal(SAMPLE_PROXY, resultWriter);
            assertThat(resultWriter.toString())
                    .isEqualTo(SAMPLE_XML);
        } catch (JAXBException e) {
            //noinspection ResultOfMethodCallIgnored
            Fail.fail("JAXBException thrown during test", e);
        }
    }

    @Test
    void unmarshalTest() {
        try {
            var context = JAXBContext.newInstance(DomainProxy.class);
            Unmarshaller u = context.createUnmarshaller();
            var reader = new StringReader(SAMPLE_XML);
            assertThatThrownBy(() -> u.unmarshal(reader)).isInstanceOf(InternalException.class);
        } catch (JAXBException e) {
            //noinspection ResultOfMethodCallIgnored
            Fail.fail("JAXBException thrown during test", e);
        }
    }
}