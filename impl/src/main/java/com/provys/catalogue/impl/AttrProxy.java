package com.provys.catalogue.impl;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.provys.catalogue.api.Attr;
import com.provys.common.datatype.DtUid;
import java.lang.Override;
import javax.annotation.Nonnull;
import javax.json.bind.annotation.JsonbTransient;
import javax.xml.bind.annotation.XmlRootElement;

@JsonSerialize(
        converter = GenAttrProxySerializationConverter.class
)
@XmlRootElement(
        name = "ATTR"
)
public class AttrProxy extends GenAttrProxy implements Attr {
    AttrProxy(AttrManagerImpl manager, DtUid id) {
        super(manager, id);
    }

    @Nonnull
    @Override
    protected AttrProxy self() {
        return this;
    }

    @Nonnull
    @Override
    public Attr selfAsObject() {
        return this;
    }

    /**
     * @return name of attribute for use in Java (camelcase, derived from propername)
     */
    @Nonnull
    public String getJavaName() {
        final String[] parts = getNameNm().split("_");
        final var properNameRoot = getProperNameRoot().orElse(null);
        int index = 0;
        var builder = new StringBuilder();
        if (parts[index].length() == 1) {
            builder.append(parts[index].toLowerCase());
            index++;
        }
        if (parts.length > index) {
            if (parts[index].equalsIgnoreCase(properNameRoot)) {
                builder.append(properNameRoot);
            } else {
                if (index == 0) {
                    builder.append(parts[index].toLowerCase());
                } else {
                    builder.append(Character.toUpperCase(parts[index].charAt(0)))
                            .append(parts[index].substring(1).toLowerCase());
                }
            }
            index++;
        }
        while (parts.length > index) {
            builder.append(Character.toUpperCase(parts[index].charAt(0)))
                    .append(parts[index].substring(1).toLowerCase());
            index++;
        }
        return builder.toString();
    }

    @Override
    public int getOrdInEntity() {
        // we have to select all attributes of given entity
        var attrs = getManager().getByEntityId(getEntityId());
        int result = 0;
        // and calculate how many of them are before our attribute
        for (var attr : attrs) {
            if (attr.compareTo(this) < 0) {
                result++;
            }
        }
        return result;
    }

    private int compareAttrGrp(Attr other) {
        if (getAttrGrp().isEmpty()) {
            if (other.getAttrGrp().isEmpty()) {
                return 0;
            } else {
                return 1;
            }
        }
        if (other.getAttrGrp().isEmpty()) {
            return -1;
        }
        return getAttrGrp().orElseThrow().compareTo(other.getAttrGrp().orElseThrow());
    }

    /**
     * Compares attributes by their attribute group, if in the same attribute group, by their order and name
     *
     * @param other is attribute to be compared to
     * @return -1 if ordering of this is before other, 0 if both objects are the same and 1 if this object is after
     * the other
     */
    @Override
    public int compareTo(Attr other) {
        if (other == this) {
            return 0;
        }
        int result = compareAttrGrp(other);
        if (result == 0) {
            result = Double.compare(getOrd(), other.getOrd());
            if (result == 0) {
                result = getName().compareTo(other.getName());
            }
        }
        return result;
    }
}
