package com.hl.diary.result;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 数据传输类
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result<T> {
    private int code;
    private T data;
    private String msg;

    public Result(int code, String msg) {
        this(code, msg, null);
    }

    public Result(int i, String s, T data) {
        this.code = i;
        this.msg = s;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        msg = msg;
    }
}
