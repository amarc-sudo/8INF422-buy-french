package com.tpam.inviteme.dao;

import com.tpam.inviteme.beans.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILogDao extends JpaRepository<Log, Integer>  {
}
