package com.sephome.exception;

import com.alibaba.fastjson.JSONObject;
import com.sephome.exception.custom.VmeiDefinedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常处理类
 * @author HarlanWang
 * @version v.0.0.1
 * @date 2018/9/10
 */
@RestControllerAdvice
public class GlobalDefaultException {
    private static Logger logger = LoggerFactory.getLogger(GlobalDefaultException.class);
    private static final JSONObject jsonObject = new JSONObject();

    @ExceptionHandler(VmeiDefinedException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String customDefinedExceptionHadler(VmeiDefinedException e){
        logger.error("自定义异常{}",e);
        jsonObject.put("code",-1);
        jsonObject.put("msg",e.getMessage());
        return jsonObject.toJSONString();
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String defaultExceptionHandler(HttpServletRequest req, Exception e){
        logger.error("全局参数出现异常{}",e);
        jsonObject.put("code",-1);
        jsonObject.put("msg","系统繁忙，请稍后重试!");
        return jsonObject.toJSONString();
    }
}
