package com.provys.catalogue.dbloader;

import com.provys.catalogue.api.AttrMeta;
import com.provys.catalogue.impl.*;
import com.provys.provysdb.dbsqlbuilder.DbSql;
import com.provys.provysdb.dbsqlbuilder.SqlAdmin;

import javax.annotation.Nonnull;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.math.BigInteger;
import java.util.Objects;

@ApplicationScoped
public class AttrDbLoader extends AttrLoaderBase {

    @Nonnull
    private final DbSql dbSql;

    @Inject
    AttrDbLoader(SqlAdmin dbSql) {
        this.dbSql = Objects.requireNonNull(dbSql);
    }

    @Nonnull
    @Override
    protected AttrDbLoadRunner getLoadRunnerByEntityId(AttrManagerImpl attrManager, BigInteger entityId) {
        return new AttrDbLoadRunner(attrManager, dbSql,
                dbSql.eq(AttrMeta.ENTITY_ID, dbSql.bind("entity_id", entityId)));
    }

    @Nonnull
    @Override
    protected AttrDbLoadRunner getLoadRunnerByAttrGrpId(AttrManagerImpl attrManager, BigInteger attrGrpId) {
        return new AttrDbLoadRunner(attrManager, dbSql,
                dbSql.eq(AttrMeta.ATTRGRP_ID, dbSql.bind("attrgrp_id", attrGrpId)));
    }

    @Nonnull
    @Override
    protected AttrDbLoadRunner getLoadRunnerById(AttrManagerImpl attrManager, BigInteger id) {
        return new AttrDbLoadRunner(attrManager, dbSql, dbSql.eq(AttrMeta.ATTR_ID, dbSql.bind("attr_id", id)));
    }

    @Nonnull
    @Override
    protected AttrDbLoadRunner getLoadRunnerAll(AttrManagerImpl attrManager) {
        return new AttrDbLoadRunner(attrManager, dbSql, null);
    }
}
