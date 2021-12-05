package com.tpam.inviteme.dao;

import com.tpam.inviteme.beans.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IInscriptionDao extends JpaRepository<Inscription, Integer> {
}
