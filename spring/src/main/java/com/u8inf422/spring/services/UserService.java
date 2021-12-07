package com.u8inf422.spring.services;

import com.u8inf422.spring.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("userService")
@Transactional
public class UserService {

    @Autowired
    private IUserDao userDao;

}
