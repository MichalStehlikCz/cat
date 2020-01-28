package com.provys.catalogue.dbloader;

import com.provys.catalogue.api.Entity;
import com.provys.catalogue.api.EntityMeta;
import com.provys.catalogue.impl.EntityManagerImpl;
import com.provys.catalogue.impl.EntityProxy;
import com.provys.catalogue.impl.GenEntityValue;
import com.provys.catalogue.impl.GenEntityValueBuilder;
import com.provys.provysdb.dbcontext.DbResultSet;
import com.provys.provysdb.dbcontext.DbRowMapper;
import com.provys.provysdb.dbsqlbuilder.DbSql;
import com.provys.provysdb.sqlbuilder.Condition;
import com.provys.provysobject.impl.ProvysObjectLoadRunner;
import java.lang.Override;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

class EntityDbLoadRunner extends ProvysObjectLoadRunner<Entity, GenEntityValue, EntityProxy, EntityManagerImpl> {
    private static final EntityDbMapper MAPPER = new EntityDbMapper();

    @Nonnull
    private final DbSql dbSql;

    @Nullable
    private final Condition condition;

    EntityDbLoadRunner(EntityManagerImpl manager, DbSql dbSql, @Nullable Condition condition) {
        super(manager);
        this.dbSql = Objects.requireNonNull(dbSql);
        this.condition = condition;
    }

    @Nonnull
    @Override
    protected List<GenEntityValue> select() {
        return dbSql.select()
                .from(EntityMeta.FROM_CLAUSE)
                .column(EntityMeta.COL_ENTITY_ID)
                .column(EntityMeta.COL_NAME_NM)
                .column(EntityMeta.COL_NAME)
                .column(EntityMeta.COL_OBJECTCLASS)
                .column(EntityMeta.COL_ISCUSTOM)
                .column(EntityMeta.COL_TABLE_NM)
                .column(EntityMeta.COL_VIEW_NM)
                .column(EntityMeta.COL_KEY_NM)
                .column(EntityMeta.COL_TEXTTABLE_NM)
                .column(EntityMeta.COL_TEXTVIEW_NM)
                .column(EntityMeta.COL_TEXTKEY_NM)
                .column(EntityMeta.COL_TEXTALL)
                .column(EntityMeta.COL_PGPACKAGE_NM)
                .column(EntityMeta.COL_EPPACKAGE_NM)
                .column(EntityMeta.COL_CPPACKAGE_NM)
                .column(EntityMeta.COL_FPPACKAGE_NM)
                .column(EntityMeta.COL_PROPERNAME)
                .column(EntityMeta.COL_MASTER_ID)
                .column(EntityMeta.COL_MASTERTYPE)
                .column(EntityMeta.COL_USERLOCKTYPE)
                .column(EntityMeta.COL_IMPORTTYPE)
                .column(EntityMeta.COL_CONFOBJ)
                .column(EntityMeta.COL_BASEPATH)
                .column(EntityMeta.COL_INCOMPLETEKEY)
                .column(EntityMeta.COL_CONFOBJALL)
                .column(EntityMeta.COL_ENTITYGRP_ID)
                .column(EntityMeta.COL_ANCESTOR_ID)
                .column(EntityMeta.COL_NOTE)
                .column(EntityMeta.COL_CUSTOMNOTE)
                .column(EntityMeta.COL_STRUCTUREDOC)
                .column(EntityMeta.COL_USAGEDOC)
                .column(EntityMeta.COL_BEHAVIOURDOC)
                .column(EntityMeta.COL_IMPLDOC)
                .column(EntityMeta.COL_ISUSED)
                .column(EntityMeta.COL_GETRIGHTCUSTOM)
                .column(EntityMeta.COL_GETRIGHTRESTR_ID)
                .column(EntityMeta.COL_GETOPTYPE_ID)
                .column(EntityMeta.COL_KEEPDELETED)
                .column(EntityMeta.COL_SHORTDESC)
                .column(EntityMeta.COL_LONGDESC)
                .column(EntityMeta.COL_X_COPIEDATTR0)
                .column(EntityMeta.COL_X_COPIEDATTR1)
                .column(EntityMeta.COL_X_COPIEDATTR2)
                .column(EntityMeta.COL_X_COPIEDATTR3)
                .column(EntityMeta.COL_X_COPIEDATTR4)
                .column(EntityMeta.COL_X_COPIEDATTR5)
                .column(EntityMeta.COL_X_HASLIABILITY)
                .column(EntityMeta.COL_USECONFOBJ)
                .column(EntityMeta.COL_X_USECONFOBJ)
                .column(EntityMeta.COL_X_NOTIFYATTR0)
                .column(EntityMeta.COL_X_NOTIFYATTR1)
                .column(EntityMeta.COL_X_NOTIFYATTR2)
                .column(EntityMeta.COL_X_NOTIFYATTR3)
                .column(EntityMeta.COL_X_NOTIFYATTR4)
                .column(EntityMeta.COL_X_NOTIFYATTR5)
                .column(EntityMeta.COL_X_FLAGDEFINTEREST0)
                .column(EntityMeta.COL_X_FLAGDEFINTEREST1)
                .column(EntityMeta.COL_X_FLAGDEFINTEREST2)
                .column(EntityMeta.COL_X_FLAGDEFINTEREST3)
                .column(EntityMeta.COL_X_FLAGDEFINTEREST4)
                .column(EntityMeta.COL_X_FLAGDEFINTEREST5)
                .column(EntityMeta.COL_X_DELNOTIFYATTR0)
                .column(EntityMeta.COL_X_DELNOTIFYATTR1)
                .column(EntityMeta.COL_X_DELNOTIFYATTR2)
                .column(EntityMeta.COL_X_DELNOTIFYATTR3)
                .column(EntityMeta.COL_X_DELNOTIFYATTR4)
                .column(EntityMeta.COL_X_DELNOTIFYATTR5)
                .column(dbSql.nvl(EntityMeta.COL_X_HASDELROWFLAGDEF, dbSql.literal(false)), "x_hasdelrowflag")
                .where(condition)
                .prepare()
                .fetch(MAPPER);
    }

    private static class EntityDbMapper implements DbRowMapper<GenEntityValue> {
        public GenEntityValue map(DbResultSet dbResultSet, long line) {
            return new GenEntityValueBuilder()
                    .setId(dbResultSet.getNonnullDtUid(1))
                    .setNameNm(dbResultSet.getNonnullString(2))
                    .setName(dbResultSet.getNonnullString(3))
                    .setObjectClass(dbResultSet.getNonnullBoolean(4))
                    .setIsCustom(dbResultSet.getNonnullBoolean(5))
                    .setTableNm(dbResultSet.getNullableString(6))
                    .setViewNm(dbResultSet.getNullableString(7))
                    .setKeyNm(dbResultSet.getNullableString(8))
                    .setTextTableNm(dbResultSet.getNullableString(9))
                    .setTextViewNm(dbResultSet.getNullableString(10))
                    .setTextKeyNm(dbResultSet.getNullableString(11))
                    .setTextAll(dbResultSet.getNullableBoolean(12))
                    .setPgPackageNm(dbResultSet.getNullableString(13))
                    .setEpPackageNm(dbResultSet.getNullableString(14))
                    .setCpPackageNm(dbResultSet.getNullableString(15))
                    .setFpPackageNm(dbResultSet.getNullableString(16))
                    .setProperName(dbResultSet.getNullableString(17))
                    .setMasterId(dbResultSet.getNullableDtUid(18))
                    .setMasterType(dbResultSet.getNonnullCharacter(19))
                    .setUserLockType(dbResultSet.getNullableCharacter(20))
                    .setImportType(dbResultSet.getNullableCharacter(21))
                    .setConfObj(dbResultSet.getNullableCharacter(22))
                    .setBasePath(dbResultSet.getNullableString(23))
                    .setIncompleteKey(dbResultSet.getNonnullBoolean(24))
                    .setConfObjAll(dbResultSet.getNullableBoolean(25))
                    .setEntityGrpId(dbResultSet.getNullableDtUid(26))
                    .setAncestorId(dbResultSet.getNullableDtUid(27))
                    .setNote(dbResultSet.getNullableString(28))
                    .setCustomNote(dbResultSet.getNullableString(29))
                    .setStructureDoc(dbResultSet.getNullableString(30))
                    .setUsageDoc(dbResultSet.getNullableString(31))
                    .setBehaviourDoc(dbResultSet.getNullableString(32))
                    .setImplDoc(dbResultSet.getNullableString(33))
                    .setIsUsed(dbResultSet.getNonnullBoolean(34))
                    .setGetRightCustom(dbResultSet.getNonnullBoolean(35))
                    .setGetRightRestrId(dbResultSet.getNullableDtUid(36))
                    .setGetOpTypeId(dbResultSet.getNullableDtUid(37))
                    .setKeepDeleted(dbResultSet.getNullableInteger(38))
                    .setShortDesc(dbResultSet.getNullableString(39))
                    .setLongDesc(dbResultSet.getNullableString(40))
                    .setxCopiedAttr0(dbResultSet.getNonnullDouble(41))
                    .setxCopiedAttr1(dbResultSet.getNonnullDouble(42))
                    .setxCopiedAttr2(dbResultSet.getNonnullDouble(43))
                    .setxCopiedAttr3(dbResultSet.getNonnullDouble(44))
                    .setxCopiedAttr4(dbResultSet.getNonnullDouble(45))
                    .setxCopiedAttr5(dbResultSet.getNonnullDouble(46))
                    .setxHasLiability(dbResultSet.getNonnullBoolean(47))
                    .setUseConfObj(dbResultSet.getNullableBoolean(48))
                    .setxUseConfObj(dbResultSet.getNullableBoolean(49))
                    .setxNotifyAttr0(dbResultSet.getNonnullDouble(50))
                    .setxNotifyAttr1(dbResultSet.getNonnullDouble(51))
                    .setxNotifyAttr2(dbResultSet.getNonnullDouble(52))
                    .setxNotifyAttr3(dbResultSet.getNonnullDouble(53))
                    .setxNotifyAttr4(dbResultSet.getNonnullDouble(54))
                    .setxNotifyAttr5(dbResultSet.getNonnullDouble(55))
                    .setxFlagDefInterest0(dbResultSet.getNonnullDouble(56))
                    .setxFlagDefInterest1(dbResultSet.getNonnullDouble(57))
                    .setxFlagDefInterest2(dbResultSet.getNonnullDouble(58))
                    .setxFlagDefInterest3(dbResultSet.getNonnullDouble(59))
                    .setxFlagDefInterest4(dbResultSet.getNonnullDouble(60))
                    .setxFlagDefInterest5(dbResultSet.getNonnullDouble(61))
                    .setxDelNotifyAttr0(dbResultSet.getNonnullDouble(62))
                    .setxDelNotifyAttr1(dbResultSet.getNonnullDouble(63))
                    .setxDelNotifyAttr2(dbResultSet.getNonnullDouble(64))
                    .setxDelNotifyAttr3(dbResultSet.getNonnullDouble(65))
                    .setxDelNotifyAttr4(dbResultSet.getNonnullDouble(66))
                    .setxDelNotifyAttr5(dbResultSet.getNonnullDouble(67))
                    .setxHasDelRowFlagDef(dbResultSet.getNonnullBoolean(68))
                    .build();
        }
    }
}