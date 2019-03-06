package com.provys.catalogue.api;

import javax.annotation.Nonnull;
import java.util.HashMap;
import java.util.Optional;

/**
 * Defines supported attribute types
 */
public enum AttrType {

    COLUMN("C"),
    TEXT("T"),
    FREE("F"),
    FINANCE("I"),
    SQL("Q"),
    FORMULA("O");

    private static final HashMap<String, AttrType> attrTypeByCode = new HashMap<>(10);

    static {
        for (var attrType : values()) {
            attrTypeByCode.put(attrType.getCode(), attrType);
        }
    }

    @Nonnull
    public static Optional<AttrType> getAttrTypeByCode(String code) {
        return Optional.ofNullable(attrTypeByCode.get(code));
    }

    private final String code;

    AttrType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

}
