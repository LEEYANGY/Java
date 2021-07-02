package com.leeyangy.dao;

import com.leeyangy.pojo.Student;

import java.util.List;

/**
 * Created by leeyangy on 2021/7/1 13:22
 */
public interface StudentMapper {
    List<Student> getStudent();
    List<Student> getStudent2();
}
