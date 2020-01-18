package com.provys.catalogue.restapi;

import com.provys.catalogue.api.CatalogueRepository;
import com.provys.catalogue.api.Entity;
import com.provys.common.datatype.DtUid;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Objects;

@RestController
@RequestMapping(value = "/entity", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public class EntityController {

    CatalogueRepository catalogueRepository;

    @Autowired
    public EntityController(CatalogueRepository catalogueRepository) {
        this.catalogueRepository = Objects.requireNonNull(catalogueRepository);
    }

    @ApiOperation(value = "Get Entity by Internal Name",
            notes = "Retrieve entity using internal name")
    @GetMapping("/{entityNm:[a-zA-Z][a-zA-Z_0-9]*}")
    public Entity getEntityByNameNm(@PathVariable("entityNm") @ApiParam("Internal name") String entityNm) {
        return catalogueRepository.getEntityManager().getByNameNm(entityNm);
    }

    @ApiOperation(value = "Get Entity",
            notes = "Retrieve entity using UID")
    @GetMapping("/{entityId:[0-9]+}")
    public Entity getEntityById(@PathVariable("entityId") @ApiParam("Entity UID") DtUid id) {
        return catalogueRepository.getEntityManager().getById(id);
    }

    @ApiOperation(value = "Get All Entities",
            notes = "Retrieve all entities")
    @GetMapping("/")
    public Collection<Entity> getAllEntities() {
        return catalogueRepository.getEntityManager().getAll();
    }
}
