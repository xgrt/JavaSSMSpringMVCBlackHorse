package com.xgrt.controller;

import com.xgrt.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    //响应页面/跳转页面
    @RequestMapping("/")
    public String toJumpPage(){
        System.out.println("跳转页面");
        return "page.jsp";
    }

    //响应文本数据
    @RequestMapping("/toText")
    @ResponseBody//如果不加这个注解，会被认为返回一个路径
    // 加了之后就认为是返回一个字符串
    public String toText() {
        System.out.println("返回纯文本数据");
        return "response text";
    }

    //响应pojo对象
    @RequestMapping("/toJsonPOJO")
    @ResponseBody//设置响应的内容，通过JSON包的转换
    public User toJsonPOJO(){
        System.out.println("返回JSON对象数据");
        User user=new User();
        user.setName("xgrt");
        user.setAge(21);
        return user;
    }

    //响应集合POJO集合对象
    @RequestMapping("/toJsonList")
    @ResponseBody
    public List<User> toJsonList(){
        System.out.println("返回JSON集合数据");
        User user1=new User();
        user1.setName("鑫哥rt");
        user1.setAge(18);

        User user2=new User();
        user2.setName("xgrt");
        user2.setAge(16);

        List<User> userList=new ArrayList<>();
        userList.add(user1);
        userList.add(user2);

        return userList;
    }
}
