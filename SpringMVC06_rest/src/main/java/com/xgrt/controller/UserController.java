package com.xgrt.controller;

import com.xgrt.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    @RequestMapping(value = "/users",method = RequestMethod.POST)
    @ResponseBody
    public String save(@RequestBody User user){
        System.out.println("user save..."+user);
        return "{'module':'user save'}";
    }

    @RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    //@PathVariable是路径变量的参数注解,意思是从路径上取值
    public String delete(@PathVariable Integer id){
        System.out.println("user delete..." + id);
        return "{'module':'user delete'}";
    }

    @RequestMapping(value = "/users",method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody User user){
        System.out.println("user update..."+user);
        return "{'module':'user update'}";
    }

    @RequestMapping(value = "/users/{id}",method = RequestMethod.GET)
    @ResponseBody
    public String getById(@PathVariable Integer id){
        System.out.println("user getById..."+id);
        return "{'module':'user getById'}";
    }

    //设置当前请求方法为GET，表示REST风格中的查询操作
    @RequestMapping(value = "/users",method = RequestMethod.GET)
    @ResponseBody
    public String getAll(){
        System.out.println("user getAll...");
        return "{'module':'user getAll'}";
    }

}









/*
    @RequestMapping
    @ResponseBody
    public String delete(){
        System.out.println("user delete...");
        return "{'module':'user delete'}";
    }

    @RequestMapping
    @ResponseBody
    public String update(){
        System.out.println("user update...");
        return "{'module':'user update'}";
    }

    @RequestMapping
    @ResponseBody
    public String getById(){
        System.out.println("user getById...");
        return "{'module':'user getById'}";
    }

    @RequestMapping
    @ResponseBody
    public String getAll(){
        System.out.println("user getAll...");
        return "{'module':'user getAll'}";
    }
    */