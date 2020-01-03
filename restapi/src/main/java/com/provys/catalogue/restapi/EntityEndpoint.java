package com.provys.catalogue.restapi;

import com.provys.catalogue.api.CatalogueRepository;
import com.provys.catalogue.api.Entity;
import com.provys.common.datatype.DtUid;
import io.swagger.v3.oas.annotations.Operation;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/entity")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@ApplicationScoped
public class EntityEndpoint {

    @Inject
    CatalogueRepository catalogueRepository;

    @GET
    @Path("/{entityNm : [a-zA-Z][a-zA-Z_0-9]*}")
    @Operation(
            summary = "Get Entity by Internal Name",
            description = "Retrieve entity using internal name")
    public Entity getEntityByNameNm(@PathParam("entityNm") String entityNm) {
        return catalogueRepository.getEntityManager().getByNameNm(entityNm);
    }

    @GET
    @Path("/{entityId : [0-9]*}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Operation(
            summary = "Get Entity",
            description = "Retrieve entity using Id")
    public Entity getEntityByNameNm(@PathParam("entityId") DtUid id) {
        return catalogueRepository.getEntityManager().getById(id);
    }
}
