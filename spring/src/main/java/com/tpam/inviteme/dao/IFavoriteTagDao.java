package com.tpam.inviteme.dao;

import com.tpam.inviteme.beans.FavoriteTag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFavoriteTagDao extends JpaRepository<FavoriteTag, Integer> {
}
