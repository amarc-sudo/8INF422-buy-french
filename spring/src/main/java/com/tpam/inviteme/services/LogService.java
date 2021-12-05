package com.tpam.inviteme.services;

import com.tpam.inviteme.dao.IInscriptionDao;
import com.tpam.inviteme.dao.ILogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("logService")
@Transactional
public class LogService {

    @Autowired
    private ILogDao logDao;

}
