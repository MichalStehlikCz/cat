package com.provys.catalogue.restapi;

import com.provys.catalogue.CatalogueRepository;
import com.provys.catalogue.Domain;
import com.provys.common.datatype.DtUid;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Nonnull;
import java.util.Collection;
import java.util.Objects;

@RestController
@RequestMapping(value = "/domain", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public class DomainController {

    @Nonnull
    private final CatalogueRepository catalogueRepository;

    @Autowired
    public DomainController(CatalogueRepository catalogueRepository) {
        this.catalogueRepository = Objects.requireNonNull(catalogueRepository);
    }

    @ApiOperation(value = "Get Domain by Internal Name", notes = "Retrieve domain using internal name")
    @GetMapping("/{domainNm:[a-zA-Z][a-zA-Z_0-9]*}")
    public Domain getDomainByNameNm(@PathVariable("domainNm") @ApiParam("Internal domain name") String domainNm) {
        return catalogueRepository.getDomainManager().getByNameNm(domainNm);
    }

    @ApiOperation(value = "Get Domain", notes = "Retrieve domain using Id")
    @GetMapping("/{domainId:[0-9]+}")
    public Domain getDomainById(@PathVariable("domainId") @ApiParam("Domain UID") DtUid id) {
        return catalogueRepository.getDomainManager().getById(id);
    }

    @ApiOperation(value = "Get All Domains", notes = "Retrieve all domains")
    @GetMapping("/")
    public Collection<Domain> getAllDomains() {
        return catalogueRepository.getDomainManager().getAll();
    }
}
