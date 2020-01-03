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
        date = "2020-01-03T18:14:29.432167600"
)
class GenEntityValueBuilderSerializer extends JsonSerializer<GenEntityValueBuilder> {
    @Override
    @SuppressWarnings("squid:S3776")
    public void serialize(GenEntityValueBuilder builder, JsonGenerator generator,
                          SerializerProvider serializerProvider) throws IOException {
        generator.writeStartObject();
        if (builder.getId() != null) {
            generator.writeFieldName("ENTITY_ID");
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
        if (builder.isUpdObjectClass()) {
            var value = builder.isObjectClass();
            if (value == null) {
                generator.writeNullField("OBJECTCLASS");
            } else {
                generator.writeBooleanField("OBJECTCLASS", value);
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
        if (builder.isUpdTableNm()) {
            var value = builder.getTableNm();
            if (value == null) {
                generator.writeNullField("TABLE_NM");
            } else {
                generator.writeStringField("TABLE_NM", value);
            }
        }
        if (builder.isUpdViewNm()) {
            var value = builder.getViewNm();
            if (value == null) {
                generator.writeNullField("VIEW_NM");
            } else {
                generator.writeStringField("VIEW_NM", value);
            }
        }
        if (builder.isUpdKeyNm()) {
            var value = builder.getKeyNm();
            if (value == null) {
                generator.writeNullField("KEY_NM");
            } else {
                generator.writeStringField("KEY_NM", value);
            }
        }
        if (builder.isUpdTextTableNm()) {
            var value = builder.getTextTableNm();
            if (value == null) {
                generator.writeNullField("TEXTTABLE_NM");
            } else {
                generator.writeStringField("TEXTTABLE_NM", value);
            }
        }
        if (builder.isUpdTextViewNm()) {
            var value = builder.getTextViewNm();
            if (value == null) {
                generator.writeNullField("TEXTVIEW_NM");
            } else {
                generator.writeStringField("TEXTVIEW_NM", value);
            }
        }
        if (builder.isUpdTextKeyNm()) {
            var value = builder.getTextKeyNm();
            if (value == null) {
                generator.writeNullField("TEXTKEY_NM");
            } else {
                generator.writeStringField("TEXTKEY_NM", value);
            }
        }
        if (builder.isUpdTextAll()) {
            var value = builder.getTextAll();
            if (value == null) {
                generator.writeNullField("TEXTALL");
            } else {
                generator.writeBooleanField("TEXTALL", value);
            }
        }
        if (builder.isUpdPgPackageNm()) {
            var value = builder.getPgPackageNm();
            if (value == null) {
                generator.writeNullField("PGPACKAGE_NM");
            } else {
                generator.writeStringField("PGPACKAGE_NM", value);
            }
        }
        if (builder.isUpdEpPackageNm()) {
            var value = builder.getEpPackageNm();
            if (value == null) {
                generator.writeNullField("EPPACKAGE_NM");
            } else {
                generator.writeStringField("EPPACKAGE_NM", value);
            }
        }
        if (builder.isUpdCpPackageNm()) {
            var value = builder.getCpPackageNm();
            if (value == null) {
                generator.writeNullField("CPPACKAGE_NM");
            } else {
                generator.writeStringField("CPPACKAGE_NM", value);
            }
        }
        if (builder.isUpdFpPackageNm()) {
            var value = builder.getFpPackageNm();
            if (value == null) {
                generator.writeNullField("FPPACKAGE_NM");
            } else {
                generator.writeStringField("FPPACKAGE_NM", value);
            }
        }
        if (builder.isUpdProperName()) {
            var value = builder.getProperName();
            if (value == null) {
                generator.writeNullField("PROPERNAME");
            } else {
                generator.writeStringField("PROPERNAME", value);
            }
        }
        if (builder.isUpdMasterId()) {
            var value = builder.getMasterId();
            if (value == null) {
                generator.writeNullField("MASTER_ID");
            } else {
                generator.writeFieldName("MASTER_ID");
                generator.writeNumber(value.getValue());
            }
        }
        if (builder.isUpdMasterType()) {
            var value = builder.getMasterType();
            if (value == null) {
                generator.writeNullField("MASTERTYPE");
            } else {
                generator.writeObjectField("MASTERTYPE", value);
            }
        }
        if (builder.isUpdUserLockType()) {
            var value = builder.getUserLockType();
            if (value == null) {
                generator.writeNullField("USERLOCKTYPE");
            } else {
                generator.writeObjectField("USERLOCKTYPE", value);
            }
        }
        if (builder.isUpdImportType()) {
            var value = builder.getImportType();
            if (value == null) {
                generator.writeNullField("IMPORTTYPE");
            } else {
                generator.writeObjectField("IMPORTTYPE", value);
            }
        }
        if (builder.isUpdConfObj()) {
            var value = builder.getConfObj();
            if (value == null) {
                generator.writeNullField("CONFOBJ");
            } else {
                generator.writeObjectField("CONFOBJ", value);
            }
        }
        if (builder.isUpdBasePath()) {
            var value = builder.getBasePath();
            if (value == null) {
                generator.writeNullField("BASEPATH");
            } else {
                generator.writeStringField("BASEPATH", value);
            }
        }
        if (builder.isUpdIncompleteKey()) {
            var value = builder.isIncompleteKey();
            if (value == null) {
                generator.writeNullField("INCOMPLETEKEY");
            } else {
                generator.writeBooleanField("INCOMPLETEKEY", value);
            }
        }
        if (builder.isUpdConfObjAll()) {
            var value = builder.getConfObjAll();
            if (value == null) {
                generator.writeNullField("CONFOBJALL");
            } else {
                generator.writeBooleanField("CONFOBJALL", value);
            }
        }
        if (builder.isUpdEntityGrpId()) {
            var value = builder.getEntityGrpId();
            if (value == null) {
                generator.writeNullField("ENTITYGRP_ID");
            } else {
                generator.writeFieldName("ENTITYGRP_ID");
                generator.writeNumber(value.getValue());
            }
        }
        if (builder.isUpdAncestorId()) {
            var value = builder.getAncestorId();
            if (value == null) {
                generator.writeNullField("ANCESTOR_ID");
            } else {
                generator.writeFieldName("ANCESTOR_ID");
                generator.writeNumber(value.getValue());
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
        if (builder.isUpdCustomNote()) {
            var value = builder.getCustomNote();
            if (value == null) {
                generator.writeNullField("CUSTOMNOTE");
            } else {
                generator.writeStringField("CUSTOMNOTE", value);
            }
        }
        if (builder.isUpdStructureDoc()) {
            var value = builder.getStructureDoc();
            if (value == null) {
                generator.writeNullField("STRUCTUREDOC");
            } else {
                generator.writeStringField("STRUCTUREDOC", value);
            }
        }
        if (builder.isUpdUsageDoc()) {
            var value = builder.getUsageDoc();
            if (value == null) {
                generator.writeNullField("USAGEDOC");
            } else {
                generator.writeStringField("USAGEDOC", value);
            }
        }
        if (builder.isUpdBehaviourDoc()) {
            var value = builder.getBehaviourDoc();
            if (value == null) {
                generator.writeNullField("BEHAVIOURDOC");
            } else {
                generator.writeStringField("BEHAVIOURDOC", value);
            }
        }
        if (builder.isUpdImplDoc()) {
            var value = builder.getImplDoc();
            if (value == null) {
                generator.writeNullField("IMPLDOC");
            } else {
                generator.writeStringField("IMPLDOC", value);
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
        if (builder.isUpdGetRightCustom()) {
            var value = builder.isGetRightCustom();
            if (value == null) {
                generator.writeNullField("GETRIGHTCUSTOM");
            } else {
                generator.writeBooleanField("GETRIGHTCUSTOM", value);
            }
        }
        if (builder.isUpdGetRightRestrId()) {
            var value = builder.getGetRightRestrId();
            if (value == null) {
                generator.writeNullField("GETRIGHTRESTR_ID");
            } else {
                generator.writeFieldName("GETRIGHTRESTR_ID");
                generator.writeNumber(value.getValue());
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
        if (builder.isUpdKeepDeleted()) {
            var value = builder.getKeepDeleted();
            if (value == null) {
                generator.writeNullField("KEEPDELETED");
            } else {
                generator.writeNumberField("KEEPDELETED", value);
            }
        }
        if (builder.isUpdShortDesc()) {
            var value = builder.getShortDesc();
            if (value == null) {
                generator.writeNullField("SHORTDESC");
            } else {
                generator.writeStringField("SHORTDESC", value);
            }
        }
        if (builder.isUpdLongDesc()) {
            var value = builder.getLongDesc();
            if (value == null) {
                generator.writeNullField("LONGDESC");
            } else {
                generator.writeStringField("LONGDESC", value);
            }
        }
        if (builder.isUpdXCopiedAttr0()) {
            var value = builder.getxCopiedAttr0();
            if (value == null) {
                generator.writeNullField("X_COPIEDATTR0");
            } else {
                generator.writeNumberField("X_COPIEDATTR0", value);
            }
        }
        if (builder.isUpdXCopiedAttr1()) {
            var value = builder.getxCopiedAttr1();
            if (value == null) {
                generator.writeNullField("X_COPIEDATTR1");
            } else {
                generator.writeNumberField("X_COPIEDATTR1", value);
            }
        }
        if (builder.isUpdXCopiedAttr2()) {
            var value = builder.getxCopiedAttr2();
            if (value == null) {
                generator.writeNullField("X_COPIEDATTR2");
            } else {
                generator.writeNumberField("X_COPIEDATTR2", value);
            }
        }
        if (builder.isUpdXCopiedAttr3()) {
            var value = builder.getxCopiedAttr3();
            if (value == null) {
                generator.writeNullField("X_COPIEDATTR3");
            } else {
                generator.writeNumberField("X_COPIEDATTR3", value);
            }
        }
        if (builder.isUpdXCopiedAttr4()) {
            var value = builder.getxCopiedAttr4();
            if (value == null) {
                generator.writeNullField("X_COPIEDATTR4");
            } else {
                generator.writeNumberField("X_COPIEDATTR4", value);
            }
        }
        if (builder.isUpdXCopiedAttr5()) {
            var value = builder.getxCopiedAttr5();
            if (value == null) {
                generator.writeNullField("X_COPIEDATTR5");
            } else {
                generator.writeNumberField("X_COPIEDATTR5", value);
            }
        }
        if (builder.isUpdXHasLiability()) {
            var value = builder.isxHasLiability();
            if (value == null) {
                generator.writeNullField("X_HASLIABILITY");
            } else {
                generator.writeBooleanField("X_HASLIABILITY", value);
            }
        }
        if (builder.isUpdUseConfObj()) {
            var value = builder.getUseConfObj();
            if (value == null) {
                generator.writeNullField("USECONFOBJ");
            } else {
                generator.writeBooleanField("USECONFOBJ", value);
            }
        }
        if (builder.isUpdXUseConfObj()) {
            var value = builder.getxUseConfObj();
            if (value == null) {
                generator.writeNullField("X_USECONFOBJ");
            } else {
                generator.writeBooleanField("X_USECONFOBJ", value);
            }
        }
        if (builder.isUpdXNotifyAttr0()) {
            var value = builder.getxNotifyAttr0();
            if (value == null) {
                generator.writeNullField("X_NOTIFYATTR0");
            } else {
                generator.writeNumberField("X_NOTIFYATTR0", value);
            }
        }
        if (builder.isUpdXNotifyAttr1()) {
            var value = builder.getxNotifyAttr1();
            if (value == null) {
                generator.writeNullField("X_NOTIFYATTR1");
            } else {
                generator.writeNumberField("X_NOTIFYATTR1", value);
            }
        }
        if (builder.isUpdXNotifyAttr2()) {
            var value = builder.getxNotifyAttr2();
            if (value == null) {
                generator.writeNullField("X_NOTIFYATTR2");
            } else {
                generator.writeNumberField("X_NOTIFYATTR2", value);
            }
        }
        if (builder.isUpdXNotifyAttr3()) {
            var value = builder.getxNotifyAttr3();
            if (value == null) {
                generator.writeNullField("X_NOTIFYATTR3");
            } else {
                generator.writeNumberField("X_NOTIFYATTR3", value);
            }
        }
        if (builder.isUpdXNotifyAttr4()) {
            var value = builder.getxNotifyAttr4();
            if (value == null) {
                generator.writeNullField("X_NOTIFYATTR4");
            } else {
                generator.writeNumberField("X_NOTIFYATTR4", value);
            }
        }
        if (builder.isUpdXNotifyAttr5()) {
            var value = builder.getxNotifyAttr5();
            if (value == null) {
                generator.writeNullField("X_NOTIFYATTR5");
            } else {
                generator.writeNumberField("X_NOTIFYATTR5", value);
            }
        }
        if (builder.isUpdXFlagDefInterest0()) {
            var value = builder.getxFlagDefInterest0();
            if (value == null) {
                generator.writeNullField("X_FLAGDEFINTEREST0");
            } else {
                generator.writeNumberField("X_FLAGDEFINTEREST0", value);
            }
        }
        if (builder.isUpdXFlagDefInterest1()) {
            var value = builder.getxFlagDefInterest1();
            if (value == null) {
                generator.writeNullField("X_FLAGDEFINTEREST1");
            } else {
                generator.writeNumberField("X_FLAGDEFINTEREST1", value);
            }
        }
        if (builder.isUpdXFlagDefInterest2()) {
            var value = builder.getxFlagDefInterest2();
            if (value == null) {
                generator.writeNullField("X_FLAGDEFINTEREST2");
            } else {
                generator.writeNumberField("X_FLAGDEFINTEREST2", value);
            }
        }
        if (builder.isUpdXFlagDefInterest3()) {
            var value = builder.getxFlagDefInterest3();
            if (value == null) {
                generator.writeNullField("X_FLAGDEFINTEREST3");
            } else {
                generator.writeNumberField("X_FLAGDEFINTEREST3", value);
            }
        }
        if (builder.isUpdXFlagDefInterest4()) {
            var value = builder.getxFlagDefInterest4();
            if (value == null) {
                generator.writeNullField("X_FLAGDEFINTEREST4");
            } else {
                generator.writeNumberField("X_FLAGDEFINTEREST4", value);
            }
        }
        if (builder.isUpdXFlagDefInterest5()) {
            var value = builder.getxFlagDefInterest5();
            if (value == null) {
                generator.writeNullField("X_FLAGDEFINTEREST5");
            } else {
                generator.writeNumberField("X_FLAGDEFINTEREST5", value);
            }
        }
        if (builder.isUpdXDelNotifyAttr0()) {
            var value = builder.getxDelNotifyAttr0();
            if (value == null) {
                generator.writeNullField("X_DELNOTIFYATTR0");
            } else {
                generator.writeNumberField("X_DELNOTIFYATTR0", value);
            }
        }
        if (builder.isUpdXDelNotifyAttr1()) {
            var value = builder.getxDelNotifyAttr1();
            if (value == null) {
                generator.writeNullField("X_DELNOTIFYATTR1");
            } else {
                generator.writeNumberField("X_DELNOTIFYATTR1", value);
            }
        }
        if (builder.isUpdXDelNotifyAttr2()) {
            var value = builder.getxDelNotifyAttr2();
            if (value == null) {
                generator.writeNullField("X_DELNOTIFYATTR2");
            } else {
                generator.writeNumberField("X_DELNOTIFYATTR2", value);
            }
        }
        if (builder.isUpdXDelNotifyAttr3()) {
            var value = builder.getxDelNotifyAttr3();
            if (value == null) {
                generator.writeNullField("X_DELNOTIFYATTR3");
            } else {
                generator.writeNumberField("X_DELNOTIFYATTR3", value);
            }
        }
        if (builder.isUpdXDelNotifyAttr4()) {
            var value = builder.getxDelNotifyAttr4();
            if (value == null) {
                generator.writeNullField("X_DELNOTIFYATTR4");
            } else {
                generator.writeNumberField("X_DELNOTIFYATTR4", value);
            }
        }
        if (builder.isUpdXDelNotifyAttr5()) {
            var value = builder.getxDelNotifyAttr5();
            if (value == null) {
                generator.writeNullField("X_DELNOTIFYATTR5");
            } else {
                generator.writeNumberField("X_DELNOTIFYATTR5", value);
            }
        }
        if (builder.isUpdXHasDelRowFlagDef()) {
            var value = builder.isxHasDelRowFlagDef();
            if (value == null) {
                generator.writeNullField("X_HASDELROWFLAGDEF");
            } else {
                generator.writeBooleanField("X_HASDELROWFLAGDEF", value);
            }
        }
        generator.writeEndObject();
    }
}