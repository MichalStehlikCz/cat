package com.provys.catalogue.dbloader;

import com.provys.catalogue.AttrMeta;
import com.provys.catalogue.impl.AttrLoaderBase;
import com.provys.catalogue.impl.AttrManagerImpl;
import com.provys.common.datatype.DtUid;
import com.provys.provysdb.dbsqlbuilder.SqlAdmin;
import java.lang.Override;
import java.util.Objects;
import javax.annotation.Nonnull;

public class AttrDbLoader extends AttrLoaderBase {
    @Nonnull
    private final SqlAdmin dbSql;

    public AttrDbLoader(SqlAdmin dbSql) {
        this.dbSql = Objects.requireNonNull(dbSql);
    }

    @Nonnull
    @Override
    protected AttrDbLoadRunner getLoadRunnerById(AttrManagerImpl manager, DtUid id) {
        return new AttrDbLoadRunner(manager, dbSql, dbSql.eq(AttrMeta.COL_ATTR_ID, dbSql.bind("attr_id", id)));
    }

    @Nonnull
    @Override
    protected AttrDbLoadRunner getLoadRunnerAll(AttrManagerImpl manager) {
        return new AttrDbLoadRunner(manager, dbSql, null);
    }

    @Nonnull
    @Override
    protected AttrDbLoadRunner getLoadRunnerByEntityId(AttrManagerImpl manager, DtUid entityId) {
        return new AttrDbLoadRunner(manager, dbSql,
                dbSql.eq(AttrMeta.COL_ENTITY_ID, dbSql.bind("entity_id", entityId)));
    }

    @Nonnull
    @Override
    protected AttrDbLoadRunner getLoadRunnerByAttrGrpId(AttrManagerImpl attrManager, DtUid attrGrpId) {
        return new AttrDbLoadRunner(attrManager, dbSql,
                dbSql.eq(AttrMeta.COL_ATTRGRP_ID, dbSql.bind("attrgrp_id", attrGrpId)));
    }
}
