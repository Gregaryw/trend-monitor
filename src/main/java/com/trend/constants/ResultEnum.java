package com.trend.constants;

/**
 * @author HarlanWang
 * @version v.0.0.1
 * @date 2018/9/17
 */
public enum ResultEnum {
    SUCCESS(0,"成功"),
    ERROR(1,"失败"),
    FAIL(-1,"未知错误");

    private int code;
    private String msg;

    ResultEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

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
