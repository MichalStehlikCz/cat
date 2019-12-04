package com.provys.catalogue.impl;

import com.provys.catalogue.api.Domain;
import com.provys.catalogue.impl.gen.DomainValue;
import com.provys.provysobject.impl.ProvysNmObjectLoaderImpl;

public abstract class DomainLoaderBase
        extends ProvysNmObjectLoaderImpl<Domain, DomainValue, DomainProxy, DomainManagerImpl>
        implements DomainLoader {

}