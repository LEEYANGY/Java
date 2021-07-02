package com.leeyangy.dao;

import com.leeyangy.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;

/**
 * Created by leeyangy on 2021/7/1 13:22
 */
public interface TeacherMapper {

    @Select("select * from teacher where id =#{tid}")
    Teacher getTeacher(@Param("tid") int id);
}
