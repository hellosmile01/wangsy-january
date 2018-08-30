package smile.wangsy.january.merchant.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Products {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品价格
     */
    private BigDecimal price;

    /**
     * 商品库存
     */
    @Column(name = "in_stocks")
    private Integer inStocks;

    /**
     * 销量
     */
    @Column(name = "sales_volume")
    private Integer salesVolume;

    /**
     * 月销量
     */
    @Column(name = "sales_month_volume")
    private Integer salesMonthVolume;

    /**
     * 描述
     */
    private String description;

    /**
     * 审核状态（0：未审核，1：通过；2：不通过）
     */
    private Integer state;

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
     * 数据入库时间
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
     * 分类id
     */
    @Column(name = "category_id")
    private Long categoryId;

    /**
     * 分类名称
     */
    @Column(name = "category_name")
    private String categoryName;

    /**
     * 商品图片
     */
    private String images;

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
     * 获取商品名称
     *
     * @return name - 商品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商品名称
     *
     * @param name 商品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取商品价格
     *
     * @return price - 商品价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置商品价格
     *
     * @param price 商品价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取商品库存
     *
     * @return in_stocks - 商品库存
     */
    public Integer getInStocks() {
        return inStocks;
    }

    /**
     * 设置商品库存
     *
     * @param inStocks 商品库存
     */
    public void setInStocks(Integer inStocks) {
        this.inStocks = inStocks;
    }

    /**
     * 获取销量
     *
     * @return sales_volume - 销量
     */
    public Integer getSalesVolume() {
        return salesVolume;
    }

    /**
     * 设置销量
     *
     * @param salesVolume 销量
     */
    public void setSalesVolume(Integer salesVolume) {
        this.salesVolume = salesVolume;
    }

    /**
     * 获取月销量
     *
     * @return sales_month_volume - 月销量
     */
    public Integer getSalesMonthVolume() {
        return salesMonthVolume;
    }

    /**
     * 设置月销量
     *
     * @param salesMonthVolume 月销量
     */
    public void setSalesMonthVolume(Integer salesMonthVolume) {
        this.salesMonthVolume = salesMonthVolume;
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
     * 获取审核状态（0：未审核，1：通过；2：不通过）
     *
     * @return state - 审核状态（0：未审核，1：通过；2：不通过）
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置审核状态（0：未审核，1：通过；2：不通过）
     *
     * @param state 审核状态（0：未审核，1：通过；2：不通过）
     */
    public void setState(Integer state) {
        this.state = state;
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
     * 获取数据入库时间
     *
     * @return insert_time - 数据入库时间
     */
    public Date getInsertTime() {
        return insertTime;
    }

    /**
     * 设置数据入库时间
     *
     * @param insertTime 数据入库时间
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

    /**
     * 获取分类id
     *
     * @return category_id - 分类id
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * 设置分类id
     *
     * @param categoryId 分类id
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取分类名称
     *
     * @return category_name - 分类名称
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 设置分类名称
     *
     * @param categoryName 分类名称
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * 获取商品图片
     *
     * @return images - 商品图片
     */
    public String getImages() {
        return images;
    }

    /**
     * 设置商品图片
     *
     * @param images 商品图片
     */
    public void setImages(String images) {
        this.images = images;
    }
}