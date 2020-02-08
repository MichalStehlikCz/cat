package com.provys.catalogue.impl;

import com.provys.catalogue.Attr;
import com.provys.catalogue.AttrManager;
import com.provys.common.datatype.DtUid;
import com.provys.common.exception.RegularException;
import com.provys.provysobject.impl.ProvysObjectManagerImpl;
import com.provys.provysobject.index.IdNameNmPair;
import com.provys.provysobject.index.IndexNonUnique;
import com.provys.provysobject.index.IndexUnique;

import javax.annotation.Nonnull;
import java.util.*;

public class AttrManagerImpl extends ProvysObjectManagerImpl<CatalogueRepositoryImpl, Attr, GenAttrValue, AttrProxy,
        AttrManagerImpl, AttrLoader> implements AttrManager {

    @Nonnull
    private final IndexUnique<GenAttrValue, AttrProxy, IdNameNmPair> attrByEntityIdAndNameNm;
    @Nonnull
    private final IndexNonUnique<GenAttrValue, AttrProxy, DtUid> attrByEntityId;
    @Nonnull
    private final IndexNonUnique<GenAttrValue, AttrProxy, DtUid> attrByAttrGrpId;

    AttrManagerImpl(CatalogueRepositoryImpl repository, AttrLoader loader, int initialCapacity) {
        super(repository, loader, initialCapacity, 3);
        attrByEntityIdAndNameNm = new IndexUnique<>("attrByEntityIdAndNameNm",
                val -> new IdNameNmPair(val.getEntityId(), val.getNameNm()), 100);
        addIndex(attrByEntityIdAndNameNm);
        attrByEntityId = new IndexNonUnique<>("attrByEntityId", GenAttrValue::getEntityId);
        addIndex(attrByEntityId);
        attrByAttrGrpId = new IndexNonUnique<>("attrByAttrGrpId", attrId -> attrId.getAttrGrpId().orElse(null));
        addIndex(attrByAttrGrpId);
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
    public Collection<Attr> getByEntityId(DtUid entityId) {
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
    public Collection<Attr> getByAttrGrpId(DtUid attrGrpId) {
        var attrs = attrByAttrGrpId.get(attrGrpId).orElse(null);
        if (attrs == null) {
            // check if Id is valid entity Id
            getRepository().getAttrGrpManager().getById(attrGrpId);
            attrs = getLoader().loadByAttrGrpId(this, attrGrpId);
            attrByAttrGrpId.set(attrGrpId, attrs);
        }
        return Collections.unmodifiableCollection(attrs);
    }

    @Nonnull
    @Override
    public Attr getByEntityIdNameNm(DtUid entityId, String nameNm) {
        return getByEntityIdNameNmIfExists(entityId, nameNm).orElseThrow(() -> new RegularException(
                "JAVA_ATTRMANAGER_ATTR_NOT_FOUND_BY_ENTITY_AND_NM",
                "ATTR was not found by supplied entity " + entityId + " and internal name " + nameNm,
                Map.of("ENTITY_ID", entityId.toString(), "NAME_NM", nameNm)));
    }

    @Nonnull
    @Override
    public Optional<Attr> getByEntityIdNameNmIfExists(DtUid entityId, String nameNm) {
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
    protected AttrProxy getNewProxy(DtUid attrId) {
        return new AttrProxy(this, attrId);
    }

}
