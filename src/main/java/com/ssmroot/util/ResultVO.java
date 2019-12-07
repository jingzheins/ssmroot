package com.ssmroot.util;


import java.io.Serializable;

/**
 * @Author:wz
 * @Description:统一controller返回结果
 * @注在用ResultBean封装返回结果时,方法内不建议做异常处理 (除特别异常，可以处理，并做逻辑处理）
 * @Date :Created in  17:29-2018/2/1
 * @Return
 */
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String SUCCESS = "1";

    public static final String FAIL = "0";


    protected String msg = "success";

    protected String code = SUCCESS;

    protected T data;

    public ResultVO() {
        super();
    }

    public ResultVO(T data) {
        super();
        this.data = data;
    }

    public ResultVO(Throwable e) {
        super();
        this.msg = e.toString();
        this.code = FAIL;
    }

    public ResultVO(String code, String msg) {
        this.msg = msg;
        this.code = code;
    }

    public ResultVO fillArgs(Object... args) {
        String code = this.code;
        String message = String.format(this.msg, args);
        return new ResultVO(code, message);
    }

    public String getMsg() {
        return msg;
    }

    public ResultVO<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public String getCode() {
        return code;
    }


    public ResultVO<T> setCode(String code) {
        this.code = code;
        return this;
    }

    public T getData() {
        return data;
    }

    public ResultVO<T> setData(T data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "ResultVO{" +
                "msg='" + msg + '\'' +
                ", code='" + code + '\'' +
                ", data=" + data +
                '}';
    }
}
