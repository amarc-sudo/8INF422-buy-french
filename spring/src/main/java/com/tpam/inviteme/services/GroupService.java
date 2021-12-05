package com.tpam.inviteme.services;

import com.tpam.inviteme.dao.IFriendDao;
import com.tpam.inviteme.dao.IGroupDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("groupService")
@Transactional
public class GroupService {

    @Autowired
    private IGroupDao groupDao;

}
