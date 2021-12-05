package com.tpam.inviteme.controller;

import com.tpam.inviteme.services.EventInfoService;
import com.tpam.inviteme.services.TableDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/api/table-data")
@CrossOrigin("*")
@Slf4j
public class TableDataController {

    @Autowired
    private TableDataService tableDataService;

}
