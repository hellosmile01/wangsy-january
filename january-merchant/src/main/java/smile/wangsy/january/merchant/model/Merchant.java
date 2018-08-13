package smile.wangsy.january.merchant.model;

import java.util.Date;
import javax.persistence.*;

public class Merchant {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 商户名称
     */
    private String name;

    /**
     * 联系人姓名
     */
    @Column(name = "contact_name")
    private String contactName;

    /**
     * 联系人电话
     */
    @Column(name = "contact_mobile")
    private String contactMobile;

    /**
     * 营业时间(开始时间）
     */
    @Column(name = "start_hours")
    private Date startHours;

    /**
     * 营业时间(结束时间)
     */
    @Column(name = "end_hours")
    private String endHours;

    /**
     * 所属省份（000001）
     */
    private String province;

    /**
     * 所属市（000001001）
     */
    private String city;

    /**
     * 所属区（000001001001）
     */
    private String area;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 门店Logo（图片url，单张）
     */
    private String logo;

    /**
     * 门店外景照片（图片url,url,url）
     */
    @Column(name = "out_image")
    private String outImage;

    /**
     * 门店内景照片（url,url,url,url）
     */
    @Column(name = "inner_image")
    private String innerImage;

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
     * 营业执照（图片上传）
     */
    @Column(name = "business_license")
    private String businessLicense;

    /**
     * 行业许可证
     */
    @Column(name = "industry_license")
    private String industryLicense;

    /**
     * 审核状态（0：未审核，1：通过；2：不通过）
     */
    private Integer state;

    /**
     * 经度
     */
    private Double longitude;

    /**
     * 纬度
     */
    private Double latitude;

    /**
     * 密码
     */
    private String password;

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
     * 获取商户名称
     *
     * @return name - 商户名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商户名称
     *
     * @param name 商户名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取联系人姓名
     *
     * @return contact_name - 联系人姓名
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * 设置联系人姓名
     *
     * @param contactName 联系人姓名
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * 获取联系人电话
     *
     * @return contact_mobile - 联系人电话
     */
    public String getContactMobile() {
        return contactMobile;
    }

    /**
     * 设置联系人电话
     *
     * @param contactMobile 联系人电话
     */
    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    /**
     * 获取营业时间(开始时间）
     *
     * @return start_hours - 营业时间(开始时间）
     */
    public Date getStartHours() {
        return startHours;
    }

    /**
     * 设置营业时间(开始时间）
     *
     * @param startHours 营业时间(开始时间）
     */
    public void setStartHours(Date startHours) {
        this.startHours = startHours;
    }

    /**
     * 获取营业时间(结束时间)
     *
     * @return end_hours - 营业时间(结束时间)
     */
    public String getEndHours() {
        return endHours;
    }

    /**
     * 设置营业时间(结束时间)
     *
     * @param endHours 营业时间(结束时间)
     */
    public void setEndHours(String endHours) {
        this.endHours = endHours;
    }

    /**
     * 获取所属省份（000001）
     *
     * @return province - 所属省份（000001）
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置所属省份（000001）
     *
     * @param province 所属省份（000001）
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取所属市（000001001）
     *
     * @return city - 所属市（000001001）
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置所属市（000001001）
     *
     * @param city 所属市（000001001）
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取所属区（000001001001）
     *
     * @return area - 所属区（000001001001）
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置所属区（000001001001）
     *
     * @param area 所属区（000001001001）
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 获取详细地址
     *
     * @return address - 详细地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置详细地址
     *
     * @param address 详细地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取门店Logo（图片url，单张）
     *
     * @return logo - 门店Logo（图片url，单张）
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 设置门店Logo（图片url，单张）
     *
     * @param logo 门店Logo（图片url，单张）
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * 获取门店外景照片（图片url,url,url）
     *
     * @return out_image - 门店外景照片（图片url,url,url）
     */
    public String getOutImage() {
        return outImage;
    }

    /**
     * 设置门店外景照片（图片url,url,url）
     *
     * @param outImage 门店外景照片（图片url,url,url）
     */
    public void setOutImage(String outImage) {
        this.outImage = outImage;
    }

    /**
     * 获取门店内景照片（url,url,url,url）
     *
     * @return inner_image - 门店内景照片（url,url,url,url）
     */
    public String getInnerImage() {
        return innerImage;
    }

    /**
     * 设置门店内景照片（url,url,url,url）
     *
     * @param innerImage 门店内景照片（url,url,url,url）
     */
    public void setInnerImage(String innerImage) {
        this.innerImage = innerImage;
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
     * 获取营业执照（图片上传）
     *
     * @return business_license - 营业执照（图片上传）
     */
    public String getBusinessLicense() {
        return businessLicense;
    }

    /**
     * 设置营业执照（图片上传）
     *
     * @param businessLicense 营业执照（图片上传）
     */
    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    /**
     * 获取行业许可证
     *
     * @return industry_license - 行业许可证
     */
    public String getIndustryLicense() {
        return industryLicense;
    }

    /**
     * 设置行业许可证
     *
     * @param industryLicense 行业许可证
     */
    public void setIndustryLicense(String industryLicense) {
        this.industryLicense = industryLicense;
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
     * 获取经度
     *
     * @return longitude - 经度
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 设置经度
     *
     * @param longitude 经度
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取纬度
     *
     * @return latitude - 纬度
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 设置纬度
     *
     * @param latitude 纬度
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
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
}