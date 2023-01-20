package com.xgrt.controller;

public class Result {
    private Object data;//用于封装数据
    private Integer code;//状态码
    private String msg;//消息

    //必要的，无参构造方法
    public Result() {
    }

    //必要的，有参无消息的构造方法
    public Result(Integer code,Object data) {
        this.data = data;
        this.code = code;
    }

    //必要的，有参有消息的构造方法
    public Result(Integer code,Object data,  String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    //不必要的
    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public Result(Object data, String msg) {
        this.data = data;
        this.msg = msg;
    }
    //……


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
