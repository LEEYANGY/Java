package com.leeyangy.dao;

import com.leeyangy.pojo.Student;
import com.leeyangy.pojo.Teacher;
import com.leeyangy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Created by leeyangy on 2021/7/1 20:48
 */
public class TestStudent {
    public static void main(String[] args) {
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        TeacherMapper mapper=sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher=mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }

    @Test
    public void getStudent(){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        StudentMapper mapper=sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudent();
        for (Student student : studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }

    @Test
    public void getStudent2(){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        StudentMapper mapper=sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudent2();
        for (Student student : studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
