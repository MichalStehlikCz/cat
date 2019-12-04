package com.provys.catalogue.dbloader;

import com.provys.catalogue.api.AttrGrpMeta;
import com.provys.catalogue.impl.AttrGrpLoaderBase;
import com.provys.catalogue.impl.AttrGrpManagerImpl;
import com.provys.provysdb.dbsqlbuilder.DbSql;
import com.provys.provysdb.dbsqlbuilder.SqlAdmin;

import javax.annotation.Nonnull;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.math.BigInteger;
import java.util.Objects;

@ApplicationScoped
public class AttrGrpDbLoader extends AttrGrpLoaderBase {

    @Nonnull
    private final DbSql dbSql;

    @Inject
    AttrGrpDbLoader(SqlAdmin dbSql) {
        this.dbSql = Objects.requireNonNull(dbSql);
    }

    @Nonnull
    @Override
    protected AttrGrpDbLoadRunner getLoadRunnerByEntityId(AttrGrpManagerImpl attrGrpManager, BigInteger entityId) {
        return new AttrGrpDbLoadRunner(attrGrpManager, dbSql,
                dbSql.eq(AttrGrpMeta.ENTITY_ID, dbSql.bind("entity_id", entityId)));
    }

    @Nonnull
    @Override
    protected AttrGrpDbLoadRunner getLoadRunnerById(AttrGrpManagerImpl attrGrpManager, BigInteger id) {
        return new AttrGrpDbLoadRunner(attrGrpManager, dbSql,
                dbSql.eq(AttrGrpMeta.ATTRGRP_ID, dbSql.bind("attrgrp_id", id)));
    }

    @Nonnull
    @Override
    protected AttrGrpDbLoadRunner getLoadRunnerAll(AttrGrpManagerImpl attrGrpManager) {
        return new AttrGrpDbLoadRunner(attrGrpManager, dbSql, null);
    }
}
