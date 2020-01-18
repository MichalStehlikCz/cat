package com.provys.catalogue.restapi;

import com.provys.catalogue.api.AttrGrp;
import com.provys.catalogue.api.CatalogueRepository;
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
import java.util.Objects;

@RestController
@RequestMapping(value = "/attrgrp", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public class AttrGrpController {

    @Nonnull
    private final CatalogueRepository catalogueRepository;

    @Autowired
    public AttrGrpController(CatalogueRepository catalogueRepository) {
        this.catalogueRepository = Objects.requireNonNull(catalogueRepository);
    }

    @ApiOperation(value = "Get Attribute Group by Internal Name",
            notes = "Retrieve attribute group using entity and attribute group internal names")
    @GetMapping("/{entityNm:[a-zA-Z][a-zA-Z_0-9]*}/{nameNm:[a-zA-Z][a-zA-Z_0-9]*}")
    public AttrGrp getAttrGrpByNameNm(@PathVariable("entityNm")  @ApiParam("Internal entity name")
                                                  String entityNm,
                                @PathVariable("nameNm") @ApiParam("Internal name of attribute group")
                                        String nameNm) {
        return catalogueRepository.getAttrGrpManager().getByEntityIdNameNm(
                catalogueRepository.getEntityManager().getByNameNm(entityNm).getId(), nameNm);
    }

    @ApiOperation(value = "Get Attribute Group",
            notes = "Retrieve attribute group using UID")
    @GetMapping("/{attrGrpId:[0-9]+}")
    public AttrGrp getAttrGrpById(@PathVariable("attrGrpId") @ApiParam("Attribute group UID") DtUid id) {
        return catalogueRepository.getAttrGrpManager().getById(id);
    }
}
