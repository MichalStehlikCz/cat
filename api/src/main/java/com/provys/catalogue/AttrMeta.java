package com.provys.catalogue;

import static com.provys.provysdb.sqlbuilder.SqlFactory.*;

import com.provys.common.datatype.DtUid;
import com.provys.provysdb.sqlbuilder.SqlColumnT;
import com.provys.provysdb.sqlbuilder.SqlFrom;
import com.provys.provysdb.sqlbuilder.SqlIdentifier;
import com.provys.provysdb.sqlbuilder.SqlTableAlias;

public final class AttrMeta {
    public static final SqlIdentifier TABLE = name("ker_attr_tb");

    public static final SqlTableAlias TABLE_ALIAS = tableAlias("alattr");

    public static final SqlFrom FROM_CLAUSE = from(TABLE, TABLE_ALIAS);

    public static final SqlColumnT<DtUid> COL_ATTR_ID = column(TABLE_ALIAS, name("attr_id"), DtUid.class);

    public static final SqlColumnT<DtUid> COL_ENTITY_ID = column(TABLE_ALIAS, name("entity_id"), DtUid.class);

    public static final SqlColumnT<String> COL_NAME_NM = column(TABLE_ALIAS, name("name_nm"), String.class);

    public static final SqlColumnT<String> COL_NAME = column(TABLE_ALIAS, name("name"), String.class);

    public static final SqlColumnT<String> COL_NOTE = column(TABLE_ALIAS, name("note"), String.class);

    public static final SqlColumnT<Character> COL_ATTRTYPE = column(TABLE_ALIAS, name("attrtype"), Character.class);

    public static final SqlColumnT<Boolean> COL_ISCUSTOM = column(TABLE_ALIAS, name("iscustom"), Boolean.class);

    public static final SqlColumnT<Boolean> COL_ISUSED = column(TABLE_ALIAS, name("isused"), Boolean.class);

    public static final SqlColumnT<DtUid> COL_ATTRGRP_ID = column(TABLE_ALIAS, name("attrgrp_id"), DtUid.class);

    public static final SqlColumnT<Double> COL_ORD = column(TABLE_ALIAS, name("ord"), Double.class);

    public static final SqlColumnT<DtUid> COL_DOMAIN_ID = column(TABLE_ALIAS, name("domain_id"), DtUid.class);

    public static final SqlColumnT<String> COL_SUBDOMAIN_NM = column(TABLE_ALIAS, name("subdomain_nm"), String.class);

    public static final SqlColumnT<String> COL_PROPERNAMEROOT = column(TABLE_ALIAS, name("propernameroot"), String.class);

    public static final SqlColumnT<Boolean> COL_MANDATORY = column(TABLE_ALIAS, name("mandatory"), Boolean.class);

    public static final SqlColumnT<Boolean> COL_ORDERED = column(TABLE_ALIAS, name("ordered"), Boolean.class);

    public static final SqlColumnT<String> COL_ORDGROUP = column(TABLE_ALIAS, name("ordgroup"), String.class);

    public static final SqlColumnT<String> COL_DEFVALUE = column(TABLE_ALIAS, name("defvalue"), String.class);

    public static final SqlColumnT<Boolean> COL_MULTICREATE = column(TABLE_ALIAS, name("multicreate"), Boolean.class);

    public static final SqlColumnT<Boolean> COL_GENCOPY = column(TABLE_ALIAS, name("gencopy"), Boolean.class);

    public static final SqlColumnT<Boolean> COL_GENMOVE = column(TABLE_ALIAS, name("genmove"), Boolean.class);

    public static final SqlColumnT<Boolean> COL_GENDELETE = column(TABLE_ALIAS, name("gendelete"), Boolean.class);

    public static final SqlColumnT<DtUid> COL_TEXTSRC_ID = column(TABLE_ALIAS, name("textsrc_id"), DtUid.class);

    public static final SqlColumnT<Boolean> COL_HIERARCHICAL = column(TABLE_ALIAS, name("hierarchical"), Boolean.class);

    public static final SqlColumnT<Boolean> COL_ISINTABLE = column(TABLE_ALIAS, name("isintable"), Boolean.class);

    public static final SqlColumnT<Boolean> COL_ISOWN = column(TABLE_ALIAS, name("isown"), Boolean.class);

    public static final SqlColumnT<Boolean> COL_VALIDATED = column(TABLE_ALIAS, name("validated"), Boolean.class);

    public static final SqlColumnT<Boolean> COL_QVISIBLE = column(TABLE_ALIAS, name("qvisible"), Boolean.class);

    public static final SqlColumnT<Double> COL_LLENGTH = column(TABLE_ALIAS, name("llength"), Double.class);

    public static final SqlColumnT<Boolean> COL_INDEXED = column(TABLE_ALIAS, name("indexed"), Boolean.class);

    public static final SqlColumnT<String> COL_UPNAME_NM = column(TABLE_ALIAS, name("upname_nm"), String.class);

    public static final SqlColumnT<Boolean> COL_READONLY = column(TABLE_ALIAS, name("readonly"), Boolean.class);

    public static final SqlColumnT<DtUid> COL_GETOPTYPE_ID = column(TABLE_ALIAS, name("getoptype_id"), DtUid.class);

    public static final SqlColumnT<DtUid> COL_SETOPTYPE_ID = column(TABLE_ALIAS, name("setoptype_id"), DtUid.class);

    public static final SqlColumnT<DtUid> COL_RESETOPTYPE_ID = column(TABLE_ALIAS, name("resetoptype_id"), DtUid.class);

    public static final SqlColumnT<Boolean> COL_CONFIRMOTHER = column(TABLE_ALIAS, name("confirmother"), Boolean.class);

    public static final SqlColumnT<DtUid> COL_SETOTHEROPTYPE_ID = column(TABLE_ALIAS, name("setotheroptype_id"), DtUid.class);

    public static final SqlColumnT<Boolean> COL_MULTIVALUE = column(TABLE_ALIAS, name("multivalue"), Boolean.class);

    public static final SqlColumnT<Boolean> COL_LOGALLOWED = column(TABLE_ALIAS, name("logallowed"), Boolean.class);

    public static final SqlColumnT<Character> COL_LOGLEVEL = column(TABLE_ALIAS, name("loglevel"), Character.class);

    public static final SqlColumnT<Character> COL_DICTTYPE = column(TABLE_ALIAS, name("dicttype"), Character.class);

    public static final SqlColumnT<String> COL_DICTDEL1 = column(TABLE_ALIAS, name("dictdel1"), String.class);

    public static final SqlColumnT<String> COL_DICTDEL2 = column(TABLE_ALIAS, name("dictdel2"), String.class);

    public static final SqlColumnT<String> COL_TBCODE_CD = column(TABLE_ALIAS, name("tbcode_cd"), String.class);

    public static final SqlColumnT<String> COL_ACCOUNTRULE_NM = column(TABLE_ALIAS, name("accountrule_nm"), String.class);

    public static final SqlColumnT<DtUid> COL_ACCDOCOBJECTFORMULA_ID = column(TABLE_ALIAS, name("accdocobjectformula_id"), DtUid.class);

    public static final SqlColumnT<DtUid> COL_OWNERFORMULA_ID = column(TABLE_ALIAS, name("ownerformula_id"), DtUid.class);

    public static final SqlColumnT<DtUid> COL_FROMOBJECTFORMULA_ID = column(TABLE_ALIAS, name("fromobjectformula_id"), DtUid.class);

    public static final SqlColumnT<DtUid> COL_TOOBJECTFORMULA_ID = column(TABLE_ALIAS, name("toobjectformula_id"), DtUid.class);

    public static final SqlColumnT<Boolean> COL_APPROXRECORD = column(TABLE_ALIAS, name("approxrecord"), Boolean.class);

    public static final SqlColumnT<String> COL_VALUEACCOUNT_NM = column(TABLE_ALIAS, name("valueaccount_nm"), String.class);

    public static final SqlColumnT<Character> COL_VALUEAMOUNTTYPE = column(TABLE_ALIAS, name("valueamounttype"), Character.class);

    public static final SqlColumnT<Boolean> COL_DEFOWNER = column(TABLE_ALIAS, name("defowner"), Boolean.class);

    public static final SqlColumnT<String> COL_DOCUMENTATION = column(TABLE_ALIAS, name("documentation"), String.class);

    public static final SqlColumnT<Integer> COL_BITMAPORD = column(TABLE_ALIAS, name("bitmapord"), Integer.class);

    public static final SqlColumnT<Character> COL_X_ISFLAGDEPBIND = column(TABLE_ALIAS, name("x_isflagdepbind"), Character.class);

    public static final SqlColumnT<Boolean> COL_X_ISFLAGDEFATTR = column(TABLE_ALIAS, name("x_isflagdefattr"), Boolean.class);

    public static final SqlColumnT<Character> COL_COPIED = column(TABLE_ALIAS, name("copied"), Character.class);

    public static final SqlColumnT<Double> COL_KEYORD = column(TABLE_ALIAS, name("keyord"), Double.class);

    public static final SqlColumnT<DtUid> COL_OPTYPETYPE_RF = column(TABLE_ALIAS, name("optypetype_rf"), DtUid.class);

    public static final SqlColumnT<DtUid> COL_IMGSRC_ID = column(TABLE_ALIAS, name("imgsrc_id"), DtUid.class);

    public static final SqlColumnT<Double> COL_IMGWIDTH = column(TABLE_ALIAS, name("imgwidth"), Double.class);

    public static final SqlColumnT<Double> COL_IMGHEIGHT = column(TABLE_ALIAS, name("imgheight"), Double.class);

    public static final SqlColumnT<DtUid> COL_FILESERVER_ID = column(TABLE_ALIAS, name("fileserver_id"), DtUid.class);

    public static final SqlColumnT<Boolean> COL_GENMIGR = column(TABLE_ALIAS, name("genmigr"), Boolean.class);

    public static final SqlColumnT<Boolean> COL_EVALCVALUE = column(TABLE_ALIAS, name("evalcvalue"), Boolean.class);

    public static final SqlColumnT<Double> COL_OPTLOBLIMIT = column(TABLE_ALIAS, name("optloblimit"), Double.class);

    public static final SqlColumnT<Double> COL_MANLOBLIMIT = column(TABLE_ALIAS, name("manloblimit"), Double.class);

    private AttrMeta() {
    }
}
