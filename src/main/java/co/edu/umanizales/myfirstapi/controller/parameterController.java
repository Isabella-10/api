package co.edu.umanizales.myfirstapi.controller;

import co.edu.umanizales.myfirstapi.model.Product;
import co.edu.umanizales.myfirstapi.model.TypeDocument;
import co.edu.umanizales.myfirstapi.model.TypeProduct;
import co.edu.umanizales.myfirstapi.service.ParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/parameter")
public class parameterController {
    @Autowired

    private ParameterService parameterService;

    @GetMapping(path = "/typedocuments")
    public List<TypeDocument> getTypeDocuments() {
        return null;
    }

    @GetMapping(path = "typeproducts")
    public List<TypeProduct> getTypeProducts() {
        return null;
    }

    @GetMapping(path = "products")
    public List<Product> getProducts() {
        return null;

    }

}