package com.provys.catalogue.impl;

import com.provys.catalogue.api.Domain;
import com.provys.provysobject.impl.ProvysNmObjectLoaderImpl;

public abstract class DomainLoaderBase<S>
        extends ProvysNmObjectLoaderImpl<Domain, DomainValue, DomainProxy, DomainManagerImpl, S>
        implements DomainLoader {

}