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

    private Long id;

    @ApiParam(value = "商戶名稱")
    private String name;

    @ApiParam(value = "聯係电话")
    private String mobile;

    @ApiParam(value = "負責人")
    private String principalName;

    @ApiParam(value = "負責人電話")
    private String principalMobile;

    public static Merchant transfer(MerchantDto dto) {

        Merchant model = new Merchant();
        BeanUtils.copyProperties(dto, model);

        return model;
    }
}
