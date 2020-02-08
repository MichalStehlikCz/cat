package com.provys.catalogue.restapi;

import com.provys.catalogue.CatalogueRepository;
import com.provys.catalogue.EntityGrp;
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
@RequestMapping(value = "/entitygrp", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public class EntityGrpController {

    CatalogueRepository catalogueRepository;

    @Autowired
    public EntityGrpController(CatalogueRepository catalogueRepository) {
        this.catalogueRepository = Objects.requireNonNull(catalogueRepository);
    }

    @ApiOperation(value = "Get Entity Group by Internal Name",
            notes = "Retrieve entity group using internal name")
    @GetMapping("/{entityGrpNm:[a-zA-Z][a-zA-Z_0-9]*}")
    public EntityGrp getEntityGrpByNameNm(@PathVariable("entityGrpNm") @ApiParam("Internal name") String entityGrpNm) {
        return catalogueRepository.getEntityGrpManager().getByNameNm(entityGrpNm);
    }

    @ApiOperation(value = "Get Entity Group",
            notes = "Retrieve entity group using UID")
    @GetMapping("/{entityGrpId:[0-9]+}")
    public EntityGrp getEntityGrpById(@PathVariable("entityGrpId") @ApiParam("Entity group UID") DtUid id) {
        return catalogueRepository.getEntityGrpManager().getById(id);
    }

    @ApiOperation(value = "Get All Entity Groups",
            notes = "Retrieve all entity groups")
    @GetMapping("/")
    public Collection<EntityGrp> getAllEntityGroups() {
        return catalogueRepository.getEntityGrpManager().getAll();
    }
}
