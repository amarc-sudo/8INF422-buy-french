package com.u8inf422.spring.dao;

import com.u8inf422.spring.beans.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserDao extends JpaRepository<User, Integer> {


}