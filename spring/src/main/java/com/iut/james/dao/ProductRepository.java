package com.iut.james.dao;

import com.iut.james.beans.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

List<Product> findAll();
}