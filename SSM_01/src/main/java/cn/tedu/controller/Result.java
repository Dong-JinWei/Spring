package cn.tedu.controller;

/**
 * 结果封装
 */
public class Result {
    //描述统一格式的数据
    private Object data;
    //描述统一格式中的编码，可以表示操作成功或失败
    private Integer code;
    //描述统一格式中的消息
    private String message;

    public Result() {
    }

    public Result( Integer code, Object data) {
        this.data = data;
        this.code = code;
    }

    public Result(Object data, Integer code, String message) {
        this.data = data;
        this.code = code;
        this.message = message;
    }


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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
