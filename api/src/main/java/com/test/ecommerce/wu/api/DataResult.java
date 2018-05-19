package com.test.ecommerce.wu.api;

/**
 * @author wulonghui Date: 2018/05/19 Time: 下午7:01
 */

public class DataResult<T> {

  T data;

  int code;

  public T getData() {
    return data;
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

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public boolean isSuccess() {
    return success;
  }

  public void setSuccess(boolean success) {
    this.success = success;
  }

  String msg;

  boolean success;

}