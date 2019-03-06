package com.provys.catalogue.impl;

import com.provys.catalogue.api.Attr;
import com.provys.catalogue.api.AttrManager;
import com.provys.common.exception.RegularException;
import com.provys.provysobject.impl.ProvysObjectManagerImpl;
import com.provys.provysobject.index.IdNameNmPair;
import com.provys.provysobject.index.IndexNonUnique;
import com.provys.provysobject.index.IndexUnique;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;
import java.math.BigInteger;
import java.util.*;

public class AttrManagerImpl extends ProvysObjectManagerImpl<CatalogueRepositoryImpl, Attr, AttrValue, AttrProxy,
        AttrManagerImpl, AttrLoader> implements AttrManager {

    @Nonnull
    private static final Logger LOG = LogManager.getLogger(AttrManagerImpl.class);

    @Nonnull
    private final IndexUnique<AttrValue, AttrProxy, IdNameNmPair> attrByEntityIdAndNameNm;
    @Nonnull
    private final IndexNonUnique<AttrValue, AttrProxy, BigInteger> attrByEntityId;

    AttrManagerImpl(CatalogueRepositoryImpl repository, AttrLoader loader, int initialCapacity) {
        super(repository, loader, initialCapacity, 2);
        attrByEntityIdAndNameNm = new IndexUnique<>("attrByEntityIdAndNameNm",
                val -> new IdNameNmPair(val.getEntityId(), val.getNameNm()), 100);
        addIndex(attrByEntityIdAndNameNm);
        attrByEntityId = new IndexNonUnique<>("attrByEntityId", AttrValue::getEntityId);
        addIndex(attrByEntityId);
    }

    @Nonnull
    @Override
    public String getEntityNm() {
        return "ATTR";
    }

    @Nonnull
    @Override
    protected AttrManagerImpl self() {
        return this;
    }

    @Nonnull
    @Override
    public Collection<Attr> getByEntityId(BigInteger entityId) {
        var attrs = attrByEntityId.get(entityId).orElse(null);
        if (attrs == null) {
            // check if Id is valid entity Id
            getRepository().getEntityManager().getById(entityId);
            attrs = getLoader().loadByEntityId(this, entityId);
            attrByEntityId.set(entityId, attrs);
        }
        return Collections.unmodifiableCollection(attrs);
    }

    @Nonnull
    @Override
    public Attr getByEntityIdNameNm(BigInteger entityId, String nameNm) {
        return getByEntityIdNameNmIfExists(entityId, nameNm).orElseThrow(() -> new RegularException(LOG,
                "JAVA_ATTRMANAGER_ATTR_NOT_FOUND_BY_ENTITY_AND_NM",
                "ATTR was not found by supplied entity " + entityId + " and internal name " + nameNm,
                Map.of("ENTITY_ID", entityId.toString(), "NAME_NM", nameNm)));
    }

    @Nonnull
    @Override
    public Optional<Attr> getByEntityIdNameNmIfExists(BigInteger entityId, String nameNm) {
        var attr = attrByEntityIdAndNameNm.get(new IdNameNmPair(entityId, nameNm)).map(AttrProxy::selfAsObject);
        if (attr.isEmpty()) {
            // load attributes of given entity if they are not loaded (usually if we need one, we will need others as
            // well)
            getByEntityId(entityId);
            // and now get authoritative answer
            attr = attrByEntityIdAndNameNm.get(new IdNameNmPair(entityId, nameNm)).map(AttrProxy::selfAsObject);
        }
        return attr;
    }

    @Nonnull
    @Override
    protected AttrProxy getNewProxy(BigInteger attrId) {
        return new AttrProxy(this, attrId);
    }

}
