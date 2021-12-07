package com.u8inf422.spring.dao;

import com.u8inf422.spring.beans.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISellerDao extends JpaRepository<Seller, Integer> {


}