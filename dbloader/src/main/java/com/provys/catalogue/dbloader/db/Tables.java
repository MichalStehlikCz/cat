/*
 * This file is generated by jOOQ.
 */
package com.provys.catalogue.dbloader.db;


import com.provys.catalogue.dbloader.db.tables.KerAttrTb;
import com.provys.catalogue.dbloader.db.tables.KerAttrgrpTb;
import com.provys.catalogue.dbloader.db.tables.KerDomainTb;
import com.provys.catalogue.dbloader.db.tables.KerEntityTb;
import com.provys.catalogue.dbloader.db.tables.KerEntitygrpTb;
import com.provys.catalogue.dbloader.db.tables.KerRelTb;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in KER
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>KER.KER_ATTRGRP_TB</code>.
     */
    public static final KerAttrgrpTb KER_ATTRGRP_TB = com.provys.catalogue.dbloader.db.tables.KerAttrgrpTb.KER_ATTRGRP_TB;

    /**
     * Attribute (catalogue)
     */
    public static final KerAttrTb KER_ATTR_TB = com.provys.catalogue.dbloader.db.tables.KerAttrTb.KER_ATTR_TB;

    /**
     * Domain - attribute type (catalogue)
     */
    public static final KerDomainTb KER_DOMAIN_TB = com.provys.catalogue.dbloader.db.tables.KerDomainTb.KER_DOMAIN_TB;

    /**
     * Entity group
     */
    public static final KerEntitygrpTb KER_ENTITYGRP_TB = com.provys.catalogue.dbloader.db.tables.KerEntitygrpTb.KER_ENTITYGRP_TB;

    /**
     * Entities (catalogue)
     */
    public static final KerEntityTb KER_ENTITY_TB = com.provys.catalogue.dbloader.db.tables.KerEntityTb.KER_ENTITY_TB;

    /**
     * Relations (catalogue)
     */
    public static final KerRelTb KER_REL_TB = com.provys.catalogue.dbloader.db.tables.KerRelTb.KER_REL_TB;
}
