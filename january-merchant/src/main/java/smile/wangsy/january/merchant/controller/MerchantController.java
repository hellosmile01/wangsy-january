package smile.wangsy.january.merchant.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import smile.wangsy.january.merchant.model.Merchant;
import smile.wangsy.january.merchant.service.MerchantService;
import wang.smile.common.base.BaseConstants;
import wang.smile.common.base.BaseResult;

import java.util.Date;

/**
 * @author: wangsy
 * @date: 2018/8/12 20:53
 */
@RestController
@RequestMapping(value = "/v1/merchant")
@Api(value = "商户管理控制器", description = "商户管理Controller", tags = "商户")
public class MerchantController {

    @Autowired
    private MerchantService merchantService;

    /**
     * 新增数据Post
     * @return
     */
    @PostMapping
    public BaseResult createMerchant(Merchant merchant) {
        merchant.setBeenDeleted(false);
        merchant.setIsValid(true);
        merchant.setInsertTime(new Date());
        int result = merchantService.insert(merchant);
        if(result>0) {
            return new BaseResult(BaseConstants.SUCCESS_CODE, BaseConstants.SUCCESS_MSG, result);
        }
        return new BaseResult(BaseConstants.FAILED_CODE, BaseConstants.FAILED_MSG, result);
    }

    /**
     * 根据id获取数据
     */
    @GetMapping("/{id}")
    public BaseResult getMerchant(@PathVariable Long id) {
        if(null == id) {
            return new BaseResult(BaseConstants.FAILED_CODE, BaseConstants.FAILED_MSG, "参数不正确");
        }
        Merchant merchant = merchantService.selectByPrimaryKey(id);

        return new BaseResult(BaseConstants.FAILED_CODE, BaseConstants.SUCCESS_MSG, merchant);
    }

}
