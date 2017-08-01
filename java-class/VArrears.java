

/**
 * Created by LuoYouli.
 * Create Date: 2017-07-24 16:34
 * 发货人欠款信息vo
 */
public class VArrears {

    /**
     * 剩余欠款金额
     */
    private Object remainingQuota;
    /**
     * 剩余欠款期限
     */
    private Object remainingPeriod;

    /**
     * 剩余预存金额
     */
    private Object remainingMoney;

    public Object getRemainingQuota() {
        return remainingQuota;
    }

    public void setRemainingQuota(Object remainingQuota) {
        this.remainingQuota = remainingQuota;
    }

    public Object getRemainingPeriod() {
        return remainingPeriod;
    }

    public void setRemainingPeriod(Object remainingPeriod) {
        this.remainingPeriod = remainingPeriod;
    }

    public Object getRemainingMoney() {
        return remainingMoney;
    }

    public void setRemainingMoney(Object remainingMoney) {
        this.remainingMoney = remainingMoney;
    }
}
