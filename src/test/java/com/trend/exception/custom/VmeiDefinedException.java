package com.sephome.exception.custom;

/**
 * vmei自定义异常
 * @author HarlanWang
 * @version v.0.0.1
 * @date 2018/9/20
 */
public class VmeiDefinedException extends RuntimeException{
    public VmeiDefinedException(String message){
        super(message);
    }
}
