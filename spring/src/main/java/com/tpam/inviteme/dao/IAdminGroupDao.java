package com.tpam.inviteme.dao;

import com.tpam.inviteme.beans.AdminGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface IAdminGroupDao extends JpaRepository<AdminGroup, Integer> {

    List<AdminGroup> findAll();

}
