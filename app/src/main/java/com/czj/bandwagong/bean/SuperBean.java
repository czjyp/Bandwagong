package com.czj.bandwagong.bean;

import com.google.gson.Gson;

import java.io.Serializable;

/**
 * Created by czj on 2018/9/23.
 */
public class SuperBean implements Serializable {
    private int error;

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAdditionalErrorCode() {
        return additionalErrorCode;
    }

    public void setAdditionalErrorCode(String additionalErrorCode) {
        this.additionalErrorCode = additionalErrorCode;
    }

    public String getAdditionalErrorInfo() {
        return additionalErrorInfo;
    }

    public void setAdditionalErrorInfo(String additionalErrorInfo) {
        this.additionalErrorInfo = additionalErrorInfo;
    }

    private String message;
    private String additionalErrorCode;
    private String additionalErrorInfo;

    @Override
    public String toString() {
        Gson gson=new Gson();
        return gson.toJson(this);
    }
}
