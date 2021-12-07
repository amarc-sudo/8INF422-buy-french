package com.u8inf422.spring.services;

import com.u8inf422.spring.beans.User;
import com.u8inf422.spring.dao.IUserDao;
import com.u8inf422.spring.dao.IUserTypeDao;
import com.u8inf422.spring.utils.Cryptage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.security.NoSuchAlgorithmException;

@Service("userService")
@Transactional
public class UserService {

    @Autowired
    private IUserDao userDao;

    @Autowired
    private IUserTypeDao userTypeDao;

    public User login(String login, String password) {
        String passwordCrypt = "";
        try {
            passwordCrypt = Cryptage.crypteString(password, userDao.getSaltByMail(login));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return userDao.getUserByPasswordAndMailAndTypeID(login, passwordCrypt, userTypeDao.getUserTypeByType("user"));
    }
}
