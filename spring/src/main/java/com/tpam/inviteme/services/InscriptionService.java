package com.tpam.inviteme.services;

import com.tpam.inviteme.dao.IGroupDao;
import com.tpam.inviteme.dao.IInscriptionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("inscriptionService")
@Transactional
public class InscriptionService {

    @Autowired
    private IInscriptionDao inscriptionDao;

}
