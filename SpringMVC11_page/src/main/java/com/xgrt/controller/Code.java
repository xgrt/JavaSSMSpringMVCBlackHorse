package com.xgrt.controller;

public class Code {
    public static final Integer SAVE_OK = 20011;//添加成功的状态码
    public static final Integer DELETE_OK = 20021;//删除成功的状态码
    public static final Integer UPDATE_OK = 20031;//修改成功的状态码
    public static final Integer GET_OK = 20041;//查询成功的状态码

    public static final Integer SAVE_ERROR = 20010;//添加失败的状态码
    public static final Integer DELETE_ERROR = 20020;//删除失败的状态码
    public static final Integer UPDATE_ERROR = 20030;//修改失败的状态码
    public static final Integer GET_ERROR = 20040;//查询失败的状态码

    public static final Integer SYSTEM_ERR = 50001;
    public static final Integer SYSTEM_TIMEOUT_ERR = 50002;
    public static final Integer SYSTEM_UNKNOWN_ERR = 59999;
    //    ……
    public static final Integer BUSINESS_ERR = 60002;
    //    ……


}
