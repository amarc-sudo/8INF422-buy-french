package com.tpam.inviteme.controller;

import com.tpam.inviteme.services.AdminGroupService;
import com.tpam.inviteme.services.EventInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/api/event-info")
@CrossOrigin("*")
@Slf4j
public class EventInfoController {

    @Autowired
    private EventInfoService eventInfoService;

}
