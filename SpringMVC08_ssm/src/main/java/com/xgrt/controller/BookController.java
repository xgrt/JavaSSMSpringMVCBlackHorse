package com.xgrt.controller;

import com.xgrt.domain.Book;
import com.xgrt.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public boolean save(@RequestBody Book book) {
        return bookService.save(book);
    }

    @PutMapping
    public boolean update(@RequestBody Book book) {
        return bookService.update(book);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        return bookService.delete(id);
    }


    @GetMapping
    public List<Book> selectAll() {
        return bookService.selectAll();
    }

    @GetMapping("/{id}")
    public Book selectById(@PathVariable Integer id) {
        return bookService.selectById(id);
    }
}
