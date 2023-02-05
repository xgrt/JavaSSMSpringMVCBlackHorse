package com.xgrt.controller;

import com.xgrt.domain.Book;
import org.springframework.web.bind.annotation.*;

//@Controller
//@ResponseBody
@RestController//简化2：将@Controller和@ResponseBody注解合并为@RestController
@RequestMapping("/books")//简化1：将重复的路径提取出来
public class BookController {

//    @RequestMapping(method = RequestMethod.POST)
    @PostMapping//与@RequestMapping(method = RequestMethod.POST)作用相同
    public String save(@RequestBody Book book) {
        System.out.println("book save..."+book);
        return "{'module':'book save'}";
    }

//    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        System.out.println("book delete..." + id);
        return "{'module':'book delete'}";
    }

//    @RequestMapping(method = RequestMethod.PUT)
    @PutMapping
    public String update(@RequestBody Book book) {
        System.out.println("book update..." + book);
        return "{'module':'book update'}";
    }

//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id) {
        System.out.println("book getById..." + id);
        return "{'module':'book getById'}";
    }

//    @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String getAll() {
        System.out.println("book getAll...");
        return "{'module':'book getAll'}";
    }
}
