package com.provys.catalogue.impl;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.provys.catalogue.Attr;
import com.provys.common.datatype.DtUid;
import java.lang.Override;
import javax.annotation.Nonnull;
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

    /**
     * @return proper name of attribute - either constructed from properNameRoot or just by upper-casing first letter
     * and lower-casing the rest
     */
    @Nonnull
    @Override
    public String getcProperName() {
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

    /**
     * @return Java property name for to this attribute
     */
    @Nonnull
    @Override
    public String getcJavaPropertyName() {
        var properName = getcProperName();
        if (Character.toLowerCase(properName.charAt(0)) == properName.charAt(0)) {
            return properName;
        }
        return Character.toLowerCase(properName.charAt(0)) + properName.substring(1);
    }

    @Nonnull
    private String getJavaMethodName() {
        var properName = getcProperName();
        if ((properName.length() > 1) && (properName.charAt(1) != Character.toLowerCase(properName.charAt(1)))) {
            // weird thing in beans specification (Section 8.8)
            return getcJavaPropertyName();
        }
        if (Character.toUpperCase(properName.charAt(0)) == properName.charAt(0)) {
            return properName;
        }
        return Character.toUpperCase(properName.charAt(0)) + properName.substring(1);
    }

    /**
     * @return Java getter name for to this attribute
     */
    @Nonnull
    @Override
    public String getcJavaGetterName() {
        return (getDomain().getImplementingClass(true).equals(Boolean.class) ? "is" : "get")
                + getJavaMethodName();
    }

    /**
     * @return Java setter name for to this attribute
     */
    @Nonnull
    @Override
    public String getcJavaSetterName() {
        return "set" + getJavaMethodName();
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
