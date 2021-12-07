package com.iut.james.dao;

import com.iut.james.beans.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTypeRepository extends JpaRepository<UserType, Integer> {

    UserType getUserTypeByType(String type);

}