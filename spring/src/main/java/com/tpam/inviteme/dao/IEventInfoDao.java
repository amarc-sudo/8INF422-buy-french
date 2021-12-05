package com.tpam.inviteme.dao;

import com.tpam.inviteme.beans.EventInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IEventInfoDao extends JpaRepository<EventInfo, Integer> {

    List<EventInfo> findAllByIdEvent(int idEvent);
}
