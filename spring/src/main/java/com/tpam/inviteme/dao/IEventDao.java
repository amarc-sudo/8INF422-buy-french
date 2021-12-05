package com.tpam.inviteme.dao;

import com.tpam.inviteme.beans.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IEventDao extends JpaRepository <Event, Integer> {

    List<Event> findAll();

}
