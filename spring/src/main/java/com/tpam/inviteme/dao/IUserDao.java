package com.tpam.inviteme.dao;

import com.tpam.inviteme.beans.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserDao extends JpaRepository<User, Integer> {


}
