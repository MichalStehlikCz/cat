package com.provys.catalogue.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.provys.common.datatype.DtUid;
import com.provys.provysobject.impl.ProvysNmObjectValue;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.processing.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@Generated(
        value = "com.provys.provysobject.generator.impl.GeneratorEntity",
        date = "2020-01-26T16:33:09.106613700"
)
@SuppressWarnings("ValidExternallyBoundObject")
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(
        propOrder = {"id", "nameNm", "name", "objectClass", "isCustom", "tableNm", "viewNm", "keyNm", "textTableNm", "textViewNm", "textKeyNm", "textAll", "pgPackageNm", "epPackageNm", "cpPackageNm", "fpPackageNm", "properName", "masterId", "masterType", "userLockType", "importType", "confObj", "basePath", "incompleteKey", "confObjAll", "entityGrpId", "ancestorId", "note", "customNote", "structureDoc", "usageDoc", "behaviourDoc", "implDoc", "isUsed", "getRightCustom", "getRightRestrId", "getOpTypeId", "keepDeleted", "shortDesc", "longDesc", "xCopiedAttr0", "xCopiedAttr1", "xCopiedAttr2", "xCopiedAttr3", "xCopiedAttr4", "xCopiedAttr5", "xHasLiability", "useConfObj", "xUseConfObj", "xNotifyAttr0", "xNotifyAttr1", "xNotifyAttr2", "xNotifyAttr3", "xNotifyAttr4", "xNotifyAttr5", "xFlagDefInterest0", "xFlagDefInterest1", "xFlagDefInterest2", "xFlagDefInterest3", "xFlagDefInterest4", "xFlagDefInterest5", "xDelNotifyAttr0", "xDelNotifyAttr1", "xDelNotifyAttr2", "xDelNotifyAttr3", "xDelNotifyAttr4", "xDelNotifyAttr5", "xHasDelRowFlagDef"}
)
@XmlRootElement(
        name = "ENTITY"
)
public class GenEntityValue extends ProvysNmObjectValue {
    @XmlElement(
            name = "NAME"
    )
    @Nonnull
    private final String name;

    @XmlElement(
            name = "OBJECTCLASS"
    )
    private final boolean objectClass;

    @XmlElement(
            name = "ISCUSTOM"
    )
    private final boolean isCustom;

    @XmlElement(
            name = "TABLE_NM"
    )
    @Nullable
    private final String tableNm;

    @XmlElement(
            name = "VIEW_NM"
    )
    @Nullable
    private final String viewNm;

    @XmlElement(
            name = "KEY_NM"
    )
    @Nullable
    private final String keyNm;

    @XmlElement(
            name = "TEXTTABLE_NM"
    )
    @Nullable
    private final String textTableNm;

    @XmlElement(
            name = "TEXTVIEW_NM"
    )
    @Nullable
    private final String textViewNm;

    @XmlElement(
            name = "TEXTKEY_NM"
    )
    @Nullable
    private final String textKeyNm;

    @XmlElement(
            name = "TEXTALL"
    )
    @Nullable
    private final Boolean textAll;

    @XmlElement(
            name = "PGPACKAGE_NM"
    )
    @Nullable
    private final String pgPackageNm;

    @XmlElement(
            name = "EPPACKAGE_NM"
    )
    @Nullable
    private final String epPackageNm;

    @XmlElement(
            name = "CPPACKAGE_NM"
    )
    @Nullable
    private final String cpPackageNm;

    @XmlElement(
            name = "FPPACKAGE_NM"
    )
    @Nullable
    private final String fpPackageNm;

    @XmlElement(
            name = "PROPERNAME"
    )
    @Nullable
    private final String properName;

    @XmlElement(
            name = "MASTER_ID"
    )
    @Nullable
    private final DtUid masterId;

    @XmlElement(
            name = "MASTERTYPE"
    )
    private final char masterType;

    @XmlElement(
            name = "USERLOCKTYPE"
    )
    @Nullable
    private final Character userLockType;

    @XmlElement(
            name = "IMPORTTYPE"
    )
    @Nullable
    private final Character importType;

    @XmlElement(
            name = "CONFOBJ"
    )
    @Nullable
    private final Character confObj;

    @XmlElement(
            name = "BASEPATH"
    )
    @Nullable
    private final String basePath;

    @XmlElement(
            name = "INCOMPLETEKEY"
    )
    private final boolean incompleteKey;

    @XmlElement(
            name = "CONFOBJALL"
    )
    @Nullable
    private final Boolean confObjAll;

    @XmlElement(
            name = "ENTITYGRP_ID"
    )
    @Nullable
    private final DtUid entityGrpId;

    @XmlElement(
            name = "ANCESTOR_ID"
    )
    @Nullable
    private final DtUid ancestorId;

    @XmlElement(
            name = "NOTE"
    )
    @Nullable
    private final String note;

    @XmlElement(
            name = "CUSTOMNOTE"
    )
    @Nullable
    private final String customNote;

    @XmlElement(
            name = "STRUCTUREDOC"
    )
    @Nullable
    private final String structureDoc;

    @XmlElement(
            name = "USAGEDOC"
    )
    @Nullable
    private final String usageDoc;

    @XmlElement(
            name = "BEHAVIOURDOC"
    )
    @Nullable
    private final String behaviourDoc;

    @XmlElement(
            name = "IMPLDOC"
    )
    @Nullable
    private final String implDoc;

    @XmlElement(
            name = "ISUSED"
    )
    private final boolean isUsed;

    @XmlElement(
            name = "GETRIGHTCUSTOM"
    )
    private final boolean getRightCustom;

    @XmlElement(
            name = "GETRIGHTRESTR_ID"
    )
    @Nullable
    private final DtUid getRightRestrId;

    @XmlElement(
            name = "GETOPTYPE_ID"
    )
    @Nullable
    private final DtUid getOpTypeId;

    @XmlElement(
            name = "KEEPDELETED"
    )
    @Nullable
    private final Integer keepDeleted;

    @XmlElement(
            name = "SHORTDESC"
    )
    @Nullable
    private final String shortDesc;

    @XmlElement(
            name = "LONGDESC"
    )
    @Nullable
    private final String longDesc;

    @XmlElement(
            name = "X_COPIEDATTR0"
    )
    private final double xCopiedAttr0;

    @XmlElement(
            name = "X_COPIEDATTR1"
    )
    private final double xCopiedAttr1;

    @XmlElement(
            name = "X_COPIEDATTR2"
    )
    private final double xCopiedAttr2;

    @XmlElement(
            name = "X_COPIEDATTR3"
    )
    private final double xCopiedAttr3;

    @XmlElement(
            name = "X_COPIEDATTR4"
    )
    private final double xCopiedAttr4;

    @XmlElement(
            name = "X_COPIEDATTR5"
    )
    private final double xCopiedAttr5;

    @XmlElement(
            name = "X_HASLIABILITY"
    )
    private final boolean xHasLiability;

    @XmlElement(
            name = "USECONFOBJ"
    )
    @Nullable
    private final Boolean useConfObj;

    @XmlElement(
            name = "X_USECONFOBJ"
    )
    @Nullable
    private final Boolean xUseConfObj;

    @XmlElement(
            name = "X_NOTIFYATTR0"
    )
    private final double xNotifyAttr0;

    @XmlElement(
            name = "X_NOTIFYATTR1"
    )
    private final double xNotifyAttr1;

    @XmlElement(
            name = "X_NOTIFYATTR2"
    )
    private final double xNotifyAttr2;

    @XmlElement(
            name = "X_NOTIFYATTR3"
    )
    private final double xNotifyAttr3;

    @XmlElement(
            name = "X_NOTIFYATTR4"
    )
    private final double xNotifyAttr4;

    @XmlElement(
            name = "X_NOTIFYATTR5"
    )
    private final double xNotifyAttr5;

    @XmlElement(
            name = "X_FLAGDEFINTEREST0"
    )
    private final double xFlagDefInterest0;

    @XmlElement(
            name = "X_FLAGDEFINTEREST1"
    )
    private final double xFlagDefInterest1;

    @XmlElement(
            name = "X_FLAGDEFINTEREST2"
    )
    private final double xFlagDefInterest2;

    @XmlElement(
            name = "X_FLAGDEFINTEREST3"
    )
    private final double xFlagDefInterest3;

    @XmlElement(
            name = "X_FLAGDEFINTEREST4"
    )
    private final double xFlagDefInterest4;

    @XmlElement(
            name = "X_FLAGDEFINTEREST5"
    )
    private final double xFlagDefInterest5;

    @XmlElement(
            name = "X_DELNOTIFYATTR0"
    )
    private final double xDelNotifyAttr0;

    @XmlElement(
            name = "X_DELNOTIFYATTR1"
    )
    private final double xDelNotifyAttr1;

    @XmlElement(
            name = "X_DELNOTIFYATTR2"
    )
    private final double xDelNotifyAttr2;

    @XmlElement(
            name = "X_DELNOTIFYATTR3"
    )
    private final double xDelNotifyAttr3;

    @XmlElement(
            name = "X_DELNOTIFYATTR4"
    )
    private final double xDelNotifyAttr4;

    @XmlElement(
            name = "X_DELNOTIFYATTR5"
    )
    private final double xDelNotifyAttr5;

    @XmlElement(
            name = "X_HASDELROWFLAGDEF"
    )
    private final boolean xHasDelRowFlagDef;

    @JsonCreator
    public GenEntityValue(@JsonProperty("ENTITY_ID") DtUid id,
            @JsonProperty("NAME_NM") String nameNm, @JsonProperty("NAME") String name,
            @JsonProperty("OBJECTCLASS") boolean objectClass,
            @JsonProperty("ISCUSTOM") boolean isCustom,
            @JsonProperty("TABLE_NM") @Nullable String tableNm,
            @JsonProperty("VIEW_NM") @Nullable String viewNm,
            @JsonProperty("KEY_NM") @Nullable String keyNm,
            @JsonProperty("TEXTTABLE_NM") @Nullable String textTableNm,
            @JsonProperty("TEXTVIEW_NM") @Nullable String textViewNm,
            @JsonProperty("TEXTKEY_NM") @Nullable String textKeyNm,
            @JsonProperty("TEXTALL") @Nullable Boolean textAll,
            @JsonProperty("PGPACKAGE_NM") @Nullable String pgPackageNm,
            @JsonProperty("EPPACKAGE_NM") @Nullable String epPackageNm,
            @JsonProperty("CPPACKAGE_NM") @Nullable String cpPackageNm,
            @JsonProperty("FPPACKAGE_NM") @Nullable String fpPackageNm,
            @JsonProperty("PROPERNAME") @Nullable String properName,
            @JsonProperty("MASTER_ID") @Nullable DtUid masterId,
            @JsonProperty("MASTERTYPE") char masterType,
            @JsonProperty("USERLOCKTYPE") @Nullable Character userLockType,
            @JsonProperty("IMPORTTYPE") @Nullable Character importType,
            @JsonProperty("CONFOBJ") @Nullable Character confObj,
            @JsonProperty("BASEPATH") @Nullable String basePath,
            @JsonProperty("INCOMPLETEKEY") boolean incompleteKey,
            @JsonProperty("CONFOBJALL") @Nullable Boolean confObjAll,
            @JsonProperty("ENTITYGRP_ID") @Nullable DtUid entityGrpId,
            @JsonProperty("ANCESTOR_ID") @Nullable DtUid ancestorId,
            @JsonProperty("NOTE") @Nullable String note,
            @JsonProperty("CUSTOMNOTE") @Nullable String customNote,
            @JsonProperty("STRUCTUREDOC") @Nullable String structureDoc,
            @JsonProperty("USAGEDOC") @Nullable String usageDoc,
            @JsonProperty("BEHAVIOURDOC") @Nullable String behaviourDoc,
            @JsonProperty("IMPLDOC") @Nullable String implDoc,
            @JsonProperty("ISUSED") boolean isUsed,
            @JsonProperty("GETRIGHTCUSTOM") boolean getRightCustom,
            @JsonProperty("GETRIGHTRESTR_ID") @Nullable DtUid getRightRestrId,
            @JsonProperty("GETOPTYPE_ID") @Nullable DtUid getOpTypeId,
            @JsonProperty("KEEPDELETED") @Nullable Integer keepDeleted,
            @JsonProperty("SHORTDESC") @Nullable String shortDesc,
            @JsonProperty("LONGDESC") @Nullable String longDesc,
            @JsonProperty("X_COPIEDATTR0") double xCopiedAttr0,
            @JsonProperty("X_COPIEDATTR1") double xCopiedAttr1,
            @JsonProperty("X_COPIEDATTR2") double xCopiedAttr2,
            @JsonProperty("X_COPIEDATTR3") double xCopiedAttr3,
            @JsonProperty("X_COPIEDATTR4") double xCopiedAttr4,
            @JsonProperty("X_COPIEDATTR5") double xCopiedAttr5,
            @JsonProperty("X_HASLIABILITY") boolean xHasLiability,
            @JsonProperty("USECONFOBJ") @Nullable Boolean useConfObj,
            @JsonProperty("X_USECONFOBJ") @Nullable Boolean xUseConfObj,
            @JsonProperty("X_NOTIFYATTR0") double xNotifyAttr0,
            @JsonProperty("X_NOTIFYATTR1") double xNotifyAttr1,
            @JsonProperty("X_NOTIFYATTR2") double xNotifyAttr2,
            @JsonProperty("X_NOTIFYATTR3") double xNotifyAttr3,
            @JsonProperty("X_NOTIFYATTR4") double xNotifyAttr4,
            @JsonProperty("X_NOTIFYATTR5") double xNotifyAttr5,
            @JsonProperty("X_FLAGDEFINTEREST0") double xFlagDefInterest0,
            @JsonProperty("X_FLAGDEFINTEREST1") double xFlagDefInterest1,
            @JsonProperty("X_FLAGDEFINTEREST2") double xFlagDefInterest2,
            @JsonProperty("X_FLAGDEFINTEREST3") double xFlagDefInterest3,
            @JsonProperty("X_FLAGDEFINTEREST4") double xFlagDefInterest4,
            @JsonProperty("X_FLAGDEFINTEREST5") double xFlagDefInterest5,
            @JsonProperty("X_DELNOTIFYATTR0") double xDelNotifyAttr0,
            @JsonProperty("X_DELNOTIFYATTR1") double xDelNotifyAttr1,
            @JsonProperty("X_DELNOTIFYATTR2") double xDelNotifyAttr2,
            @JsonProperty("X_DELNOTIFYATTR3") double xDelNotifyAttr3,
            @JsonProperty("X_DELNOTIFYATTR4") double xDelNotifyAttr4,
            @JsonProperty("X_DELNOTIFYATTR5") double xDelNotifyAttr5,
            @JsonProperty("X_HASDELROWFLAGDEF") boolean xHasDelRowFlagDef) {
        super(id, nameNm);
        this.name = Objects.requireNonNull(name);
        this.objectClass = objectClass;
        this.isCustom = isCustom;
        this.tableNm = tableNm;
        this.viewNm = viewNm;
        this.keyNm = keyNm;
        this.textTableNm = textTableNm;
        this.textViewNm = textViewNm;
        this.textKeyNm = textKeyNm;
        this.textAll = textAll;
        this.pgPackageNm = pgPackageNm;
        this.epPackageNm = epPackageNm;
        this.cpPackageNm = cpPackageNm;
        this.fpPackageNm = fpPackageNm;
        this.properName = properName;
        this.masterId = masterId;
        this.masterType = masterType;
        this.userLockType = userLockType;
        this.importType = importType;
        this.confObj = confObj;
        this.basePath = basePath;
        this.incompleteKey = incompleteKey;
        this.confObjAll = confObjAll;
        this.entityGrpId = entityGrpId;
        this.ancestorId = ancestorId;
        this.note = note;
        this.customNote = customNote;
        this.structureDoc = structureDoc;
        this.usageDoc = usageDoc;
        this.behaviourDoc = behaviourDoc;
        this.implDoc = implDoc;
        this.isUsed = isUsed;
        this.getRightCustom = getRightCustom;
        this.getRightRestrId = getRightRestrId;
        this.getOpTypeId = getOpTypeId;
        this.keepDeleted = keepDeleted;
        this.shortDesc = shortDesc;
        this.longDesc = longDesc;
        this.xCopiedAttr0 = xCopiedAttr0;
        this.xCopiedAttr1 = xCopiedAttr1;
        this.xCopiedAttr2 = xCopiedAttr2;
        this.xCopiedAttr3 = xCopiedAttr3;
        this.xCopiedAttr4 = xCopiedAttr4;
        this.xCopiedAttr5 = xCopiedAttr5;
        this.xHasLiability = xHasLiability;
        this.useConfObj = useConfObj;
        this.xUseConfObj = xUseConfObj;
        this.xNotifyAttr0 = xNotifyAttr0;
        this.xNotifyAttr1 = xNotifyAttr1;
        this.xNotifyAttr2 = xNotifyAttr2;
        this.xNotifyAttr3 = xNotifyAttr3;
        this.xNotifyAttr4 = xNotifyAttr4;
        this.xNotifyAttr5 = xNotifyAttr5;
        this.xFlagDefInterest0 = xFlagDefInterest0;
        this.xFlagDefInterest1 = xFlagDefInterest1;
        this.xFlagDefInterest2 = xFlagDefInterest2;
        this.xFlagDefInterest3 = xFlagDefInterest3;
        this.xFlagDefInterest4 = xFlagDefInterest4;
        this.xFlagDefInterest5 = xFlagDefInterest5;
        this.xDelNotifyAttr0 = xDelNotifyAttr0;
        this.xDelNotifyAttr1 = xDelNotifyAttr1;
        this.xDelNotifyAttr2 = xDelNotifyAttr2;
        this.xDelNotifyAttr3 = xDelNotifyAttr3;
        this.xDelNotifyAttr4 = xDelNotifyAttr4;
        this.xDelNotifyAttr5 = xDelNotifyAttr5;
        this.xHasDelRowFlagDef = xHasDelRowFlagDef;
    }

    @XmlElement(
            name = "ENTITY_ID"
    )
    @Nonnull
    @Override
    public DtUid getId() {
        return super.getId();
    }

    @Nonnull
    public String getName() {
        return name;
    }

    public boolean isObjectClass() {
        return objectClass;
    }

    public boolean isIsCustom() {
        return isCustom;
    }

    @Nonnull
    public Optional<String> getTableNm() {
        return Optional.ofNullable(tableNm);
    }

    @Nonnull
    public Optional<String> getViewNm() {
        return Optional.ofNullable(viewNm);
    }

    @Nonnull
    public Optional<String> getKeyNm() {
        return Optional.ofNullable(keyNm);
    }

    @Nonnull
    public Optional<String> getTextTableNm() {
        return Optional.ofNullable(textTableNm);
    }

    @Nonnull
    public Optional<String> getTextViewNm() {
        return Optional.ofNullable(textViewNm);
    }

    @Nonnull
    public Optional<String> getTextKeyNm() {
        return Optional.ofNullable(textKeyNm);
    }

    @Nonnull
    public Optional<Boolean> isTextAll() {
        return Optional.ofNullable(textAll);
    }

    @Nonnull
    public Optional<String> getPgPackageNm() {
        return Optional.ofNullable(pgPackageNm);
    }

    @Nonnull
    public Optional<String> getEpPackageNm() {
        return Optional.ofNullable(epPackageNm);
    }

    @Nonnull
    public Optional<String> getCpPackageNm() {
        return Optional.ofNullable(cpPackageNm);
    }

    @Nonnull
    public Optional<String> getFpPackageNm() {
        return Optional.ofNullable(fpPackageNm);
    }

    @Nonnull
    public Optional<String> getProperName() {
        return Optional.ofNullable(properName);
    }

    @Nonnull
    public Optional<DtUid> getMasterId() {
        return Optional.ofNullable(masterId);
    }

    public char getMasterType() {
        return masterType;
    }

    @Nonnull
    public Optional<Character> getUserLockType() {
        return Optional.ofNullable(userLockType);
    }

    @Nonnull
    public Optional<Character> getImportType() {
        return Optional.ofNullable(importType);
    }

    @Nonnull
    public Optional<Character> getConfObj() {
        return Optional.ofNullable(confObj);
    }

    @Nonnull
    public Optional<String> getBasePath() {
        return Optional.ofNullable(basePath);
    }

    public boolean isIncompleteKey() {
        return incompleteKey;
    }

    @Nonnull
    public Optional<Boolean> isConfObjAll() {
        return Optional.ofNullable(confObjAll);
    }

    @Nonnull
    public Optional<DtUid> getEntityGrpId() {
        return Optional.ofNullable(entityGrpId);
    }

    @Nonnull
    public Optional<DtUid> getAncestorId() {
        return Optional.ofNullable(ancestorId);
    }

    @Nonnull
    public Optional<String> getNote() {
        return Optional.ofNullable(note);
    }

    @Nonnull
    public Optional<String> getCustomNote() {
        return Optional.ofNullable(customNote);
    }

    @Nonnull
    public Optional<String> getStructureDoc() {
        return Optional.ofNullable(structureDoc);
    }

    @Nonnull
    public Optional<String> getUsageDoc() {
        return Optional.ofNullable(usageDoc);
    }

    @Nonnull
    public Optional<String> getBehaviourDoc() {
        return Optional.ofNullable(behaviourDoc);
    }

    @Nonnull
    public Optional<String> getImplDoc() {
        return Optional.ofNullable(implDoc);
    }

    public boolean isIsUsed() {
        return isUsed;
    }

    public boolean isGetRightCustom() {
        return getRightCustom;
    }

    @Nonnull
    public Optional<DtUid> getGetRightRestrId() {
        return Optional.ofNullable(getRightRestrId);
    }

    @Nonnull
    public Optional<DtUid> getGetOpTypeId() {
        return Optional.ofNullable(getOpTypeId);
    }

    @Nonnull
    public Optional<Integer> getKeepDeleted() {
        return Optional.ofNullable(keepDeleted);
    }

    @Nonnull
    public Optional<String> getShortDesc() {
        return Optional.ofNullable(shortDesc);
    }

    @Nonnull
    public Optional<String> getLongDesc() {
        return Optional.ofNullable(longDesc);
    }

    public double getxCopiedAttr0() {
        return xCopiedAttr0;
    }

    public double getxCopiedAttr1() {
        return xCopiedAttr1;
    }

    public double getxCopiedAttr2() {
        return xCopiedAttr2;
    }

    public double getxCopiedAttr3() {
        return xCopiedAttr3;
    }

    public double getxCopiedAttr4() {
        return xCopiedAttr4;
    }

    public double getxCopiedAttr5() {
        return xCopiedAttr5;
    }

    public boolean isxHasLiability() {
        return xHasLiability;
    }

    @Nonnull
    public Optional<Boolean> isUseConfObj() {
        return Optional.ofNullable(useConfObj);
    }

    @Nonnull
    public Optional<Boolean> isxUseConfObj() {
        return Optional.ofNullable(xUseConfObj);
    }

    public double getxNotifyAttr0() {
        return xNotifyAttr0;
    }

    public double getxNotifyAttr1() {
        return xNotifyAttr1;
    }

    public double getxNotifyAttr2() {
        return xNotifyAttr2;
    }

    public double getxNotifyAttr3() {
        return xNotifyAttr3;
    }

    public double getxNotifyAttr4() {
        return xNotifyAttr4;
    }

    public double getxNotifyAttr5() {
        return xNotifyAttr5;
    }

    public double getxFlagDefInterest0() {
        return xFlagDefInterest0;
    }

    public double getxFlagDefInterest1() {
        return xFlagDefInterest1;
    }

    public double getxFlagDefInterest2() {
        return xFlagDefInterest2;
    }

    public double getxFlagDefInterest3() {
        return xFlagDefInterest3;
    }

    public double getxFlagDefInterest4() {
        return xFlagDefInterest4;
    }

    public double getxFlagDefInterest5() {
        return xFlagDefInterest5;
    }

    public double getxDelNotifyAttr0() {
        return xDelNotifyAttr0;
    }

    public double getxDelNotifyAttr1() {
        return xDelNotifyAttr1;
    }

    public double getxDelNotifyAttr2() {
        return xDelNotifyAttr2;
    }

    public double getxDelNotifyAttr3() {
        return xDelNotifyAttr3;
    }

    public double getxDelNotifyAttr4() {
        return xDelNotifyAttr4;
    }

    public double getxDelNotifyAttr5() {
        return xDelNotifyAttr5;
    }

    public boolean isxHasDelRowFlagDef() {
        return xHasDelRowFlagDef;
    }

    @Override
    @SuppressWarnings("squid:S1206")
    public boolean equals(@Nullable Object o) {
        if (this == o) return true;
        if (!(o instanceof GenEntityValue)) return false;
        if (!super.equals(o)) return false;
        GenEntityValue that = (GenEntityValue) o;
        return getNameNm().equals(that.getNameNm()) &&
                name.equals(that.name) &&
                objectClass == that.objectClass &&
                isCustom == that.isCustom &&
                Objects.equals(tableNm, that.tableNm) &&
                Objects.equals(viewNm, that.viewNm) &&
                Objects.equals(keyNm, that.keyNm) &&
                Objects.equals(textTableNm, that.textTableNm) &&
                Objects.equals(textViewNm, that.textViewNm) &&
                Objects.equals(textKeyNm, that.textKeyNm) &&
                Objects.equals(textAll, that.textAll) &&
                Objects.equals(pgPackageNm, that.pgPackageNm) &&
                Objects.equals(epPackageNm, that.epPackageNm) &&
                Objects.equals(cpPackageNm, that.cpPackageNm) &&
                Objects.equals(fpPackageNm, that.fpPackageNm) &&
                Objects.equals(properName, that.properName) &&
                Objects.equals(masterId, that.masterId) &&
                masterType == that.masterType &&
                Objects.equals(userLockType, that.userLockType) &&
                Objects.equals(importType, that.importType) &&
                Objects.equals(confObj, that.confObj) &&
                Objects.equals(basePath, that.basePath) &&
                incompleteKey == that.incompleteKey &&
                Objects.equals(confObjAll, that.confObjAll) &&
                Objects.equals(entityGrpId, that.entityGrpId) &&
                Objects.equals(ancestorId, that.ancestorId) &&
                Objects.equals(note, that.note) &&
                Objects.equals(customNote, that.customNote) &&
                Objects.equals(structureDoc, that.structureDoc) &&
                Objects.equals(usageDoc, that.usageDoc) &&
                Objects.equals(behaviourDoc, that.behaviourDoc) &&
                Objects.equals(implDoc, that.implDoc) &&
                isUsed == that.isUsed &&
                getRightCustom == that.getRightCustom &&
                Objects.equals(getRightRestrId, that.getRightRestrId) &&
                Objects.equals(getOpTypeId, that.getOpTypeId) &&
                Objects.equals(keepDeleted, that.keepDeleted) &&
                Objects.equals(shortDesc, that.shortDesc) &&
                Objects.equals(longDesc, that.longDesc) &&
                xCopiedAttr0 == that.xCopiedAttr0 &&
                xCopiedAttr1 == that.xCopiedAttr1 &&
                xCopiedAttr2 == that.xCopiedAttr2 &&
                xCopiedAttr3 == that.xCopiedAttr3 &&
                xCopiedAttr4 == that.xCopiedAttr4 &&
                xCopiedAttr5 == that.xCopiedAttr5 &&
                xHasLiability == that.xHasLiability &&
                Objects.equals(useConfObj, that.useConfObj) &&
                Objects.equals(xUseConfObj, that.xUseConfObj) &&
                xNotifyAttr0 == that.xNotifyAttr0 &&
                xNotifyAttr1 == that.xNotifyAttr1 &&
                xNotifyAttr2 == that.xNotifyAttr2 &&
                xNotifyAttr3 == that.xNotifyAttr3 &&
                xNotifyAttr4 == that.xNotifyAttr4 &&
                xNotifyAttr5 == that.xNotifyAttr5 &&
                xFlagDefInterest0 == that.xFlagDefInterest0 &&
                xFlagDefInterest1 == that.xFlagDefInterest1 &&
                xFlagDefInterest2 == that.xFlagDefInterest2 &&
                xFlagDefInterest3 == that.xFlagDefInterest3 &&
                xFlagDefInterest4 == that.xFlagDefInterest4 &&
                xFlagDefInterest5 == that.xFlagDefInterest5 &&
                xDelNotifyAttr0 == that.xDelNotifyAttr0 &&
                xDelNotifyAttr1 == that.xDelNotifyAttr1 &&
                xDelNotifyAttr2 == that.xDelNotifyAttr2 &&
                xDelNotifyAttr3 == that.xDelNotifyAttr3 &&
                xDelNotifyAttr4 == that.xDelNotifyAttr4 &&
                xDelNotifyAttr5 == that.xDelNotifyAttr5 &&
                xHasDelRowFlagDef == that.xHasDelRowFlagDef;
    }
}
