import com.test.ecommerce.wu.api.DataResult;
import com.test.ecommerce.wu.api.TradeOrderService;
import com.test.ecommerce.wu.api.impl.trade.TradeOrderServiceImpl;
import com.test.ecommerce.wu.api.request.TradeOrderRequest;
import com.test.ecommerce.wu.api.response.TradeOrderResult;

/**
 * @author wulonghui Date: 2018/05/19 Time: 下午7:54
 */
public class Main {

  public static void main(String[] args) {
    TradeOrderService tradeOrderService = new TradeOrderServiceImpl();
    DataResult<TradeOrderResult> result = tradeOrderService.trade(new TradeOrderRequest());
    System.out.println(result.getData().getPassword());
  }
}