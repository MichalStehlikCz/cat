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
        date = "2020-01-03T20:19:20.045032100"
)
class GenAttrValueBuilderSerializer extends JsonSerializer<GenAttrValueBuilder> {
    @Override
    @SuppressWarnings("squid:S3776")
    public void serialize(GenAttrValueBuilder builder, JsonGenerator generator,
                          SerializerProvider serializerProvider) throws IOException {
        generator.writeStartObject();
        if (builder.getId() != null) {
            generator.writeFieldName("ATTR_ID");
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
        if (builder.isUpdNote()) {
            var value = builder.getNote();
            if (value == null) {
                generator.writeNullField("NOTE");
            } else {
                generator.writeStringField("NOTE", value);
            }
        }
        if (builder.isUpdAttrType()) {
            var value = builder.getAttrType();
            if (value == null) {
                generator.writeNullField("ATTRTYPE");
            } else {
                generator.writeObjectField("ATTRTYPE", value);
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
        if (builder.isUpdIsUsed()) {
            var value = builder.isIsUsed();
            if (value == null) {
                generator.writeNullField("ISUSED");
            } else {
                generator.writeBooleanField("ISUSED", value);
            }
        }
        if (builder.isUpdAttrGrpId()) {
            var value = builder.getAttrGrpId();
            if (value == null) {
                generator.writeNullField("ATTRGRP_ID");
            } else {
                generator.writeFieldName("ATTRGRP_ID");
                generator.writeNumber(value.getValue());
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
        if (builder.isUpdDomainId()) {
            var value = builder.getDomainId();
            if (value == null) {
                generator.writeNullField("DOMAIN_ID");
            } else {
                generator.writeFieldName("DOMAIN_ID");
                generator.writeNumber(value.getValue());
            }
        }
        if (builder.isUpdSubdomainNm()) {
            var value = builder.getSubdomainNm();
            if (value == null) {
                generator.writeNullField("SUBDOMAIN_NM");
            } else {
                generator.writeStringField("SUBDOMAIN_NM", value);
            }
        }
        if (builder.isUpdProperNameRoot()) {
            var value = builder.getProperNameRoot();
            if (value == null) {
                generator.writeNullField("PROPERNAMEROOT");
            } else {
                generator.writeStringField("PROPERNAMEROOT", value);
            }
        }
        if (builder.isUpdMandatory()) {
            var value = builder.isMandatory();
            if (value == null) {
                generator.writeNullField("MANDATORY");
            } else {
                generator.writeBooleanField("MANDATORY", value);
            }
        }
        if (builder.isUpdOrdered()) {
            var value = builder.isOrdered();
            if (value == null) {
                generator.writeNullField("ORDERED");
            } else {
                generator.writeBooleanField("ORDERED", value);
            }
        }
        if (builder.isUpdOrdGroup()) {
            var value = builder.getOrdGroup();
            if (value == null) {
                generator.writeNullField("ORDGROUP");
            } else {
                generator.writeStringField("ORDGROUP", value);
            }
        }
        if (builder.isUpdDefValue()) {
            var value = builder.getDefValue();
            if (value == null) {
                generator.writeNullField("DEFVALUE");
            } else {
                generator.writeStringField("DEFVALUE", value);
            }
        }
        if (builder.isUpdMultiCreate()) {
            var value = builder.isMultiCreate();
            if (value == null) {
                generator.writeNullField("MULTICREATE");
            } else {
                generator.writeBooleanField("MULTICREATE", value);
            }
        }
        if (builder.isUpdGenCopy()) {
            var value = builder.isGenCopy();
            if (value == null) {
                generator.writeNullField("GENCOPY");
            } else {
                generator.writeBooleanField("GENCOPY", value);
            }
        }
        if (builder.isUpdGenMove()) {
            var value = builder.isGenMove();
            if (value == null) {
                generator.writeNullField("GENMOVE");
            } else {
                generator.writeBooleanField("GENMOVE", value);
            }
        }
        if (builder.isUpdGenDelete()) {
            var value = builder.isGenDelete();
            if (value == null) {
                generator.writeNullField("GENDELETE");
            } else {
                generator.writeBooleanField("GENDELETE", value);
            }
        }
        if (builder.isUpdTextSrcId()) {
            var value = builder.getTextSrcId();
            if (value == null) {
                generator.writeNullField("TEXTSRC_ID");
            } else {
                generator.writeFieldName("TEXTSRC_ID");
                generator.writeNumber(value.getValue());
            }
        }
        if (builder.isUpdHierarchical()) {
            var value = builder.isHierarchical();
            if (value == null) {
                generator.writeNullField("HIERARCHICAL");
            } else {
                generator.writeBooleanField("HIERARCHICAL", value);
            }
        }
        if (builder.isUpdIsInTable()) {
            var value = builder.isIsInTable();
            if (value == null) {
                generator.writeNullField("ISINTABLE");
            } else {
                generator.writeBooleanField("ISINTABLE", value);
            }
        }
        if (builder.isUpdIsOwn()) {
            var value = builder.isIsOwn();
            if (value == null) {
                generator.writeNullField("ISOWN");
            } else {
                generator.writeBooleanField("ISOWN", value);
            }
        }
        if (builder.isUpdValidated()) {
            var value = builder.isValidated();
            if (value == null) {
                generator.writeNullField("VALIDATED");
            } else {
                generator.writeBooleanField("VALIDATED", value);
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
        if (builder.isUpdLLength()) {
            var value = builder.getlLength();
            if (value == null) {
                generator.writeNullField("LLENGTH");
            } else {
                generator.writeNumberField("LLENGTH", value);
            }
        }
        if (builder.isUpdIndexed()) {
            var value = builder.isIndexed();
            if (value == null) {
                generator.writeNullField("INDEXED");
            } else {
                generator.writeBooleanField("INDEXED", value);
            }
        }
        if (builder.isUpdUpNameNm()) {
            var value = builder.getUpNameNm();
            if (value == null) {
                generator.writeNullField("UPNAME_NM");
            } else {
                generator.writeStringField("UPNAME_NM", value);
            }
        }
        if (builder.isUpdReadOnly()) {
            var value = builder.isReadOnly();
            if (value == null) {
                generator.writeNullField("READONLY");
            } else {
                generator.writeBooleanField("READONLY", value);
            }
        }
        if (builder.isUpdGetOpTypeId()) {
            var value = builder.getGetOpTypeId();
            if (value == null) {
                generator.writeNullField("GETOPTYPE_ID");
            } else {
                generator.writeFieldName("GETOPTYPE_ID");
                generator.writeNumber(value.getValue());
            }
        }
        if (builder.isUpdSetOpTypeId()) {
            var value = builder.getSetOpTypeId();
            if (value == null) {
                generator.writeNullField("SETOPTYPE_ID");
            } else {
                generator.writeFieldName("SETOPTYPE_ID");
                generator.writeNumber(value.getValue());
            }
        }
        if (builder.isUpdResetOpTypeId()) {
            var value = builder.getResetOpTypeId();
            if (value == null) {
                generator.writeNullField("RESETOPTYPE_ID");
            } else {
                generator.writeFieldName("RESETOPTYPE_ID");
                generator.writeNumber(value.getValue());
            }
        }
        if (builder.isUpdConfirmOther()) {
            var value = builder.getConfirmOther();
            if (value == null) {
                generator.writeNullField("CONFIRMOTHER");
            } else {
                generator.writeBooleanField("CONFIRMOTHER", value);
            }
        }
        if (builder.isUpdSetOtherOpTypeId()) {
            var value = builder.getSetOtherOpTypeId();
            if (value == null) {
                generator.writeNullField("SETOTHEROPTYPE_ID");
            } else {
                generator.writeFieldName("SETOTHEROPTYPE_ID");
                generator.writeNumber(value.getValue());
            }
        }
        if (builder.isUpdMultivalue()) {
            var value = builder.isMultivalue();
            if (value == null) {
                generator.writeNullField("MULTIVALUE");
            } else {
                generator.writeBooleanField("MULTIVALUE", value);
            }
        }
        if (builder.isUpdLogAllowed()) {
            var value = builder.isLogAllowed();
            if (value == null) {
                generator.writeNullField("LOGALLOWED");
            } else {
                generator.writeBooleanField("LOGALLOWED", value);
            }
        }
        if (builder.isUpdLogLevel()) {
            var value = builder.getLogLevel();
            if (value == null) {
                generator.writeNullField("LOGLEVEL");
            } else {
                generator.writeObjectField("LOGLEVEL", value);
            }
        }
        if (builder.isUpdDictType()) {
            var value = builder.getDictType();
            if (value == null) {
                generator.writeNullField("DICTTYPE");
            } else {
                generator.writeObjectField("DICTTYPE", value);
            }
        }
        if (builder.isUpdDictDel1()) {
            var value = builder.getDictDel1();
            if (value == null) {
                generator.writeNullField("DICTDEL1");
            } else {
                generator.writeStringField("DICTDEL1", value);
            }
        }
        if (builder.isUpdDictDel2()) {
            var value = builder.getDictDel2();
            if (value == null) {
                generator.writeNullField("DICTDEL2");
            } else {
                generator.writeStringField("DICTDEL2", value);
            }
        }
        if (builder.isUpdTbCodeCd()) {
            var value = builder.getTbCodeCd();
            if (value == null) {
                generator.writeNullField("TBCODE_CD");
            } else {
                generator.writeStringField("TBCODE_CD", value);
            }
        }
        if (builder.isUpdAccountRuleNm()) {
            var value = builder.getAccountRuleNm();
            if (value == null) {
                generator.writeNullField("ACCOUNTRULE_NM");
            } else {
                generator.writeStringField("ACCOUNTRULE_NM", value);
            }
        }
        if (builder.isUpdAccDocObjectFormulaId()) {
            var value = builder.getAccDocObjectFormulaId();
            if (value == null) {
                generator.writeNullField("ACCDOCOBJECTFORMULA_ID");
            } else {
                generator.writeFieldName("ACCDOCOBJECTFORMULA_ID");
                generator.writeNumber(value.getValue());
            }
        }
        if (builder.isUpdOwnerFormulaId()) {
            var value = builder.getOwnerFormulaId();
            if (value == null) {
                generator.writeNullField("OWNERFORMULA_ID");
            } else {
                generator.writeFieldName("OWNERFORMULA_ID");
                generator.writeNumber(value.getValue());
            }
        }
        if (builder.isUpdFromObjectFormulaId()) {
            var value = builder.getFromObjectFormulaId();
            if (value == null) {
                generator.writeNullField("FROMOBJECTFORMULA_ID");
            } else {
                generator.writeFieldName("FROMOBJECTFORMULA_ID");
                generator.writeNumber(value.getValue());
            }
        }
        if (builder.isUpdToObjectFormulaId()) {
            var value = builder.getToObjectFormulaId();
            if (value == null) {
                generator.writeNullField("TOOBJECTFORMULA_ID");
            } else {
                generator.writeFieldName("TOOBJECTFORMULA_ID");
                generator.writeNumber(value.getValue());
            }
        }
        if (builder.isUpdApproxRecord()) {
            var value = builder.getApproxRecord();
            if (value == null) {
                generator.writeNullField("APPROXRECORD");
            } else {
                generator.writeBooleanField("APPROXRECORD", value);
            }
        }
        if (builder.isUpdValueAccountNm()) {
            var value = builder.getValueAccountNm();
            if (value == null) {
                generator.writeNullField("VALUEACCOUNT_NM");
            } else {
                generator.writeStringField("VALUEACCOUNT_NM", value);
            }
        }
        if (builder.isUpdValueAmountType()) {
            var value = builder.getValueAmountType();
            if (value == null) {
                generator.writeNullField("VALUEAMOUNTTYPE");
            } else {
                generator.writeObjectField("VALUEAMOUNTTYPE", value);
            }
        }
        if (builder.isUpdDefOwner()) {
            var value = builder.isDefOwner();
            if (value == null) {
                generator.writeNullField("DEFOWNER");
            } else {
                generator.writeBooleanField("DEFOWNER", value);
            }
        }
        if (builder.isUpdDocumentation()) {
            var value = builder.getDocumentation();
            if (value == null) {
                generator.writeNullField("DOCUMENTATION");
            } else {
                generator.writeStringField("DOCUMENTATION", value);
            }
        }
        if (builder.isUpdBitmapOrd()) {
            var value = builder.getBitmapOrd();
            if (value == null) {
                generator.writeNullField("BITMAPORD");
            } else {
                generator.writeNumberField("BITMAPORD", value);
            }
        }
        if (builder.isUpdXIsFlagDepBind()) {
            var value = builder.getxIsFlagDepBind();
            if (value == null) {
                generator.writeNullField("X_ISFLAGDEPBIND");
            } else {
                generator.writeObjectField("X_ISFLAGDEPBIND", value);
            }
        }
        if (builder.isUpdXIsFlagDefAttr()) {
            var value = builder.isxIsFlagDefAttr();
            if (value == null) {
                generator.writeNullField("X_ISFLAGDEFATTR");
            } else {
                generator.writeBooleanField("X_ISFLAGDEFATTR", value);
            }
        }
        if (builder.isUpdCopied()) {
            var value = builder.getCopied();
            if (value == null) {
                generator.writeNullField("COPIED");
            } else {
                generator.writeObjectField("COPIED", value);
            }
        }
        if (builder.isUpdKeyOrd()) {
            var value = builder.getKeyOrd();
            if (value == null) {
                generator.writeNullField("KEYORD");
            } else {
                generator.writeNumberField("KEYORD", value);
            }
        }
        if (builder.isUpdOpTypeTypeRf()) {
            var value = builder.getOpTypeTypeRf();
            if (value == null) {
                generator.writeNullField("OPTYPETYPE_RF");
            } else {
                generator.writeFieldName("OPTYPETYPE_RF");
                generator.writeNumber(value.getValue());
            }
        }
        if (builder.isUpdImgSrcId()) {
            var value = builder.getImgSrcId();
            if (value == null) {
                generator.writeNullField("IMGSRC_ID");
            } else {
                generator.writeFieldName("IMGSRC_ID");
                generator.writeNumber(value.getValue());
            }
        }
        if (builder.isUpdImgWidth()) {
            var value = builder.getImgWidth();
            if (value == null) {
                generator.writeNullField("IMGWIDTH");
            } else {
                generator.writeNumberField("IMGWIDTH", value);
            }
        }
        if (builder.isUpdImgHeight()) {
            var value = builder.getImgHeight();
            if (value == null) {
                generator.writeNullField("IMGHEIGHT");
            } else {
                generator.writeNumberField("IMGHEIGHT", value);
            }
        }
        if (builder.isUpdFileServerId()) {
            var value = builder.getFileServerId();
            if (value == null) {
                generator.writeNullField("FILESERVER_ID");
            } else {
                generator.writeFieldName("FILESERVER_ID");
                generator.writeNumber(value.getValue());
            }
        }
        if (builder.isUpdGenMigr()) {
            var value = builder.getGenMigr();
            if (value == null) {
                generator.writeNullField("GENMIGR");
            } else {
                generator.writeBooleanField("GENMIGR", value);
            }
        }
        if (builder.isUpdEvalCValue()) {
            var value = builder.getEvalCValue();
            if (value == null) {
                generator.writeNullField("EVALCVALUE");
            } else {
                generator.writeBooleanField("EVALCVALUE", value);
            }
        }
        if (builder.isUpdOptLobLimit()) {
            var value = builder.getOptLobLimit();
            if (value == null) {
                generator.writeNullField("OPTLOBLIMIT");
            } else {
                generator.writeNumberField("OPTLOBLIMIT", value);
            }
        }
        if (builder.isUpdManLobLimit()) {
            var value = builder.getManLobLimit();
            if (value == null) {
                generator.writeNullField("MANLOBLIMIT");
            } else {
                generator.writeNumberField("MANLOBLIMIT", value);
            }
        }
        generator.writeEndObject();
    }
}