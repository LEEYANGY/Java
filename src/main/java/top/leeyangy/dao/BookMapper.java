package top.leeyangy.dao;

import org.apache.ibatis.annotations.Param;
import top.leeyangy.pojo.Books;

import java.util.List;

/**
 * Created by leeyangy on 2021/7/19 20:37
 */
public interface BookMapper {
    //增加一本书
    int addBook(Books books);
//    删除一本书
    int delBookById(@Param("bookID") int id);
//    更新一本书
    int updateBook(Books books);
//    查询一本书
    Books queryBookById(@Param("bookID") int id);
//    查询全部书
    List<Books> queryAllBook();
}
