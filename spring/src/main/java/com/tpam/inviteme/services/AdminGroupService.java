package com.tpam.inviteme.services;

import com.tpam.inviteme.beans.AdminGroup;
import com.tpam.inviteme.dao.IAdminGroupDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("adminGroupService")
@Transactional
public class AdminGroupService {

    @Autowired
    private IAdminGroupDao adminGroupDao;

    public List<AdminGroup> getAll() {
        return adminGroupDao.findAll();
    }

}
