package smile.wangsy.january.merchant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import smile.wangsy.january.merchant.model.Merchant;
import smile.wangsy.january.merchant.model.ProductCategory;
import smile.wangsy.january.merchant.service.MerchantService;
import smile.wangsy.january.merchant.service.ProductCategoryService;
import smile.wangsy.january.merchant.util.CommonUtil;
import smile.wangsy.january.merchant.valid.ProductCategoryValid;
import smile.wangsy.january.merchant.vo.ProductCategoryVo;
import wang.smile.common.base.BaseConstants;
import wang.smile.common.base.BaseResult;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Juzi
 * @Date 2018/8/31.
 */
@RestController
@RequestMapping("/v1/common/api")
public class CommonApiController {

    @Autowired
    private ProductCategoryService productCategoryService;

    @Autowired
    private MerchantService merchantService;

    /**
     * 类别下拉框数据
     * @return
     */
    @RequestMapping(value = "categoryDropDown", method = RequestMethod.GET)
    public BaseResult categoryDropDown() {
        Merchant currentLogin = CommonUtil.getCurrentLogin(merchantService);

        if(null == currentLogin) {
            return new BaseResult(BaseConstants.SUCCESS_CODE, BaseConstants.SUCCESS_MSG, new ArrayList<>());
        }

        ProductCategoryValid productCategoryValid = new ProductCategoryValid();

        productCategoryValid.setMerchantId(currentLogin.getId());

        List<ProductCategory> productCategories = productCategoryService.selectByConditions(productCategoryValid);

        List<ProductCategoryVo> productCategoryVos = ProductCategoryVo.transModelListToVoList(productCategories);

        return new BaseResult(BaseConstants.SUCCESS_CODE, BaseConstants.SUCCESS_MSG, productCategoryVos);
    }
}
