package cn.example.wang.networkcomponent.base;

import com.google.gson.annotations.SerializedName;

/**
 * Created by WANG on 17/11/23.
 *
 */

public class BaseResultBean<T> {
    @SerializedName("code")
    private int code;

    private int status;

    @SerializedName("msg")
    private String msg;
    @SerializedName("data")
    private T data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "code  is " + code +"msg  is "+data.toString();
    }
}
