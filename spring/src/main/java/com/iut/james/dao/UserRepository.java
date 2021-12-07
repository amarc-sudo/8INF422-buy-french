package com.iut.james.dao;

import com.iut.james.beans.User;
import com.iut.james.beans.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByPasswordAndMailAndTypeID(String password, String mail, UserType typeID);

    User findByMail(String mail);
}