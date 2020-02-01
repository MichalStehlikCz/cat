package com.provys.catalogue.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.provys.common.datatype.DtUid;
import com.provys.provysobject.impl.ProvysObjectValue;
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

@Generated("com.provys.provysobject.generator.impl.GeneratorEntity")
@SuppressWarnings("ValidExternallyBoundObject")
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(
        propOrder = {"id", "entityId", "nameNm", "name", "note", "attrType", "isCustom", "isUsed", "attrGrpId", "ord", "domainId", "subdomainNm", "properNameRoot", "mandatory", "ordered", "ordGroup", "defValue", "multiCreate", "genCopy", "genMove", "genDelete", "textSrcId", "hierarchical", "isInTable", "isOwn", "validated", "qVisible", "lLength", "indexed", "upNameNm", "readOnly", "getOpTypeId", "setOpTypeId", "resetOpTypeId", "confirmOther", "setOtherOpTypeId", "multivalue", "logAllowed", "logLevel", "dictType", "dictDel1", "dictDel2", "tbCodeCd", "accountRuleNm", "accDocObjectFormulaId", "ownerFormulaId", "fromObjectFormulaId", "toObjectFormulaId", "approxRecord", "valueAccountNm", "valueAmountType", "defOwner", "documentation", "bitmapOrd", "xIsFlagDepBind", "xIsFlagDefAttr", "copied", "keyOrd", "opTypeTypeRf", "imgSrcId", "imgWidth", "imgHeight", "fileServerId", "genMigr", "evalCValue", "optLobLimit", "manLobLimit"}
)
@XmlRootElement(
        name = "ATTR"
)
public class GenAttrValue extends ProvysObjectValue {
    @XmlElement(
            name = "ENTITY_ID"
    )
    @Nonnull
    private final DtUid entityId;

    @XmlElement(
            name = "NAME_NM"
    )
    @Nonnull
    private final String nameNm;

    @XmlElement(
            name = "NAME"
    )
    @Nonnull
    private final String name;

    @XmlElement(
            name = "NOTE"
    )
    @Nullable
    private final String note;

    @XmlElement(
            name = "ATTRTYPE"
    )
    private final char attrType;

    @XmlElement(
            name = "ISCUSTOM"
    )
    private final boolean isCustom;

    @XmlElement(
            name = "ISUSED"
    )
    private final boolean isUsed;

    @XmlElement(
            name = "ATTRGRP_ID"
    )
    @Nullable
    private final DtUid attrGrpId;

    @XmlElement(
            name = "ORD"
    )
    private final double ord;

    @XmlElement(
            name = "DOMAIN_ID"
    )
    @Nonnull
    private final DtUid domainId;

    @XmlElement(
            name = "SUBDOMAIN_NM"
    )
    @Nullable
    private final String subdomainNm;

    @XmlElement(
            name = "PROPERNAMEROOT"
    )
    @Nullable
    private final String properNameRoot;

    @XmlElement(
            name = "MANDATORY"
    )
    private final boolean mandatory;

    @XmlElement(
            name = "ORDERED"
    )
    private final boolean ordered;

    @XmlElement(
            name = "ORDGROUP"
    )
    @Nullable
    private final String ordGroup;

    @XmlElement(
            name = "DEFVALUE"
    )
    @Nullable
    private final String defValue;

    @XmlElement(
            name = "MULTICREATE"
    )
    private final boolean multiCreate;

    @XmlElement(
            name = "GENCOPY"
    )
    private final boolean genCopy;

    @XmlElement(
            name = "GENMOVE"
    )
    private final boolean genMove;

    @XmlElement(
            name = "GENDELETE"
    )
    private final boolean genDelete;

    @XmlElement(
            name = "TEXTSRC_ID"
    )
    @Nullable
    private final DtUid textSrcId;

    @XmlElement(
            name = "HIERARCHICAL"
    )
    private final boolean hierarchical;

    @XmlElement(
            name = "ISINTABLE"
    )
    private final boolean isInTable;

    @XmlElement(
            name = "ISOWN"
    )
    private final boolean isOwn;

    @XmlElement(
            name = "VALIDATED"
    )
    private final boolean validated;

    @XmlElement(
            name = "QVISIBLE"
    )
    private final boolean qVisible;

    @XmlElement(
            name = "LLENGTH"
    )
    @Nullable
    private final Double lLength;

    @XmlElement(
            name = "INDEXED"
    )
    private final boolean indexed;

    @XmlElement(
            name = "UPNAME_NM"
    )
    @Nullable
    private final String upNameNm;

    @XmlElement(
            name = "READONLY"
    )
    private final boolean readOnly;

    @XmlElement(
            name = "GETOPTYPE_ID"
    )
    @Nullable
    private final DtUid getOpTypeId;

    @XmlElement(
            name = "SETOPTYPE_ID"
    )
    @Nullable
    private final DtUid setOpTypeId;

    @XmlElement(
            name = "RESETOPTYPE_ID"
    )
    @Nullable
    private final DtUid resetOpTypeId;

    @XmlElement(
            name = "CONFIRMOTHER"
    )
    @Nullable
    private final Boolean confirmOther;

    @XmlElement(
            name = "SETOTHEROPTYPE_ID"
    )
    @Nullable
    private final DtUid setOtherOpTypeId;

    @XmlElement(
            name = "MULTIVALUE"
    )
    private final boolean multivalue;

    @XmlElement(
            name = "LOGALLOWED"
    )
    private final boolean logAllowed;

    @XmlElement(
            name = "LOGLEVEL"
    )
    private final char logLevel;

    @XmlElement(
            name = "DICTTYPE"
    )
    @Nullable
    private final Character dictType;

    @XmlElement(
            name = "DICTDEL1"
    )
    @Nullable
    private final String dictDel1;

    @XmlElement(
            name = "DICTDEL2"
    )
    @Nullable
    private final String dictDel2;

    @XmlElement(
            name = "TBCODE_CD"
    )
    @Nullable
    private final String tbCodeCd;

    @XmlElement(
            name = "ACCOUNTRULE_NM"
    )
    @Nullable
    private final String accountRuleNm;

    @XmlElement(
            name = "ACCDOCOBJECTFORMULA_ID"
    )
    @Nullable
    private final DtUid accDocObjectFormulaId;

    @XmlElement(
            name = "OWNERFORMULA_ID"
    )
    @Nullable
    private final DtUid ownerFormulaId;

    @XmlElement(
            name = "FROMOBJECTFORMULA_ID"
    )
    @Nullable
    private final DtUid fromObjectFormulaId;

    @XmlElement(
            name = "TOOBJECTFORMULA_ID"
    )
    @Nullable
    private final DtUid toObjectFormulaId;

    @XmlElement(
            name = "APPROXRECORD"
    )
    @Nullable
    private final Boolean approxRecord;

    @XmlElement(
            name = "VALUEACCOUNT_NM"
    )
    @Nullable
    private final String valueAccountNm;

    @XmlElement(
            name = "VALUEAMOUNTTYPE"
    )
    @Nullable
    private final Character valueAmountType;

    @XmlElement(
            name = "DEFOWNER"
    )
    private final boolean defOwner;

    @XmlElement(
            name = "DOCUMENTATION"
    )
    @Nullable
    private final String documentation;

    @XmlElement(
            name = "BITMAPORD"
    )
    @Nullable
    private final Integer bitmapOrd;

    @XmlElement(
            name = "X_ISFLAGDEPBIND"
    )
    private final char xIsFlagDepBind;

    @XmlElement(
            name = "X_ISFLAGDEFATTR"
    )
    private final boolean xIsFlagDefAttr;

    @XmlElement(
            name = "COPIED"
    )
    private final char copied;

    @XmlElement(
            name = "KEYORD"
    )
    @Nullable
    private final Double keyOrd;

    @XmlElement(
            name = "OPTYPETYPE_RF"
    )
    @Nullable
    private final DtUid opTypeTypeRf;

    @XmlElement(
            name = "IMGSRC_ID"
    )
    @Nullable
    private final DtUid imgSrcId;

    @XmlElement(
            name = "IMGWIDTH"
    )
    @Nullable
    private final Double imgWidth;

    @XmlElement(
            name = "IMGHEIGHT"
    )
    @Nullable
    private final Double imgHeight;

    @XmlElement(
            name = "FILESERVER_ID"
    )
    @Nullable
    private final DtUid fileServerId;

    @XmlElement(
            name = "GENMIGR"
    )
    @Nullable
    private final Boolean genMigr;

    @XmlElement(
            name = "EVALCVALUE"
    )
    @Nullable
    private final Boolean evalCValue;

    @XmlElement(
            name = "OPTLOBLIMIT"
    )
    @Nullable
    private final Double optLobLimit;

    @XmlElement(
            name = "MANLOBLIMIT"
    )
    @Nullable
    private final Double manLobLimit;

    @JsonCreator
    public GenAttrValue(@JsonProperty("ATTR_ID") DtUid id,
            @JsonProperty("ENTITY_ID") DtUid entityId, @JsonProperty("NAME_NM") String nameNm,
            @JsonProperty("NAME") String name, @JsonProperty("NOTE") @Nullable String note,
            @JsonProperty("ATTRTYPE") char attrType, @JsonProperty("ISCUSTOM") boolean isCustom,
            @JsonProperty("ISUSED") boolean isUsed,
            @JsonProperty("ATTRGRP_ID") @Nullable DtUid attrGrpId, @JsonProperty("ORD") double ord,
            @JsonProperty("DOMAIN_ID") DtUid domainId,
            @JsonProperty("SUBDOMAIN_NM") @Nullable String subdomainNm,
            @JsonProperty("PROPERNAMEROOT") @Nullable String properNameRoot,
            @JsonProperty("MANDATORY") boolean mandatory, @JsonProperty("ORDERED") boolean ordered,
            @JsonProperty("ORDGROUP") @Nullable String ordGroup,
            @JsonProperty("DEFVALUE") @Nullable String defValue,
            @JsonProperty("MULTICREATE") boolean multiCreate,
            @JsonProperty("GENCOPY") boolean genCopy, @JsonProperty("GENMOVE") boolean genMove,
            @JsonProperty("GENDELETE") boolean genDelete,
            @JsonProperty("TEXTSRC_ID") @Nullable DtUid textSrcId,
            @JsonProperty("HIERARCHICAL") boolean hierarchical,
            @JsonProperty("ISINTABLE") boolean isInTable, @JsonProperty("ISOWN") boolean isOwn,
            @JsonProperty("VALIDATED") boolean validated,
            @JsonProperty("QVISIBLE") boolean qVisible,
            @JsonProperty("LLENGTH") @Nullable Double lLength,
            @JsonProperty("INDEXED") boolean indexed,
            @JsonProperty("UPNAME_NM") @Nullable String upNameNm,
            @JsonProperty("READONLY") boolean readOnly,
            @JsonProperty("GETOPTYPE_ID") @Nullable DtUid getOpTypeId,
            @JsonProperty("SETOPTYPE_ID") @Nullable DtUid setOpTypeId,
            @JsonProperty("RESETOPTYPE_ID") @Nullable DtUid resetOpTypeId,
            @JsonProperty("CONFIRMOTHER") @Nullable Boolean confirmOther,
            @JsonProperty("SETOTHEROPTYPE_ID") @Nullable DtUid setOtherOpTypeId,
            @JsonProperty("MULTIVALUE") boolean multivalue,
            @JsonProperty("LOGALLOWED") boolean logAllowed, @JsonProperty("LOGLEVEL") char logLevel,
            @JsonProperty("DICTTYPE") @Nullable Character dictType,
            @JsonProperty("DICTDEL1") @Nullable String dictDel1,
            @JsonProperty("DICTDEL2") @Nullable String dictDel2,
            @JsonProperty("TBCODE_CD") @Nullable String tbCodeCd,
            @JsonProperty("ACCOUNTRULE_NM") @Nullable String accountRuleNm,
            @JsonProperty("ACCDOCOBJECTFORMULA_ID") @Nullable DtUid accDocObjectFormulaId,
            @JsonProperty("OWNERFORMULA_ID") @Nullable DtUid ownerFormulaId,
            @JsonProperty("FROMOBJECTFORMULA_ID") @Nullable DtUid fromObjectFormulaId,
            @JsonProperty("TOOBJECTFORMULA_ID") @Nullable DtUid toObjectFormulaId,
            @JsonProperty("APPROXRECORD") @Nullable Boolean approxRecord,
            @JsonProperty("VALUEACCOUNT_NM") @Nullable String valueAccountNm,
            @JsonProperty("VALUEAMOUNTTYPE") @Nullable Character valueAmountType,
            @JsonProperty("DEFOWNER") boolean defOwner,
            @JsonProperty("DOCUMENTATION") @Nullable String documentation,
            @JsonProperty("BITMAPORD") @Nullable Integer bitmapOrd,
            @JsonProperty("X_ISFLAGDEPBIND") char xIsFlagDepBind,
            @JsonProperty("X_ISFLAGDEFATTR") boolean xIsFlagDefAttr,
            @JsonProperty("COPIED") char copied, @JsonProperty("KEYORD") @Nullable Double keyOrd,
            @JsonProperty("OPTYPETYPE_RF") @Nullable DtUid opTypeTypeRf,
            @JsonProperty("IMGSRC_ID") @Nullable DtUid imgSrcId,
            @JsonProperty("IMGWIDTH") @Nullable Double imgWidth,
            @JsonProperty("IMGHEIGHT") @Nullable Double imgHeight,
            @JsonProperty("FILESERVER_ID") @Nullable DtUid fileServerId,
            @JsonProperty("GENMIGR") @Nullable Boolean genMigr,
            @JsonProperty("EVALCVALUE") @Nullable Boolean evalCValue,
            @JsonProperty("OPTLOBLIMIT") @Nullable Double optLobLimit,
            @JsonProperty("MANLOBLIMIT") @Nullable Double manLobLimit) {
        super(id);
        this.entityId = Objects.requireNonNull(entityId);
        this.nameNm = Objects.requireNonNull(nameNm);
        this.name = Objects.requireNonNull(name);
        this.note = note;
        this.attrType = attrType;
        this.isCustom = isCustom;
        this.isUsed = isUsed;
        this.attrGrpId = attrGrpId;
        this.ord = ord;
        this.domainId = Objects.requireNonNull(domainId);
        this.subdomainNm = subdomainNm;
        this.properNameRoot = properNameRoot;
        this.mandatory = mandatory;
        this.ordered = ordered;
        this.ordGroup = ordGroup;
        this.defValue = defValue;
        this.multiCreate = multiCreate;
        this.genCopy = genCopy;
        this.genMove = genMove;
        this.genDelete = genDelete;
        this.textSrcId = textSrcId;
        this.hierarchical = hierarchical;
        this.isInTable = isInTable;
        this.isOwn = isOwn;
        this.validated = validated;
        this.qVisible = qVisible;
        this.lLength = lLength;
        this.indexed = indexed;
        this.upNameNm = upNameNm;
        this.readOnly = readOnly;
        this.getOpTypeId = getOpTypeId;
        this.setOpTypeId = setOpTypeId;
        this.resetOpTypeId = resetOpTypeId;
        this.confirmOther = confirmOther;
        this.setOtherOpTypeId = setOtherOpTypeId;
        this.multivalue = multivalue;
        this.logAllowed = logAllowed;
        this.logLevel = logLevel;
        this.dictType = dictType;
        this.dictDel1 = dictDel1;
        this.dictDel2 = dictDel2;
        this.tbCodeCd = tbCodeCd;
        this.accountRuleNm = accountRuleNm;
        this.accDocObjectFormulaId = accDocObjectFormulaId;
        this.ownerFormulaId = ownerFormulaId;
        this.fromObjectFormulaId = fromObjectFormulaId;
        this.toObjectFormulaId = toObjectFormulaId;
        this.approxRecord = approxRecord;
        this.valueAccountNm = valueAccountNm;
        this.valueAmountType = valueAmountType;
        this.defOwner = defOwner;
        this.documentation = documentation;
        this.bitmapOrd = bitmapOrd;
        this.xIsFlagDepBind = xIsFlagDepBind;
        this.xIsFlagDefAttr = xIsFlagDefAttr;
        this.copied = copied;
        this.keyOrd = keyOrd;
        this.opTypeTypeRf = opTypeTypeRf;
        this.imgSrcId = imgSrcId;
        this.imgWidth = imgWidth;
        this.imgHeight = imgHeight;
        this.fileServerId = fileServerId;
        this.genMigr = genMigr;
        this.evalCValue = evalCValue;
        this.optLobLimit = optLobLimit;
        this.manLobLimit = manLobLimit;
    }

    @XmlElement(
            name = "ATTR_ID"
    )
    @Nonnull
    @Override
    public DtUid getId() {
        return super.getId();
    }

    @Nonnull
    public DtUid getEntityId() {
        return entityId;
    }

    @Nonnull
    public String getNameNm() {
        return nameNm;
    }

    @Nonnull
    public String getName() {
        return name;
    }

    @Nonnull
    public Optional<String> getNote() {
        return Optional.ofNullable(note);
    }

    public char getAttrType() {
        return attrType;
    }

    public boolean isIsCustom() {
        return isCustom;
    }

    public boolean isIsUsed() {
        return isUsed;
    }

    @Nonnull
    public Optional<DtUid> getAttrGrpId() {
        return Optional.ofNullable(attrGrpId);
    }

    public double getOrd() {
        return ord;
    }

    @Nonnull
    public DtUid getDomainId() {
        return domainId;
    }

    @Nonnull
    public Optional<String> getSubdomainNm() {
        return Optional.ofNullable(subdomainNm);
    }

    @Nonnull
    public Optional<String> getProperNameRoot() {
        return Optional.ofNullable(properNameRoot);
    }

    public boolean isMandatory() {
        return mandatory;
    }

    public boolean isOrdered() {
        return ordered;
    }

    @Nonnull
    public Optional<String> getOrdGroup() {
        return Optional.ofNullable(ordGroup);
    }

    @Nonnull
    public Optional<String> getDefValue() {
        return Optional.ofNullable(defValue);
    }

    public boolean isMultiCreate() {
        return multiCreate;
    }

    public boolean isGenCopy() {
        return genCopy;
    }

    public boolean isGenMove() {
        return genMove;
    }

    public boolean isGenDelete() {
        return genDelete;
    }

    @Nonnull
    public Optional<DtUid> getTextSrcId() {
        return Optional.ofNullable(textSrcId);
    }

    public boolean isHierarchical() {
        return hierarchical;
    }

    public boolean isIsInTable() {
        return isInTable;
    }

    public boolean isIsOwn() {
        return isOwn;
    }

    public boolean isValidated() {
        return validated;
    }

    public boolean isqVisible() {
        return qVisible;
    }

    @Nonnull
    public Optional<Double> getlLength() {
        return Optional.ofNullable(lLength);
    }

    public boolean isIndexed() {
        return indexed;
    }

    @Nonnull
    public Optional<String> getUpNameNm() {
        return Optional.ofNullable(upNameNm);
    }

    public boolean isReadOnly() {
        return readOnly;
    }

    @Nonnull
    public Optional<DtUid> getGetOpTypeId() {
        return Optional.ofNullable(getOpTypeId);
    }

    @Nonnull
    public Optional<DtUid> getSetOpTypeId() {
        return Optional.ofNullable(setOpTypeId);
    }

    @Nonnull
    public Optional<DtUid> getResetOpTypeId() {
        return Optional.ofNullable(resetOpTypeId);
    }

    @Nonnull
    public Optional<Boolean> isConfirmOther() {
        return Optional.ofNullable(confirmOther);
    }

    @Nonnull
    public Optional<DtUid> getSetOtherOpTypeId() {
        return Optional.ofNullable(setOtherOpTypeId);
    }

    public boolean isMultivalue() {
        return multivalue;
    }

    public boolean isLogAllowed() {
        return logAllowed;
    }

    public char getLogLevel() {
        return logLevel;
    }

    @Nonnull
    public Optional<Character> getDictType() {
        return Optional.ofNullable(dictType);
    }

    @Nonnull
    public Optional<String> getDictDel1() {
        return Optional.ofNullable(dictDel1);
    }

    @Nonnull
    public Optional<String> getDictDel2() {
        return Optional.ofNullable(dictDel2);
    }

    @Nonnull
    public Optional<String> getTbCodeCd() {
        return Optional.ofNullable(tbCodeCd);
    }

    @Nonnull
    public Optional<String> getAccountRuleNm() {
        return Optional.ofNullable(accountRuleNm);
    }

    @Nonnull
    public Optional<DtUid> getAccDocObjectFormulaId() {
        return Optional.ofNullable(accDocObjectFormulaId);
    }

    @Nonnull
    public Optional<DtUid> getOwnerFormulaId() {
        return Optional.ofNullable(ownerFormulaId);
    }

    @Nonnull
    public Optional<DtUid> getFromObjectFormulaId() {
        return Optional.ofNullable(fromObjectFormulaId);
    }

    @Nonnull
    public Optional<DtUid> getToObjectFormulaId() {
        return Optional.ofNullable(toObjectFormulaId);
    }

    @Nonnull
    public Optional<Boolean> isApproxRecord() {
        return Optional.ofNullable(approxRecord);
    }

    @Nonnull
    public Optional<String> getValueAccountNm() {
        return Optional.ofNullable(valueAccountNm);
    }

    @Nonnull
    public Optional<Character> getValueAmountType() {
        return Optional.ofNullable(valueAmountType);
    }

    public boolean isDefOwner() {
        return defOwner;
    }

    @Nonnull
    public Optional<String> getDocumentation() {
        return Optional.ofNullable(documentation);
    }

    @Nonnull
    public Optional<Integer> getBitmapOrd() {
        return Optional.ofNullable(bitmapOrd);
    }

    public char getxIsFlagDepBind() {
        return xIsFlagDepBind;
    }

    public boolean isxIsFlagDefAttr() {
        return xIsFlagDefAttr;
    }

    public char getCopied() {
        return copied;
    }

    @Nonnull
    public Optional<Double> getKeyOrd() {
        return Optional.ofNullable(keyOrd);
    }

    @Nonnull
    public Optional<DtUid> getOpTypeTypeRf() {
        return Optional.ofNullable(opTypeTypeRf);
    }

    @Nonnull
    public Optional<DtUid> getImgSrcId() {
        return Optional.ofNullable(imgSrcId);
    }

    @Nonnull
    public Optional<Double> getImgWidth() {
        return Optional.ofNullable(imgWidth);
    }

    @Nonnull
    public Optional<Double> getImgHeight() {
        return Optional.ofNullable(imgHeight);
    }

    @Nonnull
    public Optional<DtUid> getFileServerId() {
        return Optional.ofNullable(fileServerId);
    }

    @Nonnull
    public Optional<Boolean> isGenMigr() {
        return Optional.ofNullable(genMigr);
    }

    @Nonnull
    public Optional<Boolean> isEvalCValue() {
        return Optional.ofNullable(evalCValue);
    }

    @Nonnull
    public Optional<Double> getOptLobLimit() {
        return Optional.ofNullable(optLobLimit);
    }

    @Nonnull
    public Optional<Double> getManLobLimit() {
        return Optional.ofNullable(manLobLimit);
    }

    @Override
    @SuppressWarnings("squid:S1206")
    public boolean equals(@Nullable Object o) {
        if (this == o) return true;
        if (!(o instanceof GenAttrValue)) return false;
        if (!super.equals(o)) return false;
        GenAttrValue that = (GenAttrValue) o;
        return entityId.equals(that.entityId) &&
                nameNm.equals(that.nameNm) &&
                name.equals(that.name) &&
                Objects.equals(note, that.note) &&
                attrType == that.attrType &&
                isCustom == that.isCustom &&
                isUsed == that.isUsed &&
                Objects.equals(attrGrpId, that.attrGrpId) &&
                ord == that.ord &&
                domainId.equals(that.domainId) &&
                Objects.equals(subdomainNm, that.subdomainNm) &&
                Objects.equals(properNameRoot, that.properNameRoot) &&
                mandatory == that.mandatory &&
                ordered == that.ordered &&
                Objects.equals(ordGroup, that.ordGroup) &&
                Objects.equals(defValue, that.defValue) &&
                multiCreate == that.multiCreate &&
                genCopy == that.genCopy &&
                genMove == that.genMove &&
                genDelete == that.genDelete &&
                Objects.equals(textSrcId, that.textSrcId) &&
                hierarchical == that.hierarchical &&
                isInTable == that.isInTable &&
                isOwn == that.isOwn &&
                validated == that.validated &&
                qVisible == that.qVisible &&
                Objects.equals(lLength, that.lLength) &&
                indexed == that.indexed &&
                Objects.equals(upNameNm, that.upNameNm) &&
                readOnly == that.readOnly &&
                Objects.equals(getOpTypeId, that.getOpTypeId) &&
                Objects.equals(setOpTypeId, that.setOpTypeId) &&
                Objects.equals(resetOpTypeId, that.resetOpTypeId) &&
                Objects.equals(confirmOther, that.confirmOther) &&
                Objects.equals(setOtherOpTypeId, that.setOtherOpTypeId) &&
                multivalue == that.multivalue &&
                logAllowed == that.logAllowed &&
                logLevel == that.logLevel &&
                Objects.equals(dictType, that.dictType) &&
                Objects.equals(dictDel1, that.dictDel1) &&
                Objects.equals(dictDel2, that.dictDel2) &&
                Objects.equals(tbCodeCd, that.tbCodeCd) &&
                Objects.equals(accountRuleNm, that.accountRuleNm) &&
                Objects.equals(accDocObjectFormulaId, that.accDocObjectFormulaId) &&
                Objects.equals(ownerFormulaId, that.ownerFormulaId) &&
                Objects.equals(fromObjectFormulaId, that.fromObjectFormulaId) &&
                Objects.equals(toObjectFormulaId, that.toObjectFormulaId) &&
                Objects.equals(approxRecord, that.approxRecord) &&
                Objects.equals(valueAccountNm, that.valueAccountNm) &&
                Objects.equals(valueAmountType, that.valueAmountType) &&
                defOwner == that.defOwner &&
                Objects.equals(documentation, that.documentation) &&
                Objects.equals(bitmapOrd, that.bitmapOrd) &&
                xIsFlagDepBind == that.xIsFlagDepBind &&
                xIsFlagDefAttr == that.xIsFlagDefAttr &&
                copied == that.copied &&
                Objects.equals(keyOrd, that.keyOrd) &&
                Objects.equals(opTypeTypeRf, that.opTypeTypeRf) &&
                Objects.equals(imgSrcId, that.imgSrcId) &&
                Objects.equals(imgWidth, that.imgWidth) &&
                Objects.equals(imgHeight, that.imgHeight) &&
                Objects.equals(fileServerId, that.fileServerId) &&
                Objects.equals(genMigr, that.genMigr) &&
                Objects.equals(evalCValue, that.evalCValue) &&
                Objects.equals(optLobLimit, that.optLobLimit) &&
                Objects.equals(manLobLimit, that.manLobLimit);
    }
}
