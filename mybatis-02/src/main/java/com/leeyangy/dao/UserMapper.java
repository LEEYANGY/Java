package com.leeyangy.dao;

import com.leeyangy.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * Created by leeyangy on 2021/6/25 22:15
 */
public interface UserMapper {
    //查询所有用户
    List<User> getUserList();

    //    按id查询用户
    User getUserById(int id);

    //    insert user
    int addUser(User user);

    //  根据id修改用户信息
    int updateUser(User user);

    //    删除用户
    int deleteUser(int id);

}
