package com.provys.catalogue.restapi;

import com.provys.catalogue.api.CatalogueRepository;
import com.provys.catalogue.api.Entity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.math.BigInteger;

@ApplicationScoped
@Path("/entity")
public class EntityEndpoint {

    @Inject
    CatalogueRepository catalogueRepository;

    @GET
    @Path("/{entityNm : [a-zA-Z][a-zA-Z_0-9]*}")
    @Produces("text/plain")
    @Operation(
            summary = "Get Entity by Internal Name",
            description = "Retrieve entity using internal name",
            responses = {
                    @ApiResponse(
                            description = "Entity",
                            content = @Content(
                                    mediaType = "text/plain",
                                    schema = @Schema(
                                            implementation = Entity.class,
                                            maxLength = 30
                                    )))})
    public Response getEntityByNameNm(@PathParam("entityNm") String entityNm) {
        return Response.ok(catalogueRepository.getEntityManager().getByNameNm(entityNm)).build();
    }

    @GET
    @Path("/{entityId : [0-9]*}")
    @Produces("text/plain")
    @Operation(
            summary = "Get Entity",
            description = "Retrieve entity using Id",
            responses = {
                    @ApiResponse(
                            description = "Entity",
                            content = @Content(
                                    mediaType = "text/plain",
                                    schema = @Schema(
                                            implementation = Entity.class,
                                            maxLength = 30
                                    )))})
    public Response getEntityByNameNm(@PathParam("entityId") BigInteger id) {
        return Response.ok(catalogueRepository.getEntityManager().getById(id)).build();
    }
}
