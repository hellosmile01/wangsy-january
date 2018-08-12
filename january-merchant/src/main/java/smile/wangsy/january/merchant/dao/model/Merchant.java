package smile.wangsy.january.merchant.dao.model;

import java.io.Serializable;
import java.util.Date;

public class Merchant implements Serializable {
    private Long id;

    /**
     * 商户名称
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 数据入库时间
     *
     * @mbg.generated
     */
    private Date insertTime;

    /**
     * 数据最后一次更新时间
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * 是否已删除
     *
     * @mbg.generated
     */
    private Boolean beenDeleted;

    /**
     * 删除时间
     *
     * @mbg.generated
     */
    private Date deleteTime;

    /**
     * 是否有效
     *
     * @mbg.generated
     */
    private Boolean isValid;

    /**
     * 商户地址
     *
     * @mbg.generated
     */
    private String address;

    /**
     * 联系电话
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     * 负责人
     *
     * @mbg.generated
     */
    private String principalName;

    /**
     * 负责人电话
     *
     * @mbg.generated
     */
    private String principalMobile;

    /**
     * 描述
     *
     * @mbg.generated
     */
    private String description;

    /**
     * 登陆账号
     *
     * @mbg.generated
     */
    private String loginAccount;

    /**
     * 登陆密码
     *
     * @mbg.generated
     */
    private String password;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getBeenDeleted() {
        return beenDeleted;
    }

    public void setBeenDeleted(Boolean beenDeleted) {
        this.beenDeleted = beenDeleted;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public String getPrincipalMobile() {
        return principalMobile;
    }

    public void setPrincipalMobile(String principalMobile) {
        this.principalMobile = principalMobile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", insertTime=").append(insertTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", beenDeleted=").append(beenDeleted);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", isValid=").append(isValid);
        sb.append(", address=").append(address);
        sb.append(", mobile=").append(mobile);
        sb.append(", principalName=").append(principalName);
        sb.append(", principalMobile=").append(principalMobile);
        sb.append(", description=").append(description);
        sb.append(", loginAccount=").append(loginAccount);
        sb.append(", password=").append(password);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Merchant other = (Merchant) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getInsertTime() == null ? other.getInsertTime() == null : this.getInsertTime().equals(other.getInsertTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getBeenDeleted() == null ? other.getBeenDeleted() == null : this.getBeenDeleted().equals(other.getBeenDeleted()))
            && (this.getDeleteTime() == null ? other.getDeleteTime() == null : this.getDeleteTime().equals(other.getDeleteTime()))
            && (this.getIsValid() == null ? other.getIsValid() == null : this.getIsValid().equals(other.getIsValid()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getPrincipalName() == null ? other.getPrincipalName() == null : this.getPrincipalName().equals(other.getPrincipalName()))
            && (this.getPrincipalMobile() == null ? other.getPrincipalMobile() == null : this.getPrincipalMobile().equals(other.getPrincipalMobile()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getLoginAccount() == null ? other.getLoginAccount() == null : this.getLoginAccount().equals(other.getLoginAccount()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getInsertTime() == null) ? 0 : getInsertTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getBeenDeleted() == null) ? 0 : getBeenDeleted().hashCode());
        result = prime * result + ((getDeleteTime() == null) ? 0 : getDeleteTime().hashCode());
        result = prime * result + ((getIsValid() == null) ? 0 : getIsValid().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getPrincipalName() == null) ? 0 : getPrincipalName().hashCode());
        result = prime * result + ((getPrincipalMobile() == null) ? 0 : getPrincipalMobile().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getLoginAccount() == null) ? 0 : getLoginAccount().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        return result;
    }
}