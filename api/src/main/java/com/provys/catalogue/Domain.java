package com.provys.catalogue;

import javax.annotation.Nonnull;

public interface Domain extends GenDomain {
    /**
     * Return Java class this domain is mapped to in Provys framework
     */
    @Nonnull
    Class<?> getImplementingClass(boolean optional);
}