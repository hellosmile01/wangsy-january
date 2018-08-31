package smile.wangsy.january.merchant.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "product_category")
public class ProductCategory {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 类别名称
     */
    private String name;

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
     * 分类图片
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
     * 获取类别名称
     *
     * @return name - 类别名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置类别名称
     *
     * @param name 类别名称
     */
    public void setName(String name) {
        this.name = name;
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
     * 获取分类图片
     *
     * @return images - 分类图片
     */
    public String getImages() {
        return images;
    }

    /**
     * 设置分类图片
     *
     * @param images 分类图片
     */
    public void setImages(String images) {
        this.images = images;
    }
}