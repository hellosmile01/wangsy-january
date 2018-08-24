package smile.wangsy.january.member.model;

import java.util.Date;
import javax.persistence.*;

public class Member {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 会员名称(登陆名称)
     */
    @Column(name = "member_name")
    private String memberName;

    /**
     * 联系电话
     */
    private String mobile;

    /**
     * 真实名称(预留)
     */
    private String name;

    /**
     * 头像（图片url，单张）
     */
    private String avatar;

    /**
     * 身份证正面照
     */
    @Column(name = "id_card_front_image")
    private String idCardFrontImage;

    /**
     * 身份证反面照
     */
    @Column(name = "id_card_back_image")
    private String idCardBackImage;

    /**
     * 是否有效
     */
    @Column(name = "is_valid")
    private Boolean isValid;

    /**
     * 密码
     */
    private String password;

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
     * 获取会员名称(登陆名称)
     *
     * @return member_name - 会员名称(登陆名称)
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * 设置会员名称(登陆名称)
     *
     * @param memberName 会员名称(登陆名称)
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    /**
     * 获取联系电话
     *
     * @return mobile - 联系电话
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置联系电话
     *
     * @param mobile 联系电话
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取真实名称(预留)
     *
     * @return name - 真实名称(预留)
     */
    public String getName() {
        return name;
    }

    /**
     * 设置真实名称(预留)
     *
     * @param name 真实名称(预留)
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取头像（图片url，单张）
     *
     * @return avatar - 头像（图片url，单张）
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置头像（图片url，单张）
     *
     * @param avatar 头像（图片url，单张）
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 获取身份证正面照
     *
     * @return id_card_front_image - 身份证正面照
     */
    public String getIdCardFrontImage() {
        return idCardFrontImage;
    }

    /**
     * 设置身份证正面照
     *
     * @param idCardFrontImage 身份证正面照
     */
    public void setIdCardFrontImage(String idCardFrontImage) {
        this.idCardFrontImage = idCardFrontImage;
    }

    /**
     * 获取身份证反面照
     *
     * @return id_card_back_image - 身份证反面照
     */
    public String getIdCardBackImage() {
        return idCardBackImage;
    }

    /**
     * 设置身份证反面照
     *
     * @param idCardBackImage 身份证反面照
     */
    public void setIdCardBackImage(String idCardBackImage) {
        this.idCardBackImage = idCardBackImage;
    }

    /**
     * 获取是否有效
     *
     * @return is_valid - 是否有效
     */
    public Boolean getIsValid() {
        return isValid;
    }

    /**
     * 设置是否有效
     *
     * @param isValid 是否有效
     */
    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
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
}