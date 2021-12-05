package com.tpam.inviteme.dao;

import com.tpam.inviteme.beans.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFriendDao extends JpaRepository<Friend, Integer> {
}
