package com.provys.catalogue.dbloader;

import com.provys.catalogue.api.Attr;
import com.provys.catalogue.api.AttrManager;
import com.provys.catalogue.api.AttrType;
import com.provys.catalogue.dbloader.db.tables.records.KerAttrTbRecord;
import com.provys.catalogue.impl.AttrManagerImpl;
import com.provys.catalogue.impl.AttrProxy;
import com.provys.catalogue.impl.AttrValue;
import com.provys.common.exception.InternalException;
import com.provys.provysdb.dbcontext.DbContext;
import com.provys.provysdb.dbcontext.DbResultSet;
import com.provys.provysdb.dbcontext.DbRowMapper;
import com.provys.provysdb.sqlbuilder.SqlAdmin;
import com.provys.provysobject.impl.ProvysObjectLoadRunner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jooq.Condition;
import org.jooq.impl.DSL;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Objects;
import com.provys.provysdb.sqlbuilder.Condition;

class AttrDbLoadRunner extends ProvysObjectLoadRunner<Attr, AttrValue, AttrProxy, AttrManagerImpl> {

    private static final Logger LOG = LogManager.getLogger(AttrDbLoadRunner.class);

    @Nonnull
    private final SqlAdmin dbSql;
    @Nullable
    private final Condition condition;

    AttrDbLoadRunner(AttrManagerImpl manager, SqlAdmin dbSql, @Nullable Condition condition) {
        super(manager);
        this.dbSql = Objects.requireNonNull(dbSql);
        this.condition = condition;
    }

    private class AttrDbMapper implements DbRowMapper<AttrValue> {

        @Override
        public AttrValue map(DbResultSet dbResultSet, long l) {
            return null;
        }
    }

    @Nonnull
    @Override
    protected List<AttrValue> select() {
        return dbSql.select()
                .from("ker_attr_tb", AttrManager.TABLE_ALIAS)
                .column("attr_id", BigDecimal.class)
                .where(condition)
                .prepare()
                .fetch(new AttrDbMapper());
    }
}
