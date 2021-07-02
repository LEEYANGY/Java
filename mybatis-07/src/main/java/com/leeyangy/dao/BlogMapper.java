package com.leeyangy.dao;

import com.leeyangy.pojo.Blog;
import org.apache.ibatis.annotations.Insert;

/**
 * Created by leeyangy on 2021/7/2 23:12
 */
public interface BlogMapper {
//    insert
    @Insert("insert into blog (id,title,author,create_time,views) values (#{id},#{title},#{author},#{createTime},#{views})")
    int addBook(Blog blog);

}
