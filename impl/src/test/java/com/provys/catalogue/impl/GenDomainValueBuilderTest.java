package com.provys.catalogue.impl;

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

class GenDomainValueBuilderTest {

    private static final GenDomainValueBuilder SAMPLE_BUILDER = new GenDomainValueBuilder()
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
            .setValidateCd("STD::NUMBER");
    private static final String SAMPLE_JSON = "{\"DOMAIN_ID\":10000000599,\"NAME_NM\":\"NUMBER\"," +
            "\"NAME\":\"NUMBER\",\"DATATYPE_NM\":\"NUMBER\",\"DATALENGTH\":38,\"NOTE\":\"Numbers\"," +
            "\"ALLOWED\":true,\"QVISIBLE\":true,\"LVISIBLE\":true,\"VALIDATE_CD\":\"STD::NUMBER\"," +
            "\"LFORMAT_CD\":\"STD::NUMBER\",\"NATORDER\":true}";
    private static final String SAMPLE_XML = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><DOMAIN>" +
            "<NAME>NUMBER</NAME><DATATYPE_NM>NUMBER</DATATYPE_NM><DATALENGTH>38</DATALENGTH><NOTE>Numbers</NOTE>" +
            "<ALLOWED>true</ALLOWED><QVISIBLE>true</QVISIBLE><LVISIBLE>true</LVISIBLE>" +
            "<VALIDATE_CD>STD::NUMBER</VALIDATE_CD><LFORMAT_CD>STD::NUMBER</LFORMAT_CD><NATORDER>true</NATORDER>" +
            "<DOMAIN_ID>10000000599</DOMAIN_ID><NAME_NM>NUMBER</NAME_NM></DOMAIN>";

    @Test
    void toJsonTest() {
        //noinspection CatchMayIgnoreException
        try (Jsonb jsonb = JsonbBuilder.create()) {
            assertThat(jsonb.toJson(SAMPLE_BUILDER)).isEqualTo(SAMPLE_JSON);
        } catch (Exception e) {
            //noinspection ResultOfMethodCallIgnored
            Fail.fail("Unexpected exception thrown during test", e);
        }
    }

    @Test
    void fromJsonTest() {
        //noinspection CatchMayIgnoreException
        try (Jsonb jsonb = JsonbBuilder.create()) {
            assertThat(jsonb.fromJson(SAMPLE_JSON, GenDomainValueBuilder.class)
            ).isEqualTo(SAMPLE_BUILDER);
        } catch (Exception e) {
            //noinspection ResultOfMethodCallIgnored
            Fail.fail("Unexpected exception thrown during test", e);
        }
    }

    @Test
    void marshalTest() {
        try {
            var context = JAXBContext.newInstance(GenDomainValueBuilder.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);
            var resultWriter = new StringWriter();
            m.marshal(SAMPLE_BUILDER, resultWriter);
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
            var context = JAXBContext.newInstance(GenDomainValueBuilder.class);
            Unmarshaller u = context.createUnmarshaller();
            var reader = new StringReader(SAMPLE_XML);
            assertThat((GenDomainValueBuilder) u.unmarshal(reader)).isEqualTo(SAMPLE_BUILDER);
        } catch (JAXBException e) {
            //noinspection ResultOfMethodCallIgnored
            Fail.fail("JAXBException thrown during test", e);
        }
    }
}