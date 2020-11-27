package com.wp.application.keepaccount.bean;

public class BaseResponse {

    public int code  = 0;
    public String msg = "success";

    @Override
    public String toString() {
        return "BaseResponse{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
