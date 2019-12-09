package com.provys.catalogue.restapi;

import com.provys.catalogue.api.Attr;
import com.provys.catalogue.api.CatalogueRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.math.BigInteger;

@Path("/attr")
@ApplicationScoped
public class AttrEndpoint {

    @Inject
    CatalogueRepository catalogueRepository;

    @GET
    @Path("/{entityNm : [a-zA-Z][a-zA-Z_0-9]*}/{nameNm : [a-zA-Z][a-zA-Z_0-9]*}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Operation(
            summary = "Get Attribute by Internal Name",
            description = "Retrieve attribute using internal name",
            responses = {
                    @ApiResponse(
                            description = "Attribute",
                            content = @Content(
                                    mediaType = "application/xml",
                                    schema = @Schema(
                                            implementation = Attr.class,
                                            maxLength = 30
                                    )))})
    public Response getAttrByNameNm(@PathParam("entityNm") String entityNm, @PathParam("nameNm") String nameNm) {
        return Response.ok(catalogueRepository.getAttrManager().getByEntityIdNameNm(
                catalogueRepository.getEntityManager().getByNameNm(entityNm).getId(), nameNm)).build();
    }

    @GET
    @Path("/{attrId : [0-9]*}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Operation(
            summary = "Get Attribute",
            description = "Retrieve atribute using Id",
            responses = {
                    @ApiResponse(
                            description = "Attribute",
                            content = @Content(
                                    mediaType = "application/xml",
                                    schema = @Schema(
                                            implementation = Attr.class,
                                            maxLength = 30
                                    )))})
    public Response getAttrById(@PathParam("attrId") BigInteger id) {
        return Response.ok(catalogueRepository.getAttrManager().getById(id)).build();
    }
}
