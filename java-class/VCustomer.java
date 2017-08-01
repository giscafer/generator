

/**
 * Created by Luoyouli on 2017/7/24.
 * 发货人及收货人请求和返回信息Vo
 */
public class VCustomer {

    /**
     * 客户名称
     */
    private String name;

    /**
     * 客户类型
     */
    private String clientType;

    /**
     * 客户手机
     */
    private String mobile;

    /**
     * 客户电话
     */
    private String tel;

    /**
     * 客户地址
     */
    private String address;

    /**
     * 创建人
     */
    private String createrName;

    /**
     * 备注
     */
    private String remark;
    /**
     * TMS客户表原客户编号
     * 只用于同步数据，重构TMS上线后要被删除。
     */
    private String idBak;

    /**
     * 是否为运输协议客户
     **/
    private Object ifCustomTransport;
    /**
     * 是否为安装协议客户
     **/
    private Object ifCustomInstall;
    /**
     * 是否为配送协议客户
     **/
    private Object ifCustomDistribute;
    /**
     * 是否为保价协议客户
     **/
    private Object ifCustomInsure;
    /**
     * 发货人类型
     **/
    private String consignerType;

    /**
     * 欠款限额
     **/
    private Object arrearsQuota;

    /**
     * 欠款账期
     **/
    private Object arrearsPeriod;

    /**
     * 欠款延额
     **/
    private Object arrearsExtension;

    /**
     * 欠款延期
     **/
    private Object arrearsDelay;

    /**
     * 充值余额
     **/
    private Object prepaidBalance;

    /**
     * 财务电话
     **/
    private String financePhone;

    /**
     * 财务QQ
     **/
    private String financeQQ;

    /**
     * 业务员
     **/
    private String salesman;

    /**
     * 业务员
     **/
    private String salesmanPhone;
    /**
     * 网点名称
     */
    String companyNodeName;
    /**
     * 网点code
     */
    String companyNodeCode;

    public String getCompanyNodeName() {
        return companyNodeName;
    }

    public void setCompanyNodeName(String companyNodeName) {
        this.companyNodeName = companyNodeName;
    }

    public String getCompanyNodeCode() {
        return companyNodeCode;
    }

    public void setCompanyNodeCode(String companyNodeCode) {
        this.companyNodeCode = companyNodeCode;
    }

    public Object getArrearsQuota() {
        return arrearsQuota;
    }

    public void setArrearsQuota(Object arrearsQuota) {
        this.arrearsQuota = arrearsQuota;
    }

    public Object getArrearsPeriod() {
        return arrearsPeriod;
    }

    public void setArrearsPeriod(Object arrearsPeriod) {
        this.arrearsPeriod = arrearsPeriod;
    }

    public Object getArrearsExtension() {
        return arrearsExtension;
    }

    public void setArrearsExtension(Object arrearsExtension) {
        this.arrearsExtension = arrearsExtension;
    }

    public Object getArrearsDelay() {
        return arrearsDelay;
    }

    public void setArrearsDelay(Object arrearsDelay) {
        this.arrearsDelay = arrearsDelay;
    }

    public Object getPrepaidBalance() {
        return prepaidBalance;
    }

    public void setPrepaidBalance(Object prepaidBalance) {
        this.prepaidBalance = prepaidBalance;
    }

    public String getFinancePhone() {
        return financePhone;
    }

    public void setFinancePhone(String financePhone) {
        this.financePhone = financePhone;
    }

    public String getFinanceQQ() {
        return financeQQ;
    }

    public void setFinanceQQ(String financeQQ) {
        this.financeQQ = financeQQ;
    }

    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman;
    }

    public String getSalesmanPhone() {
        return salesmanPhone;
    }

    public void setSalesmanPhone(String salesmanPhone) {
        this.salesmanPhone = salesmanPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreaterName() {
        return createrName;
    }

    public void setCreaterName(String createrName) {
        this.createrName = createrName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIdBak() {
        return idBak;
    }

    public void setIdBak(String idBak) {
        this.idBak = idBak;
    }

    public Object isIfCustomTransport() {
        return ifCustomTransport;
    }

    public void setIfCustomTransport(Object ifCustomTransport) {
        this.ifCustomTransport = ifCustomTransport;
    }

    public Object isIfCustomInstall() {
        return ifCustomInstall;
    }

    public void setIfCustomInstall(Object ifCustomInstall) {
        this.ifCustomInstall = ifCustomInstall;
    }

    public Object isIfCustomDistribute() {
        return ifCustomDistribute;
    }

    public void setIfCustomDistribute(Object ifCustomDistribute) {
        this.ifCustomDistribute = ifCustomDistribute;
    }

    public Object isIfCustomInsure() {
        return ifCustomInsure;
    }

    public void setIfCustomInsure(Object ifCustomInsure) {
        this.ifCustomInsure = ifCustomInsure;
    }

    public String getConsignerType() {
        return consignerType;
    }

    public void setConsignerType(String consignerType) {
        this.consignerType = consignerType;
    }
}
