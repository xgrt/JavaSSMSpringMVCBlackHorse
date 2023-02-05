package com.xgrt.controller.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class ProjectInterceptor implements HandlerInterceptor {
    @Override
    //在原始操作前执行的代码
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle……");
        return true;//return false;会终止原始操作
    }

    @Override
    //在原始操作后执行的代码
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle……");
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    //在拦截操作结束后执行的代码，在postHandle执行的后面
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion……");
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
