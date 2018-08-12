package smile.wangsy.january.merchant.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wang.smile.common.base.BaseConstants;
import wang.smile.common.base.BaseResult;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: wangsy
 * @date: 2018/8/12 20:53
 */
@RestController
@RequestMapping(value = "/v1/merchant")
@Api(value = "商户管理控制器", description = "商户管理Controller", tags = "商户")
public class MerchantController {

    @RequestMapping(value = "test")
    public BaseResult test() {
        Map<String, String> map = new HashMap<>();
        map.put("test", "success");
        return new BaseResult(BaseConstants.SUCCESS_CODE, BaseConstants.SUCCESS_MSG, map);
    }
}
