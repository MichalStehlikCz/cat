package com.provys.catalogue.impl;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.provys.common.datatype.DtUid;
import com.provys.common.exception.InternalException;
import com.provys.provysobject.impl.ProvysObjectValueBuilder;
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
        date = "2020-01-14T15:07:00.839981"
)
@XmlRootElement(
        name = "ATTR"
)
@XmlAccessorType(XmlAccessType.NONE)
@JsonSerialize(
        using = GenAttrValueBuilderSerializer.class
)
@SuppressWarnings({"WeakerAccess", "unused", "UnusedReturnValue"})
public class GenAttrValueBuilder extends ProvysObjectValueBuilder<GenAttrValueBuilder, GenAttrValue> {
    @Nullable
    private DtUid entityId;

    private boolean updEntityId = false;

    @Nullable
    private String nameNm;

    private boolean updNameNm = false;

    @Nullable
    private String name;

    private boolean updName = false;

    @Nullable
    private String note;

    private boolean updNote = false;

    @Nullable
    private Character attrType;

    private boolean updAttrType = false;

    @Nullable
    private Boolean isCustom;

    private boolean updIsCustom = false;

    @Nullable
    private Boolean isUsed;

    private boolean updIsUsed = false;

    @Nullable
    private DtUid attrGrpId;

    private boolean updAttrGrpId = false;

    @Nullable
    private Double ord;

    private boolean updOrd = false;

    @Nullable
    private DtUid domainId;

    private boolean updDomainId = false;

    @Nullable
    private String subdomainNm;

    private boolean updSubdomainNm = false;

    @Nullable
    private String properNameRoot;

    private boolean updProperNameRoot = false;

    @Nullable
    private Boolean mandatory;

    private boolean updMandatory = false;

    @Nullable
    private Boolean ordered;

    private boolean updOrdered = false;

    @Nullable
    private String ordGroup;

    private boolean updOrdGroup = false;

    @Nullable
    private String defValue;

    private boolean updDefValue = false;

    @Nullable
    private Boolean multiCreate;

    private boolean updMultiCreate = false;

    @Nullable
    private Boolean genCopy;

    private boolean updGenCopy = false;

    @Nullable
    private Boolean genMove;

    private boolean updGenMove = false;

    @Nullable
    private Boolean genDelete;

    private boolean updGenDelete = false;

    @Nullable
    private DtUid textSrcId;

    private boolean updTextSrcId = false;

    @Nullable
    private Boolean hierarchical;

    private boolean updHierarchical = false;

    @Nullable
    private Boolean isInTable;

    private boolean updIsInTable = false;

    @Nullable
    private Boolean isOwn;

    private boolean updIsOwn = false;

    @Nullable
    private Boolean validated;

    private boolean updValidated = false;

    @Nullable
    private Boolean qVisible;

    private boolean updQVisible = false;

    @Nullable
    private Double lLength;

    private boolean updLLength = false;

    @Nullable
    private Boolean indexed;

    private boolean updIndexed = false;

    @Nullable
    private String upNameNm;

    private boolean updUpNameNm = false;

    @Nullable
    private Boolean readOnly;

    private boolean updReadOnly = false;

    @Nullable
    private DtUid getOpTypeId;

    private boolean updGetOpTypeId = false;

    @Nullable
    private DtUid setOpTypeId;

    private boolean updSetOpTypeId = false;

    @Nullable
    private DtUid resetOpTypeId;

    private boolean updResetOpTypeId = false;

    @Nullable
    private Boolean confirmOther;

    private boolean updConfirmOther = false;

    @Nullable
    private DtUid setOtherOpTypeId;

    private boolean updSetOtherOpTypeId = false;

    @Nullable
    private Boolean multivalue;

    private boolean updMultivalue = false;

    @Nullable
    private Boolean logAllowed;

    private boolean updLogAllowed = false;

    @Nullable
    private Character logLevel;

    private boolean updLogLevel = false;

    @Nullable
    private Character dictType;

    private boolean updDictType = false;

    @Nullable
    private String dictDel1;

    private boolean updDictDel1 = false;

    @Nullable
    private String dictDel2;

    private boolean updDictDel2 = false;

    @Nullable
    private String tbCodeCd;

    private boolean updTbCodeCd = false;

    @Nullable
    private String accountRuleNm;

    private boolean updAccountRuleNm = false;

    @Nullable
    private DtUid accDocObjectFormulaId;

    private boolean updAccDocObjectFormulaId = false;

    @Nullable
    private DtUid ownerFormulaId;

    private boolean updOwnerFormulaId = false;

    @Nullable
    private DtUid fromObjectFormulaId;

    private boolean updFromObjectFormulaId = false;

    @Nullable
    private DtUid toObjectFormulaId;

    private boolean updToObjectFormulaId = false;

    @Nullable
    private Boolean approxRecord;

    private boolean updApproxRecord = false;

    @Nullable
    private String valueAccountNm;

    private boolean updValueAccountNm = false;

    @Nullable
    private Character valueAmountType;

    private boolean updValueAmountType = false;

    @Nullable
    private Boolean defOwner;

    private boolean updDefOwner = false;

    @Nullable
    private String documentation;

    private boolean updDocumentation = false;

    @Nullable
    private Integer bitmapOrd;

    private boolean updBitmapOrd = false;

    @Nullable
    private Character xIsFlagDepBind;

    private boolean updXIsFlagDepBind = false;

    @Nullable
    private Boolean xIsFlagDefAttr;

    private boolean updXIsFlagDefAttr = false;

    @Nullable
    private Character copied;

    private boolean updCopied = false;

    @Nullable
    private Double keyOrd;

    private boolean updKeyOrd = false;

    @Nullable
    private DtUid opTypeTypeRf;

    private boolean updOpTypeTypeRf = false;

    @Nullable
    private DtUid imgSrcId;

    private boolean updImgSrcId = false;

    @Nullable
    private Double imgWidth;

    private boolean updImgWidth = false;

    @Nullable
    private Double imgHeight;

    private boolean updImgHeight = false;

    @Nullable
    private DtUid fileServerId;

    private boolean updFileServerId = false;

    @Nullable
    private Boolean genMigr;

    private boolean updGenMigr = false;

    @Nullable
    private Boolean evalCValue;

    private boolean updEvalCValue = false;

    @Nullable
    private Double optLobLimit;

    private boolean updOptLobLimit = false;

    @Nullable
    private Double manLobLimit;

    private boolean updManLobLimit = false;

    public GenAttrValueBuilder() {
    }

    public GenAttrValueBuilder(GenAttrValue value) {
        super(value);
        setEntityId(value.getEntityId());
        setNameNm(value.getNameNm());
        setName(value.getName());
        setNote(value.getNote().orElse(null));
        setAttrType(value.getAttrType());
        setIsCustom(value.isIsCustom());
        setIsUsed(value.isIsUsed());
        setAttrGrpId(value.getAttrGrpId().orElse(null));
        setOrd(value.getOrd());
        setDomainId(value.getDomainId());
        setSubdomainNm(value.getSubdomainNm().orElse(null));
        setProperNameRoot(value.getProperNameRoot().orElse(null));
        setMandatory(value.isMandatory());
        setOrdered(value.isOrdered());
        setOrdGroup(value.getOrdGroup().orElse(null));
        setDefValue(value.getDefValue().orElse(null));
        setMultiCreate(value.isMultiCreate());
        setGenCopy(value.isGenCopy());
        setGenMove(value.isGenMove());
        setGenDelete(value.isGenDelete());
        setTextSrcId(value.getTextSrcId().orElse(null));
        setHierarchical(value.isHierarchical());
        setIsInTable(value.isIsInTable());
        setIsOwn(value.isIsOwn());
        setValidated(value.isValidated());
        setqVisible(value.isqVisible());
        setlLength(value.getlLength().orElse(null));
        setIndexed(value.isIndexed());
        setUpNameNm(value.getUpNameNm().orElse(null));
        setReadOnly(value.isReadOnly());
        setGetOpTypeId(value.getGetOpTypeId().orElse(null));
        setSetOpTypeId(value.getSetOpTypeId().orElse(null));
        setResetOpTypeId(value.getResetOpTypeId().orElse(null));
        setConfirmOther(value.getConfirmOther().orElse(null));
        setSetOtherOpTypeId(value.getSetOtherOpTypeId().orElse(null));
        setMultivalue(value.isMultivalue());
        setLogAllowed(value.isLogAllowed());
        setLogLevel(value.getLogLevel());
        setDictType(value.getDictType().orElse(null));
        setDictDel1(value.getDictDel1().orElse(null));
        setDictDel2(value.getDictDel2().orElse(null));
        setTbCodeCd(value.getTbCodeCd().orElse(null));
        setAccountRuleNm(value.getAccountRuleNm().orElse(null));
        setAccDocObjectFormulaId(value.getAccDocObjectFormulaId().orElse(null));
        setOwnerFormulaId(value.getOwnerFormulaId().orElse(null));
        setFromObjectFormulaId(value.getFromObjectFormulaId().orElse(null));
        setToObjectFormulaId(value.getToObjectFormulaId().orElse(null));
        setApproxRecord(value.getApproxRecord().orElse(null));
        setValueAccountNm(value.getValueAccountNm().orElse(null));
        setValueAmountType(value.getValueAmountType().orElse(null));
        setDefOwner(value.isDefOwner());
        setDocumentation(value.getDocumentation().orElse(null));
        setBitmapOrd(value.getBitmapOrd().orElse(null));
        setxIsFlagDepBind(value.getxIsFlagDepBind());
        setxIsFlagDefAttr(value.isxIsFlagDefAttr());
        setCopied(value.getCopied());
        setKeyOrd(value.getKeyOrd().orElse(null));
        setOpTypeTypeRf(value.getOpTypeTypeRf().orElse(null));
        setImgSrcId(value.getImgSrcId().orElse(null));
        setImgWidth(value.getImgWidth().orElse(null));
        setImgHeight(value.getImgHeight().orElse(null));
        setFileServerId(value.getFileServerId().orElse(null));
        setGenMigr(value.getGenMigr().orElse(null));
        setEvalCValue(value.getEvalCValue().orElse(null));
        setOptLobLimit(value.getOptLobLimit().orElse(null));
        setManLobLimit(value.getManLobLimit().orElse(null));
    }

    public GenAttrValueBuilder(GenAttrValueBuilder value) {
        super(value);
        this.entityId = value.entityId;
        this.updEntityId = value.updEntityId;
        this.nameNm = value.nameNm;
        this.updNameNm = value.updNameNm;
        this.name = value.name;
        this.updName = value.updName;
        this.note = value.note;
        this.updNote = value.updNote;
        this.attrType = value.attrType;
        this.updAttrType = value.updAttrType;
        this.isCustom = value.isCustom;
        this.updIsCustom = value.updIsCustom;
        this.isUsed = value.isUsed;
        this.updIsUsed = value.updIsUsed;
        this.attrGrpId = value.attrGrpId;
        this.updAttrGrpId = value.updAttrGrpId;
        this.ord = value.ord;
        this.updOrd = value.updOrd;
        this.domainId = value.domainId;
        this.updDomainId = value.updDomainId;
        this.subdomainNm = value.subdomainNm;
        this.updSubdomainNm = value.updSubdomainNm;
        this.properNameRoot = value.properNameRoot;
        this.updProperNameRoot = value.updProperNameRoot;
        this.mandatory = value.mandatory;
        this.updMandatory = value.updMandatory;
        this.ordered = value.ordered;
        this.updOrdered = value.updOrdered;
        this.ordGroup = value.ordGroup;
        this.updOrdGroup = value.updOrdGroup;
        this.defValue = value.defValue;
        this.updDefValue = value.updDefValue;
        this.multiCreate = value.multiCreate;
        this.updMultiCreate = value.updMultiCreate;
        this.genCopy = value.genCopy;
        this.updGenCopy = value.updGenCopy;
        this.genMove = value.genMove;
        this.updGenMove = value.updGenMove;
        this.genDelete = value.genDelete;
        this.updGenDelete = value.updGenDelete;
        this.textSrcId = value.textSrcId;
        this.updTextSrcId = value.updTextSrcId;
        this.hierarchical = value.hierarchical;
        this.updHierarchical = value.updHierarchical;
        this.isInTable = value.isInTable;
        this.updIsInTable = value.updIsInTable;
        this.isOwn = value.isOwn;
        this.updIsOwn = value.updIsOwn;
        this.validated = value.validated;
        this.updValidated = value.updValidated;
        this.qVisible = value.qVisible;
        this.updQVisible = value.updQVisible;
        this.lLength = value.lLength;
        this.updLLength = value.updLLength;
        this.indexed = value.indexed;
        this.updIndexed = value.updIndexed;
        this.upNameNm = value.upNameNm;
        this.updUpNameNm = value.updUpNameNm;
        this.readOnly = value.readOnly;
        this.updReadOnly = value.updReadOnly;
        this.getOpTypeId = value.getOpTypeId;
        this.updGetOpTypeId = value.updGetOpTypeId;
        this.setOpTypeId = value.setOpTypeId;
        this.updSetOpTypeId = value.updSetOpTypeId;
        this.resetOpTypeId = value.resetOpTypeId;
        this.updResetOpTypeId = value.updResetOpTypeId;
        this.confirmOther = value.confirmOther;
        this.updConfirmOther = value.updConfirmOther;
        this.setOtherOpTypeId = value.setOtherOpTypeId;
        this.updSetOtherOpTypeId = value.updSetOtherOpTypeId;
        this.multivalue = value.multivalue;
        this.updMultivalue = value.updMultivalue;
        this.logAllowed = value.logAllowed;
        this.updLogAllowed = value.updLogAllowed;
        this.logLevel = value.logLevel;
        this.updLogLevel = value.updLogLevel;
        this.dictType = value.dictType;
        this.updDictType = value.updDictType;
        this.dictDel1 = value.dictDel1;
        this.updDictDel1 = value.updDictDel1;
        this.dictDel2 = value.dictDel2;
        this.updDictDel2 = value.updDictDel2;
        this.tbCodeCd = value.tbCodeCd;
        this.updTbCodeCd = value.updTbCodeCd;
        this.accountRuleNm = value.accountRuleNm;
        this.updAccountRuleNm = value.updAccountRuleNm;
        this.accDocObjectFormulaId = value.accDocObjectFormulaId;
        this.updAccDocObjectFormulaId = value.updAccDocObjectFormulaId;
        this.ownerFormulaId = value.ownerFormulaId;
        this.updOwnerFormulaId = value.updOwnerFormulaId;
        this.fromObjectFormulaId = value.fromObjectFormulaId;
        this.updFromObjectFormulaId = value.updFromObjectFormulaId;
        this.toObjectFormulaId = value.toObjectFormulaId;
        this.updToObjectFormulaId = value.updToObjectFormulaId;
        this.approxRecord = value.approxRecord;
        this.updApproxRecord = value.updApproxRecord;
        this.valueAccountNm = value.valueAccountNm;
        this.updValueAccountNm = value.updValueAccountNm;
        this.valueAmountType = value.valueAmountType;
        this.updValueAmountType = value.updValueAmountType;
        this.defOwner = value.defOwner;
        this.updDefOwner = value.updDefOwner;
        this.documentation = value.documentation;
        this.updDocumentation = value.updDocumentation;
        this.bitmapOrd = value.bitmapOrd;
        this.updBitmapOrd = value.updBitmapOrd;
        this.xIsFlagDepBind = value.xIsFlagDepBind;
        this.updXIsFlagDepBind = value.updXIsFlagDepBind;
        this.xIsFlagDefAttr = value.xIsFlagDefAttr;
        this.updXIsFlagDefAttr = value.updXIsFlagDefAttr;
        this.copied = value.copied;
        this.updCopied = value.updCopied;
        this.keyOrd = value.keyOrd;
        this.updKeyOrd = value.updKeyOrd;
        this.opTypeTypeRf = value.opTypeTypeRf;
        this.updOpTypeTypeRf = value.updOpTypeTypeRf;
        this.imgSrcId = value.imgSrcId;
        this.updImgSrcId = value.updImgSrcId;
        this.imgWidth = value.imgWidth;
        this.updImgWidth = value.updImgWidth;
        this.imgHeight = value.imgHeight;
        this.updImgHeight = value.updImgHeight;
        this.fileServerId = value.fileServerId;
        this.updFileServerId = value.updFileServerId;
        this.genMigr = value.genMigr;
        this.updGenMigr = value.updGenMigr;
        this.evalCValue = value.evalCValue;
        this.updEvalCValue = value.updEvalCValue;
        this.optLobLimit = value.optLobLimit;
        this.updOptLobLimit = value.updOptLobLimit;
        this.manLobLimit = value.manLobLimit;
        this.updManLobLimit = value.updManLobLimit;
    }

    @XmlElement(
            name = "ATTR_ID"
    )
    @Override
    @Nullable
    public DtUid getId() {
        return super.getId();
    }

    @XmlElement(
            name = "ENTITY_ID"
    )
    @Nullable
    public DtUid getEntityId() {
        return entityId;
    }

    public GenAttrValueBuilder setEntityId(DtUid entityId) {
        this.entityId = Objects.requireNonNull(entityId);
        this.updEntityId = true;
        return self();
    }

    public boolean isUpdEntityId() {
        return updEntityId;
    }

    public void setUpdEntityId(boolean updEntityId) {
        if (!this.updEntityId && updEntityId) {
            throw new InternalException("Cannot directly set update flag updEntityId; set value instead");
        }
        this.updEntityId = updEntityId;
        if (!updEntityId) {
            this.entityId = null;
        }
    }

    @XmlElement(
            name = "NAME_NM"
    )
    @Nullable
    public String getNameNm() {
        return nameNm;
    }

    public GenAttrValueBuilder setNameNm(String nameNm) {
        this.nameNm = Objects.requireNonNull(nameNm);
        this.updNameNm = true;
        return self();
    }

    public boolean isUpdNameNm() {
        return updNameNm;
    }

    public void setUpdNameNm(boolean updNameNm) {
        if (!this.updNameNm && updNameNm) {
            throw new InternalException("Cannot directly set update flag updNameNm; set value instead");
        }
        this.updNameNm = updNameNm;
        if (!updNameNm) {
            this.nameNm = null;
        }
    }

    @XmlElement(
            name = "NAME"
    )
    @Nullable
    public String getName() {
        return name;
    }

    public GenAttrValueBuilder setName(String name) {
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
            name = "NOTE"
    )
    @Nullable
    public String getNote() {
        return note;
    }

    public GenAttrValueBuilder setNote(@Nullable String note) {
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
            name = "ATTRTYPE"
    )
    @Nullable
    public Character getAttrType() {
        return attrType;
    }

    public GenAttrValueBuilder setAttrType(Character attrType) {
        this.attrType = Objects.requireNonNull(attrType);
        this.updAttrType = true;
        return self();
    }

    public boolean isUpdAttrType() {
        return updAttrType;
    }

    public void setUpdAttrType(boolean updAttrType) {
        if (!this.updAttrType && updAttrType) {
            throw new InternalException("Cannot directly set update flag updAttrType; set value instead");
        }
        this.updAttrType = updAttrType;
        if (!updAttrType) {
            this.attrType = null;
        }
    }

    @XmlElement(
            name = "ISCUSTOM"
    )
    @Nullable
    public Boolean isIsCustom() {
        return isCustom;
    }

    public GenAttrValueBuilder setIsCustom(Boolean isCustom) {
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
            name = "ISUSED"
    )
    @Nullable
    public Boolean isIsUsed() {
        return isUsed;
    }

    public GenAttrValueBuilder setIsUsed(Boolean isUsed) {
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
            name = "ATTRGRP_ID"
    )
    @Nullable
    public DtUid getAttrGrpId() {
        return attrGrpId;
    }

    public GenAttrValueBuilder setAttrGrpId(@Nullable DtUid attrGrpId) {
        this.attrGrpId = attrGrpId;
        this.updAttrGrpId = true;
        return self();
    }

    public boolean isUpdAttrGrpId() {
        return updAttrGrpId;
    }

    public void setUpdAttrGrpId(boolean updAttrGrpId) {
        this.updAttrGrpId = updAttrGrpId;
        if (!updAttrGrpId) {
            this.attrGrpId = null;
        }
    }

    @XmlElement(
            name = "ORD"
    )
    @Nullable
    public Double getOrd() {
        return ord;
    }

    public GenAttrValueBuilder setOrd(Double ord) {
        this.ord = Objects.requireNonNull(ord);
        this.updOrd = true;
        return self();
    }

    public boolean isUpdOrd() {
        return updOrd;
    }

    public void setUpdOrd(boolean updOrd) {
        if (!this.updOrd && updOrd) {
            throw new InternalException("Cannot directly set update flag updOrd; set value instead");
        }
        this.updOrd = updOrd;
        if (!updOrd) {
            this.ord = null;
        }
    }

    @XmlElement(
            name = "DOMAIN_ID"
    )
    @Nullable
    public DtUid getDomainId() {
        return domainId;
    }

    public GenAttrValueBuilder setDomainId(DtUid domainId) {
        this.domainId = Objects.requireNonNull(domainId);
        this.updDomainId = true;
        return self();
    }

    public boolean isUpdDomainId() {
        return updDomainId;
    }

    public void setUpdDomainId(boolean updDomainId) {
        if (!this.updDomainId && updDomainId) {
            throw new InternalException("Cannot directly set update flag updDomainId; set value instead");
        }
        this.updDomainId = updDomainId;
        if (!updDomainId) {
            this.domainId = null;
        }
    }

    @XmlElement(
            name = "SUBDOMAIN_NM"
    )
    @Nullable
    public String getSubdomainNm() {
        return subdomainNm;
    }

    public GenAttrValueBuilder setSubdomainNm(@Nullable String subdomainNm) {
        this.subdomainNm = subdomainNm;
        this.updSubdomainNm = true;
        return self();
    }

    public boolean isUpdSubdomainNm() {
        return updSubdomainNm;
    }

    public void setUpdSubdomainNm(boolean updSubdomainNm) {
        this.updSubdomainNm = updSubdomainNm;
        if (!updSubdomainNm) {
            this.subdomainNm = null;
        }
    }

    @XmlElement(
            name = "PROPERNAMEROOT"
    )
    @Nullable
    public String getProperNameRoot() {
        return properNameRoot;
    }

    public GenAttrValueBuilder setProperNameRoot(@Nullable String properNameRoot) {
        this.properNameRoot = properNameRoot;
        this.updProperNameRoot = true;
        return self();
    }

    public boolean isUpdProperNameRoot() {
        return updProperNameRoot;
    }

    public void setUpdProperNameRoot(boolean updProperNameRoot) {
        this.updProperNameRoot = updProperNameRoot;
        if (!updProperNameRoot) {
            this.properNameRoot = null;
        }
    }

    @XmlElement(
            name = "MANDATORY"
    )
    @Nullable
    public Boolean isMandatory() {
        return mandatory;
    }

    public GenAttrValueBuilder setMandatory(Boolean mandatory) {
        this.mandatory = Objects.requireNonNull(mandatory);
        this.updMandatory = true;
        return self();
    }

    public boolean isUpdMandatory() {
        return updMandatory;
    }

    public void setUpdMandatory(boolean updMandatory) {
        if (!this.updMandatory && updMandatory) {
            throw new InternalException("Cannot directly set update flag updMandatory; set value instead");
        }
        this.updMandatory = updMandatory;
        if (!updMandatory) {
            this.mandatory = null;
        }
    }

    @XmlElement(
            name = "ORDERED"
    )
    @Nullable
    public Boolean isOrdered() {
        return ordered;
    }

    public GenAttrValueBuilder setOrdered(Boolean ordered) {
        this.ordered = Objects.requireNonNull(ordered);
        this.updOrdered = true;
        return self();
    }

    public boolean isUpdOrdered() {
        return updOrdered;
    }

    public void setUpdOrdered(boolean updOrdered) {
        if (!this.updOrdered && updOrdered) {
            throw new InternalException("Cannot directly set update flag updOrdered; set value instead");
        }
        this.updOrdered = updOrdered;
        if (!updOrdered) {
            this.ordered = null;
        }
    }

    @XmlElement(
            name = "ORDGROUP"
    )
    @Nullable
    public String getOrdGroup() {
        return ordGroup;
    }

    public GenAttrValueBuilder setOrdGroup(@Nullable String ordGroup) {
        this.ordGroup = ordGroup;
        this.updOrdGroup = true;
        return self();
    }

    public boolean isUpdOrdGroup() {
        return updOrdGroup;
    }

    public void setUpdOrdGroup(boolean updOrdGroup) {
        this.updOrdGroup = updOrdGroup;
        if (!updOrdGroup) {
            this.ordGroup = null;
        }
    }

    @XmlElement(
            name = "DEFVALUE"
    )
    @Nullable
    public String getDefValue() {
        return defValue;
    }

    public GenAttrValueBuilder setDefValue(@Nullable String defValue) {
        this.defValue = defValue;
        this.updDefValue = true;
        return self();
    }

    public boolean isUpdDefValue() {
        return updDefValue;
    }

    public void setUpdDefValue(boolean updDefValue) {
        this.updDefValue = updDefValue;
        if (!updDefValue) {
            this.defValue = null;
        }
    }

    @XmlElement(
            name = "MULTICREATE"
    )
    @Nullable
    public Boolean isMultiCreate() {
        return multiCreate;
    }

    public GenAttrValueBuilder setMultiCreate(Boolean multiCreate) {
        this.multiCreate = Objects.requireNonNull(multiCreate);
        this.updMultiCreate = true;
        return self();
    }

    public boolean isUpdMultiCreate() {
        return updMultiCreate;
    }

    public void setUpdMultiCreate(boolean updMultiCreate) {
        if (!this.updMultiCreate && updMultiCreate) {
            throw new InternalException("Cannot directly set update flag updMultiCreate; set value instead");
        }
        this.updMultiCreate = updMultiCreate;
        if (!updMultiCreate) {
            this.multiCreate = null;
        }
    }

    @XmlElement(
            name = "GENCOPY"
    )
    @Nullable
    public Boolean isGenCopy() {
        return genCopy;
    }

    public GenAttrValueBuilder setGenCopy(Boolean genCopy) {
        this.genCopy = Objects.requireNonNull(genCopy);
        this.updGenCopy = true;
        return self();
    }

    public boolean isUpdGenCopy() {
        return updGenCopy;
    }

    public void setUpdGenCopy(boolean updGenCopy) {
        if (!this.updGenCopy && updGenCopy) {
            throw new InternalException("Cannot directly set update flag updGenCopy; set value instead");
        }
        this.updGenCopy = updGenCopy;
        if (!updGenCopy) {
            this.genCopy = null;
        }
    }

    @XmlElement(
            name = "GENMOVE"
    )
    @Nullable
    public Boolean isGenMove() {
        return genMove;
    }

    public GenAttrValueBuilder setGenMove(Boolean genMove) {
        this.genMove = Objects.requireNonNull(genMove);
        this.updGenMove = true;
        return self();
    }

    public boolean isUpdGenMove() {
        return updGenMove;
    }

    public void setUpdGenMove(boolean updGenMove) {
        if (!this.updGenMove && updGenMove) {
            throw new InternalException("Cannot directly set update flag updGenMove; set value instead");
        }
        this.updGenMove = updGenMove;
        if (!updGenMove) {
            this.genMove = null;
        }
    }

    @XmlElement(
            name = "GENDELETE"
    )
    @Nullable
    public Boolean isGenDelete() {
        return genDelete;
    }

    public GenAttrValueBuilder setGenDelete(Boolean genDelete) {
        this.genDelete = Objects.requireNonNull(genDelete);
        this.updGenDelete = true;
        return self();
    }

    public boolean isUpdGenDelete() {
        return updGenDelete;
    }

    public void setUpdGenDelete(boolean updGenDelete) {
        if (!this.updGenDelete && updGenDelete) {
            throw new InternalException("Cannot directly set update flag updGenDelete; set value instead");
        }
        this.updGenDelete = updGenDelete;
        if (!updGenDelete) {
            this.genDelete = null;
        }
    }

    @XmlElement(
            name = "TEXTSRC_ID"
    )
    @Nullable
    public DtUid getTextSrcId() {
        return textSrcId;
    }

    public GenAttrValueBuilder setTextSrcId(@Nullable DtUid textSrcId) {
        this.textSrcId = textSrcId;
        this.updTextSrcId = true;
        return self();
    }

    public boolean isUpdTextSrcId() {
        return updTextSrcId;
    }

    public void setUpdTextSrcId(boolean updTextSrcId) {
        this.updTextSrcId = updTextSrcId;
        if (!updTextSrcId) {
            this.textSrcId = null;
        }
    }

    @XmlElement(
            name = "HIERARCHICAL"
    )
    @Nullable
    public Boolean isHierarchical() {
        return hierarchical;
    }

    public GenAttrValueBuilder setHierarchical(Boolean hierarchical) {
        this.hierarchical = Objects.requireNonNull(hierarchical);
        this.updHierarchical = true;
        return self();
    }

    public boolean isUpdHierarchical() {
        return updHierarchical;
    }

    public void setUpdHierarchical(boolean updHierarchical) {
        if (!this.updHierarchical && updHierarchical) {
            throw new InternalException("Cannot directly set update flag updHierarchical; set value instead");
        }
        this.updHierarchical = updHierarchical;
        if (!updHierarchical) {
            this.hierarchical = null;
        }
    }

    @XmlElement(
            name = "ISINTABLE"
    )
    @Nullable
    public Boolean isIsInTable() {
        return isInTable;
    }

    public GenAttrValueBuilder setIsInTable(Boolean isInTable) {
        this.isInTable = Objects.requireNonNull(isInTable);
        this.updIsInTable = true;
        return self();
    }

    public boolean isUpdIsInTable() {
        return updIsInTable;
    }

    public void setUpdIsInTable(boolean updIsInTable) {
        if (!this.updIsInTable && updIsInTable) {
            throw new InternalException("Cannot directly set update flag updIsInTable; set value instead");
        }
        this.updIsInTable = updIsInTable;
        if (!updIsInTable) {
            this.isInTable = null;
        }
    }

    @XmlElement(
            name = "ISOWN"
    )
    @Nullable
    public Boolean isIsOwn() {
        return isOwn;
    }

    public GenAttrValueBuilder setIsOwn(Boolean isOwn) {
        this.isOwn = Objects.requireNonNull(isOwn);
        this.updIsOwn = true;
        return self();
    }

    public boolean isUpdIsOwn() {
        return updIsOwn;
    }

    public void setUpdIsOwn(boolean updIsOwn) {
        if (!this.updIsOwn && updIsOwn) {
            throw new InternalException("Cannot directly set update flag updIsOwn; set value instead");
        }
        this.updIsOwn = updIsOwn;
        if (!updIsOwn) {
            this.isOwn = null;
        }
    }

    @XmlElement(
            name = "VALIDATED"
    )
    @Nullable
    public Boolean isValidated() {
        return validated;
    }

    public GenAttrValueBuilder setValidated(Boolean validated) {
        this.validated = Objects.requireNonNull(validated);
        this.updValidated = true;
        return self();
    }

    public boolean isUpdValidated() {
        return updValidated;
    }

    public void setUpdValidated(boolean updValidated) {
        if (!this.updValidated && updValidated) {
            throw new InternalException("Cannot directly set update flag updValidated; set value instead");
        }
        this.updValidated = updValidated;
        if (!updValidated) {
            this.validated = null;
        }
    }

    @XmlElement(
            name = "QVISIBLE"
    )
    @Nullable
    public Boolean isqVisible() {
        return qVisible;
    }

    public GenAttrValueBuilder setqVisible(Boolean qVisible) {
        this.qVisible = Objects.requireNonNull(qVisible);
        this.updQVisible = true;
        return self();
    }

    public boolean isUpdQVisible() {
        return updQVisible;
    }

    public void setUpdQVisible(boolean updQVisible) {
        if (!this.updQVisible && updQVisible) {
            throw new InternalException("Cannot directly set update flag updQVisible; set value instead");
        }
        this.updQVisible = updQVisible;
        if (!updQVisible) {
            this.qVisible = null;
        }
    }

    @XmlElement(
            name = "LLENGTH"
    )
    @Nullable
    public Double getlLength() {
        return lLength;
    }

    public GenAttrValueBuilder setlLength(@Nullable Double lLength) {
        this.lLength = lLength;
        this.updLLength = true;
        return self();
    }

    public boolean isUpdLLength() {
        return updLLength;
    }

    public void setUpdLLength(boolean updLLength) {
        this.updLLength = updLLength;
        if (!updLLength) {
            this.lLength = null;
        }
    }

    @XmlElement(
            name = "INDEXED"
    )
    @Nullable
    public Boolean isIndexed() {
        return indexed;
    }

    public GenAttrValueBuilder setIndexed(Boolean indexed) {
        this.indexed = Objects.requireNonNull(indexed);
        this.updIndexed = true;
        return self();
    }

    public boolean isUpdIndexed() {
        return updIndexed;
    }

    public void setUpdIndexed(boolean updIndexed) {
        if (!this.updIndexed && updIndexed) {
            throw new InternalException("Cannot directly set update flag updIndexed; set value instead");
        }
        this.updIndexed = updIndexed;
        if (!updIndexed) {
            this.indexed = null;
        }
    }

    @XmlElement(
            name = "UPNAME_NM"
    )
    @Nullable
    public String getUpNameNm() {
        return upNameNm;
    }

    public GenAttrValueBuilder setUpNameNm(@Nullable String upNameNm) {
        this.upNameNm = upNameNm;
        this.updUpNameNm = true;
        return self();
    }

    public boolean isUpdUpNameNm() {
        return updUpNameNm;
    }

    public void setUpdUpNameNm(boolean updUpNameNm) {
        this.updUpNameNm = updUpNameNm;
        if (!updUpNameNm) {
            this.upNameNm = null;
        }
    }

    @XmlElement(
            name = "READONLY"
    )
    @Nullable
    public Boolean isReadOnly() {
        return readOnly;
    }

    public GenAttrValueBuilder setReadOnly(Boolean readOnly) {
        this.readOnly = Objects.requireNonNull(readOnly);
        this.updReadOnly = true;
        return self();
    }

    public boolean isUpdReadOnly() {
        return updReadOnly;
    }

    public void setUpdReadOnly(boolean updReadOnly) {
        if (!this.updReadOnly && updReadOnly) {
            throw new InternalException("Cannot directly set update flag updReadOnly; set value instead");
        }
        this.updReadOnly = updReadOnly;
        if (!updReadOnly) {
            this.readOnly = null;
        }
    }

    @XmlElement(
            name = "GETOPTYPE_ID"
    )
    @Nullable
    public DtUid getGetOpTypeId() {
        return getOpTypeId;
    }

    public GenAttrValueBuilder setGetOpTypeId(@Nullable DtUid getOpTypeId) {
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
            name = "SETOPTYPE_ID"
    )
    @Nullable
    public DtUid getSetOpTypeId() {
        return setOpTypeId;
    }

    public GenAttrValueBuilder setSetOpTypeId(@Nullable DtUid setOpTypeId) {
        this.setOpTypeId = setOpTypeId;
        this.updSetOpTypeId = true;
        return self();
    }

    public boolean isUpdSetOpTypeId() {
        return updSetOpTypeId;
    }

    public void setUpdSetOpTypeId(boolean updSetOpTypeId) {
        this.updSetOpTypeId = updSetOpTypeId;
        if (!updSetOpTypeId) {
            this.setOpTypeId = null;
        }
    }

    @XmlElement(
            name = "RESETOPTYPE_ID"
    )
    @Nullable
    public DtUid getResetOpTypeId() {
        return resetOpTypeId;
    }

    public GenAttrValueBuilder setResetOpTypeId(@Nullable DtUid resetOpTypeId) {
        this.resetOpTypeId = resetOpTypeId;
        this.updResetOpTypeId = true;
        return self();
    }

    public boolean isUpdResetOpTypeId() {
        return updResetOpTypeId;
    }

    public void setUpdResetOpTypeId(boolean updResetOpTypeId) {
        this.updResetOpTypeId = updResetOpTypeId;
        if (!updResetOpTypeId) {
            this.resetOpTypeId = null;
        }
    }

    @XmlElement(
            name = "CONFIRMOTHER"
    )
    @Nullable
    public Boolean getConfirmOther() {
        return confirmOther;
    }

    public GenAttrValueBuilder setConfirmOther(@Nullable Boolean confirmOther) {
        this.confirmOther = confirmOther;
        this.updConfirmOther = true;
        return self();
    }

    public boolean isUpdConfirmOther() {
        return updConfirmOther;
    }

    public void setUpdConfirmOther(boolean updConfirmOther) {
        this.updConfirmOther = updConfirmOther;
        if (!updConfirmOther) {
            this.confirmOther = null;
        }
    }

    @XmlElement(
            name = "SETOTHEROPTYPE_ID"
    )
    @Nullable
    public DtUid getSetOtherOpTypeId() {
        return setOtherOpTypeId;
    }

    public GenAttrValueBuilder setSetOtherOpTypeId(@Nullable DtUid setOtherOpTypeId) {
        this.setOtherOpTypeId = setOtherOpTypeId;
        this.updSetOtherOpTypeId = true;
        return self();
    }

    public boolean isUpdSetOtherOpTypeId() {
        return updSetOtherOpTypeId;
    }

    public void setUpdSetOtherOpTypeId(boolean updSetOtherOpTypeId) {
        this.updSetOtherOpTypeId = updSetOtherOpTypeId;
        if (!updSetOtherOpTypeId) {
            this.setOtherOpTypeId = null;
        }
    }

    @XmlElement(
            name = "MULTIVALUE"
    )
    @Nullable
    public Boolean isMultivalue() {
        return multivalue;
    }

    public GenAttrValueBuilder setMultivalue(Boolean multivalue) {
        this.multivalue = Objects.requireNonNull(multivalue);
        this.updMultivalue = true;
        return self();
    }

    public boolean isUpdMultivalue() {
        return updMultivalue;
    }

    public void setUpdMultivalue(boolean updMultivalue) {
        if (!this.updMultivalue && updMultivalue) {
            throw new InternalException("Cannot directly set update flag updMultivalue; set value instead");
        }
        this.updMultivalue = updMultivalue;
        if (!updMultivalue) {
            this.multivalue = null;
        }
    }

    @XmlElement(
            name = "LOGALLOWED"
    )
    @Nullable
    public Boolean isLogAllowed() {
        return logAllowed;
    }

    public GenAttrValueBuilder setLogAllowed(Boolean logAllowed) {
        this.logAllowed = Objects.requireNonNull(logAllowed);
        this.updLogAllowed = true;
        return self();
    }

    public boolean isUpdLogAllowed() {
        return updLogAllowed;
    }

    public void setUpdLogAllowed(boolean updLogAllowed) {
        if (!this.updLogAllowed && updLogAllowed) {
            throw new InternalException("Cannot directly set update flag updLogAllowed; set value instead");
        }
        this.updLogAllowed = updLogAllowed;
        if (!updLogAllowed) {
            this.logAllowed = null;
        }
    }

    @XmlElement(
            name = "LOGLEVEL"
    )
    @Nullable
    public Character getLogLevel() {
        return logLevel;
    }

    public GenAttrValueBuilder setLogLevel(Character logLevel) {
        this.logLevel = Objects.requireNonNull(logLevel);
        this.updLogLevel = true;
        return self();
    }

    public boolean isUpdLogLevel() {
        return updLogLevel;
    }

    public void setUpdLogLevel(boolean updLogLevel) {
        if (!this.updLogLevel && updLogLevel) {
            throw new InternalException("Cannot directly set update flag updLogLevel; set value instead");
        }
        this.updLogLevel = updLogLevel;
        if (!updLogLevel) {
            this.logLevel = null;
        }
    }

    @XmlElement(
            name = "DICTTYPE"
    )
    @Nullable
    public Character getDictType() {
        return dictType;
    }

    public GenAttrValueBuilder setDictType(@Nullable Character dictType) {
        this.dictType = dictType;
        this.updDictType = true;
        return self();
    }

    public boolean isUpdDictType() {
        return updDictType;
    }

    public void setUpdDictType(boolean updDictType) {
        this.updDictType = updDictType;
        if (!updDictType) {
            this.dictType = null;
        }
    }

    @XmlElement(
            name = "DICTDEL1"
    )
    @Nullable
    public String getDictDel1() {
        return dictDel1;
    }

    public GenAttrValueBuilder setDictDel1(@Nullable String dictDel1) {
        this.dictDel1 = dictDel1;
        this.updDictDel1 = true;
        return self();
    }

    public boolean isUpdDictDel1() {
        return updDictDel1;
    }

    public void setUpdDictDel1(boolean updDictDel1) {
        this.updDictDel1 = updDictDel1;
        if (!updDictDel1) {
            this.dictDel1 = null;
        }
    }

    @XmlElement(
            name = "DICTDEL2"
    )
    @Nullable
    public String getDictDel2() {
        return dictDel2;
    }

    public GenAttrValueBuilder setDictDel2(@Nullable String dictDel2) {
        this.dictDel2 = dictDel2;
        this.updDictDel2 = true;
        return self();
    }

    public boolean isUpdDictDel2() {
        return updDictDel2;
    }

    public void setUpdDictDel2(boolean updDictDel2) {
        this.updDictDel2 = updDictDel2;
        if (!updDictDel2) {
            this.dictDel2 = null;
        }
    }

    @XmlElement(
            name = "TBCODE_CD"
    )
    @Nullable
    public String getTbCodeCd() {
        return tbCodeCd;
    }

    public GenAttrValueBuilder setTbCodeCd(@Nullable String tbCodeCd) {
        this.tbCodeCd = tbCodeCd;
        this.updTbCodeCd = true;
        return self();
    }

    public boolean isUpdTbCodeCd() {
        return updTbCodeCd;
    }

    public void setUpdTbCodeCd(boolean updTbCodeCd) {
        this.updTbCodeCd = updTbCodeCd;
        if (!updTbCodeCd) {
            this.tbCodeCd = null;
        }
    }

    @XmlElement(
            name = "ACCOUNTRULE_NM"
    )
    @Nullable
    public String getAccountRuleNm() {
        return accountRuleNm;
    }

    public GenAttrValueBuilder setAccountRuleNm(@Nullable String accountRuleNm) {
        this.accountRuleNm = accountRuleNm;
        this.updAccountRuleNm = true;
        return self();
    }

    public boolean isUpdAccountRuleNm() {
        return updAccountRuleNm;
    }

    public void setUpdAccountRuleNm(boolean updAccountRuleNm) {
        this.updAccountRuleNm = updAccountRuleNm;
        if (!updAccountRuleNm) {
            this.accountRuleNm = null;
        }
    }

    @XmlElement(
            name = "ACCDOCOBJECTFORMULA_ID"
    )
    @Nullable
    public DtUid getAccDocObjectFormulaId() {
        return accDocObjectFormulaId;
    }

    public GenAttrValueBuilder setAccDocObjectFormulaId(@Nullable DtUid accDocObjectFormulaId) {
        this.accDocObjectFormulaId = accDocObjectFormulaId;
        this.updAccDocObjectFormulaId = true;
        return self();
    }

    public boolean isUpdAccDocObjectFormulaId() {
        return updAccDocObjectFormulaId;
    }

    public void setUpdAccDocObjectFormulaId(boolean updAccDocObjectFormulaId) {
        this.updAccDocObjectFormulaId = updAccDocObjectFormulaId;
        if (!updAccDocObjectFormulaId) {
            this.accDocObjectFormulaId = null;
        }
    }

    @XmlElement(
            name = "OWNERFORMULA_ID"
    )
    @Nullable
    public DtUid getOwnerFormulaId() {
        return ownerFormulaId;
    }

    public GenAttrValueBuilder setOwnerFormulaId(@Nullable DtUid ownerFormulaId) {
        this.ownerFormulaId = ownerFormulaId;
        this.updOwnerFormulaId = true;
        return self();
    }

    public boolean isUpdOwnerFormulaId() {
        return updOwnerFormulaId;
    }

    public void setUpdOwnerFormulaId(boolean updOwnerFormulaId) {
        this.updOwnerFormulaId = updOwnerFormulaId;
        if (!updOwnerFormulaId) {
            this.ownerFormulaId = null;
        }
    }

    @XmlElement(
            name = "FROMOBJECTFORMULA_ID"
    )
    @Nullable
    public DtUid getFromObjectFormulaId() {
        return fromObjectFormulaId;
    }

    public GenAttrValueBuilder setFromObjectFormulaId(@Nullable DtUid fromObjectFormulaId) {
        this.fromObjectFormulaId = fromObjectFormulaId;
        this.updFromObjectFormulaId = true;
        return self();
    }

    public boolean isUpdFromObjectFormulaId() {
        return updFromObjectFormulaId;
    }

    public void setUpdFromObjectFormulaId(boolean updFromObjectFormulaId) {
        this.updFromObjectFormulaId = updFromObjectFormulaId;
        if (!updFromObjectFormulaId) {
            this.fromObjectFormulaId = null;
        }
    }

    @XmlElement(
            name = "TOOBJECTFORMULA_ID"
    )
    @Nullable
    public DtUid getToObjectFormulaId() {
        return toObjectFormulaId;
    }

    public GenAttrValueBuilder setToObjectFormulaId(@Nullable DtUid toObjectFormulaId) {
        this.toObjectFormulaId = toObjectFormulaId;
        this.updToObjectFormulaId = true;
        return self();
    }

    public boolean isUpdToObjectFormulaId() {
        return updToObjectFormulaId;
    }

    public void setUpdToObjectFormulaId(boolean updToObjectFormulaId) {
        this.updToObjectFormulaId = updToObjectFormulaId;
        if (!updToObjectFormulaId) {
            this.toObjectFormulaId = null;
        }
    }

    @XmlElement(
            name = "APPROXRECORD"
    )
    @Nullable
    public Boolean getApproxRecord() {
        return approxRecord;
    }

    public GenAttrValueBuilder setApproxRecord(@Nullable Boolean approxRecord) {
        this.approxRecord = approxRecord;
        this.updApproxRecord = true;
        return self();
    }

    public boolean isUpdApproxRecord() {
        return updApproxRecord;
    }

    public void setUpdApproxRecord(boolean updApproxRecord) {
        this.updApproxRecord = updApproxRecord;
        if (!updApproxRecord) {
            this.approxRecord = null;
        }
    }

    @XmlElement(
            name = "VALUEACCOUNT_NM"
    )
    @Nullable
    public String getValueAccountNm() {
        return valueAccountNm;
    }

    public GenAttrValueBuilder setValueAccountNm(@Nullable String valueAccountNm) {
        this.valueAccountNm = valueAccountNm;
        this.updValueAccountNm = true;
        return self();
    }

    public boolean isUpdValueAccountNm() {
        return updValueAccountNm;
    }

    public void setUpdValueAccountNm(boolean updValueAccountNm) {
        this.updValueAccountNm = updValueAccountNm;
        if (!updValueAccountNm) {
            this.valueAccountNm = null;
        }
    }

    @XmlElement(
            name = "VALUEAMOUNTTYPE"
    )
    @Nullable
    public Character getValueAmountType() {
        return valueAmountType;
    }

    public GenAttrValueBuilder setValueAmountType(@Nullable Character valueAmountType) {
        this.valueAmountType = valueAmountType;
        this.updValueAmountType = true;
        return self();
    }

    public boolean isUpdValueAmountType() {
        return updValueAmountType;
    }

    public void setUpdValueAmountType(boolean updValueAmountType) {
        this.updValueAmountType = updValueAmountType;
        if (!updValueAmountType) {
            this.valueAmountType = null;
        }
    }

    @XmlElement(
            name = "DEFOWNER"
    )
    @Nullable
    public Boolean isDefOwner() {
        return defOwner;
    }

    public GenAttrValueBuilder setDefOwner(Boolean defOwner) {
        this.defOwner = Objects.requireNonNull(defOwner);
        this.updDefOwner = true;
        return self();
    }

    public boolean isUpdDefOwner() {
        return updDefOwner;
    }

    public void setUpdDefOwner(boolean updDefOwner) {
        if (!this.updDefOwner && updDefOwner) {
            throw new InternalException("Cannot directly set update flag updDefOwner; set value instead");
        }
        this.updDefOwner = updDefOwner;
        if (!updDefOwner) {
            this.defOwner = null;
        }
    }

    @XmlElement(
            name = "DOCUMENTATION"
    )
    @Nullable
    public String getDocumentation() {
        return documentation;
    }

    public GenAttrValueBuilder setDocumentation(@Nullable String documentation) {
        this.documentation = documentation;
        this.updDocumentation = true;
        return self();
    }

    public boolean isUpdDocumentation() {
        return updDocumentation;
    }

    public void setUpdDocumentation(boolean updDocumentation) {
        this.updDocumentation = updDocumentation;
        if (!updDocumentation) {
            this.documentation = null;
        }
    }

    @XmlElement(
            name = "BITMAPORD"
    )
    @Nullable
    public Integer getBitmapOrd() {
        return bitmapOrd;
    }

    public GenAttrValueBuilder setBitmapOrd(@Nullable Integer bitmapOrd) {
        this.bitmapOrd = bitmapOrd;
        this.updBitmapOrd = true;
        return self();
    }

    public boolean isUpdBitmapOrd() {
        return updBitmapOrd;
    }

    public void setUpdBitmapOrd(boolean updBitmapOrd) {
        this.updBitmapOrd = updBitmapOrd;
        if (!updBitmapOrd) {
            this.bitmapOrd = null;
        }
    }

    @XmlElement(
            name = "X_ISFLAGDEPBIND"
    )
    @Nullable
    public Character getxIsFlagDepBind() {
        return xIsFlagDepBind;
    }

    public GenAttrValueBuilder setxIsFlagDepBind(Character xIsFlagDepBind) {
        this.xIsFlagDepBind = Objects.requireNonNull(xIsFlagDepBind);
        this.updXIsFlagDepBind = true;
        return self();
    }

    public boolean isUpdXIsFlagDepBind() {
        return updXIsFlagDepBind;
    }

    public void setUpdXIsFlagDepBind(boolean updXIsFlagDepBind) {
        if (!this.updXIsFlagDepBind && updXIsFlagDepBind) {
            throw new InternalException("Cannot directly set update flag updXIsFlagDepBind; set value instead");
        }
        this.updXIsFlagDepBind = updXIsFlagDepBind;
        if (!updXIsFlagDepBind) {
            this.xIsFlagDepBind = null;
        }
    }

    @XmlElement(
            name = "X_ISFLAGDEFATTR"
    )
    @Nullable
    public Boolean isxIsFlagDefAttr() {
        return xIsFlagDefAttr;
    }

    public GenAttrValueBuilder setxIsFlagDefAttr(Boolean xIsFlagDefAttr) {
        this.xIsFlagDefAttr = Objects.requireNonNull(xIsFlagDefAttr);
        this.updXIsFlagDefAttr = true;
        return self();
    }

    public boolean isUpdXIsFlagDefAttr() {
        return updXIsFlagDefAttr;
    }

    public void setUpdXIsFlagDefAttr(boolean updXIsFlagDefAttr) {
        if (!this.updXIsFlagDefAttr && updXIsFlagDefAttr) {
            throw new InternalException("Cannot directly set update flag updXIsFlagDefAttr; set value instead");
        }
        this.updXIsFlagDefAttr = updXIsFlagDefAttr;
        if (!updXIsFlagDefAttr) {
            this.xIsFlagDefAttr = null;
        }
    }

    @XmlElement(
            name = "COPIED"
    )
    @Nullable
    public Character getCopied() {
        return copied;
    }

    public GenAttrValueBuilder setCopied(Character copied) {
        this.copied = Objects.requireNonNull(copied);
        this.updCopied = true;
        return self();
    }

    public boolean isUpdCopied() {
        return updCopied;
    }

    public void setUpdCopied(boolean updCopied) {
        if (!this.updCopied && updCopied) {
            throw new InternalException("Cannot directly set update flag updCopied; set value instead");
        }
        this.updCopied = updCopied;
        if (!updCopied) {
            this.copied = null;
        }
    }

    @XmlElement(
            name = "KEYORD"
    )
    @Nullable
    public Double getKeyOrd() {
        return keyOrd;
    }

    public GenAttrValueBuilder setKeyOrd(@Nullable Double keyOrd) {
        this.keyOrd = keyOrd;
        this.updKeyOrd = true;
        return self();
    }

    public boolean isUpdKeyOrd() {
        return updKeyOrd;
    }

    public void setUpdKeyOrd(boolean updKeyOrd) {
        this.updKeyOrd = updKeyOrd;
        if (!updKeyOrd) {
            this.keyOrd = null;
        }
    }

    @XmlElement(
            name = "OPTYPETYPE_RF"
    )
    @Nullable
    public DtUid getOpTypeTypeRf() {
        return opTypeTypeRf;
    }

    public GenAttrValueBuilder setOpTypeTypeRf(@Nullable DtUid opTypeTypeRf) {
        this.opTypeTypeRf = opTypeTypeRf;
        this.updOpTypeTypeRf = true;
        return self();
    }

    public boolean isUpdOpTypeTypeRf() {
        return updOpTypeTypeRf;
    }

    public void setUpdOpTypeTypeRf(boolean updOpTypeTypeRf) {
        this.updOpTypeTypeRf = updOpTypeTypeRf;
        if (!updOpTypeTypeRf) {
            this.opTypeTypeRf = null;
        }
    }

    @XmlElement(
            name = "IMGSRC_ID"
    )
    @Nullable
    public DtUid getImgSrcId() {
        return imgSrcId;
    }

    public GenAttrValueBuilder setImgSrcId(@Nullable DtUid imgSrcId) {
        this.imgSrcId = imgSrcId;
        this.updImgSrcId = true;
        return self();
    }

    public boolean isUpdImgSrcId() {
        return updImgSrcId;
    }

    public void setUpdImgSrcId(boolean updImgSrcId) {
        this.updImgSrcId = updImgSrcId;
        if (!updImgSrcId) {
            this.imgSrcId = null;
        }
    }

    @XmlElement(
            name = "IMGWIDTH"
    )
    @Nullable
    public Double getImgWidth() {
        return imgWidth;
    }

    public GenAttrValueBuilder setImgWidth(@Nullable Double imgWidth) {
        this.imgWidth = imgWidth;
        this.updImgWidth = true;
        return self();
    }

    public boolean isUpdImgWidth() {
        return updImgWidth;
    }

    public void setUpdImgWidth(boolean updImgWidth) {
        this.updImgWidth = updImgWidth;
        if (!updImgWidth) {
            this.imgWidth = null;
        }
    }

    @XmlElement(
            name = "IMGHEIGHT"
    )
    @Nullable
    public Double getImgHeight() {
        return imgHeight;
    }

    public GenAttrValueBuilder setImgHeight(@Nullable Double imgHeight) {
        this.imgHeight = imgHeight;
        this.updImgHeight = true;
        return self();
    }

    public boolean isUpdImgHeight() {
        return updImgHeight;
    }

    public void setUpdImgHeight(boolean updImgHeight) {
        this.updImgHeight = updImgHeight;
        if (!updImgHeight) {
            this.imgHeight = null;
        }
    }

    @XmlElement(
            name = "FILESERVER_ID"
    )
    @Nullable
    public DtUid getFileServerId() {
        return fileServerId;
    }

    public GenAttrValueBuilder setFileServerId(@Nullable DtUid fileServerId) {
        this.fileServerId = fileServerId;
        this.updFileServerId = true;
        return self();
    }

    public boolean isUpdFileServerId() {
        return updFileServerId;
    }

    public void setUpdFileServerId(boolean updFileServerId) {
        this.updFileServerId = updFileServerId;
        if (!updFileServerId) {
            this.fileServerId = null;
        }
    }

    @XmlElement(
            name = "GENMIGR"
    )
    @Nullable
    public Boolean getGenMigr() {
        return genMigr;
    }

    public GenAttrValueBuilder setGenMigr(@Nullable Boolean genMigr) {
        this.genMigr = genMigr;
        this.updGenMigr = true;
        return self();
    }

    public boolean isUpdGenMigr() {
        return updGenMigr;
    }

    public void setUpdGenMigr(boolean updGenMigr) {
        this.updGenMigr = updGenMigr;
        if (!updGenMigr) {
            this.genMigr = null;
        }
    }

    @XmlElement(
            name = "EVALCVALUE"
    )
    @Nullable
    public Boolean getEvalCValue() {
        return evalCValue;
    }

    public GenAttrValueBuilder setEvalCValue(@Nullable Boolean evalCValue) {
        this.evalCValue = evalCValue;
        this.updEvalCValue = true;
        return self();
    }

    public boolean isUpdEvalCValue() {
        return updEvalCValue;
    }

    public void setUpdEvalCValue(boolean updEvalCValue) {
        this.updEvalCValue = updEvalCValue;
        if (!updEvalCValue) {
            this.evalCValue = null;
        }
    }

    @XmlElement(
            name = "OPTLOBLIMIT"
    )
    @Nullable
    public Double getOptLobLimit() {
        return optLobLimit;
    }

    public GenAttrValueBuilder setOptLobLimit(@Nullable Double optLobLimit) {
        this.optLobLimit = optLobLimit;
        this.updOptLobLimit = true;
        return self();
    }

    public boolean isUpdOptLobLimit() {
        return updOptLobLimit;
    }

    public void setUpdOptLobLimit(boolean updOptLobLimit) {
        this.updOptLobLimit = updOptLobLimit;
        if (!updOptLobLimit) {
            this.optLobLimit = null;
        }
    }

    @XmlElement(
            name = "MANLOBLIMIT"
    )
    @Nullable
    public Double getManLobLimit() {
        return manLobLimit;
    }

    public GenAttrValueBuilder setManLobLimit(@Nullable Double manLobLimit) {
        this.manLobLimit = manLobLimit;
        this.updManLobLimit = true;
        return self();
    }

    public boolean isUpdManLobLimit() {
        return updManLobLimit;
    }

    public void setUpdManLobLimit(boolean updManLobLimit) {
        this.updManLobLimit = updManLobLimit;
        if (!updManLobLimit) {
            this.manLobLimit = null;
        }
    }

    @Override
    @Nonnull
    public GenAttrValueBuilder self() {
        return this;
    }

    @Override
    @Nonnull
    public GenAttrValueBuilder copy() {
        return new GenAttrValueBuilder(this);
    }

    @Override
    @Nonnull
    public GenAttrValue build() {
        return new GenAttrValue(Objects.requireNonNull(getId(), "ATTR_ID must be specified for build")
                , Objects.requireNonNull(getEntityId(), "ENTITY_ID must be specified for build")
                , Objects.requireNonNull(getNameNm(), "NAME_NM must be specified for build")
                , Objects.requireNonNull(getName(), "NAME must be specified for build")
                , getNote()
                , Objects.requireNonNull(getAttrType(), "ATTRTYPE must be specified for build")
                , Objects.requireNonNull(isIsCustom(), "ISCUSTOM must be specified for build")
                , Objects.requireNonNull(isIsUsed(), "ISUSED must be specified for build")
                , getAttrGrpId()
                , Objects.requireNonNull(getOrd(), "ORD must be specified for build")
                , Objects.requireNonNull(getDomainId(), "DOMAIN_ID must be specified for build")
                , getSubdomainNm()
                , getProperNameRoot()
                , Objects.requireNonNull(isMandatory(), "MANDATORY must be specified for build")
                , Objects.requireNonNull(isOrdered(), "ORDERED must be specified for build")
                , getOrdGroup()
                , getDefValue()
                , Objects.requireNonNull(isMultiCreate(), "MULTICREATE must be specified for build")
                , Objects.requireNonNull(isGenCopy(), "GENCOPY must be specified for build")
                , Objects.requireNonNull(isGenMove(), "GENMOVE must be specified for build")
                , Objects.requireNonNull(isGenDelete(), "GENDELETE must be specified for build")
                , getTextSrcId()
                , Objects.requireNonNull(isHierarchical(), "HIERARCHICAL must be specified for build")
                , Objects.requireNonNull(isIsInTable(), "ISINTABLE must be specified for build")
                , Objects.requireNonNull(isIsOwn(), "ISOWN must be specified for build")
                , Objects.requireNonNull(isValidated(), "VALIDATED must be specified for build")
                , Objects.requireNonNull(isqVisible(), "QVISIBLE must be specified for build")
                , getlLength()
                , Objects.requireNonNull(isIndexed(), "INDEXED must be specified for build")
                , getUpNameNm()
                , Objects.requireNonNull(isReadOnly(), "READONLY must be specified for build")
                , getGetOpTypeId()
                , getSetOpTypeId()
                , getResetOpTypeId()
                , getConfirmOther()
                , getSetOtherOpTypeId()
                , Objects.requireNonNull(isMultivalue(), "MULTIVALUE must be specified for build")
                , Objects.requireNonNull(isLogAllowed(), "LOGALLOWED must be specified for build")
                , Objects.requireNonNull(getLogLevel(), "LOGLEVEL must be specified for build")
                , getDictType()
                , getDictDel1()
                , getDictDel2()
                , getTbCodeCd()
                , getAccountRuleNm()
                , getAccDocObjectFormulaId()
                , getOwnerFormulaId()
                , getFromObjectFormulaId()
                , getToObjectFormulaId()
                , getApproxRecord()
                , getValueAccountNm()
                , getValueAmountType()
                , Objects.requireNonNull(isDefOwner(), "DEFOWNER must be specified for build")
                , getDocumentation()
                , getBitmapOrd()
                , Objects.requireNonNull(getxIsFlagDepBind(), "X_ISFLAGDEPBIND must be specified for build")
                , Objects.requireNonNull(isxIsFlagDefAttr(), "X_ISFLAGDEFATTR must be specified for build")
                , Objects.requireNonNull(getCopied(), "COPIED must be specified for build")
                , getKeyOrd()
                , getOpTypeTypeRf()
                , getImgSrcId()
                , getImgWidth()
                , getImgHeight()
                , getFileServerId()
                , getGenMigr()
                , getEvalCValue()
                , getOptLobLimit()
                , getManLobLimit()
        );
    }

    @Override
    @SuppressWarnings("squid:S1206")
    public boolean equals(@Nullable Object o) {
        if (this == o) return true;
        if (!(o instanceof GenAttrValueBuilder)) return false;
        if (!super.equals(o)) return false;
        GenAttrValueBuilder that = (GenAttrValueBuilder) o;
        return Objects.equals(entityId, that.entityId) &&
                (updEntityId == that.updEntityId) &&
                Objects.equals(nameNm, that.nameNm) &&
                (updNameNm == that.updNameNm) &&
                Objects.equals(name, that.name) &&
                (updName == that.updName) &&
                Objects.equals(note, that.note) &&
                (updNote == that.updNote) &&
                Objects.equals(attrType, that.attrType) &&
                (updAttrType == that.updAttrType) &&
                Objects.equals(isCustom, that.isCustom) &&
                (updIsCustom == that.updIsCustom) &&
                Objects.equals(isUsed, that.isUsed) &&
                (updIsUsed == that.updIsUsed) &&
                Objects.equals(attrGrpId, that.attrGrpId) &&
                (updAttrGrpId == that.updAttrGrpId) &&
                Objects.equals(ord, that.ord) &&
                (updOrd == that.updOrd) &&
                Objects.equals(domainId, that.domainId) &&
                (updDomainId == that.updDomainId) &&
                Objects.equals(subdomainNm, that.subdomainNm) &&
                (updSubdomainNm == that.updSubdomainNm) &&
                Objects.equals(properNameRoot, that.properNameRoot) &&
                (updProperNameRoot == that.updProperNameRoot) &&
                Objects.equals(mandatory, that.mandatory) &&
                (updMandatory == that.updMandatory) &&
                Objects.equals(ordered, that.ordered) &&
                (updOrdered == that.updOrdered) &&
                Objects.equals(ordGroup, that.ordGroup) &&
                (updOrdGroup == that.updOrdGroup) &&
                Objects.equals(defValue, that.defValue) &&
                (updDefValue == that.updDefValue) &&
                Objects.equals(multiCreate, that.multiCreate) &&
                (updMultiCreate == that.updMultiCreate) &&
                Objects.equals(genCopy, that.genCopy) &&
                (updGenCopy == that.updGenCopy) &&
                Objects.equals(genMove, that.genMove) &&
                (updGenMove == that.updGenMove) &&
                Objects.equals(genDelete, that.genDelete) &&
                (updGenDelete == that.updGenDelete) &&
                Objects.equals(textSrcId, that.textSrcId) &&
                (updTextSrcId == that.updTextSrcId) &&
                Objects.equals(hierarchical, that.hierarchical) &&
                (updHierarchical == that.updHierarchical) &&
                Objects.equals(isInTable, that.isInTable) &&
                (updIsInTable == that.updIsInTable) &&
                Objects.equals(isOwn, that.isOwn) &&
                (updIsOwn == that.updIsOwn) &&
                Objects.equals(validated, that.validated) &&
                (updValidated == that.updValidated) &&
                Objects.equals(qVisible, that.qVisible) &&
                (updQVisible == that.updQVisible) &&
                Objects.equals(lLength, that.lLength) &&
                (updLLength == that.updLLength) &&
                Objects.equals(indexed, that.indexed) &&
                (updIndexed == that.updIndexed) &&
                Objects.equals(upNameNm, that.upNameNm) &&
                (updUpNameNm == that.updUpNameNm) &&
                Objects.equals(readOnly, that.readOnly) &&
                (updReadOnly == that.updReadOnly) &&
                Objects.equals(getOpTypeId, that.getOpTypeId) &&
                (updGetOpTypeId == that.updGetOpTypeId) &&
                Objects.equals(setOpTypeId, that.setOpTypeId) &&
                (updSetOpTypeId == that.updSetOpTypeId) &&
                Objects.equals(resetOpTypeId, that.resetOpTypeId) &&
                (updResetOpTypeId == that.updResetOpTypeId) &&
                Objects.equals(confirmOther, that.confirmOther) &&
                (updConfirmOther == that.updConfirmOther) &&
                Objects.equals(setOtherOpTypeId, that.setOtherOpTypeId) &&
                (updSetOtherOpTypeId == that.updSetOtherOpTypeId) &&
                Objects.equals(multivalue, that.multivalue) &&
                (updMultivalue == that.updMultivalue) &&
                Objects.equals(logAllowed, that.logAllowed) &&
                (updLogAllowed == that.updLogAllowed) &&
                Objects.equals(logLevel, that.logLevel) &&
                (updLogLevel == that.updLogLevel) &&
                Objects.equals(dictType, that.dictType) &&
                (updDictType == that.updDictType) &&
                Objects.equals(dictDel1, that.dictDel1) &&
                (updDictDel1 == that.updDictDel1) &&
                Objects.equals(dictDel2, that.dictDel2) &&
                (updDictDel2 == that.updDictDel2) &&
                Objects.equals(tbCodeCd, that.tbCodeCd) &&
                (updTbCodeCd == that.updTbCodeCd) &&
                Objects.equals(accountRuleNm, that.accountRuleNm) &&
                (updAccountRuleNm == that.updAccountRuleNm) &&
                Objects.equals(accDocObjectFormulaId, that.accDocObjectFormulaId) &&
                (updAccDocObjectFormulaId == that.updAccDocObjectFormulaId) &&
                Objects.equals(ownerFormulaId, that.ownerFormulaId) &&
                (updOwnerFormulaId == that.updOwnerFormulaId) &&
                Objects.equals(fromObjectFormulaId, that.fromObjectFormulaId) &&
                (updFromObjectFormulaId == that.updFromObjectFormulaId) &&
                Objects.equals(toObjectFormulaId, that.toObjectFormulaId) &&
                (updToObjectFormulaId == that.updToObjectFormulaId) &&
                Objects.equals(approxRecord, that.approxRecord) &&
                (updApproxRecord == that.updApproxRecord) &&
                Objects.equals(valueAccountNm, that.valueAccountNm) &&
                (updValueAccountNm == that.updValueAccountNm) &&
                Objects.equals(valueAmountType, that.valueAmountType) &&
                (updValueAmountType == that.updValueAmountType) &&
                Objects.equals(defOwner, that.defOwner) &&
                (updDefOwner == that.updDefOwner) &&
                Objects.equals(documentation, that.documentation) &&
                (updDocumentation == that.updDocumentation) &&
                Objects.equals(bitmapOrd, that.bitmapOrd) &&
                (updBitmapOrd == that.updBitmapOrd) &&
                Objects.equals(xIsFlagDepBind, that.xIsFlagDepBind) &&
                (updXIsFlagDepBind == that.updXIsFlagDepBind) &&
                Objects.equals(xIsFlagDefAttr, that.xIsFlagDefAttr) &&
                (updXIsFlagDefAttr == that.updXIsFlagDefAttr) &&
                Objects.equals(copied, that.copied) &&
                (updCopied == that.updCopied) &&
                Objects.equals(keyOrd, that.keyOrd) &&
                (updKeyOrd == that.updKeyOrd) &&
                Objects.equals(opTypeTypeRf, that.opTypeTypeRf) &&
                (updOpTypeTypeRf == that.updOpTypeTypeRf) &&
                Objects.equals(imgSrcId, that.imgSrcId) &&
                (updImgSrcId == that.updImgSrcId) &&
                Objects.equals(imgWidth, that.imgWidth) &&
                (updImgWidth == that.updImgWidth) &&
                Objects.equals(imgHeight, that.imgHeight) &&
                (updImgHeight == that.updImgHeight) &&
                Objects.equals(fileServerId, that.fileServerId) &&
                (updFileServerId == that.updFileServerId) &&
                Objects.equals(genMigr, that.genMigr) &&
                (updGenMigr == that.updGenMigr) &&
                Objects.equals(evalCValue, that.evalCValue) &&
                (updEvalCValue == that.updEvalCValue) &&
                Objects.equals(optLobLimit, that.optLobLimit) &&
                (updOptLobLimit == that.updOptLobLimit) &&
                Objects.equals(manLobLimit, that.manLobLimit) &&
                (updManLobLimit == that.updManLobLimit);
    }

    @Override
    public String toString() {
        return "AttrValueBuilder{" +
                "  entityId =" + entityId +
                ", updEntityId = " + updEntityId +
                ", nameNm ='" + nameNm + '\'' +
                ", updNameNm = " + updNameNm +
                ", name ='" + name + '\'' +
                ", updName = " + updName +
                ", note ='" + note + '\'' +
                ", updNote = " + updNote +
                ", attrType =" + attrType +
                ", updAttrType = " + updAttrType +
                ", isCustom =" + isCustom +
                ", updIsCustom = " + updIsCustom +
                ", isUsed =" + isUsed +
                ", updIsUsed = " + updIsUsed +
                ", attrGrpId =" + attrGrpId +
                ", updAttrGrpId = " + updAttrGrpId +
                ", ord =" + ord +
                ", updOrd = " + updOrd +
                ", domainId =" + domainId +
                ", updDomainId = " + updDomainId +
                ", subdomainNm ='" + subdomainNm + '\'' +
                ", updSubdomainNm = " + updSubdomainNm +
                ", properNameRoot ='" + properNameRoot + '\'' +
                ", updProperNameRoot = " + updProperNameRoot +
                ", mandatory =" + mandatory +
                ", updMandatory = " + updMandatory +
                ", ordered =" + ordered +
                ", updOrdered = " + updOrdered +
                ", ordGroup ='" + ordGroup + '\'' +
                ", updOrdGroup = " + updOrdGroup +
                ", defValue ='" + defValue + '\'' +
                ", updDefValue = " + updDefValue +
                ", multiCreate =" + multiCreate +
                ", updMultiCreate = " + updMultiCreate +
                ", genCopy =" + genCopy +
                ", updGenCopy = " + updGenCopy +
                ", genMove =" + genMove +
                ", updGenMove = " + updGenMove +
                ", genDelete =" + genDelete +
                ", updGenDelete = " + updGenDelete +
                ", textSrcId =" + textSrcId +
                ", updTextSrcId = " + updTextSrcId +
                ", hierarchical =" + hierarchical +
                ", updHierarchical = " + updHierarchical +
                ", isInTable =" + isInTable +
                ", updIsInTable = " + updIsInTable +
                ", isOwn =" + isOwn +
                ", updIsOwn = " + updIsOwn +
                ", validated =" + validated +
                ", updValidated = " + updValidated +
                ", qVisible =" + qVisible +
                ", updQVisible = " + updQVisible +
                ", lLength =" + lLength +
                ", updLLength = " + updLLength +
                ", indexed =" + indexed +
                ", updIndexed = " + updIndexed +
                ", upNameNm ='" + upNameNm + '\'' +
                ", updUpNameNm = " + updUpNameNm +
                ", readOnly =" + readOnly +
                ", updReadOnly = " + updReadOnly +
                ", getOpTypeId =" + getOpTypeId +
                ", updGetOpTypeId = " + updGetOpTypeId +
                ", setOpTypeId =" + setOpTypeId +
                ", updSetOpTypeId = " + updSetOpTypeId +
                ", resetOpTypeId =" + resetOpTypeId +
                ", updResetOpTypeId = " + updResetOpTypeId +
                ", confirmOther =" + confirmOther +
                ", updConfirmOther = " + updConfirmOther +
                ", setOtherOpTypeId =" + setOtherOpTypeId +
                ", updSetOtherOpTypeId = " + updSetOtherOpTypeId +
                ", multivalue =" + multivalue +
                ", updMultivalue = " + updMultivalue +
                ", logAllowed =" + logAllowed +
                ", updLogAllowed = " + updLogAllowed +
                ", logLevel =" + logLevel +
                ", updLogLevel = " + updLogLevel +
                ", dictType =" + dictType +
                ", updDictType = " + updDictType +
                ", dictDel1 ='" + dictDel1 + '\'' +
                ", updDictDel1 = " + updDictDel1 +
                ", dictDel2 ='" + dictDel2 + '\'' +
                ", updDictDel2 = " + updDictDel2 +
                ", tbCodeCd ='" + tbCodeCd + '\'' +
                ", updTbCodeCd = " + updTbCodeCd +
                ", accountRuleNm ='" + accountRuleNm + '\'' +
                ", updAccountRuleNm = " + updAccountRuleNm +
                ", accDocObjectFormulaId =" + accDocObjectFormulaId +
                ", updAccDocObjectFormulaId = " + updAccDocObjectFormulaId +
                ", ownerFormulaId =" + ownerFormulaId +
                ", updOwnerFormulaId = " + updOwnerFormulaId +
                ", fromObjectFormulaId =" + fromObjectFormulaId +
                ", updFromObjectFormulaId = " + updFromObjectFormulaId +
                ", toObjectFormulaId =" + toObjectFormulaId +
                ", updToObjectFormulaId = " + updToObjectFormulaId +
                ", approxRecord =" + approxRecord +
                ", updApproxRecord = " + updApproxRecord +
                ", valueAccountNm ='" + valueAccountNm + '\'' +
                ", updValueAccountNm = " + updValueAccountNm +
                ", valueAmountType =" + valueAmountType +
                ", updValueAmountType = " + updValueAmountType +
                ", defOwner =" + defOwner +
                ", updDefOwner = " + updDefOwner +
                ", documentation ='" + documentation + '\'' +
                ", updDocumentation = " + updDocumentation +
                ", bitmapOrd =" + bitmapOrd +
                ", updBitmapOrd = " + updBitmapOrd +
                ", xIsFlagDepBind =" + xIsFlagDepBind +
                ", updXIsFlagDepBind = " + updXIsFlagDepBind +
                ", xIsFlagDefAttr =" + xIsFlagDefAttr +
                ", updXIsFlagDefAttr = " + updXIsFlagDefAttr +
                ", copied =" + copied +
                ", updCopied = " + updCopied +
                ", keyOrd =" + keyOrd +
                ", updKeyOrd = " + updKeyOrd +
                ", opTypeTypeRf =" + opTypeTypeRf +
                ", updOpTypeTypeRf = " + updOpTypeTypeRf +
                ", imgSrcId =" + imgSrcId +
                ", updImgSrcId = " + updImgSrcId +
                ", imgWidth =" + imgWidth +
                ", updImgWidth = " + updImgWidth +
                ", imgHeight =" + imgHeight +
                ", updImgHeight = " + updImgHeight +
                ", fileServerId =" + fileServerId +
                ", updFileServerId = " + updFileServerId +
                ", genMigr =" + genMigr +
                ", updGenMigr = " + updGenMigr +
                ", evalCValue =" + evalCValue +
                ", updEvalCValue = " + updEvalCValue +
                ", optLobLimit =" + optLobLimit +
                ", updOptLobLimit = " + updOptLobLimit +
                ", manLobLimit =" + manLobLimit +
                ", updManLobLimit = " + updManLobLimit +
                "} " + super.toString();
    }
}