/*
 * This file is generated by jOOQ.
 */
package com.provys.catalogue.dbloader.db;


import com.provys.catalogue.dbloader.db.tables.KerAttrTb;
import com.provys.catalogue.dbloader.db.tables.KerDomainTb;
import com.provys.catalogue.dbloader.db.tables.KerEntityTb;
import com.provys.catalogue.dbloader.db.tables.KerEntitygrpTb;
import com.provys.catalogue.dbloader.db.tables.KerRelTb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Ker extends SchemaImpl {

    private static final long serialVersionUID = -1013015542;

    /**
     * The reference instance of <code>KER</code>
     */
    public static final Ker KER = new Ker();

    /**
     * Attribute (catalogue)
     */
    public final KerAttrTb KER_ATTR_TB = com.provys.catalogue.dbloader.db.tables.KerAttrTb.KER_ATTR_TB;

    /**
     * Domain - attribute type (catalogue)
     */
    public final KerDomainTb KER_DOMAIN_TB = com.provys.catalogue.dbloader.db.tables.KerDomainTb.KER_DOMAIN_TB;

    /**
     * Entity group
     */
    public final KerEntitygrpTb KER_ENTITYGRP_TB = com.provys.catalogue.dbloader.db.tables.KerEntitygrpTb.KER_ENTITYGRP_TB;

    /**
     * Entities (catalogue)
     */
    public final KerEntityTb KER_ENTITY_TB = com.provys.catalogue.dbloader.db.tables.KerEntityTb.KER_ENTITY_TB;

    /**
     * Relations (catalogue)
     */
    public final KerRelTb KER_REL_TB = com.provys.catalogue.dbloader.db.tables.KerRelTb.KER_REL_TB;

    /**
     * No further instances allowed
     */
    private Ker() {
        super("KER", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            KerAttrTb.KER_ATTR_TB,
            KerDomainTb.KER_DOMAIN_TB,
            KerEntitygrpTb.KER_ENTITYGRP_TB,
            KerEntityTb.KER_ENTITY_TB,
            KerRelTb.KER_REL_TB);
    }
}
