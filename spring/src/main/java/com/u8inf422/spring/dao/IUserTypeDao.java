package com.u8inf422.spring.dao;

import com.u8inf422.spring.beans.User;
import com.u8inf422.spring.beans.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserTypeDao extends JpaRepository<UserType, Integer> {

    UserType getUserTypeByType(String type);
}