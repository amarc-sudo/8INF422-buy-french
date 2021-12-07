package com.u8inf422.spring.dao;

import com.u8inf422.spring.beans.Command;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommandDao extends JpaRepository<Command, Integer> {


}