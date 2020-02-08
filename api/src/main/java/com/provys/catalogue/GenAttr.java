package com.provys.catalogue;

import com.provys.common.datatype.DtUid;
import com.provys.provysobject.ProvysObject;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.processing.Generated;

@Generated("com.provys.provysobject.generator.impl.GeneratorEntity")
interface GenAttr extends ProvysObject {
    /**
     * @return Entity (object referenced by attribute ENTITY_ID)
     */
    @Nonnull
    Entity getEntity();

    /**
     * @return Entity Id (attribute ENTITY_ID)
     */
    @Nonnull
    DtUid getEntityId();

    /**
     * @return Internal name (attribute NAME_NM)
     */
    @Nonnull
    String getNameNm();

    /**
     * @return Name (attribute NAME)
     */
    @Nonnull
    String getName();

    /**
     * @return Note (attribute NOTE)
     */
    @Nonnull
    Optional<String> getNote();

    /**
     * @return Type (attribute ATTRTYPE)
     */
    char getAttrType();

    /**
     * @return Iscustom (attribute ISCUSTOM)
     */
    boolean isIsCustom();

    /**
     * @return Is used (attribute ISUSED)
     */
    boolean isIsUsed();

    /**
     * @return Attribute group (object referenced by attribute ATTRGRP_ID)
     */
    @Nonnull
    Optional<AttrGrp> getAttrGrp();

    /**
     * @return Attribute group Id (attribute ATTRGRP_ID)
     */
    @Nonnull
    Optional<DtUid> getAttrGrpId();

    /**
     * @return Ord (attribute ORD)
     */
    double getOrd();

    /**
     * @return Domain (object referenced by attribute DOMAIN_ID)
     */
    @Nonnull
    Domain getDomain();

    /**
     * @return Domain Id (attribute DOMAIN_ID)
     */
    @Nonnull
    DtUid getDomainId();

    /**
     * @return Subdomain (attribute SUBDOMAIN_NM)
     */
    @Nonnull
    Optional<String> getSubdomainNm();

    /**
     * @return Proper-case name root (attribute PROPERNAMEROOT)
     */
    @Nonnull
    Optional<String> getProperNameRoot();

    /**
     * @return Mandatory (attribute MANDATORY)
     */
    boolean isMandatory();

    /**
     * @return Ordered (attribute ORDERED)
     */
    boolean isOrdered();

    /**
     * @return Ordering group (attribute ORDGROUP)
     */
    @Nonnull
    Optional<String> getOrdGroup();

    /**
     * @return Default value (attribute DEFVALUE)
     */
    @Nonnull
    Optional<String> getDefValue();

    /**
     * @return Multi create (attribute MULTICREATE)
     */
    boolean isMultiCreate();

    /**
     * @return Generate copy (attribute GENCOPY)
     */
    boolean isGenCopy();

    /**
     * @return Generate move (attribute GENMOVE)
     */
    boolean isGenMove();

    /**
     * @return Generate delete (attribute GENDELETE)
     */
    boolean isGenDelete();

    /**
     * @return Source attribute (object referenced by attribute TEXTSRC_ID)
     */
    @Nonnull
    Optional<Attr> getTextSrc();

    /**
     * @return Source attribute Id (attribute TEXTSRC_ID)
     */
    @Nonnull
    Optional<DtUid> getTextSrcId();

    /**
     * @return Hierarchical (attribute HIERARCHICAL)
     */
    boolean isHierarchical();

    /**
     * @return Is in Table (attribute ISINTABLE)
     */
    boolean isIsInTable();

    /**
     * @return Is own (attribute ISOWN)
     */
    boolean isIsOwn();

    /**
     * @return Validated (attribute VALIDATED)
     */
    boolean isValidated();

    /**
     * @return Visible (attribute QVISIBLE)
     */
    boolean isqVisible();

    /**
     * @return Length (attribute LLENGTH)
     */
    @Nonnull
    Optional<Double> getlLength();

    /**
     * @return Indexed (attribute INDEXED)
     */
    boolean isIndexed();

    /**
     * @return Uppercased column (attribute UPNAME_NM)
     */
    @Nonnull
    Optional<String> getUpNameNm();

    /**
     * @return Read-only (attribute READONLY)
     */
    boolean isReadOnly();

    /**
     * @return Read operation (attribute GETOPTYPE_ID)
     */
    @Nonnull
    Optional<DtUid> getGetOpTypeId();

    /**
     * @return Change operation (attribute SETOPTYPE_ID)
     */
    @Nonnull
    Optional<DtUid> getSetOpTypeId();

    /**
     * @return Reset operation (attribute RESETOPTYPE_ID)
     */
    @Nonnull
    Optional<DtUid> getResetOpTypeId();

    /**
     * @return Confirm other (attribute CONFIRMOTHER)
     */
    @Nonnull
    Optional<Boolean> isConfirmOther();

    /**
     * @return Change operation (non-default) (attribute SETOTHEROPTYPE_ID)
     */
    @Nonnull
    Optional<DtUid> getSetOtherOpTypeId();

    /**
     * @return Multivalue (attribute MULTIVALUE)
     */
    boolean isMultivalue();

    /**
     * @return Log allowed (attribute LOGALLOWED)
     */
    boolean isLogAllowed();

    /**
     * @return Log level (attribute LOGLEVEL)
     */
    char getLogLevel();

    /**
     * @return Dicttype (attribute DICTTYPE)
     */
    @Nonnull
    Optional<Character> getDictType();

    /**
     * @return Dictdel1 (attribute DICTDEL1)
     */
    @Nonnull
    Optional<String> getDictDel1();

    /**
     * @return Dictdel2 (attribute DICTDEL2)
     */
    @Nonnull
    Optional<String> getDictDel2();

    /**
     * @return Tbcode_cd (attribute TBCODE_CD)
     */
    @Nonnull
    Optional<String> getTbCodeCd();

    /**
     * @return Accounting rule (attribute ACCOUNTRULE_NM)
     */
    @Nonnull
    Optional<String> getAccountRuleNm();

    /**
     * @return Accounting document object (object referenced by attribute ACCDOCOBJECTFORMULA_ID)
     */
    @Nonnull
    Optional<Attr> getAccDocObjectFormula();

    /**
     * @return Accounting document object Id (attribute ACCDOCOBJECTFORMULA_ID)
     */
    @Nonnull
    Optional<DtUid> getAccDocObjectFormulaId();

    /**
     * @return Owner (finance) (object referenced by attribute OWNERFORMULA_ID)
     */
    @Nonnull
    Optional<Attr> getOwnerFormula();

    /**
     * @return Owner (finance) Id (attribute OWNERFORMULA_ID)
     */
    @Nonnull
    Optional<DtUid> getOwnerFormulaId();

    /**
     * @return From object (finance) (object referenced by attribute FROMOBJECTFORMULA_ID)
     */
    @Nonnull
    Optional<Attr> getFromObjectFormula();

    /**
     * @return From object (finance) Id (attribute FROMOBJECTFORMULA_ID)
     */
    @Nonnull
    Optional<DtUid> getFromObjectFormulaId();

    /**
     * @return To object (finance) (object referenced by attribute TOOBJECTFORMULA_ID)
     */
    @Nonnull
    Optional<Attr> getToObjectFormula();

    /**
     * @return To object (finance) Id (attribute TOOBJECTFORMULA_ID)
     */
    @Nonnull
    Optional<DtUid> getToObjectFormulaId();

    /**
     * @return Approximate record (attribute APPROXRECORD)
     */
    @Nonnull
    Optional<Boolean> isApproxRecord();

    /**
     * @return Value account (attribute VALUEACCOUNT_NM)
     */
    @Nonnull
    Optional<String> getValueAccountNm();

    /**
     * @return Value amount type (attribute VALUEAMOUNTTYPE)
     */
    @Nonnull
    Optional<Character> getValueAmountType();

    /**
     * @return Default owner (attribute DEFOWNER)
     */
    boolean isDefOwner();

    /**
     * @return Documentation (attribute DOCUMENTATION)
     */
    @Nonnull
    Optional<String> getDocumentation();

    /**
     * @return Bitmap order (attribute BITMAPORD)
     */
    @Nonnull
    Optional<Integer> getBitmapOrd();

    /**
     * @return X_isflagdepbind (attribute X_ISFLAGDEPBIND)
     */
    char getxIsFlagDepBind();

    /**
     * @return X_isflagdefattr (attribute X_ISFLAGDEFATTR)
     */
    boolean isxIsFlagDefAttr();

    /**
     * @return Copied (attribute COPIED)
     */
    char getCopied();

    /**
     * @return Order in key (attribute KEYORD)
     */
    @Nonnull
    Optional<Double> getKeyOrd();

    /**
     * @return Type of operation (attribute OPTYPETYPE_RF)
     */
    @Nonnull
    Optional<DtUid> getOpTypeTypeRf();

    /**
     * @return Image source ID (object referenced by attribute IMGSRC_ID)
     */
    @Nonnull
    Optional<Attr> getImgSrc();

    /**
     * @return Image source ID Id (attribute IMGSRC_ID)
     */
    @Nonnull
    Optional<DtUid> getImgSrcId();

    /**
     * @return Image width (attribute IMGWIDTH)
     */
    @Nonnull
    Optional<Double> getImgWidth();

    /**
     * @return Image height (attribute IMGHEIGHT)
     */
    @Nonnull
    Optional<Double> getImgHeight();

    /**
     * @return File server (uid) (attribute FILESERVER_ID)
     */
    @Nonnull
    Optional<DtUid> getFileServerId();

    /**
     * @return Migration Generator (attribute GENMIGR)
     */
    @Nonnull
    Optional<Boolean> isGenMigr();

    /**
     * @return Evaluate text (attribute EVALCVALUE)
     */
    @Nonnull
    Optional<Boolean> isEvalCValue();

    /**
     * @return Optional lob limit (attribute OPTLOBLIMIT)
     */
    @Nonnull
    Optional<Double> getOptLobLimit();

    /**
     * @return Mandatory lob limit (attribute MANLOBLIMIT)
     */
    @Nonnull
    Optional<Double> getManLobLimit();
}
