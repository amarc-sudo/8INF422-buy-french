package com.tpam.inviteme.services;

import com.tpam.inviteme.beans.Person;
import com.tpam.inviteme.dao.IPersonDao;
import com.tpam.inviteme.dao.ITableDataDao;
import com.tpam.inviteme.dao.ITokenConnexionDao;
import com.tpam.inviteme.dao.IUserDao;
import com.tpam.inviteme.utils.Cryptage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;

@Service("userService")
@Transactional
public class UserService {

    @Autowired
    private IUserDao userDao;

}
