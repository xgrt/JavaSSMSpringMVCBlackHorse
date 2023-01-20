package com.xgrt;


import com.xgrt.config.SpringConfig;
import com.xgrt.domain.Book;
import com.xgrt.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {
    @Autowired
    private BookService bookService;

    @Test
    public void testSelectById(){
        Book book = bookService.selectById(2);
        System.out.println(book);
    }

    @Test
    public void testSelectAll(){
        List<Book> books = bookService.selectAll();
        System.out.println(books);
    }
}
