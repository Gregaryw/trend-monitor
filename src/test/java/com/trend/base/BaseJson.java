package com.sephome.base;

/**
 * @author Closure.Yang
 * @since 2014/10/7
 */
public class BaseJson {
  /*  *//**
     * 是否成功
     *//*
    protected boolean success = false;

    *//**
     * 是否成功
     *//*
    protected ApiCode apiCode;

    *//**
     * 消息
     *//*
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    protected String msg = "";

    protected boolean isSlmOpen;

    public BaseJson() {
    }
    
    public BaseJson(boolean success) {
        this.success = success;
    }

    *//**
     * 以成功标志来构造
     *
     * @param apiCode
     *//*
    public BaseJson(ApiCode apiCode) {
        this.apiCode = apiCode;
        this.msg = apiCode.getMessage();
        //this.msg = apiCode.getMessage();
    }

    *//**
     * 以消息来构造
     *
     * @param msg
     *//*
    public BaseJson(ApiCode apiCode, String msg) {
        this.apiCode = apiCode;
        this.msg = StringUtils.isBlank(msg) ? apiCode.getMessage() : msg;
    }

    public BaseJson(ApiCode apiCode, String msg, Object... arguments) {
        this.apiCode = apiCode;
        this.msg = formatMsg(msg, arguments);
    }

    public BaseJson(String msg) {
        this.msg = msg;
    }

    public BaseJson(String msg, Object... arguments) {
        this.msg = formatMsg(msg, arguments);
    }

    public String getMsg() {
        if (msg == null || msg.isEmpty()) {
            msg = apiCode.getMessage();
        }
        if (isSlmOpen) {
            if (msg != null) {
                return LocaleMessageHolder.slm(msg);
            }
        }
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setMsg(String msg, Object... arguments) {
        this.msg = formatMsg(msg, arguments);
    }

    public String toJson() {
        if (msg == null || msg.isEmpty()) {
            msg = apiCode.getMessage();
        }
        if (isSlmOpen) {
            if (msg != null) {
                msg = LocaleMessageHolder.slm(msg);
            }
        }

        //return JsonUtil.objectToJson(this);
        return JSONUtils.toJSONString(this);
    }

    public void toJson(HttpServletResponse response) throws IOException {
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().write(toJson());
    }

    public void toGsonJson(HttpServletResponse response) throws IOException {
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().write(toGsonJson());
    }

    public String toGsonJson() {
        if (msg == null || msg.isEmpty()) {
            msg = apiCode.getMessage();
        }
        if (isSlmOpen) {
            if (msg != null) {
                msg = LocaleMessageHolder.slm(msg);
            }
        }
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        return gson.toJson(this);
    }

    public BaseJson openSLM() {
        isSlmOpen = true;
        return this;
    }

    public BaseJson closeSLM() {
        isSlmOpen = false;
        return this;
    }

    private String formatMsg(String msg, Object[] arguments) {
        if (isSlmOpen) {
            String slmValue = LocaleMessageHolder.slm(msg);
            msg = MessageFormat.format(slmValue, arguments);
        }
        return msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }*/
}
