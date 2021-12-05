package com.tpam.inviteme.dao;

import com.tpam.inviteme.beans.TableData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITableDataDao extends JpaRepository<TableData, Integer> {
}
