package cn.tedu.dao;

import cn.tedu.domain.Book;
import jdk.jfr.SettingDefinition;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookDao {

    @Insert("insert into tbl_book(type, name, description) values (#{type}, #{name} , #{description})")
    public int save(Book book);

    @Delete("delete from tbl_book where id = #{id}")
    public int remove(Integer id);

    @Update("update tbl_book set type=#{type}, name=#{name}, description=#{description} where id = #{id}")
    public int update(Book book);

    @Select("select * from tbl_book where name like '%${name}%'")
    public List<Book> findAll(String name);

    @Select("select * from tbl_book where id = #{id}")
    public Book findBookById(Integer id);

}
