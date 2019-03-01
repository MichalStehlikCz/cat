package com.provys.catalogue.api;

import com.provys.provysobject.ProvysObjectManager;

import javax.annotation.Nonnull;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Optional;

public interface AttrManager extends ProvysObjectManager<Attr> {

    @Nonnull
    Collection<Attr> getByEntityId(BigInteger entityId);

    @Nonnull
    Attr getByEntityIdNameNm(BigInteger entityId, String nameNm);

    @Nonnull
    Optional<Attr> getByEntityIdNameNmIfExists(BigInteger entityId, String nameNm);
}
