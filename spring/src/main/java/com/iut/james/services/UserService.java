package com.iut.james.services;

import com.iut.james.beans.User;
import com.iut.james.dao.UserRepository;
import com.iut.james.dao.UserTypeRepository;
import com.iut.james.utils.Cryptage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.security.NoSuchAlgorithmException;

@Service("userService")
@Transactional
public class UserService {

    @Autowired
    private UserRepository userDao;

    @Autowired
    private UserTypeRepository userTypeDao;

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
