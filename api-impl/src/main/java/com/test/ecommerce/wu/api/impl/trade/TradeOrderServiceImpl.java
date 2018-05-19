package com.test.ecommerce.wu.api.impl.trade;

import com.test.ecommerce.wu.api.DataResult;
import com.test.ecommerce.wu.api.TradeOrderService;
import com.test.ecommerce.wu.api.request.TradeOrderRequest;
import com.test.ecommerce.wu.api.response.TradeOrderResult;

/**
 * @author wulonghui Date: 2018/05/19 Time: 下午7:00
 */
public class TradeOrderServiceImpl implements TradeOrderService{

  public DataResult<TradeOrderResult> trade(TradeOrderRequest request) {
    System.out.println("hello world");
    return buildRet();
  }

  private DataResult<TradeOrderResult> buildRet() {
    DataResult<TradeOrderResult> data = new DataResult<TradeOrderResult>();
    data.setCode(200);
    data.setSuccess(true);
    data.setData(buildTradeResult());
    return data;
  }

  private TradeOrderResult buildTradeResult() {
    TradeOrderResult result = new TradeOrderResult();
    result.setPassword("12321321");
    result.setUserId("34234");
    return result;
  }
}