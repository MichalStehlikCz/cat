package com.provys.catalogue.restapi;

import com.provys.catalogue.api.Attr;
import com.provys.catalogue.api.CatalogueRepository;
import com.provys.common.datatype.DtUid;
import io.swagger.v3.oas.annotations.Operation;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.math.BigInteger;

@Path("/attr")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@ApplicationScoped
public class AttrEndpoint {

    @SuppressWarnings("CdiUnproxyableBeanTypesInspection")
    @Inject
    CatalogueRepository catalogueRepository;

    @GET
    @Path("/{entityNm : [a-zA-Z][a-zA-Z_0-9]*}/{nameNm : [a-zA-Z][a-zA-Z_0-9]*}")
    @Operation(
            summary = "Get Attribute by Internal Name",
            description = "Retrieve attribute using internal name")
    public Attr getAttrByNameNm(@PathParam("entityNm") String entityNm, @PathParam("nameNm") String nameNm) {
        return catalogueRepository.getAttrManager().getByEntityIdNameNm(
                catalogueRepository.getEntityManager().getByNameNm(entityNm).getId(), nameNm);
    }

    @GET
    @Path("/{attrId : [0-9]*}")
    @Operation(
            summary = "Get Attribute",
            description = "Retrieve atribute using Id")
    public Attr getAttrById(@PathParam("attrId") DtUid id) {
        return catalogueRepository.getAttrManager().getById(id);
    }
}
