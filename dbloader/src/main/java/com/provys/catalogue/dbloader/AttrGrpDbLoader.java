package com.provys.catalogue.dbloader;

import com.provys.catalogue.api.AttrGrpMeta;
import com.provys.catalogue.impl.AttrGrpLoaderBase;
import com.provys.catalogue.impl.AttrGrpManagerImpl;
import com.provys.common.datatype.DtUid;
import com.provys.provysdb.dbsqlbuilder.SqlAdmin;
import java.lang.Override;
import java.util.Objects;
import javax.annotation.Nonnull;

public class AttrGrpDbLoader extends AttrGrpLoaderBase {
    @Nonnull
    private final SqlAdmin dbSql;

    public AttrGrpDbLoader(SqlAdmin dbSql) {
        this.dbSql = Objects.requireNonNull(dbSql);
    }

    @Nonnull
    @Override
    protected AttrGrpDbLoadRunner getLoadRunnerById(AttrGrpManagerImpl manager, DtUid id) {
        return new AttrGrpDbLoadRunner(manager, dbSql, dbSql.eq(AttrGrpMeta.COL_ATTRGRP_ID, dbSql.bind("attrgrp_id", id)));
    }

    @Nonnull
    @Override
    protected AttrGrpDbLoadRunner getLoadRunnerAll(AttrGrpManagerImpl manager) {
        return new AttrGrpDbLoadRunner(manager, dbSql, null);
    }

    @Nonnull
    @Override
    protected AttrGrpDbLoadRunner getLoadRunnerByEntityId(AttrGrpManagerImpl manager, DtUid entityId) {
        return new AttrGrpDbLoadRunner(manager, dbSql,
                dbSql.eq(AttrGrpMeta.COL_ENTITY_ID, dbSql.bind("entity_id", entityId)));
    }
}
