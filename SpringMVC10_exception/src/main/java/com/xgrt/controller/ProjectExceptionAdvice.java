package com.xgrt.controller;

import com.xgrt.exception.BusinessException;
import com.xgrt.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice//异常处理器类的注解，注意要被SpringMVC扫描到
public class ProjectExceptionAdvice {
    @ExceptionHandler(SystemException.class)
    public  Result doSystemException(SystemException e){
        //记录日志
        //发送消息给运维
        //发送邮件个给开发人员,e对象发送给开发人员
        return new Result(e.getCode(),null,e.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public  Result doBusinessException(BusinessException e){
        return new Result(e.getCode(),null,e.getMessage());
    }

    //其他异常
    @ExceptionHandler(Exception.class)//当前异常处理器处理器处理异常的种类
    public  Result doException(Exception e){
        //记录日志
        //发送消息给运维
        //发送邮件个给开发人员,e对象发送给开发人员
        return new Result(Code.SYSTEM_UNKNOWN_ERR,null,"系统繁忙，请稍后再试！");
    }
}
