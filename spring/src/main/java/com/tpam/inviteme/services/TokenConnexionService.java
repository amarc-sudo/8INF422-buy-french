package com.tpam.inviteme.services;

import com.tpam.inviteme.beans.TokenConnexion;
import com.tpam.inviteme.dao.ITableDataDao;
import com.tpam.inviteme.dao.ITokenConnexionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Optional;
import java.util.UUID;

@Service("tokenConnexionService")
@Transactional
public class TokenConnexionService {

    @Autowired
    private ITokenConnexionDao tokenConnexionDao;

    public TokenConnexion generateToken(String mail) {
        TokenConnexion tokenConnexion = new TokenConnexion();
        tokenConnexion.setDateExpirationToken(Instant.now().plus(1, ChronoUnit.HOURS));
        tokenConnexion.setEmailConnexion(mail);
        tokenConnexion.setToken(UUID.randomUUID().toString());
        return tokenConnexionDao.save(tokenConnexion);
    }

    public Boolean checkConnexion(String mail, String token) {
        return tokenConnexionDao.checkConnexion(mail, token , Instant.now()).size() > 0;
    }

    public Optional<TokenConnexion> checkToken(String token) {
        return tokenConnexionDao.checkToken(token , Instant.now());
    }


}
