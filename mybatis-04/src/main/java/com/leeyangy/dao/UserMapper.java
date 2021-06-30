package com.leeyangy.dao;

import com.leeyangy.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by leeyangy on 2021/6/25 22:15
 */
public interface UserMapper {
    //查询所有用户
    @Select("select * from user")
    List<User> getUser();

//    方法存在多个参数，所有参数前面必须加上@Param("id")注解
    @Select("select * from user where id=#{id}")
    User getUserById(@Param("id")int id);

//    自动提交事务案例
    @Insert("insert into user(id,name,pwd) values (#{id},#{name},#{pwd})")
    int insertUser(User user);

    @Update("update user set name=#{name},pwd=#{pwd} where id=#{id}")
    int updateUser(User user);

//    delUser  @Param 注解中的id要和Param中的id名称一致
    @Delete("delete from user where id=#{id}")
    int deleteUser(@Param("id") int id);

}

