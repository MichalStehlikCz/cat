package com.provys.catalogue.impl;

import com.provys.catalogue.api.Domain;
import com.provys.catalogue.impl.gen.DomainValue;
import com.provys.provysobject.impl.ProvysNmObjectLoader;

public interface DomainLoader extends ProvysNmObjectLoader<Domain, DomainValue, DomainProxy, DomainManagerImpl> {
}
