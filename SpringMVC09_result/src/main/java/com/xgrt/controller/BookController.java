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
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return new Result(flag?Code.SAVE_OK:Code.SAVE_ERROR,flag);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new Result(flag?Code.UPDATE_OK:Code.UPDATE_ERROR,flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = bookService.delete(id);
        return new Result(flag?Code.DELETE_OK:Code.DELETE_ERROR,flag);
    }


    @GetMapping
    public Result selectAll() {
        List<Book> books = bookService.selectAll();
        Integer code=books!=null?Code.GET_OK:Code.GET_ERROR;
        String msg=books!= null?"":"数据查询失败，请重试！";
        return new Result(code,books,msg);
    }

    @GetMapping("/{id}")
    public Result selectById(@PathVariable Integer id) {
        Book book = bookService.selectById(id);
        Integer code=book!=null?Code.GET_OK:Code.GET_ERROR;
        String msg=book!= null?"":"数据查询失败，请重试！";
        return new Result(code,book,msg);
    }
}
