package com.bestyyq.homestay.util;

public enum HttpStatus {
    Unauthorized("未授权",401),
    OK("请求成功",200);

    private String message;

    private int code;

    HttpStatus(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }
}
