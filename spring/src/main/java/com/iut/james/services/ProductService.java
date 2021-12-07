package com.iut.james.services;

import com.iut.james.beans.Product;
import com.iut.james.dao.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("productService")
@Transactional
public class ProductService {

    @Autowired
    private ProductRepository productRepository;



    public List<Product> getProducts(){
        return productRepository.findAll();
    }
}
