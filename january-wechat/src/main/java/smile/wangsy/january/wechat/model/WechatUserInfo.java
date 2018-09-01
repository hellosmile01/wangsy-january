package smile.wangsy.january.wechat.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "wechat_user_info")
public class WechatUserInfo {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * openid
     */
    private String openid;

    /**
     * session_key
     */
    @Column(name = "session_key")
    private String sessionKey;

    /**
     * nickName
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 头像
     */
    @Column(name = "avatar_url")
    private String avatarUrl;

    /**
     * country
     */
    private String country;

    /**
     * city
     */
    private String city;

    /**
     * province
     */
    private String province;

    /**
     * gender
     */
    private Integer gender;

    /**
     * language
     */
    private String language;

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
     * 绑定的手机号码
     */
    private String mobile;

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
     * 获取openid
     *
     * @return openid - openid
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * 设置openid
     *
     * @param openid openid
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * 获取session_key
     *
     * @return session_key - session_key
     */
    public String getSessionKey() {
        return sessionKey;
    }

    /**
     * 设置session_key
     *
     * @param sessionKey session_key
     */
    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    /**
     * 获取nickName
     *
     * @return nick_name - nickName
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置nickName
     *
     * @param nickName nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取头像
     *
     * @return avatar_url - 头像
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * 设置头像
     *
     * @param avatarUrl 头像
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     * 获取country
     *
     * @return country - country
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置country
     *
     * @param country country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取city
     *
     * @return city - city
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置city
     *
     * @param city city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取province
     *
     * @return province - province
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置province
     *
     * @param province province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取gender
     *
     * @return gender - gender
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置gender
     *
     * @param gender gender
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取language
     *
     * @return language - language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * 设置language
     *
     * @param language language
     */
    public void setLanguage(String language) {
        this.language = language;
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
     * 获取绑定的手机号码
     *
     * @return mobile - 绑定的手机号码
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置绑定的手机号码
     *
     * @param mobile 绑定的手机号码
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}