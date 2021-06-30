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
    public void getUser() {
//        1.必写
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
//            2.必写
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> user= mapper.getUser();
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
    @Test
    public void getUserById(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();

        UserMapper mapper=sqlSession.getMapper(UserMapper.class);

        User user=mapper.getUserById(2);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void insertUser(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        mapper.insertUser(new User(22,"leee","321123"));
        sqlSession.close();
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        int res=mapper.updateUser(new User(22,"ffff","123456"));
        if(res>0){
            System.out.println("success!!!");
        }else {
            System.out.println("fail!!!");
        }

    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(222);
        sqlSession.close();
    }



}
