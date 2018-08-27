package smile.wangsy.january.merchant.valid;

import java.io.Serializable;

import io.swagger.annotations.ApiParam;
import lombok.Data;

/**
 * @author wangsy
 * @date 2018/08/27
 */
@Data
public class MerchantValid implements Serializable {

    private Long id;

    @ApiParam(value = "商戶名稱")
    private String name;

    @ApiParam(value = "聯係电话")
    private String mobile;

    @ApiParam(value = "負責人")
    private String principalName;

    @ApiParam(value = "負責人電話")
    private String principalMobile;

}
