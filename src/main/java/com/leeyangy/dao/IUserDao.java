package com.leeyangy.dao;

import com.leeyangy.domain.User;

import java.util.List;

/**
 *
 */
public interface IUserDao {
    /**
     *
     * @return
     */
    List<User> findAll();
}