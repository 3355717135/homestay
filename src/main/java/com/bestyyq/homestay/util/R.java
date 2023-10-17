package com.bestyyq.homestay.util;

import lombok.Data;

@Data
public class R<T> {
    //状态码
    private Integer status;
    //错误的状态信息
    private String message;
    //数据
    private T data;

    public void ok(Integer status, String message) {
        this.data = null;
        this.status = status;
        this.message = message;
    }

    public void ok(Integer status, String message, T data) {
        ok(status, message);
        this.data = data;
    }

    public void succeed(T data) {
        HttpStatus ok = HttpStatus.OK;
        ok(ok.getCode(), ok.getMessage(), data);
    }

    public void fail(HttpStatus httpStatus) {
        this.status = httpStatus.getCode();
        this.message = httpStatus.getMessage();
        this.data = null;
    }


}
