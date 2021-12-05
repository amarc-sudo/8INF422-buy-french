package com.tpam.inviteme.dao;

import com.tpam.inviteme.beans.TableData;
import com.tpam.inviteme.beans.TokenConnexion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

public interface ITokenConnexionDao extends JpaRepository<TokenConnexion, Integer> {

    @Query(value = "SELECT T FROM TokenConnexion as T WHERE T.emailConnexion = ?1 and T.token = ?2 and T.dateExpirationToken > ?3")
    List<TokenConnexion> checkConnexion(String mail, String token , Instant maintenant);

    @Query(value = "SELECT T FROM TokenConnexion as T WHERE  T.token = ?1 and T.dateExpirationToken > ?2")
    Optional<TokenConnexion> checkToken(String token, Instant now);
}
