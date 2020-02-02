package com.provys.catalogue.impl;

import com.provys.catalogue.api.Entity;
import com.provys.catalogue.api.EntityGrp;
import com.provys.common.datatype.DtUid;
import com.provys.provysobject.impl.ProvysNmObjectProxyImpl;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.processing.Generated;

@Generated("com.provys.provysobject.generator.impl.GeneratorEntity")
abstract class GenEntityProxy extends ProvysNmObjectProxyImpl<Entity, GenEntityValue, EntityProxy, EntityManagerImpl> {
    GenEntityProxy(EntityManagerImpl manager, DtUid id) {
        super(manager, id);
    }

    @Nonnull
    public String getName() {
        return validateValueObject().getName();
    }

    public boolean isObjectClass() {
        return validateValueObject().isObjectClass();
    }

    public boolean isIsCustom() {
        return validateValueObject().isIsCustom();
    }

    @Nonnull
    public Optional<String> getTableNm() {
        return validateValueObject().getTableNm();
    }

    @Nonnull
    public Optional<String> getViewNm() {
        return validateValueObject().getViewNm();
    }

    @Nonnull
    public Optional<String> getKeyNm() {
        return validateValueObject().getKeyNm();
    }

    @Nonnull
    public Optional<String> getTextTableNm() {
        return validateValueObject().getTextTableNm();
    }

    @Nonnull
    public Optional<String> getTextViewNm() {
        return validateValueObject().getTextViewNm();
    }

    @Nonnull
    public Optional<String> getTextKeyNm() {
        return validateValueObject().getTextKeyNm();
    }

    @Nonnull
    public Optional<Boolean> isTextAll() {
        return validateValueObject().isTextAll();
    }

    @Nonnull
    public Optional<String> getPgPackageNm() {
        return validateValueObject().getPgPackageNm();
    }

    @Nonnull
    public Optional<String> getEpPackageNm() {
        return validateValueObject().getEpPackageNm();
    }

    @Nonnull
    public Optional<String> getCpPackageNm() {
        return validateValueObject().getCpPackageNm();
    }

    @Nonnull
    public Optional<String> getFpPackageNm() {
        return validateValueObject().getFpPackageNm();
    }

    @Nonnull
    public Optional<String> getProperName() {
        return validateValueObject().getProperName();
    }

    @Nonnull
    public Optional<DtUid> getMasterId() {
        return validateValueObject().getMasterId();
    }

    public char getMasterType() {
        return validateValueObject().getMasterType();
    }

    @Nonnull
    public Optional<Character> getUserLockType() {
        return validateValueObject().getUserLockType();
    }

    @Nonnull
    public Optional<Character> getImportType() {
        return validateValueObject().getImportType();
    }

    @Nonnull
    public Optional<Character> getConfObj() {
        return validateValueObject().getConfObj();
    }

    @Nonnull
    public Optional<String> getBasePath() {
        return validateValueObject().getBasePath();
    }

    public boolean isIncompleteKey() {
        return validateValueObject().isIncompleteKey();
    }

    @Nonnull
    public Optional<Boolean> isConfObjAll() {
        return validateValueObject().isConfObjAll();
    }

    @Nonnull
    public Optional<EntityGrp> getEntityGrp() {
        return getEntityGrpId().map(id -> getManager().getRepository().getEntityGrpManager().getById(id));
    }

    @Nonnull
    public Optional<DtUid> getEntityGrpId() {
        return validateValueObject().getEntityGrpId();
    }

    @Nonnull
    public Optional<Entity> getAncestor() {
        return getAncestorId().map(id -> getManager().getRepository().getEntityManager().getById(id));
    }

    @Nonnull
    public Optional<DtUid> getAncestorId() {
        return validateValueObject().getAncestorId();
    }

    @Nonnull
    public Optional<String> getNote() {
        return validateValueObject().getNote();
    }

    @Nonnull
    public Optional<String> getCustomNote() {
        return validateValueObject().getCustomNote();
    }

    @Nonnull
    public Optional<String> getStructureDoc() {
        return validateValueObject().getStructureDoc();
    }

    @Nonnull
    public Optional<String> getUsageDoc() {
        return validateValueObject().getUsageDoc();
    }

    @Nonnull
    public Optional<String> getBehaviourDoc() {
        return validateValueObject().getBehaviourDoc();
    }

    @Nonnull
    public Optional<String> getImplDoc() {
        return validateValueObject().getImplDoc();
    }

    public boolean isIsUsed() {
        return validateValueObject().isIsUsed();
    }

    public boolean isGetRightCustom() {
        return validateValueObject().isGetRightCustom();
    }

    @Nonnull
    public Optional<DtUid> getGetRightRestrId() {
        return validateValueObject().getGetRightRestrId();
    }

    @Nonnull
    public Optional<DtUid> getGetOpTypeId() {
        return validateValueObject().getGetOpTypeId();
    }

    @Nonnull
    public Optional<Integer> getKeepDeleted() {
        return validateValueObject().getKeepDeleted();
    }

    @Nonnull
    public Optional<String> getShortDesc() {
        return validateValueObject().getShortDesc();
    }

    @Nonnull
    public Optional<String> getLongDesc() {
        return validateValueObject().getLongDesc();
    }

    public double getxCopiedAttr0() {
        return validateValueObject().getxCopiedAttr0();
    }

    public double getxCopiedAttr1() {
        return validateValueObject().getxCopiedAttr1();
    }

    public double getxCopiedAttr2() {
        return validateValueObject().getxCopiedAttr2();
    }

    public double getxCopiedAttr3() {
        return validateValueObject().getxCopiedAttr3();
    }

    public double getxCopiedAttr4() {
        return validateValueObject().getxCopiedAttr4();
    }

    public double getxCopiedAttr5() {
        return validateValueObject().getxCopiedAttr5();
    }

    public boolean isxHasLiability() {
        return validateValueObject().isxHasLiability();
    }

    @Nonnull
    public Optional<Boolean> isUseConfObj() {
        return validateValueObject().isUseConfObj();
    }

    @Nonnull
    public Optional<Boolean> isxUseConfObj() {
        return validateValueObject().isxUseConfObj();
    }

    public double getxNotifyAttr0() {
        return validateValueObject().getxNotifyAttr0();
    }

    public double getxNotifyAttr1() {
        return validateValueObject().getxNotifyAttr1();
    }

    public double getxNotifyAttr2() {
        return validateValueObject().getxNotifyAttr2();
    }

    public double getxNotifyAttr3() {
        return validateValueObject().getxNotifyAttr3();
    }

    public double getxNotifyAttr4() {
        return validateValueObject().getxNotifyAttr4();
    }

    public double getxNotifyAttr5() {
        return validateValueObject().getxNotifyAttr5();
    }

    public double getxFlagDefInterest0() {
        return validateValueObject().getxFlagDefInterest0();
    }

    public double getxFlagDefInterest1() {
        return validateValueObject().getxFlagDefInterest1();
    }

    public double getxFlagDefInterest2() {
        return validateValueObject().getxFlagDefInterest2();
    }

    public double getxFlagDefInterest3() {
        return validateValueObject().getxFlagDefInterest3();
    }

    public double getxFlagDefInterest4() {
        return validateValueObject().getxFlagDefInterest4();
    }

    public double getxFlagDefInterest5() {
        return validateValueObject().getxFlagDefInterest5();
    }

    public double getxDelNotifyAttr0() {
        return validateValueObject().getxDelNotifyAttr0();
    }

    public double getxDelNotifyAttr1() {
        return validateValueObject().getxDelNotifyAttr1();
    }

    public double getxDelNotifyAttr2() {
        return validateValueObject().getxDelNotifyAttr2();
    }

    public double getxDelNotifyAttr3() {
        return validateValueObject().getxDelNotifyAttr3();
    }

    public double getxDelNotifyAttr4() {
        return validateValueObject().getxDelNotifyAttr4();
    }

    public double getxDelNotifyAttr5() {
        return validateValueObject().getxDelNotifyAttr5();
    }

    @Nonnull
    public Optional<Boolean> isxHasDelRowFlagDef() {
        return validateValueObject().isxHasDelRowFlagDef();
    }
}
