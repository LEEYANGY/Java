package com.leeyangy.dao;

import com.leeyangy.pojo.Blog;
import com.leeyangy.utils.IDutils;
import com.leeyangy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by leeyangy on 2021/7/2 0:19
 */
public class TestBlog {
    @Test
   public void addInitBlog(){
       SqlSession sqlSession= MybatisUtils.getSqlSession();
       BlogMapper mapper=sqlSession.getMapper(BlogMapper.class);

       Blog blog=new Blog();
//       获取随机id
       blog.setId(IDutils.getId());
       blog.setTitle("Mybatis");
       blog.setAuthor("LEEYANGY");
       blog.setCreateTime(new Date());
       blog.setViews(99999);
       mapper.addBook(blog);
//--------------------------------------------------
       blog.setId(IDutils.getId());
       blog.setTitle("Mybatis");
       blog.setAuthor("LEEYANGY");
       blog.setCreateTime(new Date());
       blog.setViews(99999);
       mapper.addBook(blog);
//--------------------------------------------------
       sqlSession.close();
   }


   @Test
    public void queryBlogIF(){
       SqlSession sqlSession= MybatisUtils.getSqlSession();
       BlogMapper mapper=sqlSession.getMapper(BlogMapper.class);

       HashMap map =new HashMap();
//       map.put("title","Mybatis so easy");

       List<Blog> blogs=mapper.queryBlogIF(map);

       for (Blog blog : blogs) {
           System.out.println(blog);
       }
        sqlSession.close();
   }
}
