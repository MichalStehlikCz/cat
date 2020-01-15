package com.provys.catalogue.impl;

import com.provys.catalogue.api.AttrGrp;
import com.provys.catalogue.api.AttrGrpManager;
import com.provys.common.datatype.DtUid;
import com.provys.common.exception.RegularException;
import com.provys.provysobject.impl.ProvysObjectManagerImpl;
import com.provys.provysobject.index.IdNameNmPair;
import com.provys.provysobject.index.IndexNonUnique;
import com.provys.provysobject.index.IndexUnique;

import javax.annotation.Nonnull;
import java.util.*;

public class AttrGrpManagerImpl extends ProvysObjectManagerImpl<CatalogueRepositoryImpl, AttrGrp, GenAttrGrpValue,
        AttrGrpProxy, AttrGrpManagerImpl, AttrGrpLoader> implements AttrGrpManager {

    @Nonnull
    private final IndexUnique<GenAttrGrpValue, AttrGrpProxy, IdNameNmPair> attrGrpByEntityIdAndNameNm;
    @Nonnull
    private final IndexNonUnique<GenAttrGrpValue, AttrGrpProxy, DtUid> attrGrpByEntityId;

    AttrGrpManagerImpl(CatalogueRepositoryImpl repository, AttrGrpLoader loader, int initialCapacity) {
        super(repository, loader, initialCapacity, 2);
        attrGrpByEntityIdAndNameNm = new IndexUnique<>("attrGrpByEntityIdAndNameNm",
                val -> new IdNameNmPair(val.getEntityId(), val.getNameNm()), 100);
        addIndex(attrGrpByEntityIdAndNameNm);
        attrGrpByEntityId = new IndexNonUnique<>("attrGrpByEntityId", GenAttrGrpValue::getEntityId);
        addIndex(attrGrpByEntityId);
    }

    @Nonnull
    @Override
    public String getEntityNm() {
        return "ATTRGRP";
    }

    @Nonnull
    @Override
    protected AttrGrpManagerImpl self() {
        return this;
    }

    @Nonnull
    @Override
    public Collection<AttrGrp> getByEntityId(DtUid entityId) {
        var attrGrps = attrGrpByEntityId.get(entityId).orElse(null);
        if (attrGrps == null) {
            // check if Id is valid entity Id
            getRepository().getEntityManager().getById(entityId);
            attrGrps = getLoader().loadByEntityId(this, entityId);
            attrGrpByEntityId.set(entityId, attrGrps);
        }
        return Collections.unmodifiableCollection(attrGrps);
    }

    @Nonnull
    @Override
    public AttrGrp getByEntityIdNameNm(DtUid entityId, String nameNm) {
        return getByEntityIdNameNmIfExists(entityId, nameNm).orElseThrow(() -> new RegularException(
                "JAVA_ATTRGRPMANAGER_ATTRGRP_NOT_FOUND_BY_ENTITY_AND_NM",
                "ATTRGRP was not found by supplied entity " + entityId + " and internal name " + nameNm,
                Map.of("ENTITY_ID", entityId.toString(), "NAME_NM", nameNm)));
    }

    @Nonnull
    @Override
    public Optional<AttrGrp> getByEntityIdNameNmIfExists(DtUid entityId, String nameNm) {
        var attrGrp = attrGrpByEntityIdAndNameNm.get(new IdNameNmPair(entityId, nameNm)).map(AttrGrpProxy::selfAsObject);
        if (attrGrp.isEmpty()) {
            // load attributes of given entity if they are not loaded (usually if we need one, we will need others as
            // well)
            getByEntityId(entityId);
            // and now get authoritative answer
            attrGrp = attrGrpByEntityIdAndNameNm.get(new IdNameNmPair(entityId, nameNm)).map(AttrGrpProxy::selfAsObject);
        }
        return attrGrp;
    }

    @Nonnull
    @Override
    protected AttrGrpProxy getNewProxy(DtUid attrGrpId) {
        return new AttrGrpProxy(this, attrGrpId);
    }

}
