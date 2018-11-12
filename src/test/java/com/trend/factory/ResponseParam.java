package com.sephome.factory;

import com.sephome.abs.AbstractResponse;
import com.sephome.constants.ResultEnum;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 页面返回结果封装类
 * @author HarlanWang
 * @version v.0.0.1
 * @date 2018/9/17
 */
public class ResponseParam<T> extends AbstractResponse implements Serializable {

    /**
     * 返回数据
     */
    private Map<String,T> data = new HashMap<>();

    public static ResponseParam SUCCESS(){
       return new ResponseParam(ResultEnum.SUCCESS);
    }

    public static ResponseParam ERROR(){
        return new ResponseParam(ResultEnum.ERROR);
    }

    public static ResponseParam FAIL(){
        return new ResponseParam(ResultEnum.FAIL);
    }

    private ResponseParam() {
    }

    private ResponseParam(ResultEnum resultEnum) {
       this.code = resultEnum.getCode();
       this.msg = resultEnum.getMsg();
    }

    private ResponseParam(int code, String msg, Map<String, T> data) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public static ResponseParam build(int code, String msg,Map<String, Object> data){
        return ResponseParam.ResponseParamBuilderHandler.build(code,msg,data);
    }

    public  ResponseParam addData(String key, T t){
        data.put(key,t);
        return this;
    }

    /**
     * 采用静态内部类实现单例模式创建对象
     */

    private static class ResponseParamBuilderHandler{
      private  static ResponseParam<Object> responseParam = new ResponseParam<>();
        public static ResponseParam build(int code,String msg,Map<String,Object> data){
            responseParam.setCode(code);
            responseParam.setMsg(msg);
            responseParam.setData(data);
            return  responseParam;
        }
    }

    public Map<String, T> getData() {
        return data;
    }

    public void setData(Map<String, T> data) {
        this.data = data;
    }

}
