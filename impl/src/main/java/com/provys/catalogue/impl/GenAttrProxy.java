package com.provys.catalogue.impl;

import com.provys.catalogue.Attr;
import com.provys.catalogue.AttrGrp;
import com.provys.catalogue.Domain;
import com.provys.catalogue.Entity;
import com.provys.common.datatype.DtUid;
import com.provys.provysobject.impl.ProvysObjectProxyImpl;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.processing.Generated;

@Generated("com.provys.provysobject.generator.impl.GeneratorEntity")
abstract class GenAttrProxy extends ProvysObjectProxyImpl<Attr, GenAttrValue, AttrProxy, AttrManagerImpl> {
    GenAttrProxy(AttrManagerImpl manager, DtUid id) {
        super(manager, id);
    }

    @Nonnull
    public Entity getEntity() {
        return getManager().getRepository().getEntityManager().getById(getEntityId());
    }

    @Nonnull
    public DtUid getEntityId() {
        return validateValueObject().getEntityId();
    }

    @Nonnull
    public String getNameNm() {
        return validateValueObject().getNameNm();
    }

    @Nonnull
    public String getName() {
        return validateValueObject().getName();
    }

    @Nonnull
    public Optional<String> getNote() {
        return validateValueObject().getNote();
    }

    public char getAttrType() {
        return validateValueObject().getAttrType();
    }

    public boolean isIsCustom() {
        return validateValueObject().isIsCustom();
    }

    public boolean isIsUsed() {
        return validateValueObject().isIsUsed();
    }

    @Nonnull
    public Optional<AttrGrp> getAttrGrp() {
        return getAttrGrpId().map(id -> getManager().getRepository().getAttrGrpManager().getById(id));
    }

    @Nonnull
    public Optional<DtUid> getAttrGrpId() {
        return validateValueObject().getAttrGrpId();
    }

    public double getOrd() {
        return validateValueObject().getOrd();
    }

    @Nonnull
    public Domain getDomain() {
        return getManager().getRepository().getDomainManager().getById(getDomainId());
    }

    @Nonnull
    public DtUid getDomainId() {
        return validateValueObject().getDomainId();
    }

    @Nonnull
    public Optional<String> getSubdomainNm() {
        return validateValueObject().getSubdomainNm();
    }

    @Nonnull
    public Optional<String> getProperNameRoot() {
        return validateValueObject().getProperNameRoot();
    }

    public boolean isMandatory() {
        return validateValueObject().isMandatory();
    }

    public boolean isOrdered() {
        return validateValueObject().isOrdered();
    }

    @Nonnull
    public Optional<String> getOrdGroup() {
        return validateValueObject().getOrdGroup();
    }

    @Nonnull
    public Optional<String> getDefValue() {
        return validateValueObject().getDefValue();
    }

    public boolean isMultiCreate() {
        return validateValueObject().isMultiCreate();
    }

    public boolean isGenCopy() {
        return validateValueObject().isGenCopy();
    }

    public boolean isGenMove() {
        return validateValueObject().isGenMove();
    }

    public boolean isGenDelete() {
        return validateValueObject().isGenDelete();
    }

    @Nonnull
    public Optional<Attr> getTextSrc() {
        return getTextSrcId().map(id -> getManager().getRepository().getAttrManager().getById(id));
    }

    @Nonnull
    public Optional<DtUid> getTextSrcId() {
        return validateValueObject().getTextSrcId();
    }

    public boolean isHierarchical() {
        return validateValueObject().isHierarchical();
    }

    public boolean isIsInTable() {
        return validateValueObject().isIsInTable();
    }

    public boolean isIsOwn() {
        return validateValueObject().isIsOwn();
    }

    public boolean isValidated() {
        return validateValueObject().isValidated();
    }

    public boolean isqVisible() {
        return validateValueObject().isqVisible();
    }

    @Nonnull
    public Optional<Double> getlLength() {
        return validateValueObject().getlLength();
    }

    public boolean isIndexed() {
        return validateValueObject().isIndexed();
    }

    @Nonnull
    public Optional<String> getUpNameNm() {
        return validateValueObject().getUpNameNm();
    }

    public boolean isReadOnly() {
        return validateValueObject().isReadOnly();
    }

    @Nonnull
    public Optional<DtUid> getGetOpTypeId() {
        return validateValueObject().getGetOpTypeId();
    }

    @Nonnull
    public Optional<DtUid> getSetOpTypeId() {
        return validateValueObject().getSetOpTypeId();
    }

    @Nonnull
    public Optional<DtUid> getResetOpTypeId() {
        return validateValueObject().getResetOpTypeId();
    }

    @Nonnull
    public Optional<Boolean> isConfirmOther() {
        return validateValueObject().isConfirmOther();
    }

    @Nonnull
    public Optional<DtUid> getSetOtherOpTypeId() {
        return validateValueObject().getSetOtherOpTypeId();
    }

    public boolean isMultivalue() {
        return validateValueObject().isMultivalue();
    }

    public boolean isLogAllowed() {
        return validateValueObject().isLogAllowed();
    }

    public char getLogLevel() {
        return validateValueObject().getLogLevel();
    }

    @Nonnull
    public Optional<Character> getDictType() {
        return validateValueObject().getDictType();
    }

    @Nonnull
    public Optional<String> getDictDel1() {
        return validateValueObject().getDictDel1();
    }

    @Nonnull
    public Optional<String> getDictDel2() {
        return validateValueObject().getDictDel2();
    }

    @Nonnull
    public Optional<String> getTbCodeCd() {
        return validateValueObject().getTbCodeCd();
    }

    @Nonnull
    public Optional<String> getAccountRuleNm() {
        return validateValueObject().getAccountRuleNm();
    }

    @Nonnull
    public Optional<Attr> getAccDocObjectFormula() {
        return getAccDocObjectFormulaId().map(id -> getManager().getRepository().getAttrManager().getById(id));
    }

    @Nonnull
    public Optional<DtUid> getAccDocObjectFormulaId() {
        return validateValueObject().getAccDocObjectFormulaId();
    }

    @Nonnull
    public Optional<Attr> getOwnerFormula() {
        return getOwnerFormulaId().map(id -> getManager().getRepository().getAttrManager().getById(id));
    }

    @Nonnull
    public Optional<DtUid> getOwnerFormulaId() {
        return validateValueObject().getOwnerFormulaId();
    }

    @Nonnull
    public Optional<Attr> getFromObjectFormula() {
        return getFromObjectFormulaId().map(id -> getManager().getRepository().getAttrManager().getById(id));
    }

    @Nonnull
    public Optional<DtUid> getFromObjectFormulaId() {
        return validateValueObject().getFromObjectFormulaId();
    }

    @Nonnull
    public Optional<Attr> getToObjectFormula() {
        return getToObjectFormulaId().map(id -> getManager().getRepository().getAttrManager().getById(id));
    }

    @Nonnull
    public Optional<DtUid> getToObjectFormulaId() {
        return validateValueObject().getToObjectFormulaId();
    }

    @Nonnull
    public Optional<Boolean> isApproxRecord() {
        return validateValueObject().isApproxRecord();
    }

    @Nonnull
    public Optional<String> getValueAccountNm() {
        return validateValueObject().getValueAccountNm();
    }

    @Nonnull
    public Optional<Character> getValueAmountType() {
        return validateValueObject().getValueAmountType();
    }

    public boolean isDefOwner() {
        return validateValueObject().isDefOwner();
    }

    @Nonnull
    public Optional<String> getDocumentation() {
        return validateValueObject().getDocumentation();
    }

    @Nonnull
    public Optional<Integer> getBitmapOrd() {
        return validateValueObject().getBitmapOrd();
    }

    public char getxIsFlagDepBind() {
        return validateValueObject().getxIsFlagDepBind();
    }

    public boolean isxIsFlagDefAttr() {
        return validateValueObject().isxIsFlagDefAttr();
    }

    public char getCopied() {
        return validateValueObject().getCopied();
    }

    @Nonnull
    public Optional<Double> getKeyOrd() {
        return validateValueObject().getKeyOrd();
    }

    @Nonnull
    public Optional<DtUid> getOpTypeTypeRf() {
        return validateValueObject().getOpTypeTypeRf();
    }

    @Nonnull
    public Optional<Attr> getImgSrc() {
        return getImgSrcId().map(id -> getManager().getRepository().getAttrManager().getById(id));
    }

    @Nonnull
    public Optional<DtUid> getImgSrcId() {
        return validateValueObject().getImgSrcId();
    }

    @Nonnull
    public Optional<Double> getImgWidth() {
        return validateValueObject().getImgWidth();
    }

    @Nonnull
    public Optional<Double> getImgHeight() {
        return validateValueObject().getImgHeight();
    }

    @Nonnull
    public Optional<DtUid> getFileServerId() {
        return validateValueObject().getFileServerId();
    }

    @Nonnull
    public Optional<Boolean> isGenMigr() {
        return validateValueObject().isGenMigr();
    }

    @Nonnull
    public Optional<Boolean> isEvalCValue() {
        return validateValueObject().isEvalCValue();
    }

    @Nonnull
    public Optional<Double> getOptLobLimit() {
        return validateValueObject().getOptLobLimit();
    }

    @Nonnull
    public Optional<Double> getManLobLimit() {
        return validateValueObject().getManLobLimit();
    }
}
