package com.u8inf422.spring.dao;

import com.u8inf422.spring.beans.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductDao extends JpaRepository<Product, Integer> {


}