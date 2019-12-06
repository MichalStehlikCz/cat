package com.provys.catalogue.restapi;

import com.provys.catalogue.api.CatalogueRepository;
import com.provys.catalogue.api.Domain;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.math.BigInteger;

@Path("/domain")
public class DomainEndpoint {

    @SuppressWarnings("CdiUnproxyableBeanTypesInspection")
    @Inject
    CatalogueRepository catalogueRepository;

    @GET
    @Path("/{domainNm : [a-zA-Z][a-zA-Z_0-9]*}")
    @Produces("text/plain")
    @Operation(
            summary = "Get Domain by Internal Name",
            description = "Retrieve domain using internal name",
            responses = {
                    @ApiResponse(
                            description = "Domain",
                            content = @Content(
                                    mediaType = "text/plain",
                                    schema = @Schema(
                                            implementation = Domain.class,
                                            maxLength = 30
                                    )))})
    public Response getDomainByNameNm(@PathParam("domainNm") String domainNm) {
        return Response.ok(catalogueRepository.getDomainManager().getByNameNm(domainNm)).build();
    }

    @GET
    @Path("/{domainId : [0-9]*}")
    @Produces("text/plain")
    @Operation(
            summary = "Get Domain",
            description = "Retrieve domain using Id",
            responses = {
                    @ApiResponse(
                            description = "Domain",
                            content = @Content(
                                    mediaType = "text/plain",
                                    schema = @Schema(
                                            implementation = Domain.class,
                                            maxLength = 30
                                    )))})
    public Response getDomainById(@PathParam("domainId") BigInteger id) {
        return Response.ok(catalogueRepository.getDomainManager().getById(id)).build();
    }

    @GET
    @Path("/")
    @Produces("text/plain")
    @Operation(
            summary = "Get All Domains",
            description = "Retrieve all domains",
            responses = {
                    @ApiResponse(
                            description = "Domain",
                            content = @Content(
                                    mediaType = "text/plain",
                                    schema = @Schema(
                                            implementation = Domain.class,
                                            maxLength = 30
                                    )))})
    public Response getAllDomains() {
        return Response.ok(catalogueRepository.getDomainManager().getAll()).build();
    }
}
