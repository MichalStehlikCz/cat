package com.provys.catalogue.dbloader;

import com.provys.catalogue.Attr;
import com.provys.catalogue.AttrMeta;
import com.provys.catalogue.impl.AttrManagerImpl;
import com.provys.catalogue.impl.AttrProxy;
import com.provys.catalogue.impl.GenAttrValue;
import com.provys.catalogue.impl.GenAttrValueBuilder;
import com.provys.provysdb.dbcontext.DbResultSet;
import com.provys.provysdb.dbcontext.DbRowMapper;
import com.provys.provysdb.dbsqlbuilder.DbSql;
import com.provys.provysdb.sqlbuilder.Condition;
import com.provys.provysobject.impl.ProvysObjectLoadRunner;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

class AttrDbLoadRunner extends ProvysObjectLoadRunner<Attr, GenAttrValue, AttrProxy, AttrManagerImpl> {
    private static final AttrDbMapper MAPPER = new AttrDbMapper();

    @Nonnull
    private final DbSql dbSql;

    @Nullable
    private final Condition condition;

    AttrDbLoadRunner(AttrManagerImpl manager, DbSql dbSql, @Nullable Condition condition) {
        super(manager);
        this.dbSql = Objects.requireNonNull(dbSql);
        this.condition = condition;
    }

    @Nonnull
    @Override
    protected List<GenAttrValue> select() {
        return dbSql.select()
                .from(AttrMeta.FROM_CLAUSE)
                .column(AttrMeta.COL_ATTR_ID)
                .column(AttrMeta.COL_ENTITY_ID)
                .column(AttrMeta.COL_NAME_NM)
                .column(AttrMeta.COL_NAME)
                .column(AttrMeta.COL_NOTE)
                .column(AttrMeta.COL_ATTRTYPE)
                .column(AttrMeta.COL_ISCUSTOM)
                .column(AttrMeta.COL_ISUSED)
                .column(AttrMeta.COL_ATTRGRP_ID)
                .column(AttrMeta.COL_ORD)
                .column(AttrMeta.COL_DOMAIN_ID)
                .column(AttrMeta.COL_SUBDOMAIN_NM)
                .column(AttrMeta.COL_PROPERNAMEROOT)
                .column(AttrMeta.COL_MANDATORY)
                .column(AttrMeta.COL_ORDERED)
                .column(AttrMeta.COL_ORDGROUP)
                .column(AttrMeta.COL_DEFVALUE)
                .column(AttrMeta.COL_MULTICREATE)
                .column(AttrMeta.COL_GENCOPY)
                .column(AttrMeta.COL_GENMOVE)
                .column(AttrMeta.COL_GENDELETE)
                .column(AttrMeta.COL_TEXTSRC_ID)
                .column(AttrMeta.COL_HIERARCHICAL)
                .column(AttrMeta.COL_ISINTABLE)
                .column(AttrMeta.COL_ISOWN)
                .column(AttrMeta.COL_VALIDATED)
                .column(AttrMeta.COL_QVISIBLE)
                .column(AttrMeta.COL_LLENGTH)
                .column(AttrMeta.COL_INDEXED)
                .column(AttrMeta.COL_UPNAME_NM)
                .column(AttrMeta.COL_READONLY)
                .column(AttrMeta.COL_GETOPTYPE_ID)
                .column(AttrMeta.COL_SETOPTYPE_ID)
                .column(AttrMeta.COL_RESETOPTYPE_ID)
                .column(AttrMeta.COL_CONFIRMOTHER)
                .column(AttrMeta.COL_SETOTHEROPTYPE_ID)
                .column(AttrMeta.COL_MULTIVALUE)
                .column(AttrMeta.COL_LOGALLOWED)
                .column(AttrMeta.COL_LOGLEVEL)
                .column(AttrMeta.COL_DICTTYPE)
                .column(AttrMeta.COL_DICTDEL1)
                .column(AttrMeta.COL_DICTDEL2)
                .column(AttrMeta.COL_TBCODE_CD)
                .column(AttrMeta.COL_ACCOUNTRULE_NM)
                .column(AttrMeta.COL_ACCDOCOBJECTFORMULA_ID)
                .column(AttrMeta.COL_OWNERFORMULA_ID)
                .column(AttrMeta.COL_FROMOBJECTFORMULA_ID)
                .column(AttrMeta.COL_TOOBJECTFORMULA_ID)
                .column(AttrMeta.COL_APPROXRECORD)
                .column(AttrMeta.COL_VALUEACCOUNT_NM)
                .column(AttrMeta.COL_VALUEAMOUNTTYPE)
                .column(AttrMeta.COL_DEFOWNER)
                .column(AttrMeta.COL_DOCUMENTATION)
                .column(AttrMeta.COL_BITMAPORD)
                .column(AttrMeta.COL_X_ISFLAGDEPBIND)
                .column(AttrMeta.COL_X_ISFLAGDEFATTR)
                .column(AttrMeta.COL_COPIED)
                .column(AttrMeta.COL_KEYORD)
                .column(AttrMeta.COL_OPTYPETYPE_RF)
                .column(AttrMeta.COL_IMGSRC_ID)
                .column(AttrMeta.COL_IMGWIDTH)
                .column(AttrMeta.COL_IMGHEIGHT)
                .column(AttrMeta.COL_FILESERVER_ID)
                .column(AttrMeta.COL_GENMIGR)
                .column(AttrMeta.COL_EVALCVALUE)
                .column(AttrMeta.COL_OPTLOBLIMIT)
                .column(AttrMeta.COL_MANLOBLIMIT)
                .where(condition)
                .prepare()
                .fetch(MAPPER);
    }

    private static class AttrDbMapper implements DbRowMapper<GenAttrValue> {
        public GenAttrValue map(DbResultSet dbResultSet, long line) {
            return new GenAttrValueBuilder()
                .setId(dbResultSet.getNonnullDtUid(1))
                .setEntityId(dbResultSet.getNonnullDtUid(2))
                .setNameNm(dbResultSet.getNonnullString(3))
                .setName(dbResultSet.getNonnullString(4))
                .setNote(dbResultSet.getNullableString(5))
                .setAttrType(dbResultSet.getNonnullCharacter(6))
                .setIsCustom(dbResultSet.getNonnullBoolean(7))
                .setIsUsed(dbResultSet.getNonnullBoolean(8))
                .setAttrGrpId(dbResultSet.getNullableDtUid(9))
                .setOrd(dbResultSet.getNonnullDouble(10))
                .setDomainId(dbResultSet.getNonnullDtUid(11))
                .setSubdomainNm(dbResultSet.getNullableString(12))
                .setProperNameRoot(dbResultSet.getNullableString(13))
                .setMandatory(dbResultSet.getNonnullBoolean(14))
                .setOrdered(dbResultSet.getNonnullBoolean(15))
                .setOrdGroup(dbResultSet.getNullableString(16))
                .setDefValue(dbResultSet.getNullableString(17))
                .setMultiCreate(dbResultSet.getNonnullBoolean(18))
                .setGenCopy(dbResultSet.getNonnullBoolean(19))
                .setGenMove(dbResultSet.getNonnullBoolean(20))
                .setGenDelete(dbResultSet.getNonnullBoolean(21))
                .setTextSrcId(dbResultSet.getNullableDtUid(22))
                .setHierarchical(dbResultSet.getNonnullBoolean(23))
                .setIsInTable(dbResultSet.getNonnullBoolean(24))
                .setIsOwn(dbResultSet.getNonnullBoolean(25))
                .setValidated(dbResultSet.getNonnullBoolean(26))
                .setqVisible(dbResultSet.getNonnullBoolean(27))
                .setlLength(dbResultSet.getNullableDouble(28))
                .setIndexed(dbResultSet.getNonnullBoolean(29))
                .setUpNameNm(dbResultSet.getNullableString(30))
                .setReadOnly(dbResultSet.getNonnullBoolean(31))
                .setGetOpTypeId(dbResultSet.getNullableDtUid(32))
                .setSetOpTypeId(dbResultSet.getNullableDtUid(33))
                .setResetOpTypeId(dbResultSet.getNullableDtUid(34))
                .setConfirmOther(dbResultSet.getNullableBoolean(35))
                .setSetOtherOpTypeId(dbResultSet.getNullableDtUid(36))
                .setMultivalue(dbResultSet.getNonnullBoolean(37))
                .setLogAllowed(dbResultSet.getNonnullBoolean(38))
                .setLogLevel(dbResultSet.getNonnullCharacter(39))
                .setDictType(dbResultSet.getNullableCharacter(40))
                .setDictDel1(dbResultSet.getNullableString(41))
                .setDictDel2(dbResultSet.getNullableString(42))
                .setTbCodeCd(dbResultSet.getNullableString(43))
                .setAccountRuleNm(dbResultSet.getNullableString(44))
                .setAccDocObjectFormulaId(dbResultSet.getNullableDtUid(45))
                .setOwnerFormulaId(dbResultSet.getNullableDtUid(46))
                .setFromObjectFormulaId(dbResultSet.getNullableDtUid(47))
                .setToObjectFormulaId(dbResultSet.getNullableDtUid(48))
                .setApproxRecord(dbResultSet.getNullableBoolean(49))
                .setValueAccountNm(dbResultSet.getNullableString(50))
                .setValueAmountType(dbResultSet.getNullableCharacter(51))
                .setDefOwner(dbResultSet.getNonnullBoolean(52))
                .setDocumentation(dbResultSet.getNullableString(53))
                .setBitmapOrd(dbResultSet.getNullableInteger(54))
                .setxIsFlagDepBind(dbResultSet.getNonnullCharacter(55))
                .setxIsFlagDefAttr(dbResultSet.getNonnullBoolean(56))
                .setCopied(dbResultSet.getNonnullCharacter(57))
                .setKeyOrd(dbResultSet.getNullableDouble(58))
                .setOpTypeTypeRf(dbResultSet.getNullableDtUid(59))
                .setImgSrcId(dbResultSet.getNullableDtUid(60))
                .setImgWidth(dbResultSet.getNullableDouble(61))
                .setImgHeight(dbResultSet.getNullableDouble(62))
                .setFileServerId(dbResultSet.getNullableDtUid(63))
                .setGenMigr(dbResultSet.getNullableBoolean(64))
                .setEvalCValue(dbResultSet.getNullableBoolean(65))
                .setOptLobLimit(dbResultSet.getNullableDouble(66))
                .setManLobLimit(dbResultSet.getNullableDouble(67))
                .build();
        }
    }
}
