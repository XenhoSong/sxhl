package com.test.ecommerce.wu.api.response;

import java.io.Serializable;

/**
 * @author wulonghui Date: 2018/05/19 Time: 下午7:06
 */
public class TradeOrderResult implements Serializable{

  String userId;

  String password;

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}