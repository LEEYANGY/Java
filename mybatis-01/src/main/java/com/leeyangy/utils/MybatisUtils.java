package com.leeyangy.utils;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Created by leeyangy on 2021/6/25 21:55
 */
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    static {
       try {
//           使用Mybatis 获取SQLSessionFactory对象
           String resource = "mybatis-config.xml";
           InputStream ins=Resources.getResourceAsStream(resource);
           sqlSessionFactory=new SqlSessionFactoryBuilder().build(ins);
       }catch (IOException e){
           e.printStackTrace();
       }
    }
    public static SqlSession getSqlSession(){
       return sqlSessionFactory.openSession();
    }
}
