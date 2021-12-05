package com.tpam.inviteme.dao;

import com.tpam.inviteme.beans.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IPersonDao extends JpaRepository<Person, Integer> {

    @Query(value = "Select u.idPerson from User as u " +
            " where u.email=:login and u.password=:password")
    Person login(@Param("login") String login, @Param("password") String password);

}
