package com.iut.james.dao;

import com.iut.james.beans.Command;
import com.iut.james.beans.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommandRepository extends JpaRepository<Command, Integer> {
    List<Command> findAll(User mapInformations);

    List<Command> findAllbyidUserOrderByDate(User mapInformations);



}