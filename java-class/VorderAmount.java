

/**
 * Created by LuoYouli.
 * Create Date: 2017-07-29 10:41
 * 订单列表金额Vo
 */
public class VorderAmount {

    /**
     * 订单号
     */
    private String sonNumber;
    /**
     * 订单总金额
     */
    private Object amount;

    public String getSonNumber() {
        return sonNumber;
    }

    public void setSonNumber(String sonNumber) {
        this.sonNumber = sonNumber;
    }

    public Object getAmount() {
        return amount;
    }

    public void setAmount(Object amount) {
        this.amount = amount;
    }
}
