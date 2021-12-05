package com.tpam.inviteme.dao;

import com.tpam.inviteme.beans.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGroupDao extends JpaRepository<Group, Integer> {
}
