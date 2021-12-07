package com.u8inf422.spring.dao;

import com.u8inf422.spring.beans.User;
import com.u8inf422.spring.beans.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

public interface IUserDao extends JpaRepository<User, Integer> {


    User getUserByPasswordAndMailAndTypeID(String password, String mail, UserType typeID);

    String getSaltByMail(String mail);
}