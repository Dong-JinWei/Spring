package cn.tedu.test;

import cn.tedu.config.SpringConfig;
import cn.tedu.domain.Book;
import cn.tedu.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class TestService {

    @Autowired
    private BookService bookService;

    @Test
    public void testFindAll(){
        List<Book> all = bookService.findAll("龙");
        System.out.println(all);
    }
}
