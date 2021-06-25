package com.leeyangy.dao;

import com.leeyangy.pojo.User;
import com.leeyangy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Created by leeyangy on 2021/6/25 22:22
 */
public class UserDaoTest {
    @Test
    public void test(){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        UserDao userDao = (UserDao) sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();
        for (User user:userList){
            System.out.println(user);
        }
        sqlSession.close();
    }
}
