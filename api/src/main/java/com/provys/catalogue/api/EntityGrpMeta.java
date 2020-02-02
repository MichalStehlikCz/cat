package com.provys.catalogue.api;

import static com.provys.provysdb.sqlbuilder.SqlFactory.*;

import com.provys.common.datatype.DtUid;
import com.provys.provysdb.sqlbuilder.SqlColumnT;
import com.provys.provysdb.sqlbuilder.SqlFrom;
import com.provys.provysdb.sqlbuilder.SqlIdentifier;
import com.provys.provysdb.sqlbuilder.SqlTableAlias;

public final class EntityGrpMeta {
    public static final SqlIdentifier TABLE = name("ker_entitygrp_tb");

    public static final SqlTableAlias TABLE_ALIAS = tableAlias("alentitygrp");

    public static final SqlFrom FROM_CLAUSE = from(TABLE, TABLE_ALIAS);

    public static final SqlColumnT<DtUid> COL_ENTITYGRP_ID = column(TABLE_ALIAS, name("entitygrp_id"), DtUid.class);

    public static final SqlColumnT<DtUid> COL_PARENT_ID = column(TABLE_ALIAS, name("parent_id"), DtUid.class);

    public static final SqlColumnT<String> COL_NAME_NM = column(TABLE_ALIAS, name("name_nm"), String.class);

    public static final SqlColumnT<String> COL_NAME = column(TABLE_ALIAS, name("name"), String.class);

    public static final SqlColumnT<String> COL_NOTE = column(TABLE_ALIAS, name("note"), String.class);

    public static final SqlColumnT<Integer> COL_ORD = column(TABLE_ALIAS, name("ord"), Integer.class);

    private EntityGrpMeta() {
    }
}
