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

    @ApiParam(value = "商户名称")
    private String name;

    @ApiParam(value = "联系电话")
    private String mobile;

    @ApiParam(value = "负责人")
    private String principalName;

    @ApiParam(value = "负责人电话")
    private String principalMobile;

}
