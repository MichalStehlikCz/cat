package com.provys.catalogue.impl;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.provys.catalogue.Attr;
import com.provys.catalogue.AttrGrp;
import com.provys.catalogue.Entity;
import com.provys.common.datatype.DtUid;
import java.lang.Override;
import java.util.Collection;
import javax.annotation.Nonnull;
import javax.xml.bind.annotation.XmlRootElement;

@JsonSerialize(
        converter = GenEntityProxySerializationConverter.class
)
@XmlRootElement(
        name = "ENTITY"
)
public class EntityProxy extends GenEntityProxy implements Entity {
    EntityProxy(EntityManagerImpl manager, DtUid id) {
        super(manager, id);
    }

    @Nonnull
    @Override
    protected EntityProxy self() {
        return this;
    }

    @Nonnull
    @Override
    public Entity selfAsObject() {
        return this;
    }

    /**
     * Calculate proper name from internal name. Used when proper name is not specified for entity
     *
     * @return calculated proper name
     */
    @Nonnull
    private String calcProperName() {
        var nameNm = getNameNm();
        return nameNm.charAt(0) + nameNm.substring(1).toLowerCase();
    }

    /**
     * @return effective proper name for this entity; either proper name if one is specified or internal name with first
     * letter upper-case and the rest lower-case
     */
    @Nonnull
    @Override
    public String getcProperName() {
        return getProperName().orElseGet(this::calcProperName);
    }

    @Nonnull
    @Override
    public Collection<AttrGrp> getAttrGrps() {
        return getManager().getRepository().getAttrGrpManager().getByEntityId(getId());
    }

    @Nonnull
    @Override
    public Collection<Attr> getAttrs() {
        return getManager().getRepository().getAttrManager().getByEntityId(getId());
    }

    private int compareEntityGrp(Entity other) {
        var entityGrp = getEntityGrp();
        var otherEntityGrp = other.getEntityGrp();
        if (entityGrp.isEmpty()) {
            if (otherEntityGrp.isEmpty()) {
                return 0;
            } else {
                return 1;
            }
        }
        if (otherEntityGrp.isEmpty()) {
            return -1;
        }
        return entityGrp.get().compareTo(otherEntityGrp.get());
    }

    /**
     * Compares entities by their entity group, if in same entity group, by their name
     *
     * @param other is other entity to be compared to
     * @return -1 if ordering of this is before other, 0 if both objects are the same and 1 if this object is after
     * the other
     */
    @Override
    public int compareTo(Entity other) {
        if (other == this) {
            return 0;
        }
        int result = compareEntityGrp(other);
        if (result == 0) {
            result = getName().compareTo(other.getName());
        }
        return result;
    }
}
