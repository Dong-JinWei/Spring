package cn.tedu.service;

import cn.tedu.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookService {


    public boolean save(Book book);

    public boolean remove(Integer id);

    public boolean update(Book book);

    public List<Book> findAll(String name);

    public Book findBookById(Integer id);
}
