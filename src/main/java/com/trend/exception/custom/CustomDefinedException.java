package com.trend.exception.custom;

/**
 * vmei自定义异常
 * @author HarlanWang
 * @version v.0.0.1
 * @date 2018/9/20
 */
public class CustomDefinedException extends RuntimeException{
    public CustomDefinedException(String message){
        super(message);
    }
}
