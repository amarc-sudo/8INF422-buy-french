package com.iut.james.dao;

import com.iut.james.beans.User;
import com.iut.james.beans.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User getUserByPasswordAndMailAndTypeID(String password, String mail, UserType typeID);

    String getSaltByMail(String mail);
}