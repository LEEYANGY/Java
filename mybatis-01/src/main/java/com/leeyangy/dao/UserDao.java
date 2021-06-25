package com.leeyangy.dao;

import com.leeyangy.pojo.User;

import java.util.List;

/**
 * Created by leeyangy on 2021/6/25 22:15
 */
public interface UserDao {
    List<User> getUserList();
}
