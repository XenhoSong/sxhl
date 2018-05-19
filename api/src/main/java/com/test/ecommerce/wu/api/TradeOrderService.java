/**
 * Youzan.com Inc.
 * Copyright (c) 2012-2016 All Rights Reserved.
 */
package com.test.ecommerce.wu.api;

import com.test.ecommerce.wu.api.request.TradeOrderRequest;
import com.test.ecommerce.wu.api.response.TradeOrderResult;

/**
 * @author wulonghui
 * @version TradeOrderService.java, v 0.1 2018-05-19 18:59
 */
public interface TradeOrderService {

  public DataResult<TradeOrderResult> trade(TradeOrderRequest request);
}
