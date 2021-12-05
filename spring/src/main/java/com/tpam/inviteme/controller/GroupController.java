package com.tpam.inviteme.controller;

import com.tpam.inviteme.services.EventInfoService;
import com.tpam.inviteme.services.GroupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/api/group")
@CrossOrigin("*")
@Slf4j
public class GroupController {

    @Autowired
    private GroupService groupService;

}
