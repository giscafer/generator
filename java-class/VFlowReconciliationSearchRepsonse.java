

/**
 * Created by hjd on 2017-07-20.
 * 月结对账查询响应VO
 */
public class VFlowReconciliationSearchRepsonse {
    /**
     *对账记录Id
     * */
    private String id;
    /**
     *开单网点
     * */
    private String billDepart;
    /**
     *开单时间
     * */
    private String operatDate;
    /**
     *发货人
     * */
    private String shipperName;
    /**
     *发货人编号
     * */
    private String shipperNo;
    /**
     * 任务单号
     */
    private String waybillId;
    /**
     * 付款方式
     * */
    private String payType;
    /**
     * 服务类型
     * */
    private String serviceType;
//    /**
//     * 货物信息
//     * */
//    List<VAbnormalRegistWayBillGoods> waybillGoodsInfo = new ArrayList<>();
    /**
     * 货物信息
     */
    private String goods;
    /**
     * 收货人
     */
    private String consignee;
    /**
     * 收货详细地址
     */
    private String consigneeAddress;
    /**
     * 总金额
     */
    private Object totalAmount;
//    /**
//     * 费用明细
//     * */
//    List<VAbnormalRegistWayBillGoods> waybillGoodsInfo = new ArrayList<>();
    /**
     * 费用明细
     */
    private String feeDetail;
    /**
     * 签收状态
     */
    private String waybillStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBillDepart() {
        return billDepart;
    }

    public void setBillDepart(String billDepart) {
        this.billDepart = billDepart;
    }

    public String getOperatDate() {
        return operatDate;
    }

    public void setOperatDate(String operatDate) {
        this.operatDate = operatDate;
    }

    public String getShipperName() {
        return shipperName;
    }

    public void setShipperName(String shipperName) {
        this.shipperName = shipperName;
    }

    public String getShipperNo() {
        return shipperNo;
    }

    public void setShipperNo(String shipperNo) {
        this.shipperNo = shipperNo;
    }

    public String getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(String waybillId) {
        this.waybillId = waybillId;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
    }

    public Object getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Object totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getFeeDetail() {
        return feeDetail;
    }

    public void setFeeDetail(String feeDetail) {
        this.feeDetail = feeDetail;
    }

    public String getWaybillStatus() {
        return waybillStatus;
    }

    public void setWaybillStatus(String waybillStatus) {
        this.waybillStatus = waybillStatus;
    }
}
