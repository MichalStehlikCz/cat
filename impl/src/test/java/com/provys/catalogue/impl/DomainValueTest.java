package com.provys.catalogue.impl;

import com.provys.common.exception.InternalException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;

@SuppressWarnings("squid:S1192") // no problem with duplicate String values
class DomainValueTest {

    private static final Logger LOG = LogManager.getLogger(DomainValueTest.class);

    @Test
    void toJsonTest() {
        var value = new DomainValueBuilder()
                .setId(BigInteger.valueOf(10000000599L))
                .setNameNm("NUMBER")
                .setName("NUMBER")
                .setDataTypeNm("NUMBER")
                .setDataLength(38)
                .setNote("Numbers")
                .setAllowed(true)
                .setqVisible(true)
                .setlVisible(true)
                .setValidateCd("STD::NUMBER")
                .setlFormatCd("STD::NUMBER")
                .setNatOrder(true)
                .build();
        try (Jsonb jsonb = JsonbBuilder.create()) {
            assertThat(jsonb.toJson(value)).isEqualTo("{\"DOMAIN_ID\":10000000599,\"NAME_NM\":\"NUMBER\"," +
                    "\"NAME\":\"NUMBER\",\"DATATYPE_NM\":\"NUMBER\",\"DATALENGTH\":38,\"NOTE\":\"Numbers\"," +
                    "\"ALLOWED\":true,\"QVISIBLE\":true,\"LVISIBLE\":true,\"VALIDATE_CD\":\"STD::NUMBER\"," +
                    "\"LFORMAT_CD\":\"STD::NUMBER\",\"NATORDER\":true}");
        } catch (Exception e) {
            throw new InternalException(LOG, "Failed to serialize to JSON", e);
        }
    }

    @Test
    void fromJsonTest() {
        try (Jsonb jsonb = JsonbBuilder.create()) {
            assertThat(jsonb.fromJson("{\"DOMAIN_ID\":10000000599,\"NAME_NM\":\"NUMBER\"," +
                    "\"NAME\":\"NUMBER\",\"DATATYPE_NM\":\"NUMBER\",\"DATALENGTH\":38,\"NOTE\":\"Numbers\"," +
                    "\"ALLOWED\":true,\"QVISIBLE\":true,\"LVISIBLE\":true,\"VALIDATE_CD\":\"STD::NUMBER\"," +
                    "\"LFORMAT_CD\":\"STD::NUMBER\",\"NATORDER\":true}", DomainValue.class)
            ).isEqualTo(new DomainValueBuilder()
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
                    .build());
        } catch (Exception e) {
            throw new InternalException(LOG, "Failed to deserialize from JSON", e);
        }
    }
}
