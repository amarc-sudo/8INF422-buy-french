package com.tpam.inviteme.services;

import com.tpam.inviteme.dao.IPersonDao;
import com.tpam.inviteme.dao.IPersonGroupDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("personService")
@Transactional
public class PersonGroupService {

    @Autowired
    private IPersonGroupDao personGroupDao;

}
