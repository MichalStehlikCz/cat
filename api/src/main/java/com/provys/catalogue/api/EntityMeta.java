package com.provys.catalogue.api;

import static com.provys.provysdb.sqlbuilder.SqlFactory.*;

import com.provys.common.datatype.DtUid;
import com.provys.provysdb.sqlbuilder.SqlColumnT;
import com.provys.provysdb.sqlbuilder.SqlFrom;
import com.provys.provysdb.sqlbuilder.SqlIdentifier;
import com.provys.provysdb.sqlbuilder.SqlTableAlias;
import java.lang.Boolean;
import java.lang.Character;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;

public final class EntityMeta {
    public static final SqlIdentifier TABLE = name("ker_entity_tb");

    public static final SqlTableAlias TABLE_ALIAS = tableAlias("alentity");

    public static final SqlFrom FROM_CLAUSE = from(TABLE, TABLE_ALIAS);

    public static final SqlColumnT<DtUid> COL_ENTITY_ID = column(TABLE_ALIAS, name("entity_id"), DtUid.class);

    public static final SqlColumnT<String> COL_NAME_NM = column(TABLE_ALIAS, name("name_nm"), String.class);

    public static final SqlColumnT<String> COL_NAME = column(TABLE_ALIAS, name("name"), String.class);

    public static final SqlColumnT<Boolean> COL_OBJECTCLASS = column(TABLE_ALIAS, name("objectclass"), Boolean.class);

    public static final SqlColumnT<Boolean> COL_ISCUSTOM = column(TABLE_ALIAS, name("iscustom"), Boolean.class);

    public static final SqlColumnT<String> COL_TABLE_NM = column(TABLE_ALIAS, name("table_nm"), String.class);

    public static final SqlColumnT<String> COL_VIEW_NM = column(TABLE_ALIAS, name("view_nm"), String.class);

    public static final SqlColumnT<String> COL_KEY_NM = column(TABLE_ALIAS, name("key_nm"), String.class);

    public static final SqlColumnT<String> COL_TEXTTABLE_NM = column(TABLE_ALIAS, name("texttable_nm"), String.class);

    public static final SqlColumnT<String> COL_TEXTVIEW_NM = column(TABLE_ALIAS, name("textview_nm"), String.class);

    public static final SqlColumnT<String> COL_TEXTKEY_NM = column(TABLE_ALIAS, name("textkey_nm"), String.class);

    public static final SqlColumnT<Boolean> COL_TEXTALL = column(TABLE_ALIAS, name("textall"), Boolean.class);

    public static final SqlColumnT<String> COL_PGPACKAGE_NM = column(TABLE_ALIAS, name("pgpackage_nm"), String.class);

    public static final SqlColumnT<String> COL_EPPACKAGE_NM = column(TABLE_ALIAS, name("eppackage_nm"), String.class);

    public static final SqlColumnT<String> COL_CPPACKAGE_NM = column(TABLE_ALIAS, name("cppackage_nm"), String.class);

    public static final SqlColumnT<String> COL_FPPACKAGE_NM = column(TABLE_ALIAS, name("fppackage_nm"), String.class);

    public static final SqlColumnT<String> COL_PROPERNAME = column(TABLE_ALIAS, name("propername"), String.class);

    public static final SqlColumnT<DtUid> COL_MASTER_ID = column(TABLE_ALIAS, name("master_id"), DtUid.class);

    public static final SqlColumnT<Character> COL_MASTERTYPE = column(TABLE_ALIAS, name("mastertype"), Character.class);

    public static final SqlColumnT<Character> COL_USERLOCKTYPE = column(TABLE_ALIAS, name("userlocktype"), Character.class);

    public static final SqlColumnT<Character> COL_IMPORTTYPE = column(TABLE_ALIAS, name("importtype"), Character.class);

    public static final SqlColumnT<Character> COL_CONFOBJ = column(TABLE_ALIAS, name("confobj"), Character.class);

    public static final SqlColumnT<String> COL_BASEPATH = column(TABLE_ALIAS, name("basepath"), String.class);

    public static final SqlColumnT<Boolean> COL_INCOMPLETEKEY = column(TABLE_ALIAS, name("incompletekey"), Boolean.class);

    public static final SqlColumnT<Boolean> COL_CONFOBJALL = column(TABLE_ALIAS, name("confobjall"), Boolean.class);

    public static final SqlColumnT<DtUid> COL_ENTITYGRP_ID = column(TABLE_ALIAS, name("entitygrp_id"), DtUid.class);

    public static final SqlColumnT<DtUid> COL_ANCESTOR_ID = column(TABLE_ALIAS, name("ancestor_id"), DtUid.class);

    public static final SqlColumnT<String> COL_NOTE = column(TABLE_ALIAS, name("note"), String.class);

    public static final SqlColumnT<String> COL_CUSTOMNOTE = column(TABLE_ALIAS, name("customnote"), String.class);

    public static final SqlColumnT<String> COL_STRUCTUREDOC = column(TABLE_ALIAS, name("structuredoc"), String.class);

    public static final SqlColumnT<String> COL_USAGEDOC = column(TABLE_ALIAS, name("usagedoc"), String.class);

    public static final SqlColumnT<String> COL_BEHAVIOURDOC = column(TABLE_ALIAS, name("behaviourdoc"), String.class);

    public static final SqlColumnT<String> COL_IMPLDOC = column(TABLE_ALIAS, name("impldoc"), String.class);

    public static final SqlColumnT<Boolean> COL_ISUSED = column(TABLE_ALIAS, name("isused"), Boolean.class);

    public static final SqlColumnT<Boolean> COL_GETRIGHTCUSTOM = column(TABLE_ALIAS, name("getrightcustom"), Boolean.class);

    public static final SqlColumnT<DtUid> COL_GETRIGHTRESTR_ID = column(TABLE_ALIAS, name("getrightrestr_id"), DtUid.class);

    public static final SqlColumnT<DtUid> COL_GETOPTYPE_ID = column(TABLE_ALIAS, name("getoptype_id"), DtUid.class);

    public static final SqlColumnT<Integer> COL_KEEPDELETED = column(TABLE_ALIAS, name("keepdeleted"), Integer.class);

    public static final SqlColumnT<String> COL_SHORTDESC = column(TABLE_ALIAS, name("shortdesc"), String.class);

    public static final SqlColumnT<String> COL_LONGDESC = column(TABLE_ALIAS, name("longdesc"), String.class);

    public static final SqlColumnT<Double> COL_X_COPIEDATTR0 = column(TABLE_ALIAS, name("x_copiedattr0"), Double.class);

    public static final SqlColumnT<Double> COL_X_COPIEDATTR1 = column(TABLE_ALIAS, name("x_copiedattr1"), Double.class);

    public static final SqlColumnT<Double> COL_X_COPIEDATTR2 = column(TABLE_ALIAS, name("x_copiedattr2"), Double.class);

    public static final SqlColumnT<Double> COL_X_COPIEDATTR3 = column(TABLE_ALIAS, name("x_copiedattr3"), Double.class);

    public static final SqlColumnT<Double> COL_X_COPIEDATTR4 = column(TABLE_ALIAS, name("x_copiedattr4"), Double.class);

    public static final SqlColumnT<Double> COL_X_COPIEDATTR5 = column(TABLE_ALIAS, name("x_copiedattr5"), Double.class);

    public static final SqlColumnT<Boolean> COL_X_HASLIABILITY = column(TABLE_ALIAS, name("x_hasliability"), Boolean.class);

    public static final SqlColumnT<Boolean> COL_USECONFOBJ = column(TABLE_ALIAS, name("useconfobj"), Boolean.class);

    public static final SqlColumnT<Boolean> COL_X_USECONFOBJ = column(TABLE_ALIAS, name("x_useconfobj"), Boolean.class);

    public static final SqlColumnT<Double> COL_X_NOTIFYATTR0 = column(TABLE_ALIAS, name("x_notifyattr0"), Double.class);

    public static final SqlColumnT<Double> COL_X_NOTIFYATTR1 = column(TABLE_ALIAS, name("x_notifyattr1"), Double.class);

    public static final SqlColumnT<Double> COL_X_NOTIFYATTR2 = column(TABLE_ALIAS, name("x_notifyattr2"), Double.class);

    public static final SqlColumnT<Double> COL_X_NOTIFYATTR3 = column(TABLE_ALIAS, name("x_notifyattr3"), Double.class);

    public static final SqlColumnT<Double> COL_X_NOTIFYATTR4 = column(TABLE_ALIAS, name("x_notifyattr4"), Double.class);

    public static final SqlColumnT<Double> COL_X_NOTIFYATTR5 = column(TABLE_ALIAS, name("x_notifyattr5"), Double.class);

    public static final SqlColumnT<Double> COL_X_FLAGDEFINTEREST0 = column(TABLE_ALIAS, name("x_flagdefinterest0"), Double.class);

    public static final SqlColumnT<Double> COL_X_FLAGDEFINTEREST1 = column(TABLE_ALIAS, name("x_flagdefinterest1"), Double.class);

    public static final SqlColumnT<Double> COL_X_FLAGDEFINTEREST2 = column(TABLE_ALIAS, name("x_flagdefinterest2"), Double.class);

    public static final SqlColumnT<Double> COL_X_FLAGDEFINTEREST3 = column(TABLE_ALIAS, name("x_flagdefinterest3"), Double.class);

    public static final SqlColumnT<Double> COL_X_FLAGDEFINTEREST4 = column(TABLE_ALIAS, name("x_flagdefinterest4"), Double.class);

    public static final SqlColumnT<Double> COL_X_FLAGDEFINTEREST5 = column(TABLE_ALIAS, name("x_flagdefinterest5"), Double.class);

    public static final SqlColumnT<Double> COL_X_DELNOTIFYATTR0 = column(TABLE_ALIAS, name("x_delnotifyattr0"), Double.class);

    public static final SqlColumnT<Double> COL_X_DELNOTIFYATTR1 = column(TABLE_ALIAS, name("x_delnotifyattr1"), Double.class);

    public static final SqlColumnT<Double> COL_X_DELNOTIFYATTR2 = column(TABLE_ALIAS, name("x_delnotifyattr2"), Double.class);

    public static final SqlColumnT<Double> COL_X_DELNOTIFYATTR3 = column(TABLE_ALIAS, name("x_delnotifyattr3"), Double.class);

    public static final SqlColumnT<Double> COL_X_DELNOTIFYATTR4 = column(TABLE_ALIAS, name("x_delnotifyattr4"), Double.class);

    public static final SqlColumnT<Double> COL_X_DELNOTIFYATTR5 = column(TABLE_ALIAS, name("x_delnotifyattr5"), Double.class);

    public static final SqlColumnT<Boolean> COL_X_HASDELROWFLAGDEF = column(TABLE_ALIAS, name("x_hasdelrowflagdef"), Boolean.class);

    private EntityMeta() {
    }
}