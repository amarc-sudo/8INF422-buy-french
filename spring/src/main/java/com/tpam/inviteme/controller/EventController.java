package com.tpam.inviteme.controller;

import com.tpam.inviteme.beans.AdminGroup;
import com.tpam.inviteme.beans.Event;
import com.tpam.inviteme.services.AdminGroupService;
import com.tpam.inviteme.services.EventInfoService;
import com.tpam.inviteme.services.EventService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("rest/api/event")
@CrossOrigin("*")
@Slf4j
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping(value = "getAll")
    public List<Event> getAllAdmin() {
        return eventService.getAll();
    }


}
