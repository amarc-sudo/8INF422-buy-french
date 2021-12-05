package com.tpam.inviteme.controller;

import com.tpam.inviteme.services.EventInfoService;
import com.tpam.inviteme.services.LogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/api/log")
@CrossOrigin("*")
@Slf4j
public class LogController {

    @Autowired
    private LogService logService;

}
