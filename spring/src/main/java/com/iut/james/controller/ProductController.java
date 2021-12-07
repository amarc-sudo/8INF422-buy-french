package com.iut.james.controller;

import com.iut.james.beans.Product;
import com.iut.james.services.ProductService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rest/api/product")
@CrossOrigin("*")
@Slf4j
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("getall")
    @ApiOperation("Renvoie un professeur qui a le login et le mot de passe donnés en paramètre")
    public List<Product> readByLoginAndPassword() {
        return productService.getProducts();
    }
}
