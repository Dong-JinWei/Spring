package cn.tedu.controller;

import cn.tedu.exception.BusinessException;
import cn.tedu.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 一样处理器类
 */
// 用户标注当前类为Rest风格对应的异常处理
@RestControllerAdvice
public class ProjectExceptionAdvice {

    // 除了自定义的异常处理器，保留Exception类型异常的处理，用户处理非预期异常
    @ExceptionHandler(Exception.class)
    public Result doOtherException(Exception ex){
        return new Result(null, 666, "系统繁忙，请稍后再试");
    }

    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException se){
        // 记录日志
        // 发送消息给运维
        // 发送邮件给开发人员， se对象发送给开发人员

        return new Result(null, se.getCode(), se.getMessage());

    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException be){
        // 记录日志
        // 发送消息给运维
        // 发送邮件给开发人员， se对象发送给开发人员

        return new Result(null, be.getCode(), be.getMessage());

    }

}
