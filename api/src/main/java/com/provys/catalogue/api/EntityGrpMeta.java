package com.provys.catalogue.api;

import com.provys.provysdb.sqlbuilder.SqlColumnT;
import com.provys.provysdb.sqlbuilder.SqlTableAlias;

import java.math.BigInteger;

import static com.provys.provysdb.sqlbuilder.SqlFactory.*;

public class EntityGrpMeta {
    public static final SqlTableAlias TABLE_ALIAS = tableAlias("alentitygrp");
    public static final SqlColumnT<BigInteger> ENTITYGRP_ID = column(TABLE_ALIAS, name("entitygrp_id"), BigInteger.class);
    public static final SqlColumnT<String> NAME_NM = column(TABLE_ALIAS, name("name_nm"), String.class);
    public static final SqlColumnT<BigInteger> PARENT_ID = column(TABLE_ALIAS, name("parent_id"), BigInteger.class);

    private EntityGrpMeta() {}
}
