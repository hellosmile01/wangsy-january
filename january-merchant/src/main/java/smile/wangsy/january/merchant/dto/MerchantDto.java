package smile.wangsy.january.merchant.dto;

import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import smile.wangsy.january.merchant.model.Merchant;

import java.io.Serializable;

/**
 * @author wangsy
 * @date 2018/08/27
 */
@Data
public class MerchantDto implements Serializable {

    @ApiParam(value = "商户名称")
    private String name;

    @ApiParam(value = "联系电话")
    private String mobile;

    @ApiParam(value = "负责人")
    private String principalName;

    @ApiParam(value = "负责人电话")
    private String principalMobile;

    @ApiParam(value = "营业时间(开始时间）")
    private String startHours;

    @ApiParam(value = "营业时间(结束时间)")
    private String endHours;

    @ApiParam(value = "所属省份（000001）")
    private String province;

    @ApiParam(value = "所属市（000001001）")
    private String city;

    @ApiParam(value = "所属区（000001001001）")
    private String area;

    @ApiParam(value = "详细地址")
    private String address;

    @ApiParam(value = "经度")
    private Double longitude;

    @ApiParam(value = "纬度")
    private Double latitude;

    @ApiParam(value = "描述")
    private String description;

    @ApiParam(value = "登陆账号")
    private String loginAccount;

    @ApiParam(value = "密码")
    private String password;

    @ApiParam(value = "logo")
    private String logo;

    @ApiParam(value = "门店外景照片（图片url,url,url）")
    private String outImage;

    @ApiParam(value = "门店内景照片（url,url,url,url）")
    private String innerImage;

    @ApiParam(value = "身份证正面照")
    private String idCardFrontImage;

    @ApiParam(value = "身份证反面照")
    private String idCardBackImage;

    @ApiParam(value = "营业执照（图片上传）")
    private String businessLicense;

    @ApiParam(value = "行业许可证")
    private String industryLicense;

    public Merchant transfer(MerchantDto dto) {

        Merchant model = new Merchant();
        BeanUtils.copyProperties(dto, model);

        return model;
    }
}
