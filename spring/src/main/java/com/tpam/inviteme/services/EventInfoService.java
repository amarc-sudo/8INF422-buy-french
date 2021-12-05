package com.tpam.inviteme.services;

import com.tpam.inviteme.beans.Event;
import com.tpam.inviteme.beans.EventInfo;
import com.tpam.inviteme.dao.IEventDao;
import com.tpam.inviteme.dao.IEventInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("eventInfoService")
@Transactional
public class EventInfoService {

    @Autowired
    private IEventInfoDao eventInfoDao;

    public List<EventInfo> getAllByIdEvent(int idEvent) {
        return eventInfoDao.findAllByIdEvent(idEvent);
    }

}
