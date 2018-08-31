package smile.wangsy.january.order.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Order {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 订单号
     */
    @Column(name = "order_number")
    private String orderNumber;

    /**
     * 描述
     */
    private String description;

    /**
     * 订单状态（-1：已取消, 0：未支付，1：已支付；2：已接单，3: 配送中，4: 已完成）
     */
    @Column(name = "order_state")
    private Integer orderState;

    /**
     * 配送地址
     */
    @Column(name = "distribute_address")
    private String distributeAddress;

    /**
     * 商户名称
     */
    @Column(name = "merchant_name")
    private String merchantName;

    /**
     * 商户id
     */
    @Column(name = "merchant_id")
    private Long merchantId;

    /**
     * 会员名称
     */
    @Column(name = "member_name")
    private String memberName;

    /**
     * 会员id
     */
    @Column(name = "member_id")
    private Long memberId;

    /**
     * 联系电话
     */
    @Column(name = "member_mobile")
    private String memberMobile;

    /**
     * 配送费
     */
    @Column(name = "distribute_price")
    private BigDecimal distributePrice;

    /**
     * 优惠金额
     */
    private BigDecimal discount;

    /**
     * 打包费
     */
    @Column(name = "pack_price")
    private BigDecimal packPrice;

    /**
     * 合计金额
     */
    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    /**
     * 配送员名称
     */
    @Column(name = "distributer_name")
    private String distributerName;

    /**
     * 配送员id
     */
    @Column(name = "distributer_id")
    private Long distributerId;

    /**
     * 配送员联系电话
     */
    @Column(name = "distributer_mobile")
    private String distributerMobile;

    /**
     * 配送单位名称
     */
    @Column(name = "distribution_name")
    private String distributionName;

    /**
     * 配送单位id
     */
    @Column(name = "distribution_id")
    private Long distributionId;

    /**
     * 数据入库时间(订单时间)
     */
    @Column(name = "insert_time")
    private Date insertTime;

    /**
     * 数据最后一次更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 删除时间
     */
    @Column(name = "delete_time")
    private Date deleteTime;

    /**
     * 是否已删除
     */
    @Column(name = "been_deleted")
    private Boolean beenDeleted;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取订单号
     *
     * @return order_number - 订单号
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * 设置订单号
     *
     * @param orderNumber 订单号
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取订单状态（-1：已取消, 0：未支付，1：已支付；2：已接单，3: 配送中，4: 已完成）
     *
     * @return order_state - 订单状态（-1：已取消, 0：未支付，1：已支付；2：已接单，3: 配送中，4: 已完成）
     */
    public Integer getOrderState() {
        return orderState;
    }

    /**
     * 设置订单状态（-1：已取消, 0：未支付，1：已支付；2：已接单，3: 配送中，4: 已完成）
     *
     * @param orderState 订单状态（-1：已取消, 0：未支付，1：已支付；2：已接单，3: 配送中，4: 已完成）
     */
    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    /**
     * 获取配送地址
     *
     * @return distribute_address - 配送地址
     */
    public String getDistributeAddress() {
        return distributeAddress;
    }

    /**
     * 设置配送地址
     *
     * @param distributeAddress 配送地址
     */
    public void setDistributeAddress(String distributeAddress) {
        this.distributeAddress = distributeAddress;
    }

    /**
     * 获取商户名称
     *
     * @return merchant_name - 商户名称
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * 设置商户名称
     *
     * @param merchantName 商户名称
     */
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    /**
     * 获取商户id
     *
     * @return merchant_id - 商户id
     */
    public Long getMerchantId() {
        return merchantId;
    }

    /**
     * 设置商户id
     *
     * @param merchantId 商户id
     */
    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * 获取会员名称
     *
     * @return member_name - 会员名称
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * 设置会员名称
     *
     * @param memberName 会员名称
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    /**
     * 获取会员id
     *
     * @return member_id - 会员id
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * 设置会员id
     *
     * @param memberId 会员id
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * 获取联系电话
     *
     * @return member_mobile - 联系电话
     */
    public String getMemberMobile() {
        return memberMobile;
    }

    /**
     * 设置联系电话
     *
     * @param memberMobile 联系电话
     */
    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }

    /**
     * 获取配送费
     *
     * @return distribute_price - 配送费
     */
    public BigDecimal getDistributePrice() {
        return distributePrice;
    }

    /**
     * 设置配送费
     *
     * @param distributePrice 配送费
     */
    public void setDistributePrice(BigDecimal distributePrice) {
        this.distributePrice = distributePrice;
    }

    /**
     * 获取优惠金额
     *
     * @return discount - 优惠金额
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * 设置优惠金额
     *
     * @param discount 优惠金额
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * 获取打包费
     *
     * @return pack_price - 打包费
     */
    public BigDecimal getPackPrice() {
        return packPrice;
    }

    /**
     * 设置打包费
     *
     * @param packPrice 打包费
     */
    public void setPackPrice(BigDecimal packPrice) {
        this.packPrice = packPrice;
    }

    /**
     * 获取合计金额
     *
     * @return total_amount - 合计金额
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * 设置合计金额
     *
     * @param totalAmount 合计金额
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 获取配送员名称
     *
     * @return distributer_name - 配送员名称
     */
    public String getDistributerName() {
        return distributerName;
    }

    /**
     * 设置配送员名称
     *
     * @param distributerName 配送员名称
     */
    public void setDistributerName(String distributerName) {
        this.distributerName = distributerName;
    }

    /**
     * 获取配送员id
     *
     * @return distributer_id - 配送员id
     */
    public Long getDistributerId() {
        return distributerId;
    }

    /**
     * 设置配送员id
     *
     * @param distributerId 配送员id
     */
    public void setDistributerId(Long distributerId) {
        this.distributerId = distributerId;
    }

    /**
     * 获取配送员联系电话
     *
     * @return distributer_mobile - 配送员联系电话
     */
    public String getDistributerMobile() {
        return distributerMobile;
    }

    /**
     * 设置配送员联系电话
     *
     * @param distributerMobile 配送员联系电话
     */
    public void setDistributerMobile(String distributerMobile) {
        this.distributerMobile = distributerMobile;
    }

    /**
     * 获取配送单位名称
     *
     * @return distribution_name - 配送单位名称
     */
    public String getDistributionName() {
        return distributionName;
    }

    /**
     * 设置配送单位名称
     *
     * @param distributionName 配送单位名称
     */
    public void setDistributionName(String distributionName) {
        this.distributionName = distributionName;
    }

    /**
     * 获取配送单位id
     *
     * @return distribution_id - 配送单位id
     */
    public Long getDistributionId() {
        return distributionId;
    }

    /**
     * 设置配送单位id
     *
     * @param distributionId 配送单位id
     */
    public void setDistributionId(Long distributionId) {
        this.distributionId = distributionId;
    }

    /**
     * 获取数据入库时间(订单时间)
     *
     * @return insert_time - 数据入库时间(订单时间)
     */
    public Date getInsertTime() {
        return insertTime;
    }

    /**
     * 设置数据入库时间(订单时间)
     *
     * @param insertTime 数据入库时间(订单时间)
     */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    /**
     * 获取数据最后一次更新时间
     *
     * @return update_time - 数据最后一次更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置数据最后一次更新时间
     *
     * @param updateTime 数据最后一次更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取删除时间
     *
     * @return delete_time - 删除时间
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * 设置删除时间
     *
     * @param deleteTime 删除时间
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * 获取是否已删除
     *
     * @return been_deleted - 是否已删除
     */
    public Boolean getBeenDeleted() {
        return beenDeleted;
    }

    /**
     * 设置是否已删除
     *
     * @param beenDeleted 是否已删除
     */
    public void setBeenDeleted(Boolean beenDeleted) {
        this.beenDeleted = beenDeleted;
    }
}