package com.xgrt.controller.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class ProjectInterceptor implements HandlerInterceptor {
    @Override
    //在原始操作前执行的代码，实用性最强
    //可以用于校验
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        /*String contentType = request.getHeader("Content-Type");//取数据
        HandlerMethod hm = (HandlerMethod) handler;*/
        //hm.getMethod();//拿到原始执行的对象，通过反射进行接下来的操作
//        System.out.println(handler.getClass());//结果：class org.springframework.web.method.HandlerMethod
        System.out.println("preHandle……" /*+ contentType*/);
        return true;//return false;会终止原始操作
    }

    @Override
    //在原始操作后执行的代码
    //ModelAndView封装了SpringMVC关于页面跳转的相关数据
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle……");
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    //在拦截操作结束后执行的代码，在postHandle执行的后面
    //可以通过ex参数拿到原始过程执行过程中出现的异常
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion……");
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
