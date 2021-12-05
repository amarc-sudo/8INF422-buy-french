package com.tpam.inviteme.services;

import com.tpam.inviteme.dao.IFavoriteTagDao;
import com.tpam.inviteme.dao.IFriendDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("friendService")
@Transactional
public class FriendService {

    @Autowired
    private IFriendDao friendDao;

}
