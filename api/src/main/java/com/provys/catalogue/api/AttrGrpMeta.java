package com.provys.catalogue.api;

import com.provys.provysdb.sqlbuilder.SqlColumnT;
import com.provys.provysdb.sqlbuilder.SqlTableAlias;

import java.math.BigInteger;

import static com.provys.provysdb.sqlbuilder.SqlFactory.*;

public class AttrGrpMeta {
    public static final SqlTableAlias TABLE_ALIAS = tableAlias("alattrgrp");
    public static final SqlColumnT<BigInteger> ATTRGRP_ID = column(TABLE_ALIAS, name("attrgrp_id"), BigInteger.class);
    public static final SqlColumnT<BigInteger> ENTITY_ID = column(TABLE_ALIAS, name("entity_id"), BigInteger.class);

    private AttrGrpMeta() {}
}
