package com.provys.catalogue.restapi;

import com.provys.catalogue.api.Attr;
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
@RequestMapping(value = "/attr", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public class AttrController {

    @Nonnull
    private final CatalogueRepository catalogueRepository;

    @Autowired
    public AttrController(CatalogueRepository catalogueRepository) {
        this.catalogueRepository = Objects.requireNonNull(catalogueRepository);
    }

    @ApiOperation(value = "Get Attribute by Internal Name",
            notes = "Retrieve attribute using entity and attribute internal names")
    @GetMapping("/{entityNm:[a-zA-Z][a-zA-Z_0-9]*}/{nameNm:[a-zA-Z][a-zA-Z_0-9]*}")
    public Attr getAttrByNameNm(@PathVariable("entityNm")  @ApiParam("Internal entity name") String entityNm,
                                @PathVariable("nameNm") @ApiParam("Internal name of attribute") String nameNm) {
        return catalogueRepository.getAttrManager().getByEntityIdNameNm(
                catalogueRepository.getEntityManager().getByNameNm(entityNm).getId(), nameNm);
    }

    @ApiOperation(value = "Get Attribute",
            notes = "Retrieve attribute using UID")
    @GetMapping("/{attrId:[0-9]+}")
    public Attr getAttrById(@PathVariable("attrId") @ApiParam("Attribute UID") DtUid id) {
        return catalogueRepository.getAttrManager().getById(id);
    }
}
