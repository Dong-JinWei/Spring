package cn.tedu.service.impl;

import cn.tedu.dao.BookDao;
import cn.tedu.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements cn.tedu.service.BookService {

    @Autowired
    private BookDao bookDao;

    public boolean save(Book book) {
        return bookDao.save(book) > 0;
    }

    public boolean remove(Integer id) {
        return bookDao.remove(id) > 0;

    }

    public boolean update(Book book) {
        return bookDao.update(book) > 0;
    }

    public List<Book> findAll(String name) {
        return bookDao.findAll(name);
    }

    public Book findBookById(Integer id) {
        return bookDao.findBookById(id);
    }
}
