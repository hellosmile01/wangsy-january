package smile.wangsy.january.merchant.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import smile.wangsy.january.merchant.model.Merchant;

/**
 * @author: wangsy
 * @date: 2018/8/13 21:53
 */
@Data
@ApiModel(value = "MerchantDto 数据对象")
public class MerchantDto {

    @ApiModelProperty(value = "商户名称", name = "name", required = true, example = "超级旗舰店")
    private String name;

    @ApiModelProperty(value = "联系电话", name = "mobile", required = true, example = "联系电话")
    private String mobile;

    @ApiModelProperty(value = "责任人", name = "principalName", required = true, example = "责任人")
    private String principalName;

    @ApiModelProperty(value = "责任人电话", name = "principalMobile", required = true, example = "责任人电话")
    private String principalMobile;

    @ApiModelProperty(value = "营业开始时间", name = "startHours", required = true, example = "营业开始时间")
    private String startHours;

    @ApiModelProperty(value = "打烊时间", name = "endHours", required = true, example = "打烊时间")
    private String endHours;

    @ApiModelProperty(value = "省份", name = "province", required = true, example = "省份")
    private String province;

    @ApiModelProperty(value = "城市", name = "city", required = true, example = "城市")
    private String city;

    @ApiModelProperty(value = "区域", name = "area", required = true, example = "区域")
    private String area;

    @ApiModelProperty(value = "详细地址", name = "address", required = true, example = "详细地址")
    private String address;

    @ApiModelProperty(value = "logo", name = "logo", required = true, example = "logo")
    private String logo;

    @ApiModelProperty(value = "外景图片", name = "outImage", required = true, example = "外景图片")
    private String outImage;

    @ApiModelProperty(value = "内景图片", name = "innerImage", required = true, example = "内景图片")
    private String innerImage;

    @ApiModelProperty(value = "身份证正面", name = "idCardFrontImage", required = true, example = "身份证正面")
    private String idCardFrontImage;

    @ApiModelProperty(value = "身份证反面", name = "idCardBackImage", required = true, example = "身份证反面")
    private String idCardBackImage;

    @ApiModelProperty(value = "营业执照（图片上传）", name = "businessLicense", required = true, example = "营业执照（图片上传）")
    private String businessLicense;

    @ApiModelProperty(value = "行业许可证", name = "industryLicense", required = true, example = "行业许可证")
    private String industryLicense;

    @ApiModelProperty(value = "经度", name = "longitude", required = true, example = "经度")
    private Double longitude;

    @ApiModelProperty(value = "纬度", name = "latitude", required = true, example = "纬度")
    private Double latitude;

    @ApiModelProperty(value = "描述", name = "description", required = true, example = "描述")
    private String description;

    @ApiModelProperty(value = "登陆账号", name = "loginAccount", required = true, example = "登陆账号")
    private String loginAccount;

    @ApiModelProperty(value = "密码", name = "password", required = true, example = "密码")
    private String password;

    public Merchant transfer(MerchantDto dto) {

        Merchant merchant = new Merchant();
        BeanUtils.copyProperties(dto, merchant);

        return merchant;
    }
}
