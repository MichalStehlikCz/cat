package com.provys.catalogue.impl;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.provys.common.datatype.DtUid;
import com.provys.common.exception.InternalException;
import com.provys.provysobject.impl.ProvysNmObjectValueBuilder;
import java.lang.Boolean;
import java.lang.Character;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.processing.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Generated(
        value = "com.provys.provysobject.generator.impl.GeneratorEntity",
        date = "2020-01-14T15:05:54.674284"
)
@XmlRootElement(
        name = "ENTITY"
)
@XmlAccessorType(XmlAccessType.NONE)
@JsonSerialize(
        using = GenEntityValueBuilderSerializer.class
)
@SuppressWarnings({"WeakerAccess", "unused", "UnusedReturnValue"})
public class GenEntityValueBuilder extends ProvysNmObjectValueBuilder<GenEntityValueBuilder, GenEntityValue> {
    @Nullable
    private String name;

    private boolean updName = false;

    @Nullable
    private Boolean objectClass;

    private boolean updObjectClass = false;

    @Nullable
    private Boolean isCustom;

    private boolean updIsCustom = false;

    @Nullable
    private String tableNm;

    private boolean updTableNm = false;

    @Nullable
    private String viewNm;

    private boolean updViewNm = false;

    @Nullable
    private String keyNm;

    private boolean updKeyNm = false;

    @Nullable
    private String textTableNm;

    private boolean updTextTableNm = false;

    @Nullable
    private String textViewNm;

    private boolean updTextViewNm = false;

    @Nullable
    private String textKeyNm;

    private boolean updTextKeyNm = false;

    @Nullable
    private Boolean textAll;

    private boolean updTextAll = false;

    @Nullable
    private String pgPackageNm;

    private boolean updPgPackageNm = false;

    @Nullable
    private String epPackageNm;

    private boolean updEpPackageNm = false;

    @Nullable
    private String cpPackageNm;

    private boolean updCpPackageNm = false;

    @Nullable
    private String fpPackageNm;

    private boolean updFpPackageNm = false;

    @Nullable
    private String properName;

    private boolean updProperName = false;

    @Nullable
    private DtUid masterId;

    private boolean updMasterId = false;

    @Nullable
    private Character masterType;

    private boolean updMasterType = false;

    @Nullable
    private Character userLockType;

    private boolean updUserLockType = false;

    @Nullable
    private Character importType;

    private boolean updImportType = false;

    @Nullable
    private Character confObj;

    private boolean updConfObj = false;

    @Nullable
    private String basePath;

    private boolean updBasePath = false;

    @Nullable
    private Boolean incompleteKey;

    private boolean updIncompleteKey = false;

    @Nullable
    private Boolean confObjAll;

    private boolean updConfObjAll = false;

    @Nullable
    private DtUid entityGrpId;

    private boolean updEntityGrpId = false;

    @Nullable
    private DtUid ancestorId;

    private boolean updAncestorId = false;

    @Nullable
    private String note;

    private boolean updNote = false;

    @Nullable
    private String customNote;

    private boolean updCustomNote = false;

    @Nullable
    private String structureDoc;

    private boolean updStructureDoc = false;

    @Nullable
    private String usageDoc;

    private boolean updUsageDoc = false;

    @Nullable
    private String behaviourDoc;

    private boolean updBehaviourDoc = false;

    @Nullable
    private String implDoc;

    private boolean updImplDoc = false;

    @Nullable
    private Boolean isUsed;

    private boolean updIsUsed = false;

    @Nullable
    private Boolean getRightCustom;

    private boolean updGetRightCustom = false;

    @Nullable
    private DtUid getRightRestrId;

    private boolean updGetRightRestrId = false;

    @Nullable
    private DtUid getOpTypeId;

    private boolean updGetOpTypeId = false;

    @Nullable
    private Integer keepDeleted;

    private boolean updKeepDeleted = false;

    @Nullable
    private String shortDesc;

    private boolean updShortDesc = false;

    @Nullable
    private String longDesc;

    private boolean updLongDesc = false;

    @Nullable
    private Double xCopiedAttr0;

    private boolean updXCopiedAttr0 = false;

    @Nullable
    private Double xCopiedAttr1;

    private boolean updXCopiedAttr1 = false;

    @Nullable
    private Double xCopiedAttr2;

    private boolean updXCopiedAttr2 = false;

    @Nullable
    private Double xCopiedAttr3;

    private boolean updXCopiedAttr3 = false;

    @Nullable
    private Double xCopiedAttr4;

    private boolean updXCopiedAttr4 = false;

    @Nullable
    private Double xCopiedAttr5;

    private boolean updXCopiedAttr5 = false;

    @Nullable
    private Boolean xHasLiability;

    private boolean updXHasLiability = false;

    @Nullable
    private Boolean useConfObj;

    private boolean updUseConfObj = false;

    @Nullable
    private Boolean xUseConfObj;

    private boolean updXUseConfObj = false;

    @Nullable
    private Double xNotifyAttr0;

    private boolean updXNotifyAttr0 = false;

    @Nullable
    private Double xNotifyAttr1;

    private boolean updXNotifyAttr1 = false;

    @Nullable
    private Double xNotifyAttr2;

    private boolean updXNotifyAttr2 = false;

    @Nullable
    private Double xNotifyAttr3;

    private boolean updXNotifyAttr3 = false;

    @Nullable
    private Double xNotifyAttr4;

    private boolean updXNotifyAttr4 = false;

    @Nullable
    private Double xNotifyAttr5;

    private boolean updXNotifyAttr5 = false;

    @Nullable
    private Double xFlagDefInterest0;

    private boolean updXFlagDefInterest0 = false;

    @Nullable
    private Double xFlagDefInterest1;

    private boolean updXFlagDefInterest1 = false;

    @Nullable
    private Double xFlagDefInterest2;

    private boolean updXFlagDefInterest2 = false;

    @Nullable
    private Double xFlagDefInterest3;

    private boolean updXFlagDefInterest3 = false;

    @Nullable
    private Double xFlagDefInterest4;

    private boolean updXFlagDefInterest4 = false;

    @Nullable
    private Double xFlagDefInterest5;

    private boolean updXFlagDefInterest5 = false;

    @Nullable
    private Double xDelNotifyAttr0;

    private boolean updXDelNotifyAttr0 = false;

    @Nullable
    private Double xDelNotifyAttr1;

    private boolean updXDelNotifyAttr1 = false;

    @Nullable
    private Double xDelNotifyAttr2;

    private boolean updXDelNotifyAttr2 = false;

    @Nullable
    private Double xDelNotifyAttr3;

    private boolean updXDelNotifyAttr3 = false;

    @Nullable
    private Double xDelNotifyAttr4;

    private boolean updXDelNotifyAttr4 = false;

    @Nullable
    private Double xDelNotifyAttr5;

    private boolean updXDelNotifyAttr5 = false;

    @Nullable
    private Boolean xHasDelRowFlagDef;

    private boolean updXHasDelRowFlagDef = false;

    public GenEntityValueBuilder() {
    }

    public GenEntityValueBuilder(GenEntityValue value) {
        super(value);
        setName(value.getName());
        setObjectClass(value.isObjectClass());
        setIsCustom(value.isIsCustom());
        setTableNm(value.getTableNm().orElse(null));
        setViewNm(value.getViewNm().orElse(null));
        setKeyNm(value.getKeyNm().orElse(null));
        setTextTableNm(value.getTextTableNm().orElse(null));
        setTextViewNm(value.getTextViewNm().orElse(null));
        setTextKeyNm(value.getTextKeyNm().orElse(null));
        setTextAll(value.getTextAll().orElse(null));
        setPgPackageNm(value.getPgPackageNm().orElse(null));
        setEpPackageNm(value.getEpPackageNm().orElse(null));
        setCpPackageNm(value.getCpPackageNm().orElse(null));
        setFpPackageNm(value.getFpPackageNm().orElse(null));
        setProperName(value.getProperName().orElse(null));
        setMasterId(value.getMasterId().orElse(null));
        setMasterType(value.getMasterType());
        setUserLockType(value.getUserLockType().orElse(null));
        setImportType(value.getImportType().orElse(null));
        setConfObj(value.getConfObj().orElse(null));
        setBasePath(value.getBasePath().orElse(null));
        setIncompleteKey(value.isIncompleteKey());
        setConfObjAll(value.getConfObjAll().orElse(null));
        setEntityGrpId(value.getEntityGrpId().orElse(null));
        setAncestorId(value.getAncestorId().orElse(null));
        setNote(value.getNote().orElse(null));
        setCustomNote(value.getCustomNote().orElse(null));
        setStructureDoc(value.getStructureDoc().orElse(null));
        setUsageDoc(value.getUsageDoc().orElse(null));
        setBehaviourDoc(value.getBehaviourDoc().orElse(null));
        setImplDoc(value.getImplDoc().orElse(null));
        setIsUsed(value.isIsUsed());
        setGetRightCustom(value.isGetRightCustom());
        setGetRightRestrId(value.getGetRightRestrId().orElse(null));
        setGetOpTypeId(value.getGetOpTypeId().orElse(null));
        setKeepDeleted(value.getKeepDeleted().orElse(null));
        setShortDesc(value.getShortDesc().orElse(null));
        setLongDesc(value.getLongDesc().orElse(null));
        setxCopiedAttr0(value.getxCopiedAttr0());
        setxCopiedAttr1(value.getxCopiedAttr1());
        setxCopiedAttr2(value.getxCopiedAttr2());
        setxCopiedAttr3(value.getxCopiedAttr3());
        setxCopiedAttr4(value.getxCopiedAttr4());
        setxCopiedAttr5(value.getxCopiedAttr5());
        setxHasLiability(value.isxHasLiability());
        setUseConfObj(value.getUseConfObj().orElse(null));
        setxUseConfObj(value.getxUseConfObj().orElse(null));
        setxNotifyAttr0(value.getxNotifyAttr0());
        setxNotifyAttr1(value.getxNotifyAttr1());
        setxNotifyAttr2(value.getxNotifyAttr2());
        setxNotifyAttr3(value.getxNotifyAttr3());
        setxNotifyAttr4(value.getxNotifyAttr4());
        setxNotifyAttr5(value.getxNotifyAttr5());
        setxFlagDefInterest0(value.getxFlagDefInterest0());
        setxFlagDefInterest1(value.getxFlagDefInterest1());
        setxFlagDefInterest2(value.getxFlagDefInterest2());
        setxFlagDefInterest3(value.getxFlagDefInterest3());
        setxFlagDefInterest4(value.getxFlagDefInterest4());
        setxFlagDefInterest5(value.getxFlagDefInterest5());
        setxDelNotifyAttr0(value.getxDelNotifyAttr0());
        setxDelNotifyAttr1(value.getxDelNotifyAttr1());
        setxDelNotifyAttr2(value.getxDelNotifyAttr2());
        setxDelNotifyAttr3(value.getxDelNotifyAttr3());
        setxDelNotifyAttr4(value.getxDelNotifyAttr4());
        setxDelNotifyAttr5(value.getxDelNotifyAttr5());
        setxHasDelRowFlagDef(value.isxHasDelRowFlagDef());
    }

    public GenEntityValueBuilder(GenEntityValueBuilder value) {
        super(value);
        this.name = value.name;
        this.updName = value.updName;
        this.objectClass = value.objectClass;
        this.updObjectClass = value.updObjectClass;
        this.isCustom = value.isCustom;
        this.updIsCustom = value.updIsCustom;
        this.tableNm = value.tableNm;
        this.updTableNm = value.updTableNm;
        this.viewNm = value.viewNm;
        this.updViewNm = value.updViewNm;
        this.keyNm = value.keyNm;
        this.updKeyNm = value.updKeyNm;
        this.textTableNm = value.textTableNm;
        this.updTextTableNm = value.updTextTableNm;
        this.textViewNm = value.textViewNm;
        this.updTextViewNm = value.updTextViewNm;
        this.textKeyNm = value.textKeyNm;
        this.updTextKeyNm = value.updTextKeyNm;
        this.textAll = value.textAll;
        this.updTextAll = value.updTextAll;
        this.pgPackageNm = value.pgPackageNm;
        this.updPgPackageNm = value.updPgPackageNm;
        this.epPackageNm = value.epPackageNm;
        this.updEpPackageNm = value.updEpPackageNm;
        this.cpPackageNm = value.cpPackageNm;
        this.updCpPackageNm = value.updCpPackageNm;
        this.fpPackageNm = value.fpPackageNm;
        this.updFpPackageNm = value.updFpPackageNm;
        this.properName = value.properName;
        this.updProperName = value.updProperName;
        this.masterId = value.masterId;
        this.updMasterId = value.updMasterId;
        this.masterType = value.masterType;
        this.updMasterType = value.updMasterType;
        this.userLockType = value.userLockType;
        this.updUserLockType = value.updUserLockType;
        this.importType = value.importType;
        this.updImportType = value.updImportType;
        this.confObj = value.confObj;
        this.updConfObj = value.updConfObj;
        this.basePath = value.basePath;
        this.updBasePath = value.updBasePath;
        this.incompleteKey = value.incompleteKey;
        this.updIncompleteKey = value.updIncompleteKey;
        this.confObjAll = value.confObjAll;
        this.updConfObjAll = value.updConfObjAll;
        this.entityGrpId = value.entityGrpId;
        this.updEntityGrpId = value.updEntityGrpId;
        this.ancestorId = value.ancestorId;
        this.updAncestorId = value.updAncestorId;
        this.note = value.note;
        this.updNote = value.updNote;
        this.customNote = value.customNote;
        this.updCustomNote = value.updCustomNote;
        this.structureDoc = value.structureDoc;
        this.updStructureDoc = value.updStructureDoc;
        this.usageDoc = value.usageDoc;
        this.updUsageDoc = value.updUsageDoc;
        this.behaviourDoc = value.behaviourDoc;
        this.updBehaviourDoc = value.updBehaviourDoc;
        this.implDoc = value.implDoc;
        this.updImplDoc = value.updImplDoc;
        this.isUsed = value.isUsed;
        this.updIsUsed = value.updIsUsed;
        this.getRightCustom = value.getRightCustom;
        this.updGetRightCustom = value.updGetRightCustom;
        this.getRightRestrId = value.getRightRestrId;
        this.updGetRightRestrId = value.updGetRightRestrId;
        this.getOpTypeId = value.getOpTypeId;
        this.updGetOpTypeId = value.updGetOpTypeId;
        this.keepDeleted = value.keepDeleted;
        this.updKeepDeleted = value.updKeepDeleted;
        this.shortDesc = value.shortDesc;
        this.updShortDesc = value.updShortDesc;
        this.longDesc = value.longDesc;
        this.updLongDesc = value.updLongDesc;
        this.xCopiedAttr0 = value.xCopiedAttr0;
        this.updXCopiedAttr0 = value.updXCopiedAttr0;
        this.xCopiedAttr1 = value.xCopiedAttr1;
        this.updXCopiedAttr1 = value.updXCopiedAttr1;
        this.xCopiedAttr2 = value.xCopiedAttr2;
        this.updXCopiedAttr2 = value.updXCopiedAttr2;
        this.xCopiedAttr3 = value.xCopiedAttr3;
        this.updXCopiedAttr3 = value.updXCopiedAttr3;
        this.xCopiedAttr4 = value.xCopiedAttr4;
        this.updXCopiedAttr4 = value.updXCopiedAttr4;
        this.xCopiedAttr5 = value.xCopiedAttr5;
        this.updXCopiedAttr5 = value.updXCopiedAttr5;
        this.xHasLiability = value.xHasLiability;
        this.updXHasLiability = value.updXHasLiability;
        this.useConfObj = value.useConfObj;
        this.updUseConfObj = value.updUseConfObj;
        this.xUseConfObj = value.xUseConfObj;
        this.updXUseConfObj = value.updXUseConfObj;
        this.xNotifyAttr0 = value.xNotifyAttr0;
        this.updXNotifyAttr0 = value.updXNotifyAttr0;
        this.xNotifyAttr1 = value.xNotifyAttr1;
        this.updXNotifyAttr1 = value.updXNotifyAttr1;
        this.xNotifyAttr2 = value.xNotifyAttr2;
        this.updXNotifyAttr2 = value.updXNotifyAttr2;
        this.xNotifyAttr3 = value.xNotifyAttr3;
        this.updXNotifyAttr3 = value.updXNotifyAttr3;
        this.xNotifyAttr4 = value.xNotifyAttr4;
        this.updXNotifyAttr4 = value.updXNotifyAttr4;
        this.xNotifyAttr5 = value.xNotifyAttr5;
        this.updXNotifyAttr5 = value.updXNotifyAttr5;
        this.xFlagDefInterest0 = value.xFlagDefInterest0;
        this.updXFlagDefInterest0 = value.updXFlagDefInterest0;
        this.xFlagDefInterest1 = value.xFlagDefInterest1;
        this.updXFlagDefInterest1 = value.updXFlagDefInterest1;
        this.xFlagDefInterest2 = value.xFlagDefInterest2;
        this.updXFlagDefInterest2 = value.updXFlagDefInterest2;
        this.xFlagDefInterest3 = value.xFlagDefInterest3;
        this.updXFlagDefInterest3 = value.updXFlagDefInterest3;
        this.xFlagDefInterest4 = value.xFlagDefInterest4;
        this.updXFlagDefInterest4 = value.updXFlagDefInterest4;
        this.xFlagDefInterest5 = value.xFlagDefInterest5;
        this.updXFlagDefInterest5 = value.updXFlagDefInterest5;
        this.xDelNotifyAttr0 = value.xDelNotifyAttr0;
        this.updXDelNotifyAttr0 = value.updXDelNotifyAttr0;
        this.xDelNotifyAttr1 = value.xDelNotifyAttr1;
        this.updXDelNotifyAttr1 = value.updXDelNotifyAttr1;
        this.xDelNotifyAttr2 = value.xDelNotifyAttr2;
        this.updXDelNotifyAttr2 = value.updXDelNotifyAttr2;
        this.xDelNotifyAttr3 = value.xDelNotifyAttr3;
        this.updXDelNotifyAttr3 = value.updXDelNotifyAttr3;
        this.xDelNotifyAttr4 = value.xDelNotifyAttr4;
        this.updXDelNotifyAttr4 = value.updXDelNotifyAttr4;
        this.xDelNotifyAttr5 = value.xDelNotifyAttr5;
        this.updXDelNotifyAttr5 = value.updXDelNotifyAttr5;
        this.xHasDelRowFlagDef = value.xHasDelRowFlagDef;
        this.updXHasDelRowFlagDef = value.updXHasDelRowFlagDef;
    }

    @XmlElement(
            name = "ENTITY_ID"
    )
    @Override
    @Nullable
    public DtUid getId() {
        return super.getId();
    }

    @XmlElement(
            name = "NAME"
    )
    @Nullable
    public String getName() {
        return name;
    }

    public GenEntityValueBuilder setName(String name) {
        this.name = Objects.requireNonNull(name);
        this.updName = true;
        return self();
    }

    public boolean isUpdName() {
        return updName;
    }

    public void setUpdName(boolean updName) {
        if (!this.updName && updName) {
            throw new InternalException("Cannot directly set update flag updName; set value instead");
        }
        this.updName = updName;
        if (!updName) {
            this.name = null;
        }
    }

    @XmlElement(
            name = "OBJECTCLASS"
    )
    @Nullable
    public Boolean isObjectClass() {
        return objectClass;
    }

    public GenEntityValueBuilder setObjectClass(Boolean objectClass) {
        this.objectClass = Objects.requireNonNull(objectClass);
        this.updObjectClass = true;
        return self();
    }

    public boolean isUpdObjectClass() {
        return updObjectClass;
    }

    public void setUpdObjectClass(boolean updObjectClass) {
        if (!this.updObjectClass && updObjectClass) {
            throw new InternalException("Cannot directly set update flag updObjectClass; set value instead");
        }
        this.updObjectClass = updObjectClass;
        if (!updObjectClass) {
            this.objectClass = null;
        }
    }

    @XmlElement(
            name = "ISCUSTOM"
    )
    @Nullable
    public Boolean isIsCustom() {
        return isCustom;
    }

    public GenEntityValueBuilder setIsCustom(Boolean isCustom) {
        this.isCustom = Objects.requireNonNull(isCustom);
        this.updIsCustom = true;
        return self();
    }

    public boolean isUpdIsCustom() {
        return updIsCustom;
    }

    public void setUpdIsCustom(boolean updIsCustom) {
        if (!this.updIsCustom && updIsCustom) {
            throw new InternalException("Cannot directly set update flag updIsCustom; set value instead");
        }
        this.updIsCustom = updIsCustom;
        if (!updIsCustom) {
            this.isCustom = null;
        }
    }

    @XmlElement(
            name = "TABLE_NM"
    )
    @Nullable
    public String getTableNm() {
        return tableNm;
    }

    public GenEntityValueBuilder setTableNm(@Nullable String tableNm) {
        this.tableNm = tableNm;
        this.updTableNm = true;
        return self();
    }

    public boolean isUpdTableNm() {
        return updTableNm;
    }

    public void setUpdTableNm(boolean updTableNm) {
        this.updTableNm = updTableNm;
        if (!updTableNm) {
            this.tableNm = null;
        }
    }

    @XmlElement(
            name = "VIEW_NM"
    )
    @Nullable
    public String getViewNm() {
        return viewNm;
    }

    public GenEntityValueBuilder setViewNm(@Nullable String viewNm) {
        this.viewNm = viewNm;
        this.updViewNm = true;
        return self();
    }

    public boolean isUpdViewNm() {
        return updViewNm;
    }

    public void setUpdViewNm(boolean updViewNm) {
        this.updViewNm = updViewNm;
        if (!updViewNm) {
            this.viewNm = null;
        }
    }

    @XmlElement(
            name = "KEY_NM"
    )
    @Nullable
    public String getKeyNm() {
        return keyNm;
    }

    public GenEntityValueBuilder setKeyNm(@Nullable String keyNm) {
        this.keyNm = keyNm;
        this.updKeyNm = true;
        return self();
    }

    public boolean isUpdKeyNm() {
        return updKeyNm;
    }

    public void setUpdKeyNm(boolean updKeyNm) {
        this.updKeyNm = updKeyNm;
        if (!updKeyNm) {
            this.keyNm = null;
        }
    }

    @XmlElement(
            name = "TEXTTABLE_NM"
    )
    @Nullable
    public String getTextTableNm() {
        return textTableNm;
    }

    public GenEntityValueBuilder setTextTableNm(@Nullable String textTableNm) {
        this.textTableNm = textTableNm;
        this.updTextTableNm = true;
        return self();
    }

    public boolean isUpdTextTableNm() {
        return updTextTableNm;
    }

    public void setUpdTextTableNm(boolean updTextTableNm) {
        this.updTextTableNm = updTextTableNm;
        if (!updTextTableNm) {
            this.textTableNm = null;
        }
    }

    @XmlElement(
            name = "TEXTVIEW_NM"
    )
    @Nullable
    public String getTextViewNm() {
        return textViewNm;
    }

    public GenEntityValueBuilder setTextViewNm(@Nullable String textViewNm) {
        this.textViewNm = textViewNm;
        this.updTextViewNm = true;
        return self();
    }

    public boolean isUpdTextViewNm() {
        return updTextViewNm;
    }

    public void setUpdTextViewNm(boolean updTextViewNm) {
        this.updTextViewNm = updTextViewNm;
        if (!updTextViewNm) {
            this.textViewNm = null;
        }
    }

    @XmlElement(
            name = "TEXTKEY_NM"
    )
    @Nullable
    public String getTextKeyNm() {
        return textKeyNm;
    }

    public GenEntityValueBuilder setTextKeyNm(@Nullable String textKeyNm) {
        this.textKeyNm = textKeyNm;
        this.updTextKeyNm = true;
        return self();
    }

    public boolean isUpdTextKeyNm() {
        return updTextKeyNm;
    }

    public void setUpdTextKeyNm(boolean updTextKeyNm) {
        this.updTextKeyNm = updTextKeyNm;
        if (!updTextKeyNm) {
            this.textKeyNm = null;
        }
    }

    @XmlElement(
            name = "TEXTALL"
    )
    @Nullable
    public Boolean getTextAll() {
        return textAll;
    }

    public GenEntityValueBuilder setTextAll(@Nullable Boolean textAll) {
        this.textAll = textAll;
        this.updTextAll = true;
        return self();
    }

    public boolean isUpdTextAll() {
        return updTextAll;
    }

    public void setUpdTextAll(boolean updTextAll) {
        this.updTextAll = updTextAll;
        if (!updTextAll) {
            this.textAll = null;
        }
    }

    @XmlElement(
            name = "PGPACKAGE_NM"
    )
    @Nullable
    public String getPgPackageNm() {
        return pgPackageNm;
    }

    public GenEntityValueBuilder setPgPackageNm(@Nullable String pgPackageNm) {
        this.pgPackageNm = pgPackageNm;
        this.updPgPackageNm = true;
        return self();
    }

    public boolean isUpdPgPackageNm() {
        return updPgPackageNm;
    }

    public void setUpdPgPackageNm(boolean updPgPackageNm) {
        this.updPgPackageNm = updPgPackageNm;
        if (!updPgPackageNm) {
            this.pgPackageNm = null;
        }
    }

    @XmlElement(
            name = "EPPACKAGE_NM"
    )
    @Nullable
    public String getEpPackageNm() {
        return epPackageNm;
    }

    public GenEntityValueBuilder setEpPackageNm(@Nullable String epPackageNm) {
        this.epPackageNm = epPackageNm;
        this.updEpPackageNm = true;
        return self();
    }

    public boolean isUpdEpPackageNm() {
        return updEpPackageNm;
    }

    public void setUpdEpPackageNm(boolean updEpPackageNm) {
        this.updEpPackageNm = updEpPackageNm;
        if (!updEpPackageNm) {
            this.epPackageNm = null;
        }
    }

    @XmlElement(
            name = "CPPACKAGE_NM"
    )
    @Nullable
    public String getCpPackageNm() {
        return cpPackageNm;
    }

    public GenEntityValueBuilder setCpPackageNm(@Nullable String cpPackageNm) {
        this.cpPackageNm = cpPackageNm;
        this.updCpPackageNm = true;
        return self();
    }

    public boolean isUpdCpPackageNm() {
        return updCpPackageNm;
    }

    public void setUpdCpPackageNm(boolean updCpPackageNm) {
        this.updCpPackageNm = updCpPackageNm;
        if (!updCpPackageNm) {
            this.cpPackageNm = null;
        }
    }

    @XmlElement(
            name = "FPPACKAGE_NM"
    )
    @Nullable
    public String getFpPackageNm() {
        return fpPackageNm;
    }

    public GenEntityValueBuilder setFpPackageNm(@Nullable String fpPackageNm) {
        this.fpPackageNm = fpPackageNm;
        this.updFpPackageNm = true;
        return self();
    }

    public boolean isUpdFpPackageNm() {
        return updFpPackageNm;
    }

    public void setUpdFpPackageNm(boolean updFpPackageNm) {
        this.updFpPackageNm = updFpPackageNm;
        if (!updFpPackageNm) {
            this.fpPackageNm = null;
        }
    }

    @XmlElement(
            name = "PROPERNAME"
    )
    @Nullable
    public String getProperName() {
        return properName;
    }

    public GenEntityValueBuilder setProperName(@Nullable String properName) {
        this.properName = properName;
        this.updProperName = true;
        return self();
    }

    public boolean isUpdProperName() {
        return updProperName;
    }

    public void setUpdProperName(boolean updProperName) {
        this.updProperName = updProperName;
        if (!updProperName) {
            this.properName = null;
        }
    }

    @XmlElement(
            name = "MASTER_ID"
    )
    @Nullable
    public DtUid getMasterId() {
        return masterId;
    }

    public GenEntityValueBuilder setMasterId(@Nullable DtUid masterId) {
        this.masterId = masterId;
        this.updMasterId = true;
        return self();
    }

    public boolean isUpdMasterId() {
        return updMasterId;
    }

    public void setUpdMasterId(boolean updMasterId) {
        this.updMasterId = updMasterId;
        if (!updMasterId) {
            this.masterId = null;
        }
    }

    @XmlElement(
            name = "MASTERTYPE"
    )
    @Nullable
    public Character getMasterType() {
        return masterType;
    }

    public GenEntityValueBuilder setMasterType(Character masterType) {
        this.masterType = Objects.requireNonNull(masterType);
        this.updMasterType = true;
        return self();
    }

    public boolean isUpdMasterType() {
        return updMasterType;
    }

    public void setUpdMasterType(boolean updMasterType) {
        if (!this.updMasterType && updMasterType) {
            throw new InternalException("Cannot directly set update flag updMasterType; set value instead");
        }
        this.updMasterType = updMasterType;
        if (!updMasterType) {
            this.masterType = null;
        }
    }

    @XmlElement(
            name = "USERLOCKTYPE"
    )
    @Nullable
    public Character getUserLockType() {
        return userLockType;
    }

    public GenEntityValueBuilder setUserLockType(@Nullable Character userLockType) {
        this.userLockType = userLockType;
        this.updUserLockType = true;
        return self();
    }

    public boolean isUpdUserLockType() {
        return updUserLockType;
    }

    public void setUpdUserLockType(boolean updUserLockType) {
        this.updUserLockType = updUserLockType;
        if (!updUserLockType) {
            this.userLockType = null;
        }
    }

    @XmlElement(
            name = "IMPORTTYPE"
    )
    @Nullable
    public Character getImportType() {
        return importType;
    }

    public GenEntityValueBuilder setImportType(@Nullable Character importType) {
        this.importType = importType;
        this.updImportType = true;
        return self();
    }

    public boolean isUpdImportType() {
        return updImportType;
    }

    public void setUpdImportType(boolean updImportType) {
        this.updImportType = updImportType;
        if (!updImportType) {
            this.importType = null;
        }
    }

    @XmlElement(
            name = "CONFOBJ"
    )
    @Nullable
    public Character getConfObj() {
        return confObj;
    }

    public GenEntityValueBuilder setConfObj(@Nullable Character confObj) {
        this.confObj = confObj;
        this.updConfObj = true;
        return self();
    }

    public boolean isUpdConfObj() {
        return updConfObj;
    }

    public void setUpdConfObj(boolean updConfObj) {
        this.updConfObj = updConfObj;
        if (!updConfObj) {
            this.confObj = null;
        }
    }

    @XmlElement(
            name = "BASEPATH"
    )
    @Nullable
    public String getBasePath() {
        return basePath;
    }

    public GenEntityValueBuilder setBasePath(@Nullable String basePath) {
        this.basePath = basePath;
        this.updBasePath = true;
        return self();
    }

    public boolean isUpdBasePath() {
        return updBasePath;
    }

    public void setUpdBasePath(boolean updBasePath) {
        this.updBasePath = updBasePath;
        if (!updBasePath) {
            this.basePath = null;
        }
    }

    @XmlElement(
            name = "INCOMPLETEKEY"
    )
    @Nullable
    public Boolean isIncompleteKey() {
        return incompleteKey;
    }

    public GenEntityValueBuilder setIncompleteKey(Boolean incompleteKey) {
        this.incompleteKey = Objects.requireNonNull(incompleteKey);
        this.updIncompleteKey = true;
        return self();
    }

    public boolean isUpdIncompleteKey() {
        return updIncompleteKey;
    }

    public void setUpdIncompleteKey(boolean updIncompleteKey) {
        if (!this.updIncompleteKey && updIncompleteKey) {
            throw new InternalException("Cannot directly set update flag updIncompleteKey; set value instead");
        }
        this.updIncompleteKey = updIncompleteKey;
        if (!updIncompleteKey) {
            this.incompleteKey = null;
        }
    }

    @XmlElement(
            name = "CONFOBJALL"
    )
    @Nullable
    public Boolean getConfObjAll() {
        return confObjAll;
    }

    public GenEntityValueBuilder setConfObjAll(@Nullable Boolean confObjAll) {
        this.confObjAll = confObjAll;
        this.updConfObjAll = true;
        return self();
    }

    public boolean isUpdConfObjAll() {
        return updConfObjAll;
    }

    public void setUpdConfObjAll(boolean updConfObjAll) {
        this.updConfObjAll = updConfObjAll;
        if (!updConfObjAll) {
            this.confObjAll = null;
        }
    }

    @XmlElement(
            name = "ENTITYGRP_ID"
    )
    @Nullable
    public DtUid getEntityGrpId() {
        return entityGrpId;
    }

    public GenEntityValueBuilder setEntityGrpId(@Nullable DtUid entityGrpId) {
        this.entityGrpId = entityGrpId;
        this.updEntityGrpId = true;
        return self();
    }

    public boolean isUpdEntityGrpId() {
        return updEntityGrpId;
    }

    public void setUpdEntityGrpId(boolean updEntityGrpId) {
        this.updEntityGrpId = updEntityGrpId;
        if (!updEntityGrpId) {
            this.entityGrpId = null;
        }
    }

    @XmlElement(
            name = "ANCESTOR_ID"
    )
    @Nullable
    public DtUid getAncestorId() {
        return ancestorId;
    }

    public GenEntityValueBuilder setAncestorId(@Nullable DtUid ancestorId) {
        this.ancestorId = ancestorId;
        this.updAncestorId = true;
        return self();
    }

    public boolean isUpdAncestorId() {
        return updAncestorId;
    }

    public void setUpdAncestorId(boolean updAncestorId) {
        this.updAncestorId = updAncestorId;
        if (!updAncestorId) {
            this.ancestorId = null;
        }
    }

    @XmlElement(
            name = "NOTE"
    )
    @Nullable
    public String getNote() {
        return note;
    }

    public GenEntityValueBuilder setNote(@Nullable String note) {
        this.note = note;
        this.updNote = true;
        return self();
    }

    public boolean isUpdNote() {
        return updNote;
    }

    public void setUpdNote(boolean updNote) {
        this.updNote = updNote;
        if (!updNote) {
            this.note = null;
        }
    }

    @XmlElement(
            name = "CUSTOMNOTE"
    )
    @Nullable
    public String getCustomNote() {
        return customNote;
    }

    public GenEntityValueBuilder setCustomNote(@Nullable String customNote) {
        this.customNote = customNote;
        this.updCustomNote = true;
        return self();
    }

    public boolean isUpdCustomNote() {
        return updCustomNote;
    }

    public void setUpdCustomNote(boolean updCustomNote) {
        this.updCustomNote = updCustomNote;
        if (!updCustomNote) {
            this.customNote = null;
        }
    }

    @XmlElement(
            name = "STRUCTUREDOC"
    )
    @Nullable
    public String getStructureDoc() {
        return structureDoc;
    }

    public GenEntityValueBuilder setStructureDoc(@Nullable String structureDoc) {
        this.structureDoc = structureDoc;
        this.updStructureDoc = true;
        return self();
    }

    public boolean isUpdStructureDoc() {
        return updStructureDoc;
    }

    public void setUpdStructureDoc(boolean updStructureDoc) {
        this.updStructureDoc = updStructureDoc;
        if (!updStructureDoc) {
            this.structureDoc = null;
        }
    }

    @XmlElement(
            name = "USAGEDOC"
    )
    @Nullable
    public String getUsageDoc() {
        return usageDoc;
    }

    public GenEntityValueBuilder setUsageDoc(@Nullable String usageDoc) {
        this.usageDoc = usageDoc;
        this.updUsageDoc = true;
        return self();
    }

    public boolean isUpdUsageDoc() {
        return updUsageDoc;
    }

    public void setUpdUsageDoc(boolean updUsageDoc) {
        this.updUsageDoc = updUsageDoc;
        if (!updUsageDoc) {
            this.usageDoc = null;
        }
    }

    @XmlElement(
            name = "BEHAVIOURDOC"
    )
    @Nullable
    public String getBehaviourDoc() {
        return behaviourDoc;
    }

    public GenEntityValueBuilder setBehaviourDoc(@Nullable String behaviourDoc) {
        this.behaviourDoc = behaviourDoc;
        this.updBehaviourDoc = true;
        return self();
    }

    public boolean isUpdBehaviourDoc() {
        return updBehaviourDoc;
    }

    public void setUpdBehaviourDoc(boolean updBehaviourDoc) {
        this.updBehaviourDoc = updBehaviourDoc;
        if (!updBehaviourDoc) {
            this.behaviourDoc = null;
        }
    }

    @XmlElement(
            name = "IMPLDOC"
    )
    @Nullable
    public String getImplDoc() {
        return implDoc;
    }

    public GenEntityValueBuilder setImplDoc(@Nullable String implDoc) {
        this.implDoc = implDoc;
        this.updImplDoc = true;
        return self();
    }

    public boolean isUpdImplDoc() {
        return updImplDoc;
    }

    public void setUpdImplDoc(boolean updImplDoc) {
        this.updImplDoc = updImplDoc;
        if (!updImplDoc) {
            this.implDoc = null;
        }
    }

    @XmlElement(
            name = "ISUSED"
    )
    @Nullable
    public Boolean isIsUsed() {
        return isUsed;
    }

    public GenEntityValueBuilder setIsUsed(Boolean isUsed) {
        this.isUsed = Objects.requireNonNull(isUsed);
        this.updIsUsed = true;
        return self();
    }

    public boolean isUpdIsUsed() {
        return updIsUsed;
    }

    public void setUpdIsUsed(boolean updIsUsed) {
        if (!this.updIsUsed && updIsUsed) {
            throw new InternalException("Cannot directly set update flag updIsUsed; set value instead");
        }
        this.updIsUsed = updIsUsed;
        if (!updIsUsed) {
            this.isUsed = null;
        }
    }

    @XmlElement(
            name = "GETRIGHTCUSTOM"
    )
    @Nullable
    public Boolean isGetRightCustom() {
        return getRightCustom;
    }

    public GenEntityValueBuilder setGetRightCustom(Boolean getRightCustom) {
        this.getRightCustom = Objects.requireNonNull(getRightCustom);
        this.updGetRightCustom = true;
        return self();
    }

    public boolean isUpdGetRightCustom() {
        return updGetRightCustom;
    }

    public void setUpdGetRightCustom(boolean updGetRightCustom) {
        if (!this.updGetRightCustom && updGetRightCustom) {
            throw new InternalException("Cannot directly set update flag updGetRightCustom; set value instead");
        }
        this.updGetRightCustom = updGetRightCustom;
        if (!updGetRightCustom) {
            this.getRightCustom = null;
        }
    }

    @XmlElement(
            name = "GETRIGHTRESTR_ID"
    )
    @Nullable
    public DtUid getGetRightRestrId() {
        return getRightRestrId;
    }

    public GenEntityValueBuilder setGetRightRestrId(@Nullable DtUid getRightRestrId) {
        this.getRightRestrId = getRightRestrId;
        this.updGetRightRestrId = true;
        return self();
    }

    public boolean isUpdGetRightRestrId() {
        return updGetRightRestrId;
    }

    public void setUpdGetRightRestrId(boolean updGetRightRestrId) {
        this.updGetRightRestrId = updGetRightRestrId;
        if (!updGetRightRestrId) {
            this.getRightRestrId = null;
        }
    }

    @XmlElement(
            name = "GETOPTYPE_ID"
    )
    @Nullable
    public DtUid getGetOpTypeId() {
        return getOpTypeId;
    }

    public GenEntityValueBuilder setGetOpTypeId(@Nullable DtUid getOpTypeId) {
        this.getOpTypeId = getOpTypeId;
        this.updGetOpTypeId = true;
        return self();
    }

    public boolean isUpdGetOpTypeId() {
        return updGetOpTypeId;
    }

    public void setUpdGetOpTypeId(boolean updGetOpTypeId) {
        this.updGetOpTypeId = updGetOpTypeId;
        if (!updGetOpTypeId) {
            this.getOpTypeId = null;
        }
    }

    @XmlElement(
            name = "KEEPDELETED"
    )
    @Nullable
    public Integer getKeepDeleted() {
        return keepDeleted;
    }

    public GenEntityValueBuilder setKeepDeleted(@Nullable Integer keepDeleted) {
        this.keepDeleted = keepDeleted;
        this.updKeepDeleted = true;
        return self();
    }

    public boolean isUpdKeepDeleted() {
        return updKeepDeleted;
    }

    public void setUpdKeepDeleted(boolean updKeepDeleted) {
        this.updKeepDeleted = updKeepDeleted;
        if (!updKeepDeleted) {
            this.keepDeleted = null;
        }
    }

    @XmlElement(
            name = "SHORTDESC"
    )
    @Nullable
    public String getShortDesc() {
        return shortDesc;
    }

    public GenEntityValueBuilder setShortDesc(@Nullable String shortDesc) {
        this.shortDesc = shortDesc;
        this.updShortDesc = true;
        return self();
    }

    public boolean isUpdShortDesc() {
        return updShortDesc;
    }

    public void setUpdShortDesc(boolean updShortDesc) {
        this.updShortDesc = updShortDesc;
        if (!updShortDesc) {
            this.shortDesc = null;
        }
    }

    @XmlElement(
            name = "LONGDESC"
    )
    @Nullable
    public String getLongDesc() {
        return longDesc;
    }

    public GenEntityValueBuilder setLongDesc(@Nullable String longDesc) {
        this.longDesc = longDesc;
        this.updLongDesc = true;
        return self();
    }

    public boolean isUpdLongDesc() {
        return updLongDesc;
    }

    public void setUpdLongDesc(boolean updLongDesc) {
        this.updLongDesc = updLongDesc;
        if (!updLongDesc) {
            this.longDesc = null;
        }
    }

    @XmlElement(
            name = "X_COPIEDATTR0"
    )
    @Nullable
    public Double getxCopiedAttr0() {
        return xCopiedAttr0;
    }

    public GenEntityValueBuilder setxCopiedAttr0(Double xCopiedAttr0) {
        this.xCopiedAttr0 = Objects.requireNonNull(xCopiedAttr0);
        this.updXCopiedAttr0 = true;
        return self();
    }

    public boolean isUpdXCopiedAttr0() {
        return updXCopiedAttr0;
    }

    public void setUpdXCopiedAttr0(boolean updXCopiedAttr0) {
        if (!this.updXCopiedAttr0 && updXCopiedAttr0) {
            throw new InternalException("Cannot directly set update flag updXCopiedAttr0; set value instead");
        }
        this.updXCopiedAttr0 = updXCopiedAttr0;
        if (!updXCopiedAttr0) {
            this.xCopiedAttr0 = null;
        }
    }

    @XmlElement(
            name = "X_COPIEDATTR1"
    )
    @Nullable
    public Double getxCopiedAttr1() {
        return xCopiedAttr1;
    }

    public GenEntityValueBuilder setxCopiedAttr1(Double xCopiedAttr1) {
        this.xCopiedAttr1 = Objects.requireNonNull(xCopiedAttr1);
        this.updXCopiedAttr1 = true;
        return self();
    }

    public boolean isUpdXCopiedAttr1() {
        return updXCopiedAttr1;
    }

    public void setUpdXCopiedAttr1(boolean updXCopiedAttr1) {
        if (!this.updXCopiedAttr1 && updXCopiedAttr1) {
            throw new InternalException("Cannot directly set update flag updXCopiedAttr1; set value instead");
        }
        this.updXCopiedAttr1 = updXCopiedAttr1;
        if (!updXCopiedAttr1) {
            this.xCopiedAttr1 = null;
        }
    }

    @XmlElement(
            name = "X_COPIEDATTR2"
    )
    @Nullable
    public Double getxCopiedAttr2() {
        return xCopiedAttr2;
    }

    public GenEntityValueBuilder setxCopiedAttr2(Double xCopiedAttr2) {
        this.xCopiedAttr2 = Objects.requireNonNull(xCopiedAttr2);
        this.updXCopiedAttr2 = true;
        return self();
    }

    public boolean isUpdXCopiedAttr2() {
        return updXCopiedAttr2;
    }

    public void setUpdXCopiedAttr2(boolean updXCopiedAttr2) {
        if (!this.updXCopiedAttr2 && updXCopiedAttr2) {
            throw new InternalException("Cannot directly set update flag updXCopiedAttr2; set value instead");
        }
        this.updXCopiedAttr2 = updXCopiedAttr2;
        if (!updXCopiedAttr2) {
            this.xCopiedAttr2 = null;
        }
    }

    @XmlElement(
            name = "X_COPIEDATTR3"
    )
    @Nullable
    public Double getxCopiedAttr3() {
        return xCopiedAttr3;
    }

    public GenEntityValueBuilder setxCopiedAttr3(Double xCopiedAttr3) {
        this.xCopiedAttr3 = Objects.requireNonNull(xCopiedAttr3);
        this.updXCopiedAttr3 = true;
        return self();
    }

    public boolean isUpdXCopiedAttr3() {
        return updXCopiedAttr3;
    }

    public void setUpdXCopiedAttr3(boolean updXCopiedAttr3) {
        if (!this.updXCopiedAttr3 && updXCopiedAttr3) {
            throw new InternalException("Cannot directly set update flag updXCopiedAttr3; set value instead");
        }
        this.updXCopiedAttr3 = updXCopiedAttr3;
        if (!updXCopiedAttr3) {
            this.xCopiedAttr3 = null;
        }
    }

    @XmlElement(
            name = "X_COPIEDATTR4"
    )
    @Nullable
    public Double getxCopiedAttr4() {
        return xCopiedAttr4;
    }

    public GenEntityValueBuilder setxCopiedAttr4(Double xCopiedAttr4) {
        this.xCopiedAttr4 = Objects.requireNonNull(xCopiedAttr4);
        this.updXCopiedAttr4 = true;
        return self();
    }

    public boolean isUpdXCopiedAttr4() {
        return updXCopiedAttr4;
    }

    public void setUpdXCopiedAttr4(boolean updXCopiedAttr4) {
        if (!this.updXCopiedAttr4 && updXCopiedAttr4) {
            throw new InternalException("Cannot directly set update flag updXCopiedAttr4; set value instead");
        }
        this.updXCopiedAttr4 = updXCopiedAttr4;
        if (!updXCopiedAttr4) {
            this.xCopiedAttr4 = null;
        }
    }

    @XmlElement(
            name = "X_COPIEDATTR5"
    )
    @Nullable
    public Double getxCopiedAttr5() {
        return xCopiedAttr5;
    }

    public GenEntityValueBuilder setxCopiedAttr5(Double xCopiedAttr5) {
        this.xCopiedAttr5 = Objects.requireNonNull(xCopiedAttr5);
        this.updXCopiedAttr5 = true;
        return self();
    }

    public boolean isUpdXCopiedAttr5() {
        return updXCopiedAttr5;
    }

    public void setUpdXCopiedAttr5(boolean updXCopiedAttr5) {
        if (!this.updXCopiedAttr5 && updXCopiedAttr5) {
            throw new InternalException("Cannot directly set update flag updXCopiedAttr5; set value instead");
        }
        this.updXCopiedAttr5 = updXCopiedAttr5;
        if (!updXCopiedAttr5) {
            this.xCopiedAttr5 = null;
        }
    }

    @XmlElement(
            name = "X_HASLIABILITY"
    )
    @Nullable
    public Boolean isxHasLiability() {
        return xHasLiability;
    }

    public GenEntityValueBuilder setxHasLiability(Boolean xHasLiability) {
        this.xHasLiability = Objects.requireNonNull(xHasLiability);
        this.updXHasLiability = true;
        return self();
    }

    public boolean isUpdXHasLiability() {
        return updXHasLiability;
    }

    public void setUpdXHasLiability(boolean updXHasLiability) {
        if (!this.updXHasLiability && updXHasLiability) {
            throw new InternalException("Cannot directly set update flag updXHasLiability; set value instead");
        }
        this.updXHasLiability = updXHasLiability;
        if (!updXHasLiability) {
            this.xHasLiability = null;
        }
    }

    @XmlElement(
            name = "USECONFOBJ"
    )
    @Nullable
    public Boolean getUseConfObj() {
        return useConfObj;
    }

    public GenEntityValueBuilder setUseConfObj(@Nullable Boolean useConfObj) {
        this.useConfObj = useConfObj;
        this.updUseConfObj = true;
        return self();
    }

    public boolean isUpdUseConfObj() {
        return updUseConfObj;
    }

    public void setUpdUseConfObj(boolean updUseConfObj) {
        this.updUseConfObj = updUseConfObj;
        if (!updUseConfObj) {
            this.useConfObj = null;
        }
    }

    @XmlElement(
            name = "X_USECONFOBJ"
    )
    @Nullable
    public Boolean getxUseConfObj() {
        return xUseConfObj;
    }

    public GenEntityValueBuilder setxUseConfObj(@Nullable Boolean xUseConfObj) {
        this.xUseConfObj = xUseConfObj;
        this.updXUseConfObj = true;
        return self();
    }

    public boolean isUpdXUseConfObj() {
        return updXUseConfObj;
    }

    public void setUpdXUseConfObj(boolean updXUseConfObj) {
        this.updXUseConfObj = updXUseConfObj;
        if (!updXUseConfObj) {
            this.xUseConfObj = null;
        }
    }

    @XmlElement(
            name = "X_NOTIFYATTR0"
    )
    @Nullable
    public Double getxNotifyAttr0() {
        return xNotifyAttr0;
    }

    public GenEntityValueBuilder setxNotifyAttr0(Double xNotifyAttr0) {
        this.xNotifyAttr0 = Objects.requireNonNull(xNotifyAttr0);
        this.updXNotifyAttr0 = true;
        return self();
    }

    public boolean isUpdXNotifyAttr0() {
        return updXNotifyAttr0;
    }

    public void setUpdXNotifyAttr0(boolean updXNotifyAttr0) {
        if (!this.updXNotifyAttr0 && updXNotifyAttr0) {
            throw new InternalException("Cannot directly set update flag updXNotifyAttr0; set value instead");
        }
        this.updXNotifyAttr0 = updXNotifyAttr0;
        if (!updXNotifyAttr0) {
            this.xNotifyAttr0 = null;
        }
    }

    @XmlElement(
            name = "X_NOTIFYATTR1"
    )
    @Nullable
    public Double getxNotifyAttr1() {
        return xNotifyAttr1;
    }

    public GenEntityValueBuilder setxNotifyAttr1(Double xNotifyAttr1) {
        this.xNotifyAttr1 = Objects.requireNonNull(xNotifyAttr1);
        this.updXNotifyAttr1 = true;
        return self();
    }

    public boolean isUpdXNotifyAttr1() {
        return updXNotifyAttr1;
    }

    public void setUpdXNotifyAttr1(boolean updXNotifyAttr1) {
        if (!this.updXNotifyAttr1 && updXNotifyAttr1) {
            throw new InternalException("Cannot directly set update flag updXNotifyAttr1; set value instead");
        }
        this.updXNotifyAttr1 = updXNotifyAttr1;
        if (!updXNotifyAttr1) {
            this.xNotifyAttr1 = null;
        }
    }

    @XmlElement(
            name = "X_NOTIFYATTR2"
    )
    @Nullable
    public Double getxNotifyAttr2() {
        return xNotifyAttr2;
    }

    public GenEntityValueBuilder setxNotifyAttr2(Double xNotifyAttr2) {
        this.xNotifyAttr2 = Objects.requireNonNull(xNotifyAttr2);
        this.updXNotifyAttr2 = true;
        return self();
    }

    public boolean isUpdXNotifyAttr2() {
        return updXNotifyAttr2;
    }

    public void setUpdXNotifyAttr2(boolean updXNotifyAttr2) {
        if (!this.updXNotifyAttr2 && updXNotifyAttr2) {
            throw new InternalException("Cannot directly set update flag updXNotifyAttr2; set value instead");
        }
        this.updXNotifyAttr2 = updXNotifyAttr2;
        if (!updXNotifyAttr2) {
            this.xNotifyAttr2 = null;
        }
    }

    @XmlElement(
            name = "X_NOTIFYATTR3"
    )
    @Nullable
    public Double getxNotifyAttr3() {
        return xNotifyAttr3;
    }

    public GenEntityValueBuilder setxNotifyAttr3(Double xNotifyAttr3) {
        this.xNotifyAttr3 = Objects.requireNonNull(xNotifyAttr3);
        this.updXNotifyAttr3 = true;
        return self();
    }

    public boolean isUpdXNotifyAttr3() {
        return updXNotifyAttr3;
    }

    public void setUpdXNotifyAttr3(boolean updXNotifyAttr3) {
        if (!this.updXNotifyAttr3 && updXNotifyAttr3) {
            throw new InternalException("Cannot directly set update flag updXNotifyAttr3; set value instead");
        }
        this.updXNotifyAttr3 = updXNotifyAttr3;
        if (!updXNotifyAttr3) {
            this.xNotifyAttr3 = null;
        }
    }

    @XmlElement(
            name = "X_NOTIFYATTR4"
    )
    @Nullable
    public Double getxNotifyAttr4() {
        return xNotifyAttr4;
    }

    public GenEntityValueBuilder setxNotifyAttr4(Double xNotifyAttr4) {
        this.xNotifyAttr4 = Objects.requireNonNull(xNotifyAttr4);
        this.updXNotifyAttr4 = true;
        return self();
    }

    public boolean isUpdXNotifyAttr4() {
        return updXNotifyAttr4;
    }

    public void setUpdXNotifyAttr4(boolean updXNotifyAttr4) {
        if (!this.updXNotifyAttr4 && updXNotifyAttr4) {
            throw new InternalException("Cannot directly set update flag updXNotifyAttr4; set value instead");
        }
        this.updXNotifyAttr4 = updXNotifyAttr4;
        if (!updXNotifyAttr4) {
            this.xNotifyAttr4 = null;
        }
    }

    @XmlElement(
            name = "X_NOTIFYATTR5"
    )
    @Nullable
    public Double getxNotifyAttr5() {
        return xNotifyAttr5;
    }

    public GenEntityValueBuilder setxNotifyAttr5(Double xNotifyAttr5) {
        this.xNotifyAttr5 = Objects.requireNonNull(xNotifyAttr5);
        this.updXNotifyAttr5 = true;
        return self();
    }

    public boolean isUpdXNotifyAttr5() {
        return updXNotifyAttr5;
    }

    public void setUpdXNotifyAttr5(boolean updXNotifyAttr5) {
        if (!this.updXNotifyAttr5 && updXNotifyAttr5) {
            throw new InternalException("Cannot directly set update flag updXNotifyAttr5; set value instead");
        }
        this.updXNotifyAttr5 = updXNotifyAttr5;
        if (!updXNotifyAttr5) {
            this.xNotifyAttr5 = null;
        }
    }

    @XmlElement(
            name = "X_FLAGDEFINTEREST0"
    )
    @Nullable
    public Double getxFlagDefInterest0() {
        return xFlagDefInterest0;
    }

    public GenEntityValueBuilder setxFlagDefInterest0(Double xFlagDefInterest0) {
        this.xFlagDefInterest0 = Objects.requireNonNull(xFlagDefInterest0);
        this.updXFlagDefInterest0 = true;
        return self();
    }

    public boolean isUpdXFlagDefInterest0() {
        return updXFlagDefInterest0;
    }

    public void setUpdXFlagDefInterest0(boolean updXFlagDefInterest0) {
        if (!this.updXFlagDefInterest0 && updXFlagDefInterest0) {
            throw new InternalException("Cannot directly set update flag updXFlagDefInterest0; set value instead");
        }
        this.updXFlagDefInterest0 = updXFlagDefInterest0;
        if (!updXFlagDefInterest0) {
            this.xFlagDefInterest0 = null;
        }
    }

    @XmlElement(
            name = "X_FLAGDEFINTEREST1"
    )
    @Nullable
    public Double getxFlagDefInterest1() {
        return xFlagDefInterest1;
    }

    public GenEntityValueBuilder setxFlagDefInterest1(Double xFlagDefInterest1) {
        this.xFlagDefInterest1 = Objects.requireNonNull(xFlagDefInterest1);
        this.updXFlagDefInterest1 = true;
        return self();
    }

    public boolean isUpdXFlagDefInterest1() {
        return updXFlagDefInterest1;
    }

    public void setUpdXFlagDefInterest1(boolean updXFlagDefInterest1) {
        if (!this.updXFlagDefInterest1 && updXFlagDefInterest1) {
            throw new InternalException("Cannot directly set update flag updXFlagDefInterest1; set value instead");
        }
        this.updXFlagDefInterest1 = updXFlagDefInterest1;
        if (!updXFlagDefInterest1) {
            this.xFlagDefInterest1 = null;
        }
    }

    @XmlElement(
            name = "X_FLAGDEFINTEREST2"
    )
    @Nullable
    public Double getxFlagDefInterest2() {
        return xFlagDefInterest2;
    }

    public GenEntityValueBuilder setxFlagDefInterest2(Double xFlagDefInterest2) {
        this.xFlagDefInterest2 = Objects.requireNonNull(xFlagDefInterest2);
        this.updXFlagDefInterest2 = true;
        return self();
    }

    public boolean isUpdXFlagDefInterest2() {
        return updXFlagDefInterest2;
    }

    public void setUpdXFlagDefInterest2(boolean updXFlagDefInterest2) {
        if (!this.updXFlagDefInterest2 && updXFlagDefInterest2) {
            throw new InternalException("Cannot directly set update flag updXFlagDefInterest2; set value instead");
        }
        this.updXFlagDefInterest2 = updXFlagDefInterest2;
        if (!updXFlagDefInterest2) {
            this.xFlagDefInterest2 = null;
        }
    }

    @XmlElement(
            name = "X_FLAGDEFINTEREST3"
    )
    @Nullable
    public Double getxFlagDefInterest3() {
        return xFlagDefInterest3;
    }

    public GenEntityValueBuilder setxFlagDefInterest3(Double xFlagDefInterest3) {
        this.xFlagDefInterest3 = Objects.requireNonNull(xFlagDefInterest3);
        this.updXFlagDefInterest3 = true;
        return self();
    }

    public boolean isUpdXFlagDefInterest3() {
        return updXFlagDefInterest3;
    }

    public void setUpdXFlagDefInterest3(boolean updXFlagDefInterest3) {
        if (!this.updXFlagDefInterest3 && updXFlagDefInterest3) {
            throw new InternalException("Cannot directly set update flag updXFlagDefInterest3; set value instead");
        }
        this.updXFlagDefInterest3 = updXFlagDefInterest3;
        if (!updXFlagDefInterest3) {
            this.xFlagDefInterest3 = null;
        }
    }

    @XmlElement(
            name = "X_FLAGDEFINTEREST4"
    )
    @Nullable
    public Double getxFlagDefInterest4() {
        return xFlagDefInterest4;
    }

    public GenEntityValueBuilder setxFlagDefInterest4(Double xFlagDefInterest4) {
        this.xFlagDefInterest4 = Objects.requireNonNull(xFlagDefInterest4);
        this.updXFlagDefInterest4 = true;
        return self();
    }

    public boolean isUpdXFlagDefInterest4() {
        return updXFlagDefInterest4;
    }

    public void setUpdXFlagDefInterest4(boolean updXFlagDefInterest4) {
        if (!this.updXFlagDefInterest4 && updXFlagDefInterest4) {
            throw new InternalException("Cannot directly set update flag updXFlagDefInterest4; set value instead");
        }
        this.updXFlagDefInterest4 = updXFlagDefInterest4;
        if (!updXFlagDefInterest4) {
            this.xFlagDefInterest4 = null;
        }
    }

    @XmlElement(
            name = "X_FLAGDEFINTEREST5"
    )
    @Nullable
    public Double getxFlagDefInterest5() {
        return xFlagDefInterest5;
    }

    public GenEntityValueBuilder setxFlagDefInterest5(Double xFlagDefInterest5) {
        this.xFlagDefInterest5 = Objects.requireNonNull(xFlagDefInterest5);
        this.updXFlagDefInterest5 = true;
        return self();
    }

    public boolean isUpdXFlagDefInterest5() {
        return updXFlagDefInterest5;
    }

    public void setUpdXFlagDefInterest5(boolean updXFlagDefInterest5) {
        if (!this.updXFlagDefInterest5 && updXFlagDefInterest5) {
            throw new InternalException("Cannot directly set update flag updXFlagDefInterest5; set value instead");
        }
        this.updXFlagDefInterest5 = updXFlagDefInterest5;
        if (!updXFlagDefInterest5) {
            this.xFlagDefInterest5 = null;
        }
    }

    @XmlElement(
            name = "X_DELNOTIFYATTR0"
    )
    @Nullable
    public Double getxDelNotifyAttr0() {
        return xDelNotifyAttr0;
    }

    public GenEntityValueBuilder setxDelNotifyAttr0(Double xDelNotifyAttr0) {
        this.xDelNotifyAttr0 = Objects.requireNonNull(xDelNotifyAttr0);
        this.updXDelNotifyAttr0 = true;
        return self();
    }

    public boolean isUpdXDelNotifyAttr0() {
        return updXDelNotifyAttr0;
    }

    public void setUpdXDelNotifyAttr0(boolean updXDelNotifyAttr0) {
        if (!this.updXDelNotifyAttr0 && updXDelNotifyAttr0) {
            throw new InternalException("Cannot directly set update flag updXDelNotifyAttr0; set value instead");
        }
        this.updXDelNotifyAttr0 = updXDelNotifyAttr0;
        if (!updXDelNotifyAttr0) {
            this.xDelNotifyAttr0 = null;
        }
    }

    @XmlElement(
            name = "X_DELNOTIFYATTR1"
    )
    @Nullable
    public Double getxDelNotifyAttr1() {
        return xDelNotifyAttr1;
    }

    public GenEntityValueBuilder setxDelNotifyAttr1(Double xDelNotifyAttr1) {
        this.xDelNotifyAttr1 = Objects.requireNonNull(xDelNotifyAttr1);
        this.updXDelNotifyAttr1 = true;
        return self();
    }

    public boolean isUpdXDelNotifyAttr1() {
        return updXDelNotifyAttr1;
    }

    public void setUpdXDelNotifyAttr1(boolean updXDelNotifyAttr1) {
        if (!this.updXDelNotifyAttr1 && updXDelNotifyAttr1) {
            throw new InternalException("Cannot directly set update flag updXDelNotifyAttr1; set value instead");
        }
        this.updXDelNotifyAttr1 = updXDelNotifyAttr1;
        if (!updXDelNotifyAttr1) {
            this.xDelNotifyAttr1 = null;
        }
    }

    @XmlElement(
            name = "X_DELNOTIFYATTR2"
    )
    @Nullable
    public Double getxDelNotifyAttr2() {
        return xDelNotifyAttr2;
    }

    public GenEntityValueBuilder setxDelNotifyAttr2(Double xDelNotifyAttr2) {
        this.xDelNotifyAttr2 = Objects.requireNonNull(xDelNotifyAttr2);
        this.updXDelNotifyAttr2 = true;
        return self();
    }

    public boolean isUpdXDelNotifyAttr2() {
        return updXDelNotifyAttr2;
    }

    public void setUpdXDelNotifyAttr2(boolean updXDelNotifyAttr2) {
        if (!this.updXDelNotifyAttr2 && updXDelNotifyAttr2) {
            throw new InternalException("Cannot directly set update flag updXDelNotifyAttr2; set value instead");
        }
        this.updXDelNotifyAttr2 = updXDelNotifyAttr2;
        if (!updXDelNotifyAttr2) {
            this.xDelNotifyAttr2 = null;
        }
    }

    @XmlElement(
            name = "X_DELNOTIFYATTR3"
    )
    @Nullable
    public Double getxDelNotifyAttr3() {
        return xDelNotifyAttr3;
    }

    public GenEntityValueBuilder setxDelNotifyAttr3(Double xDelNotifyAttr3) {
        this.xDelNotifyAttr3 = Objects.requireNonNull(xDelNotifyAttr3);
        this.updXDelNotifyAttr3 = true;
        return self();
    }

    public boolean isUpdXDelNotifyAttr3() {
        return updXDelNotifyAttr3;
    }

    public void setUpdXDelNotifyAttr3(boolean updXDelNotifyAttr3) {
        if (!this.updXDelNotifyAttr3 && updXDelNotifyAttr3) {
            throw new InternalException("Cannot directly set update flag updXDelNotifyAttr3; set value instead");
        }
        this.updXDelNotifyAttr3 = updXDelNotifyAttr3;
        if (!updXDelNotifyAttr3) {
            this.xDelNotifyAttr3 = null;
        }
    }

    @XmlElement(
            name = "X_DELNOTIFYATTR4"
    )
    @Nullable
    public Double getxDelNotifyAttr4() {
        return xDelNotifyAttr4;
    }

    public GenEntityValueBuilder setxDelNotifyAttr4(Double xDelNotifyAttr4) {
        this.xDelNotifyAttr4 = Objects.requireNonNull(xDelNotifyAttr4);
        this.updXDelNotifyAttr4 = true;
        return self();
    }

    public boolean isUpdXDelNotifyAttr4() {
        return updXDelNotifyAttr4;
    }

    public void setUpdXDelNotifyAttr4(boolean updXDelNotifyAttr4) {
        if (!this.updXDelNotifyAttr4 && updXDelNotifyAttr4) {
            throw new InternalException("Cannot directly set update flag updXDelNotifyAttr4; set value instead");
        }
        this.updXDelNotifyAttr4 = updXDelNotifyAttr4;
        if (!updXDelNotifyAttr4) {
            this.xDelNotifyAttr4 = null;
        }
    }

    @XmlElement(
            name = "X_DELNOTIFYATTR5"
    )
    @Nullable
    public Double getxDelNotifyAttr5() {
        return xDelNotifyAttr5;
    }

    public GenEntityValueBuilder setxDelNotifyAttr5(Double xDelNotifyAttr5) {
        this.xDelNotifyAttr5 = Objects.requireNonNull(xDelNotifyAttr5);
        this.updXDelNotifyAttr5 = true;
        return self();
    }

    public boolean isUpdXDelNotifyAttr5() {
        return updXDelNotifyAttr5;
    }

    public void setUpdXDelNotifyAttr5(boolean updXDelNotifyAttr5) {
        if (!this.updXDelNotifyAttr5 && updXDelNotifyAttr5) {
            throw new InternalException("Cannot directly set update flag updXDelNotifyAttr5; set value instead");
        }
        this.updXDelNotifyAttr5 = updXDelNotifyAttr5;
        if (!updXDelNotifyAttr5) {
            this.xDelNotifyAttr5 = null;
        }
    }

    @XmlElement(
            name = "X_HASDELROWFLAGDEF"
    )
    @Nullable
    public Boolean isxHasDelRowFlagDef() {
        return xHasDelRowFlagDef;
    }

    public GenEntityValueBuilder setxHasDelRowFlagDef(Boolean xHasDelRowFlagDef) {
        this.xHasDelRowFlagDef = Objects.requireNonNull(xHasDelRowFlagDef);
        this.updXHasDelRowFlagDef = true;
        return self();
    }

    public boolean isUpdXHasDelRowFlagDef() {
        return updXHasDelRowFlagDef;
    }

    public void setUpdXHasDelRowFlagDef(boolean updXHasDelRowFlagDef) {
        if (!this.updXHasDelRowFlagDef && updXHasDelRowFlagDef) {
            throw new InternalException("Cannot directly set update flag updXHasDelRowFlagDef; set value instead");
        }
        this.updXHasDelRowFlagDef = updXHasDelRowFlagDef;
        if (!updXHasDelRowFlagDef) {
            this.xHasDelRowFlagDef = null;
        }
    }

    @Override
    @Nonnull
    public GenEntityValueBuilder self() {
        return this;
    }

    @Override
    @Nonnull
    public GenEntityValueBuilder copy() {
        return new GenEntityValueBuilder(this);
    }

    @Override
    @Nonnull
    public GenEntityValue build() {
        return new GenEntityValue(Objects.requireNonNull(getId(), "ENTITY_ID must be specified for build")
                , Objects.requireNonNull(getNameNm(), "NAME_NM must be specified for build")
                , Objects.requireNonNull(getName(), "NAME must be specified for build")
                , Objects.requireNonNull(isObjectClass(), "OBJECTCLASS must be specified for build")
                , Objects.requireNonNull(isIsCustom(), "ISCUSTOM must be specified for build")
                , getTableNm()
                , getViewNm()
                , getKeyNm()
                , getTextTableNm()
                , getTextViewNm()
                , getTextKeyNm()
                , getTextAll()
                , getPgPackageNm()
                , getEpPackageNm()
                , getCpPackageNm()
                , getFpPackageNm()
                , getProperName()
                , getMasterId()
                , Objects.requireNonNull(getMasterType(), "MASTERTYPE must be specified for build")
                , getUserLockType()
                , getImportType()
                , getConfObj()
                , getBasePath()
                , Objects.requireNonNull(isIncompleteKey(), "INCOMPLETEKEY must be specified for build")
                , getConfObjAll()
                , getEntityGrpId()
                , getAncestorId()
                , getNote()
                , getCustomNote()
                , getStructureDoc()
                , getUsageDoc()
                , getBehaviourDoc()
                , getImplDoc()
                , Objects.requireNonNull(isIsUsed(), "ISUSED must be specified for build")
                , Objects.requireNonNull(isGetRightCustom(), "GETRIGHTCUSTOM must be specified for build")
                , getGetRightRestrId()
                , getGetOpTypeId()
                , getKeepDeleted()
                , getShortDesc()
                , getLongDesc()
                , Objects.requireNonNull(getxCopiedAttr0(), "X_COPIEDATTR0 must be specified for build")
                , Objects.requireNonNull(getxCopiedAttr1(), "X_COPIEDATTR1 must be specified for build")
                , Objects.requireNonNull(getxCopiedAttr2(), "X_COPIEDATTR2 must be specified for build")
                , Objects.requireNonNull(getxCopiedAttr3(), "X_COPIEDATTR3 must be specified for build")
                , Objects.requireNonNull(getxCopiedAttr4(), "X_COPIEDATTR4 must be specified for build")
                , Objects.requireNonNull(getxCopiedAttr5(), "X_COPIEDATTR5 must be specified for build")
                , Objects.requireNonNull(isxHasLiability(), "X_HASLIABILITY must be specified for build")
                , getUseConfObj()
                , getxUseConfObj()
                , Objects.requireNonNull(getxNotifyAttr0(), "X_NOTIFYATTR0 must be specified for build")
                , Objects.requireNonNull(getxNotifyAttr1(), "X_NOTIFYATTR1 must be specified for build")
                , Objects.requireNonNull(getxNotifyAttr2(), "X_NOTIFYATTR2 must be specified for build")
                , Objects.requireNonNull(getxNotifyAttr3(), "X_NOTIFYATTR3 must be specified for build")
                , Objects.requireNonNull(getxNotifyAttr4(), "X_NOTIFYATTR4 must be specified for build")
                , Objects.requireNonNull(getxNotifyAttr5(), "X_NOTIFYATTR5 must be specified for build")
                , Objects.requireNonNull(getxFlagDefInterest0(), "X_FLAGDEFINTEREST0 must be specified for build")
                , Objects.requireNonNull(getxFlagDefInterest1(), "X_FLAGDEFINTEREST1 must be specified for build")
                , Objects.requireNonNull(getxFlagDefInterest2(), "X_FLAGDEFINTEREST2 must be specified for build")
                , Objects.requireNonNull(getxFlagDefInterest3(), "X_FLAGDEFINTEREST3 must be specified for build")
                , Objects.requireNonNull(getxFlagDefInterest4(), "X_FLAGDEFINTEREST4 must be specified for build")
                , Objects.requireNonNull(getxFlagDefInterest5(), "X_FLAGDEFINTEREST5 must be specified for build")
                , Objects.requireNonNull(getxDelNotifyAttr0(), "X_DELNOTIFYATTR0 must be specified for build")
                , Objects.requireNonNull(getxDelNotifyAttr1(), "X_DELNOTIFYATTR1 must be specified for build")
                , Objects.requireNonNull(getxDelNotifyAttr2(), "X_DELNOTIFYATTR2 must be specified for build")
                , Objects.requireNonNull(getxDelNotifyAttr3(), "X_DELNOTIFYATTR3 must be specified for build")
                , Objects.requireNonNull(getxDelNotifyAttr4(), "X_DELNOTIFYATTR4 must be specified for build")
                , Objects.requireNonNull(getxDelNotifyAttr5(), "X_DELNOTIFYATTR5 must be specified for build")
                , Objects.requireNonNull(isxHasDelRowFlagDef(), "X_HASDELROWFLAGDEF must be specified for build")
        );
    }

    @Override
    @SuppressWarnings("squid:S1206")
    public boolean equals(@Nullable Object o) {
        if (this == o) return true;
        if (!(o instanceof GenEntityValueBuilder)) return false;
        if (!super.equals(o)) return false;
        GenEntityValueBuilder that = (GenEntityValueBuilder) o;
        return Objects.equals(name, that.name) &&
                (updName == that.updName) &&
                Objects.equals(objectClass, that.objectClass) &&
                (updObjectClass == that.updObjectClass) &&
                Objects.equals(isCustom, that.isCustom) &&
                (updIsCustom == that.updIsCustom) &&
                Objects.equals(tableNm, that.tableNm) &&
                (updTableNm == that.updTableNm) &&
                Objects.equals(viewNm, that.viewNm) &&
                (updViewNm == that.updViewNm) &&
                Objects.equals(keyNm, that.keyNm) &&
                (updKeyNm == that.updKeyNm) &&
                Objects.equals(textTableNm, that.textTableNm) &&
                (updTextTableNm == that.updTextTableNm) &&
                Objects.equals(textViewNm, that.textViewNm) &&
                (updTextViewNm == that.updTextViewNm) &&
                Objects.equals(textKeyNm, that.textKeyNm) &&
                (updTextKeyNm == that.updTextKeyNm) &&
                Objects.equals(textAll, that.textAll) &&
                (updTextAll == that.updTextAll) &&
                Objects.equals(pgPackageNm, that.pgPackageNm) &&
                (updPgPackageNm == that.updPgPackageNm) &&
                Objects.equals(epPackageNm, that.epPackageNm) &&
                (updEpPackageNm == that.updEpPackageNm) &&
                Objects.equals(cpPackageNm, that.cpPackageNm) &&
                (updCpPackageNm == that.updCpPackageNm) &&
                Objects.equals(fpPackageNm, that.fpPackageNm) &&
                (updFpPackageNm == that.updFpPackageNm) &&
                Objects.equals(properName, that.properName) &&
                (updProperName == that.updProperName) &&
                Objects.equals(masterId, that.masterId) &&
                (updMasterId == that.updMasterId) &&
                Objects.equals(masterType, that.masterType) &&
                (updMasterType == that.updMasterType) &&
                Objects.equals(userLockType, that.userLockType) &&
                (updUserLockType == that.updUserLockType) &&
                Objects.equals(importType, that.importType) &&
                (updImportType == that.updImportType) &&
                Objects.equals(confObj, that.confObj) &&
                (updConfObj == that.updConfObj) &&
                Objects.equals(basePath, that.basePath) &&
                (updBasePath == that.updBasePath) &&
                Objects.equals(incompleteKey, that.incompleteKey) &&
                (updIncompleteKey == that.updIncompleteKey) &&
                Objects.equals(confObjAll, that.confObjAll) &&
                (updConfObjAll == that.updConfObjAll) &&
                Objects.equals(entityGrpId, that.entityGrpId) &&
                (updEntityGrpId == that.updEntityGrpId) &&
                Objects.equals(ancestorId, that.ancestorId) &&
                (updAncestorId == that.updAncestorId) &&
                Objects.equals(note, that.note) &&
                (updNote == that.updNote) &&
                Objects.equals(customNote, that.customNote) &&
                (updCustomNote == that.updCustomNote) &&
                Objects.equals(structureDoc, that.structureDoc) &&
                (updStructureDoc == that.updStructureDoc) &&
                Objects.equals(usageDoc, that.usageDoc) &&
                (updUsageDoc == that.updUsageDoc) &&
                Objects.equals(behaviourDoc, that.behaviourDoc) &&
                (updBehaviourDoc == that.updBehaviourDoc) &&
                Objects.equals(implDoc, that.implDoc) &&
                (updImplDoc == that.updImplDoc) &&
                Objects.equals(isUsed, that.isUsed) &&
                (updIsUsed == that.updIsUsed) &&
                Objects.equals(getRightCustom, that.getRightCustom) &&
                (updGetRightCustom == that.updGetRightCustom) &&
                Objects.equals(getRightRestrId, that.getRightRestrId) &&
                (updGetRightRestrId == that.updGetRightRestrId) &&
                Objects.equals(getOpTypeId, that.getOpTypeId) &&
                (updGetOpTypeId == that.updGetOpTypeId) &&
                Objects.equals(keepDeleted, that.keepDeleted) &&
                (updKeepDeleted == that.updKeepDeleted) &&
                Objects.equals(shortDesc, that.shortDesc) &&
                (updShortDesc == that.updShortDesc) &&
                Objects.equals(longDesc, that.longDesc) &&
                (updLongDesc == that.updLongDesc) &&
                Objects.equals(xCopiedAttr0, that.xCopiedAttr0) &&
                (updXCopiedAttr0 == that.updXCopiedAttr0) &&
                Objects.equals(xCopiedAttr1, that.xCopiedAttr1) &&
                (updXCopiedAttr1 == that.updXCopiedAttr1) &&
                Objects.equals(xCopiedAttr2, that.xCopiedAttr2) &&
                (updXCopiedAttr2 == that.updXCopiedAttr2) &&
                Objects.equals(xCopiedAttr3, that.xCopiedAttr3) &&
                (updXCopiedAttr3 == that.updXCopiedAttr3) &&
                Objects.equals(xCopiedAttr4, that.xCopiedAttr4) &&
                (updXCopiedAttr4 == that.updXCopiedAttr4) &&
                Objects.equals(xCopiedAttr5, that.xCopiedAttr5) &&
                (updXCopiedAttr5 == that.updXCopiedAttr5) &&
                Objects.equals(xHasLiability, that.xHasLiability) &&
                (updXHasLiability == that.updXHasLiability) &&
                Objects.equals(useConfObj, that.useConfObj) &&
                (updUseConfObj == that.updUseConfObj) &&
                Objects.equals(xUseConfObj, that.xUseConfObj) &&
                (updXUseConfObj == that.updXUseConfObj) &&
                Objects.equals(xNotifyAttr0, that.xNotifyAttr0) &&
                (updXNotifyAttr0 == that.updXNotifyAttr0) &&
                Objects.equals(xNotifyAttr1, that.xNotifyAttr1) &&
                (updXNotifyAttr1 == that.updXNotifyAttr1) &&
                Objects.equals(xNotifyAttr2, that.xNotifyAttr2) &&
                (updXNotifyAttr2 == that.updXNotifyAttr2) &&
                Objects.equals(xNotifyAttr3, that.xNotifyAttr3) &&
                (updXNotifyAttr3 == that.updXNotifyAttr3) &&
                Objects.equals(xNotifyAttr4, that.xNotifyAttr4) &&
                (updXNotifyAttr4 == that.updXNotifyAttr4) &&
                Objects.equals(xNotifyAttr5, that.xNotifyAttr5) &&
                (updXNotifyAttr5 == that.updXNotifyAttr5) &&
                Objects.equals(xFlagDefInterest0, that.xFlagDefInterest0) &&
                (updXFlagDefInterest0 == that.updXFlagDefInterest0) &&
                Objects.equals(xFlagDefInterest1, that.xFlagDefInterest1) &&
                (updXFlagDefInterest1 == that.updXFlagDefInterest1) &&
                Objects.equals(xFlagDefInterest2, that.xFlagDefInterest2) &&
                (updXFlagDefInterest2 == that.updXFlagDefInterest2) &&
                Objects.equals(xFlagDefInterest3, that.xFlagDefInterest3) &&
                (updXFlagDefInterest3 == that.updXFlagDefInterest3) &&
                Objects.equals(xFlagDefInterest4, that.xFlagDefInterest4) &&
                (updXFlagDefInterest4 == that.updXFlagDefInterest4) &&
                Objects.equals(xFlagDefInterest5, that.xFlagDefInterest5) &&
                (updXFlagDefInterest5 == that.updXFlagDefInterest5) &&
                Objects.equals(xDelNotifyAttr0, that.xDelNotifyAttr0) &&
                (updXDelNotifyAttr0 == that.updXDelNotifyAttr0) &&
                Objects.equals(xDelNotifyAttr1, that.xDelNotifyAttr1) &&
                (updXDelNotifyAttr1 == that.updXDelNotifyAttr1) &&
                Objects.equals(xDelNotifyAttr2, that.xDelNotifyAttr2) &&
                (updXDelNotifyAttr2 == that.updXDelNotifyAttr2) &&
                Objects.equals(xDelNotifyAttr3, that.xDelNotifyAttr3) &&
                (updXDelNotifyAttr3 == that.updXDelNotifyAttr3) &&
                Objects.equals(xDelNotifyAttr4, that.xDelNotifyAttr4) &&
                (updXDelNotifyAttr4 == that.updXDelNotifyAttr4) &&
                Objects.equals(xDelNotifyAttr5, that.xDelNotifyAttr5) &&
                (updXDelNotifyAttr5 == that.updXDelNotifyAttr5) &&
                Objects.equals(xHasDelRowFlagDef, that.xHasDelRowFlagDef) &&
                (updXHasDelRowFlagDef == that.updXHasDelRowFlagDef);
    }

    @Override
    public String toString() {
        return "EntityValueBuilder{" +
                "  name ='" + name + '\'' +
                ", updName = " + updName +
                ", objectClass =" + objectClass +
                ", updObjectClass = " + updObjectClass +
                ", isCustom =" + isCustom +
                ", updIsCustom = " + updIsCustom +
                ", tableNm ='" + tableNm + '\'' +
                ", updTableNm = " + updTableNm +
                ", viewNm ='" + viewNm + '\'' +
                ", updViewNm = " + updViewNm +
                ", keyNm ='" + keyNm + '\'' +
                ", updKeyNm = " + updKeyNm +
                ", textTableNm ='" + textTableNm + '\'' +
                ", updTextTableNm = " + updTextTableNm +
                ", textViewNm ='" + textViewNm + '\'' +
                ", updTextViewNm = " + updTextViewNm +
                ", textKeyNm ='" + textKeyNm + '\'' +
                ", updTextKeyNm = " + updTextKeyNm +
                ", textAll =" + textAll +
                ", updTextAll = " + updTextAll +
                ", pgPackageNm ='" + pgPackageNm + '\'' +
                ", updPgPackageNm = " + updPgPackageNm +
                ", epPackageNm ='" + epPackageNm + '\'' +
                ", updEpPackageNm = " + updEpPackageNm +
                ", cpPackageNm ='" + cpPackageNm + '\'' +
                ", updCpPackageNm = " + updCpPackageNm +
                ", fpPackageNm ='" + fpPackageNm + '\'' +
                ", updFpPackageNm = " + updFpPackageNm +
                ", properName ='" + properName + '\'' +
                ", updProperName = " + updProperName +
                ", masterId =" + masterId +
                ", updMasterId = " + updMasterId +
                ", masterType =" + masterType +
                ", updMasterType = " + updMasterType +
                ", userLockType =" + userLockType +
                ", updUserLockType = " + updUserLockType +
                ", importType =" + importType +
                ", updImportType = " + updImportType +
                ", confObj =" + confObj +
                ", updConfObj = " + updConfObj +
                ", basePath ='" + basePath + '\'' +
                ", updBasePath = " + updBasePath +
                ", incompleteKey =" + incompleteKey +
                ", updIncompleteKey = " + updIncompleteKey +
                ", confObjAll =" + confObjAll +
                ", updConfObjAll = " + updConfObjAll +
                ", entityGrpId =" + entityGrpId +
                ", updEntityGrpId = " + updEntityGrpId +
                ", ancestorId =" + ancestorId +
                ", updAncestorId = " + updAncestorId +
                ", note ='" + note + '\'' +
                ", updNote = " + updNote +
                ", customNote ='" + customNote + '\'' +
                ", updCustomNote = " + updCustomNote +
                ", structureDoc ='" + structureDoc + '\'' +
                ", updStructureDoc = " + updStructureDoc +
                ", usageDoc ='" + usageDoc + '\'' +
                ", updUsageDoc = " + updUsageDoc +
                ", behaviourDoc ='" + behaviourDoc + '\'' +
                ", updBehaviourDoc = " + updBehaviourDoc +
                ", implDoc ='" + implDoc + '\'' +
                ", updImplDoc = " + updImplDoc +
                ", isUsed =" + isUsed +
                ", updIsUsed = " + updIsUsed +
                ", getRightCustom =" + getRightCustom +
                ", updGetRightCustom = " + updGetRightCustom +
                ", getRightRestrId =" + getRightRestrId +
                ", updGetRightRestrId = " + updGetRightRestrId +
                ", getOpTypeId =" + getOpTypeId +
                ", updGetOpTypeId = " + updGetOpTypeId +
                ", keepDeleted =" + keepDeleted +
                ", updKeepDeleted = " + updKeepDeleted +
                ", shortDesc ='" + shortDesc + '\'' +
                ", updShortDesc = " + updShortDesc +
                ", longDesc ='" + longDesc + '\'' +
                ", updLongDesc = " + updLongDesc +
                ", xCopiedAttr0 =" + xCopiedAttr0 +
                ", updXCopiedAttr0 = " + updXCopiedAttr0 +
                ", xCopiedAttr1 =" + xCopiedAttr1 +
                ", updXCopiedAttr1 = " + updXCopiedAttr1 +
                ", xCopiedAttr2 =" + xCopiedAttr2 +
                ", updXCopiedAttr2 = " + updXCopiedAttr2 +
                ", xCopiedAttr3 =" + xCopiedAttr3 +
                ", updXCopiedAttr3 = " + updXCopiedAttr3 +
                ", xCopiedAttr4 =" + xCopiedAttr4 +
                ", updXCopiedAttr4 = " + updXCopiedAttr4 +
                ", xCopiedAttr5 =" + xCopiedAttr5 +
                ", updXCopiedAttr5 = " + updXCopiedAttr5 +
                ", xHasLiability =" + xHasLiability +
                ", updXHasLiability = " + updXHasLiability +
                ", useConfObj =" + useConfObj +
                ", updUseConfObj = " + updUseConfObj +
                ", xUseConfObj =" + xUseConfObj +
                ", updXUseConfObj = " + updXUseConfObj +
                ", xNotifyAttr0 =" + xNotifyAttr0 +
                ", updXNotifyAttr0 = " + updXNotifyAttr0 +
                ", xNotifyAttr1 =" + xNotifyAttr1 +
                ", updXNotifyAttr1 = " + updXNotifyAttr1 +
                ", xNotifyAttr2 =" + xNotifyAttr2 +
                ", updXNotifyAttr2 = " + updXNotifyAttr2 +
                ", xNotifyAttr3 =" + xNotifyAttr3 +
                ", updXNotifyAttr3 = " + updXNotifyAttr3 +
                ", xNotifyAttr4 =" + xNotifyAttr4 +
                ", updXNotifyAttr4 = " + updXNotifyAttr4 +
                ", xNotifyAttr5 =" + xNotifyAttr5 +
                ", updXNotifyAttr5 = " + updXNotifyAttr5 +
                ", xFlagDefInterest0 =" + xFlagDefInterest0 +
                ", updXFlagDefInterest0 = " + updXFlagDefInterest0 +
                ", xFlagDefInterest1 =" + xFlagDefInterest1 +
                ", updXFlagDefInterest1 = " + updXFlagDefInterest1 +
                ", xFlagDefInterest2 =" + xFlagDefInterest2 +
                ", updXFlagDefInterest2 = " + updXFlagDefInterest2 +
                ", xFlagDefInterest3 =" + xFlagDefInterest3 +
                ", updXFlagDefInterest3 = " + updXFlagDefInterest3 +
                ", xFlagDefInterest4 =" + xFlagDefInterest4 +
                ", updXFlagDefInterest4 = " + updXFlagDefInterest4 +
                ", xFlagDefInterest5 =" + xFlagDefInterest5 +
                ", updXFlagDefInterest5 = " + updXFlagDefInterest5 +
                ", xDelNotifyAttr0 =" + xDelNotifyAttr0 +
                ", updXDelNotifyAttr0 = " + updXDelNotifyAttr0 +
                ", xDelNotifyAttr1 =" + xDelNotifyAttr1 +
                ", updXDelNotifyAttr1 = " + updXDelNotifyAttr1 +
                ", xDelNotifyAttr2 =" + xDelNotifyAttr2 +
                ", updXDelNotifyAttr2 = " + updXDelNotifyAttr2 +
                ", xDelNotifyAttr3 =" + xDelNotifyAttr3 +
                ", updXDelNotifyAttr3 = " + updXDelNotifyAttr3 +
                ", xDelNotifyAttr4 =" + xDelNotifyAttr4 +
                ", updXDelNotifyAttr4 = " + updXDelNotifyAttr4 +
                ", xDelNotifyAttr5 =" + xDelNotifyAttr5 +
                ", updXDelNotifyAttr5 = " + updXDelNotifyAttr5 +
                ", xHasDelRowFlagDef =" + xHasDelRowFlagDef +
                ", updXHasDelRowFlagDef = " + updXHasDelRowFlagDef +
                "} " + super.toString();
    }
}