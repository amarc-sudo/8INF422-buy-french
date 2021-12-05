package com.tpam.inviteme.dao;

import com.tpam.inviteme.beans.PersonGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonGroupDao extends JpaRepository<PersonGroup, Integer> {
}
