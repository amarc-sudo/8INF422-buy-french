package com.tpam.inviteme.controller;

import com.tpam.inviteme.beans.AdminGroup;
import com.tpam.inviteme.services.AdminGroupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("rest/api/admin-group")
@CrossOrigin("*")
@Slf4j
public class AdminGroupController {

    @Autowired
    private AdminGroupService adminGroupService;

    @GetMapping(value = "getAll")
    public  List<AdminGroup> getAllAdmin() {
        return adminGroupService.getAll();
    }

}
