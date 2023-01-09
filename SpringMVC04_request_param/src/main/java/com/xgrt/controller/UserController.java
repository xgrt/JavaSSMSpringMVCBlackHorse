package com.xgrt.controller;

import com.xgrt.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {
    //普通参数
    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name,int age){
        System.out.println("普通参数传递：name ===> "+name);
        System.out.println("普通参数传递：age ===> "+age);
        return "{'module','common param'}";
    }

    //普通参数，请求参数与实参名不同
    @RequestMapping("/commonParamDifferentName")
    @ResponseBody
    public String commonParamDifferentName(@RequestParam("name") String userName, int age) {
        System.out.println("普通参数传递：name ===> "+userName);//结果：普通参数传递：name ===> null
        System.out.println("普通参数传递：age ===> "+age);
        return "{'module','common param different name'}";
    }

    //pojo参数
    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user) {
        System.out.println("pojo参数传递：user ===> "+user);
        return "{'module','pojo param'}";
    }

    //嵌套pojo参数
    @RequestMapping("/pojoContainPojoParam")
    @ResponseBody
    public String pojoContainPojoParam(User user) {
        System.out.println("pojo嵌套参数传递：user ===> "+user);
        return "{'module','pojo contain param'}";
    }

    //数组参数
    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String[] hobbyS){
        System.out.println("数组参数传递：hobbyS ===> "+ Arrays.toString(hobbyS));
        return "{'module','array param'}";
    }

    //集合参数
    //实际上，不加@RequestParam，是把List和array当做POJO参数来用
    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam List<String> hobbyS){
        System.out.println("集合参数传递：hobbyS ===> "+ hobbyS);
        return "{'module','list param'}";
    }

    //集合参数：JSON格式
    //json的数据是在请求体里面的数据不能用@RequestParam
    // 要用@RequestBody
    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> hobbyS){
        System.out.println("JSON集合普通参数传递：hobbyS ==> "+hobbyS);
        return "{'module','list common for json param'}";
    }

    //pojo参数：JSON格式
    @RequestMapping("/pojoParamForJson")
    @ResponseBody
    public String pojoParamForJson(@RequestBody User user){
        System.out.println("JSON集合普通参数传递：user ==> "+user);
        return "{'module','pojo for json param'}";
    }

    //pojo集合参数：JSON格式
    @RequestMapping("/listPojoParamForJson")
    @ResponseBody
    public String listPojoParamForJson(@RequestBody List<User> users){
        System.out.println("JSON集合普通参数传递：users ==> "+users);
        return "{'module','list pojo for json param'}";
    }
}
