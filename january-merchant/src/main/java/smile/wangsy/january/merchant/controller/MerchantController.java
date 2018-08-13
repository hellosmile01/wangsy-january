package smile.wangsy.january.merchant.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import smile.wangsy.january.merchant.model.Merchant;
import smile.wangsy.january.merchant.service.MerchantService;
import wang.smile.common.base.BaseConstants;
import wang.smile.common.base.BaseResult;

/**
 * @author wangsy
 * @Date 2018/8/13.
 */
@RestController
@RequestMapping(value = "/v1/merchant")
@Api(value = "MerchantController")
public class MerchantController {

    @Autowired
    private MerchantService merchantService;

    @PostMapping
    @ApiOperation(value = "新增", httpMethod = "POST", response = MerchantController.class, notes = "新增")
    public BaseResult createMerchant(Merchant merchant) {
        try {
            merchantService.insert(merchant);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResult(BaseConstants.FAILED_CODE, BaseConstants.FAILED_MSG, "ERROR");
        }
        return new BaseResult(BaseConstants.SUCCESS_CODE, BaseConstants.SUCCESS_MSG, "SUCCESS");
    }

}
