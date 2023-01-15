package com.xgrt.controller;

import com.xgrt.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    //保存
    @PostMapping
    public String save(@RequestBody Book book) {
        System.out.println("book save ===> " + book);
        return "{'module':'book save success'}";
    }

    //查询全部
    @GetMapping
    public List<Book> getAll() {
        System.out.println("book getAll is running...");
        List<Book> books = new ArrayList<>();
        Book book = new Book();
        book.setType("计算机");
        book.setName("SpringMVC小白教程");
        book.setDescription("稀里糊涂");
        books.add(book);

        Book book1 = new Book();
        book1.setType("计算机");
        book1.setName("SpringMVC入门教程");
        book1.setDescription("小试牛刀");
        books.add(book1);

        Book book2 = new Book();
        book2.setType("计算机");
        book2.setName("SpringMVC实战教程");
        book2.setDescription("登堂入室");
        books.add(book2);

        System.out.println("book getAll ===> " + books);
        return books;
    }
}
