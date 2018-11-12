package com.trend.abs;

/**
 * @author HarlanWang
 * @version v.0.0.1
 * @date 2018/9/18
 */
public abstract  class AbstractResponse {
    protected  int code;
    protected  String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
