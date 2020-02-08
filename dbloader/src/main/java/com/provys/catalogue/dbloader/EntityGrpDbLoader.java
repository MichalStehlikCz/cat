package com.provys.catalogue.dbloader;

import com.provys.catalogue.EntityGrpMeta;
import com.provys.catalogue.impl.EntityGrpLoaderBase;
import com.provys.catalogue.impl.EntityGrpManagerImpl;
import com.provys.common.datatype.DtUid;
import com.provys.provysdb.dbsqlbuilder.SqlAdmin;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nonnull;

public class EntityGrpDbLoader extends EntityGrpLoaderBase {
    @Nonnull
    private final SqlAdmin dbSql;

    public EntityGrpDbLoader(SqlAdmin dbSql) {
        this.dbSql = Objects.requireNonNull(dbSql);
    }

    @Nonnull
    @Override
    protected EntityGrpDbLoadRunner getLoadRunnerByNameNm(EntityGrpManagerImpl manager,
                                                          String nameNm) {
        return new EntityGrpDbLoadRunner(manager, dbSql, dbSql.eq(EntityGrpMeta.COL_NAME_NM, dbSql.bind("name_nm", nameNm)));
    }

    @Nonnull
    @Override
    protected EntityGrpDbLoadRunner getLoadRunnerById(EntityGrpManagerImpl manager, DtUid id) {
        return new EntityGrpDbLoadRunner(manager, dbSql, dbSql.eq(EntityGrpMeta.COL_ENTITYGRP_ID, dbSql.bind("entitygrp_id", id)));
    }

    @Nonnull
    @Override
    protected EntityGrpDbLoadRunner getLoadRunnerAll(EntityGrpManagerImpl manager) {
        return new EntityGrpDbLoadRunner(manager, dbSql, null);
    }

    @Nonnull
    @Override
    protected EntityGrpDbLoadRunner getLoadRunnerByParentId(EntityGrpManagerImpl manager, DtUid parentId) {
        return new EntityGrpDbLoadRunner(manager, dbSql,
                dbSql.eq(EntityGrpMeta.COL_PARENT_ID, dbSql.bind("parent_id", parentId)));
    }
}
