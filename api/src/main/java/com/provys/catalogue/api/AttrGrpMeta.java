package com.provys.catalogue.api;

import static com.provys.provysdb.sqlbuilder.SqlFactory.*;

import com.provys.common.datatype.DtUid;
import com.provys.provysdb.sqlbuilder.SqlColumnT;
import com.provys.provysdb.sqlbuilder.SqlFrom;
import com.provys.provysdb.sqlbuilder.SqlIdentifier;
import com.provys.provysdb.sqlbuilder.SqlTableAlias;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;

public final class AttrGrpMeta {
    public static final SqlIdentifier TABLE = name("ker_attrgrp_tb");

    public static final SqlTableAlias TABLE_ALIAS = tableAlias("alattrgrp");

    public static final SqlFrom FROM_CLAUSE = from(TABLE, TABLE_ALIAS);

    public static final SqlColumnT<DtUid> COL_ATTRGRP_ID = column(TABLE_ALIAS, name("attrgrp_id"), DtUid.class);

    public static final SqlColumnT<DtUid> COL_ENTITY_ID = column(TABLE_ALIAS, name("entity_id"), DtUid.class);

    public static final SqlColumnT<String> COL_NAME_NM = column(TABLE_ALIAS, name("name_nm"), String.class);

    public static final SqlColumnT<String> COL_NAME = column(TABLE_ALIAS, name("name"), String.class);

    public static final SqlColumnT<Boolean> COL_ISCUSTOM = column(TABLE_ALIAS, name("iscustom"), Boolean.class);

    public static final SqlColumnT<Integer> COL_ORD = column(TABLE_ALIAS, name("ord"), Integer.class);

    public static final SqlColumnT<String> COL_NOTE = column(TABLE_ALIAS, name("note"), String.class);

    private AttrGrpMeta() {
    }
}