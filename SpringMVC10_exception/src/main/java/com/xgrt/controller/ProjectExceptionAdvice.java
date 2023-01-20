package com.xgrt.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice//异常处理器类的注解，注意要被SpringMVC扫描到
public class ProjectExceptionAdvice {
    @ExceptionHandler(Exception.class)//当前异常处理器处理器处理异常的种类
    public  Result doException(Exception e){
        System.out.println("异常，休要跑！");
        return new Result(666,"异常，休要跑！");
    }
}
