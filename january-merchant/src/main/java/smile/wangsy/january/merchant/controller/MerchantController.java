package smile.wangsy.january.merchant.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import smile.wangsy.january.merchant.dto.MerchantDto;
import smile.wangsy.january.merchant.service.MerchantService;
import smile.wangsy.january.merchant.vo.MerchantVo;
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

    /**
     *
     * @param dto
     * @return
     */
    @PostMapping
    @ApiOperation(value = "新增", httpMethod = "POST", response = MerchantController.class, notes = "新增")
    public BaseResult createMerchant(MerchantDto dto) {
        try {
            merchantService.insertDto(dto);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResult(BaseConstants.FAILED_CODE, BaseConstants.FAILED_MSG, "新增数据异常");
        }
        return new BaseResult(BaseConstants.SUCCESS_CODE, BaseConstants.SUCCESS_MSG, "SUCCESS");
    }

    /**
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public BaseResult getMerchant(@PathVariable Long id) {
        if(id == null || id <= 0) {
            return new BaseResult(BaseConstants.FAILED_CODE, BaseConstants.FAILED_MSG, "请求参数错误");
        }
        MerchantVo merchantVo = merchantService.selectById(id);
        return new BaseResult(BaseConstants.SUCCESS_CODE, BaseConstants.SUCCESS_MSG, merchantVo);
    }
}
