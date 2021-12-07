package com.u8inf422.spring.dao;

import com.u8inf422.spring.beans.User;
import com.u8inf422.spring.beans.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserDao extends JpaRepository<User, Integer> {


    User getUserByPasswordAndMailAndTypeID(String password, String mail, UserType typeID);

    String getSaltByMail(String mail);
}