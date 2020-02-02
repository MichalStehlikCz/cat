package com.provys.catalogue.api;

import static com.provys.provysdb.sqlbuilder.SqlFactory.*;

import com.provys.common.datatype.DtUid;
import com.provys.provysdb.sqlbuilder.SqlColumnT;
import com.provys.provysdb.sqlbuilder.SqlFrom;
import com.provys.provysdb.sqlbuilder.SqlIdentifier;
import com.provys.provysdb.sqlbuilder.SqlTableAlias;

public final class DomainMeta {
    public static final SqlIdentifier TABLE = name("ker_domain_tb");

    public static final SqlTableAlias TABLE_ALIAS = tableAlias("aldomain");

    public static final SqlFrom FROM_CLAUSE = from(TABLE, TABLE_ALIAS);

    public static final SqlColumnT<DtUid> COL_DOMAIN_ID = column(TABLE_ALIAS, name("domain_id"), DtUid.class);

    public static final SqlColumnT<String> COL_NAME_NM = column(TABLE_ALIAS, name("name_nm"), String.class);

    public static final SqlColumnT<String> COL_NAME = column(TABLE_ALIAS, name("name"), String.class);

    public static final SqlColumnT<String> COL_DATATYPE_NM = column(TABLE_ALIAS, name("datatype_nm"), String.class);

    public static final SqlColumnT<Integer> COL_DATALENGTH = column(TABLE_ALIAS, name("datalength"), Integer.class);

    public static final SqlColumnT<Integer> COL_DATAPRECISION = column(TABLE_ALIAS, name("dataprecision"), Integer.class);

    public static final SqlColumnT<String> COL_NOTE = column(TABLE_ALIAS, name("note"), String.class);

    public static final SqlColumnT<Boolean> COL_ALLOWED = column(TABLE_ALIAS, name("allowed"), Boolean.class);

    public static final SqlColumnT<Boolean> COL_QVISIBLE = column(TABLE_ALIAS, name("qvisible"), Boolean.class);

    public static final SqlColumnT<Boolean> COL_LVISIBLE = column(TABLE_ALIAS, name("lvisible"), Boolean.class);

    public static final SqlColumnT<String> COL_VALIDATE_CD = column(TABLE_ALIAS, name("validate_cd"), String.class);

    public static final SqlColumnT<String> COL_LFORMAT_CD = column(TABLE_ALIAS, name("lformat_cd"), String.class);

    public static final SqlColumnT<Boolean> COL_NATORDER = column(TABLE_ALIAS, name("natorder"), Boolean.class);

    private DomainMeta() {
    }
}
