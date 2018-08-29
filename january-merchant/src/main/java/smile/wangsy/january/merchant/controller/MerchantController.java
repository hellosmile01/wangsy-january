package smile.wangsy.january.merchant.controller;

import org.springframework.web.servlet.ModelAndView;
import smile.wangsy.january.merchant.model.Merchant;
import smile.wangsy.january.merchant.dto.MerchantDto;
import smile.wangsy.january.merchant.vo.MerchantVo;
import smile.wangsy.january.merchant.valid.MerchantValid;
import smile.wangsy.january.merchant.service.MerchantService;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import wang.smile.common.base.BaseConstants;
import wang.smile.common.base.BaseResult;

import java.util.List;

/**
 * @author wangsy
 * @date 2018/08/27
 */
@RestController
@RequestMapping("/v1/merchant")
@Api(value = "MerchantController", description = "商戶管理")
public class MerchantController {

    @Autowired
    private MerchantService services;

    @PostMapping
    @ApiOperation(value = "新增", httpMethod = "POST", response = MerchantController.class, notes = "新增")
    public BaseResult createModel(MerchantDto dto) {
        try {
            services.insertByDto(dto);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResult(BaseConstants.FAILED_CODE, BaseConstants.FAILED_MSG, "新增数据异常");
        }
        return new BaseResult(BaseConstants.SUCCESS_CODE, BaseConstants.SUCCESS_MSG, "SUCCESS");
    }

    @PutMapping
    @ApiOperation(value = "修改", httpMethod = "PUT", response = MerchantController.class, notes = "修改")
    public BaseResult updateModel(MerchantDto dto) {
        try {
            services.updateByDto(dto);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResult(BaseConstants.FAILED_CODE, BaseConstants.FAILED_MSG, "修改数据异常");
        }
        return new BaseResult(BaseConstants.SUCCESS_CODE, BaseConstants.SUCCESS_MSG, "SUCCESS");
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除", httpMethod = "DELETE", response = MerchantController.class, notes = "删除")
    public BaseResult deleteById(@PathVariable Long id) {
        if(id == null || id <= 0) {
            return new BaseResult(BaseConstants.FAILED_CODE, BaseConstants.FAILED_MSG, "请求参数错误");
        }
        try {
            services.deleteByUpdate(id);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResult(BaseConstants.FAILED_CODE, BaseConstants.FAILED_MSG, "删除数据异常");
        }
        return new BaseResult(BaseConstants.SUCCESS_CODE, BaseConstants.SUCCESS_MSG, "SUCCESS");
    }

    /**
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    @ApiOperation(value = "根据id查询", httpMethod = "GET", response = MerchantController.class, notes = "根据id查询")
    public BaseResult getById(@PathVariable Long id) {
        if(id == null || id <= 0) {
            return new BaseResult(BaseConstants.FAILED_CODE, BaseConstants.FAILED_MSG, "请求参数错误");
        }
        Merchant model = services.selectById(id);

        MerchantVo modelVo = MerchantVo.transModelToVo(model);

        return new BaseResult(BaseConstants.SUCCESS_CODE, BaseConstants.SUCCESS_MSG, modelVo);
    }

    /**
     * 根据条件查询
     * @param valid
     * @return
     */
    @GetMapping
    @ApiOperation(value = "根据condition查询", httpMethod = "GET", response = MerchantController.class, notes = "根据条件查询")
    public BaseResult getById(MerchantValid valid) {
        if(null == valid) {
            return new BaseResult(BaseConstants.FAILED_CODE, BaseConstants.FAILED_MSG, "请求参数错误");
        }
        List<Merchant> list = services.selectByConditions(valid);

        List<MerchantVo> voList = MerchantVo.transModelListToVoList(list);

        return new BaseResult(BaseConstants.SUCCESS_CODE, BaseConstants.SUCCESS_MSG, voList);
    }

    @RequestMapping("/login")
    public ModelAndView login(MerchantValid valid) {

        return null;
    }
}
