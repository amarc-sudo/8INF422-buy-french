package com.tpam.inviteme.services;

import com.tpam.inviteme.dao.IEventDao;
import com.tpam.inviteme.dao.IFavoriteTagDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("favoriteTagService")
@Transactional
public class FavoriteTagService {

    @Autowired
    private IFavoriteTagDao favoriteTagDao;

}
