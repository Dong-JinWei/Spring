package cn.tedu.controller;

/**
 * 定义返回吗的类
 */
public class Code {
    // 定义具体的状态码
    public static final Integer SAVE_OK = 2001;
    public static final Integer DELETE_OK = 2002;
    public static final Integer UPDATE_OK = 2003;
    //public static final Integer UPDATE_SELECT_OK = 20031;
    public static final Integer GET_OK = 2004;

    public static final Integer SAVE_ERROR = 20011;
    public static final Integer DELETE_ERROR = 20012;
    public static final Integer UPDATE_ERROR = 20013;
    public static final Integer GET_ERROR = 20014;

    // 异常状态码
    public static final Integer BUSINESS_ERROR = 5001;
    public static final Integer SYSTEM_ERROR = 5002;

    public static final Integer DATA_NULL = 4004;

}
