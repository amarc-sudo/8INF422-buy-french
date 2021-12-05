package com.tpam.inviteme.services;

import com.tpam.inviteme.beans.AdminGroup;
import com.tpam.inviteme.beans.Event;
import com.tpam.inviteme.dao.IAdminGroupDao;
import com.tpam.inviteme.dao.IEventDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("eventService")
@Transactional
public class EventService {

    @Autowired
    private IEventDao eventDao;

    public List<Event> getAll() {
        return eventDao.findAll();
    }
}
