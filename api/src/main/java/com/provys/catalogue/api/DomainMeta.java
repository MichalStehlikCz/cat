package com.provys.catalogue.api;

import com.provys.provysdb.sqlbuilder.SqlColumnT;
import com.provys.provysdb.sqlbuilder.SqlTableAlias;

import static com.provys.provysdb.sqlbuilder.SqlFactory.*;

import java.math.BigInteger;

public final class DomainMeta {
    public static final SqlTableAlias TABLE_ALIAS = tableAlias("aldomain");
    public static final SqlColumnT<BigInteger> DOMAIN_ID = column(TABLE_ALIAS, name("domain_id"), BigInteger.class);
    public static final SqlColumnT<String> NAME_NM = column(TABLE_ALIAS, name("name_nm"), String.class);

    private DomainMeta() {}
}
