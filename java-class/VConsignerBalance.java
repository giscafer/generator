

/**
 * Created by LuoYouli.
 * Create Object: 2017-07-26 15:57
 * 发货人余额流水vo
 */
public class VConsignerBalance {

    /**
     * ID
     */
    private  String consignerBalanceId;

    /**
     * 发货人编号
     */
    private String consignerCode;

    /**
     * 发货人名称
     */
    private String consignerName;

    /**
     * 费用类型
     */
    private String rechargeType;

    /**
     * 充值方式
     */
    private String rechargeWay;

    /**
     * 充值金额
     */
    private Object prepaidMoney;

    /**
     * 赠送金额
     */
    private Object giveMoney;

    /**
     * 辅助单号
     */
    private String serialNumber;

    /**
     * 充值人
     */
    private String recharger;

    /**
     * 审核状态
     */
    private Boolean auditing;

    /**
     * 审核状态
     */
    private String auditings;

    /**
     * 充值日期
     */
    private Object rechargeObject;

    /**
     * 审核人
     */
    private String auditor;

    /**
     * 审核日期
     */
    private Object auditorObject;

    /**
     * 备注
     */
    private String remarks;


    /**
     * 起始日期
     */
    private Object startTime;

    /**
     * 结束日期
     */
    private Object endTime;

    /**
     * 收入
     */
    private  Object income;

    /**
     * 支出
     */
    private  Object expenditure;
    /**
     * 修改人
     */
    private String modify;

    /**
     * 订单列表：订单号及金额数据
     */
    private Object vorderAmounts;

    public Object getVorderAmounts() {
        return vorderAmounts;
    }

    public void setVorderAmounts(Object  vorderAmounts) {
        this.vorderAmounts = vorderAmounts;
    }

    public Object getExpenditure() {
        return expenditure;
    }

    public void setExpenditure(Object expenditure) {
        this.expenditure = expenditure;
    }

    public Object getIncome() {
        return income;
    }

    public void setIncome(Object income) {
        this.income = income;
    }

    public Boolean getAuditing() {
        return auditing;
    }

    public void setAuditing(Boolean auditing) {
        this.auditing = auditing;
    }

    public String getConsignerName() {
        return consignerName;
    }

    public void setConsignerName(String consignerName) {
        this.consignerName = consignerName;
    }

    public Object getStartTime() {
        return startTime;
    }

    public void setStartTime(Object startTime) {
        this.startTime = startTime;
    }

    public Object getEndTime() {
        return endTime;
    }

    public void setEndTime(Object endTime) {
        this.endTime = endTime;
    }

    public String getConsignerBalanceId() {
        return consignerBalanceId;
    }

    public void setConsignerBalanceId(String consignerBalanceId) {
        this.consignerBalanceId = consignerBalanceId;
    }

    public String getConsignerCode() {
        return consignerCode;
    }

    public void setConsignerCode(String consignerCode) {
        this.consignerCode = consignerCode;
    }

    public String getRechargeType() {
        return rechargeType;
    }

    public void setRechargeType(String rechargeType) {
        this.rechargeType = rechargeType;
    }

    public String getRechargeWay() {
        return rechargeWay;
    }

    public void setRechargeWay(String rechargeWay) {
        this.rechargeWay = rechargeWay;
    }

    public Object getPrepaidMoney() {
        return prepaidMoney;
    }

    public void setPrepaidMoney(Object prepaidMoney) {
        this.prepaidMoney = prepaidMoney;
    }

    public Object getGiveMoney() {
        return giveMoney;
    }

    public void setGiveMoney(Object giveMoney) {
        this.giveMoney = giveMoney;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getRecharger() {
        return recharger;
    }

    public void setRecharger(String recharger) {
        this.recharger = recharger;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public Object getAuditorObject() {
        return auditorObject;
    }

    public void setAuditorObject(Object auditorObject) {
        this.auditorObject = auditorObject;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getModify() {
        return modify;
    }

    public void setModify(String modify) {
        this.modify = modify;
    }

    public Object getRechargeObject() {
        return rechargeObject;
    }

    public void setRechargeObject(Object rechargeObject) {
        this.rechargeObject = rechargeObject;
    }

    public String getAuditings() {
        return auditings;
    }

    public void setAuditings(String auditings) {
        this.auditings = auditings;
    }
}
