package cn.tedu.controller;


import cn.tedu.domain.Book;
import cn.tedu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/save")
    public Result save(@RequestBody Book book){
        if (book.isEmpty()){
            return new Result(Code.SAVE_ERROR, false);
        }
        boolean flag = bookService.save(book);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERROR, flag);
    }

    @RequestMapping("/remove")
    public Result remove(Integer id){
        boolean flag = bookService.remove(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERROR, flag);

    }

    @RequestMapping("/update")
    public Result update(@RequestBody Book book){
        boolean flag = bookService.update(book);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERROR, flag);

    }

    @RequestMapping("/findById")
    public Result findById(Integer id){
        // 模拟业务异常，包装成自定义类
        //if (id == 1){
        //    throw new BusinessException(Code.BUSINESS_ERROR, "业务异常");
        //}

        // 模拟系统异常，将可能出现的异常进行包装，转换为自定义异常
        //try{
        //    int i = 1/0;
        //}catch (Exception e){
        //    throw new SystemException(Code.SYSTEM_ERROR, "系统异常", e);
        //}
        Book book = bookService.findBookById(id);
        Integer code = book != null ? Code.GET_OK : Code.GET_ERROR;
        String message = book != null ? "" : "数据查询失败，请重试";

        return new Result(book, code, message);

    }

    @RequestMapping(value = "/findAll")
    public Result findAll(String name) throws UnsupportedEncodingException {
        System.out.println(name);
        String decode = URLDecoder.decode(name, "UTF-8");
        List<Book> bookList = bookService.findAll(decode);
        System.out.println(decode);
        Integer code = bookList != null ? Code.GET_OK : Code.GET_ERROR;
        String message = bookList != null ? "" : "数据查询失败，请重试";
        return new Result(bookList, code, message);

    }


}
