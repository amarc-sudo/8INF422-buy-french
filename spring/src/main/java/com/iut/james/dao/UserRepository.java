package com.iut.james.dao;

import com.iut.james.beans.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByPasswordAndMail(String password, String mail);

    User findByMail(String mail);
}