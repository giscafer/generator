

/**
 * Created by hjd on 2017-07-20.
 * 账单查询VO
 */
public class VCollectionSearchRequest {

    /**
     * 账单生成时间起
     */
    private Object generationTimeBegin;

    /**
     * 账单生成时间止
     */
    private Object generationTimeEnd;

    /**
     * 应收单号
     */
    private String receivableNumber;

    /**
     * 发货人Id
     */
    private String consignerId;

    /**
     * 审核状态
     */
    private boolean audited;

    /**
     * 收款状态
     */
    private Object paymentStatus;

    /**
     * 是否核销
     */
    private boolean writeOff;


    /**
     * 发货人类型
     */
    private Object consignerType;

    public Object getGenerationTimeBegin() {
        return generationTimeBegin;
    }

    public void setGenerationTimeBegin(Object generationTimeBegin) {
        this.generationTimeBegin = generationTimeBegin;
    }

    public Object getGenerationTimeEnd() {
        return generationTimeEnd;
    }

    public void setGenerationTimeEnd(Object generationTimeEnd) {
        this.generationTimeEnd = generationTimeEnd;
    }

    public String getReceivableNumber() {
        return receivableNumber;
    }

    public void setReceivableNumber(String receivableNumber) {
        this.receivableNumber = receivableNumber;
    }

    public String getConsignerId() {
        return consignerId;
    }

    public void setConsignerId(String consignerId) {
        this.consignerId = consignerId;
    }

    public Boolean getWriteOff() {
        return writeOff;
    }

    public void setWriteOff(Boolean writeOff) {
        this.writeOff = writeOff;
    }

    public Object getObject() {
        return paymentStatus;
    }

    public void setObject(Object paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public boolean isAudited() {
        return audited;
    }

    public void setAudited(boolean audited) {
        this.audited = audited;
    }

    public boolean isWriteOff() {
        return writeOff;
    }

    public void setWriteOff(boolean writeOff) {
        this.writeOff = writeOff;
    }

}
