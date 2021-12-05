package com.tpam.inviteme.services;

import com.tpam.inviteme.beans.Person;
import com.tpam.inviteme.dao.ILogDao;
import com.tpam.inviteme.dao.IPersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("personGroupService")
@Transactional
public class PersonService {

    @Autowired
    private IPersonDao personDao;



}
