package top.leeyangy.service;

//import org.springframework.beans.factory.annotation.Autowired;
import top.leeyangy.dao.BookMapper;
import top.leeyangy.pojo.Books;

import java.util.List;

/**
 * Created by leeyangy on 2021/7/20 0:11
 */
public class BookServiceImpl implements BookService{

//    service电泳dao层，组合Dao
//    @Autowired
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int delBookById(int id) {
        return bookMapper.delBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
