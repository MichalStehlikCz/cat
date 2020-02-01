package com.provys.catalogue.api;

import com.provys.common.datatype.DtUid;
import com.provys.provysobject.ProvysNmObject;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.processing.Generated;

@Generated("com.provys.provysobject.generator.impl.GeneratorEntity")
interface GenEntity extends ProvysNmObject {
    /**
     * @return Name (attribute NAME)
     */
    @Nonnull
    String getName();

    /**
     * @return Object class (attribute OBJECTCLASS)
     */
    boolean isObjectClass();

    /**
     * @return Is custom (attribute ISCUSTOM)
     */
    boolean isIsCustom();

    /**
     * @return Table (attribute TABLE_NM)
     */
    @Nonnull
    Optional<String> getTableNm();

    /**
     * @return View (attribute VIEW_NM)
     */
    @Nonnull
    Optional<String> getViewNm();

    /**
     * @return Key (attribute KEY_NM)
     */
    @Nonnull
    Optional<String> getKeyNm();

    /**
     * @return Translations table (attribute TEXTTABLE_NM)
     */
    @Nonnull
    Optional<String> getTextTableNm();

    /**
     * @return Translations view (attribute TEXTVIEW_NM)
     */
    @Nonnull
    Optional<String> getTextViewNm();

    /**
     * @return Translations key (attribute TEXTKEY_NM)
     */
    @Nonnull
    Optional<String> getTextKeyNm();

    /**
     * @return Own translations table (attribute TEXTALL)
     */
    @Nonnull
    Optional<Boolean> isTextAll();

    /**
     * @return PG package (attribute PGPACKAGE_NM)
     */
    @Nonnull
    Optional<String> getPgPackageNm();

    /**
     * @return EP package (attribute EPPACKAGE_NM)
     */
    @Nonnull
    Optional<String> getEpPackageNm();

    /**
     * @return CP package (attribute CPPACKAGE_NM)
     */
    @Nonnull
    Optional<String> getCpPackageNm();

    /**
     * @return FP package (attribute FPPACKAGE_NM)
     */
    @Nonnull
    Optional<String> getFpPackageNm();

    /**
     * @return Proper-case name (attribute PROPERNAME)
     */
    @Nonnull
    Optional<String> getProperName();

    /**
     * @return Master (attribute MASTER_ID)
     */
    @Nonnull
    Optional<DtUid> getMasterId();

    /**
     * @return Master type (attribute MASTERTYPE)
     */
    char getMasterType();

    /**
     * @return Lock usage (attribute USERLOCKTYPE)
     */
    @Nonnull
    Optional<Character> getUserLockType();

    /**
     * @return Import type (attribute IMPORTTYPE)
     */
    @Nonnull
    Optional<Character> getImportType();

    /**
     * @return Configuration object (attribute CONFOBJ)
     */
    @Nonnull
    Optional<Character> getConfObj();

    /**
     * @return Base path (attribute BASEPATH)
     */
    @Nonnull
    Optional<String> getBasePath();

    /**
     * @return Internal key (attribute INCOMPLETEKEY)
     */
    boolean isIncompleteKey();

    /**
     * @return All masters (attribute CONFOBJALL)
     */
    @Nonnull
    Optional<Boolean> isConfObjAll();

    /**
     * @return Entity group (object referenced by attribute ENTITYGRP_ID)
     */
    @Nonnull
    Optional<EntityGrp> getEntityGrp();

    /**
     * @return Entity group Id (attribute ENTITYGRP_ID)
     */
    @Nonnull
    Optional<DtUid> getEntityGrpId();

    /**
     * @return Ancestor (object referenced by attribute ANCESTOR_ID)
     */
    @Nonnull
    Optional<Entity> getAncestor();

    /**
     * @return Ancestor Id (attribute ANCESTOR_ID)
     */
    @Nonnull
    Optional<DtUid> getAncestorId();

    /**
     * @return Note (attribute NOTE)
     */
    @Nonnull
    Optional<String> getNote();

    /**
     * @return Customisation note (attribute CUSTOMNOTE)
     */
    @Nonnull
    Optional<String> getCustomNote();

    /**
     * @return Structure documentation (attribute STRUCTUREDOC)
     */
    @Nonnull
    Optional<String> getStructureDoc();

    /**
     * @return Usage documentation (attribute USAGEDOC)
     */
    @Nonnull
    Optional<String> getUsageDoc();

    /**
     * @return Behaviour documentation (attribute BEHAVIOURDOC)
     */
    @Nonnull
    Optional<String> getBehaviourDoc();

    /**
     * @return Implementation documentation (attribute IMPLDOC)
     */
    @Nonnull
    Optional<String> getImplDoc();

    /**
     * @return Is used (attribute ISUSED)
     */
    boolean isIsUsed();

    /**
     * @return Get rights custom (attribute GETRIGHTCUSTOM)
     */
    boolean isGetRightCustom();

    /**
     * @return Get right restriction (attribute GETRIGHTRESTR_ID)
     */
    @Nonnull
    Optional<DtUid> getGetRightRestrId();

    /**
     * @return Get operation type (attribute GETOPTYPE_ID)
     */
    @Nonnull
    Optional<DtUid> getGetOpTypeId();

    /**
     * @return Keep deleted (attribute KEEPDELETED)
     */
    @Nonnull
    Optional<Integer> getKeepDeleted();

    /**
     * @return Short description (attribute SHORTDESC)
     */
    @Nonnull
    Optional<String> getShortDesc();

    /**
     * @return Long description (attribute LONGDESC)
     */
    @Nonnull
    Optional<String> getLongDesc();

    /**
     * @return Copy value of attribute (1st part) (attribute X_COPIEDATTR0)
     */
    double getxCopiedAttr0();

    /**
     * @return Copy value of attribute (2nd part) (attribute X_COPIEDATTR1)
     */
    double getxCopiedAttr1();

    /**
     * @return Copy value of attribute (3rd part) (attribute X_COPIEDATTR2)
     */
    double getxCopiedAttr2();

    /**
     * @return Copy value of attribute (4th part) (attribute X_COPIEDATTR3)
     */
    double getxCopiedAttr3();

    /**
     * @return Copy value of attribute (5th part) (attribute X_COPIEDATTR4)
     */
    double getxCopiedAttr4();

    /**
     * @return Copy value of attribute (6th part) (attribute X_COPIEDATTR5)
     */
    double getxCopiedAttr5();

    /**
     * @return Can have liability (calculated) (attribute X_HASLIABILITY)
     */
    boolean isxHasLiability();

    /**
     * @return Use version control (attribute USECONFOBJ)
     */
    @Nonnull
    Optional<Boolean> isUseConfObj();

    /**
     * @return Use version control (*) (attribute X_USECONFOBJ)
     */
    @Nonnull
    Optional<Boolean> isxUseConfObj();

    /**
     * @return Attr. with notification (1st part) (attribute X_NOTIFYATTR0)
     */
    double getxNotifyAttr0();

    /**
     * @return Attr. with notification (2nd part) (attribute X_NOTIFYATTR1)
     */
    double getxNotifyAttr1();

    /**
     * @return Attr. with notification (3rd part) (attribute X_NOTIFYATTR2)
     */
    double getxNotifyAttr2();

    /**
     * @return Attr. with notification (4th part) (attribute X_NOTIFYATTR3)
     */
    double getxNotifyAttr3();

    /**
     * @return Attr. with notification (5th part) (attribute X_NOTIFYATTR4)
     */
    double getxNotifyAttr4();

    /**
     * @return Attr. with notification (6th part) (attribute X_NOTIFYATTR5)
     */
    double getxNotifyAttr5();

    /**
     * @return Attr. with flag def. (1st part) (attribute X_FLAGDEFINTEREST0)
     */
    double getxFlagDefInterest0();

    /**
     * @return Attr. with flag def. (2nd part) (attribute X_FLAGDEFINTEREST1)
     */
    double getxFlagDefInterest1();

    /**
     * @return Attr. with flag def. (3rd part) (attribute X_FLAGDEFINTEREST2)
     */
    double getxFlagDefInterest2();

    /**
     * @return Attr. with flag def. (4th part) (attribute X_FLAGDEFINTEREST3)
     */
    double getxFlagDefInterest3();

    /**
     * @return Attr. with flag def. (5th part) (attribute X_FLAGDEFINTEREST4)
     */
    double getxFlagDefInterest4();

    /**
     * @return Attr. with flag def. (6th part) (attribute X_FLAGDEFINTEREST5)
     */
    double getxFlagDefInterest5();

    /**
     * @return Attr. with delete notification (1st part) (attribute X_DELNOTIFYATTR0)
     */
    double getxDelNotifyAttr0();

    /**
     * @return Attr. with delete notification (2nd part) (attribute X_DELNOTIFYATTR1)
     */
    double getxDelNotifyAttr1();

    /**
     * @return Attr. with delete notification (3rd part) (attribute X_DELNOTIFYATTR2)
     */
    double getxDelNotifyAttr2();

    /**
     * @return Attr. with delete notification (4th part) (attribute X_DELNOTIFYATTR3)
     */
    double getxDelNotifyAttr3();

    /**
     * @return Attr. with delete notification (5th part) (attribute X_DELNOTIFYATTR4)
     */
    double getxDelNotifyAttr4();

    /**
     * @return Attr. with delete notification (6th part) (attribute X_DELNOTIFYATTR5)
     */
    double getxDelNotifyAttr5();

    /**
     * @return Has DELETEROW Flagdef (attribute X_HASDELROWFLAGDEF)
     */
    @Nonnull
    Optional<Boolean> isxHasDelRowFlagDef();
}
