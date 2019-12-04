package com.provys.catalogue.api;

import javax.annotation.Nonnull;

public interface Domain extends DomainBase {
    /**
     * Return Java class this domain is mapped to in Provys framework
     */
    @Nonnull
    Class<?> getImplementingClass(boolean optional);
}
