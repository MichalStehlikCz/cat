package com.provys.catalogue.restapi;

import com.provys.catalogue.api.CatalogueRepository;
import com.provys.catalogue.api.Domain;
import io.swagger.v3.oas.annotations.Operation;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.math.BigInteger;
import java.util.Collection;

@Path("/domain")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@ApplicationScoped
public class DomainEndpoint {

    @SuppressWarnings("CdiUnproxyableBeanTypesInspection")
    @Inject
    CatalogueRepository catalogueRepository;

    @GET
    @Path("/{domainNm : [a-zA-Z][a-zA-Z_0-9]*}")
    @Operation(
            summary = "Get Domain by Internal Name",
            description = "Retrieve domain using internal name")
    public Domain getDomainByNameNm(@PathParam("domainNm") String domainNm) {
        return catalogueRepository.getDomainManager().getByNameNm(domainNm);
    }

    @GET
    @Path("/{domainId : [0-9]*}")
    @Operation(
            summary = "Get Domain",
            description = "Retrieve domain using Id")
    public Domain getDomainById(@PathParam("domainId") BigInteger id) {
        return catalogueRepository.getDomainManager().getById(id);
    }

    @GET
    @Path("/")
    @Operation(
            summary = "Get All Domains",
            description = "Retrieve all domains")
    public Collection<Domain> getAllDomains() {
        return catalogueRepository.getDomainManager().getAll();
    }
}
