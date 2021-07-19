package top.leeyangy.service;

import org.apache.ibatis.annotations.Param;
import top.leeyangy.pojo.Books;

import java.util.List;

/**
 * Created by leeyangy on 2021/7/20 0:09
 */
public interface BookService {
    //增加一本书
    int addBook(Books books);
    //    删除一本书
    int delBookById(int id);
    //    更新一本书
    int updateBook(Books books);
    //    查询一本书
    Books queryBookById(int id);
    //    查询全部书
    List<Books> queryAllBook();
}
