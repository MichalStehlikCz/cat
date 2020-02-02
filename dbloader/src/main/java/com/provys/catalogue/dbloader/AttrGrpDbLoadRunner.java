package com.provys.catalogue.dbloader;

import com.provys.catalogue.api.AttrGrp;
import com.provys.catalogue.api.AttrGrpMeta;
import com.provys.catalogue.impl.AttrGrpManagerImpl;
import com.provys.catalogue.impl.AttrGrpProxy;
import com.provys.catalogue.impl.GenAttrGrpValue;
import com.provys.catalogue.impl.GenAttrGrpValueBuilder;
import com.provys.provysdb.dbcontext.DbResultSet;
import com.provys.provysdb.dbcontext.DbRowMapper;
import com.provys.provysdb.dbsqlbuilder.DbSql;
import com.provys.provysdb.sqlbuilder.Condition;
import com.provys.provysobject.impl.ProvysObjectLoadRunner;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

class AttrGrpDbLoadRunner extends ProvysObjectLoadRunner<AttrGrp, GenAttrGrpValue, AttrGrpProxy, AttrGrpManagerImpl> {
    private static final AttrGrpDbMapper MAPPER = new AttrGrpDbMapper();

    @Nonnull
    private final DbSql dbSql;

    @Nullable
    private final Condition condition;

    AttrGrpDbLoadRunner(AttrGrpManagerImpl manager, DbSql dbSql, @Nullable Condition condition) {
        super(manager);
        this.dbSql = Objects.requireNonNull(dbSql);
        this.condition = condition;
    }

    @Nonnull
    @Override
    protected List<GenAttrGrpValue> select() {
        return dbSql.select()
                .from(AttrGrpMeta.FROM_CLAUSE)
                .column(AttrGrpMeta.COL_ATTRGRP_ID)
                .column(AttrGrpMeta.COL_ENTITY_ID)
                .column(AttrGrpMeta.COL_NAME_NM)
                .column(AttrGrpMeta.COL_NAME)
                .column(AttrGrpMeta.COL_ISCUSTOM)
                .column(AttrGrpMeta.COL_ORD)
                .column(AttrGrpMeta.COL_NOTE)
                .where(condition)
                .prepare()
                .fetch(MAPPER);
    }

    private static class AttrGrpDbMapper implements DbRowMapper<GenAttrGrpValue> {
        public GenAttrGrpValue map(DbResultSet dbResultSet, long line) {
            return new GenAttrGrpValueBuilder()
                .setId(dbResultSet.getNonnullDtUid(1))
                .setEntityId(dbResultSet.getNonnullDtUid(2))
                .setNameNm(dbResultSet.getNonnullString(3))
                .setName(dbResultSet.getNonnullString(4))
                .setIsCustom(dbResultSet.getNonnullBoolean(5))
                .setOrd(dbResultSet.getNonnullInteger(6))
                .setNote(dbResultSet.getNullableString(7))
                .build();
        }
    }
}
