package com.leeyangy.dao;

import com.leeyangy.pojo.Teacher;
import com.leeyangy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Created by leeyangy on 2021/6/25 22:22
 */
public class TeacherTest {
    public static void main(String[] args) {
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        TeacherMapper mapper=sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher=mapper.getTeacherById(1);
        System.out.println(teacher);
        sqlSession.close();
    }
}
