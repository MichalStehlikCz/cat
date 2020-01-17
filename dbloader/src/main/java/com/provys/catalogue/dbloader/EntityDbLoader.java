package com.provys.catalogue.dbloader;

import com.provys.catalogue.api.EntityMeta;
import com.provys.catalogue.impl.EntityLoaderBase;
import com.provys.catalogue.impl.EntityManagerImpl;
import com.provys.common.datatype.DtUid;
import com.provys.provysdb.dbsqlbuilder.SqlAdmin;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nonnull;

public class EntityDbLoader extends EntityLoaderBase {
    @Nonnull
    private final SqlAdmin dbSql;

    public EntityDbLoader(SqlAdmin dbSql) {
        this.dbSql = Objects.requireNonNull(dbSql);
    }

    @Nonnull
    @Override
    protected EntityDbLoadRunner getLoadRunnerByNameNm(EntityManagerImpl manager, String nameNm) {
        return new EntityDbLoadRunner(manager, dbSql, dbSql.eq(EntityMeta.COL_NAME_NM, dbSql.bind("name_nm", nameNm)));
    }

    @Nonnull
    @Override
    protected EntityDbLoadRunner getLoadRunnerById(EntityManagerImpl manager, DtUid id) {
        return new EntityDbLoadRunner(manager, dbSql, dbSql.eq(EntityMeta.COL_ENTITY_ID, dbSql.bind("entity_id", id)));
    }

    @Nonnull
    @Override
    protected EntityDbLoadRunner getLoadRunnerAll(EntityManagerImpl manager) {
        return new EntityDbLoadRunner(manager, dbSql, null);
    }

    @Nonnull
    @Override
    protected EntityDbLoadRunner getLoadRunnerByEntityGrpId(EntityManagerImpl manager, DtUid entityGrpId) {
        return new EntityDbLoadRunner(manager, dbSql,
                dbSql.eq(EntityMeta.COL_ENTITYGRP_ID, dbSql.bind("entitygrp_id", entityGrpId)));
    }
}