package smile.wangsy.january.merchant.controller;

import smile.wangsy.january.merchant.model.ProductCategory;
import smile.wangsy.january.merchant.dto.ProductCategoryDto;
import smile.wangsy.january.merchant.vo.ProductCategoryVo;
import smile.wangsy.january.merchant.valid.ProductCategoryValid;
import smile.wangsy.january.merchant.service.ProductCategoryService;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import wang.smile.common.base.BaseConstants;
import wang.smile.common.base.BaseResult;

import java.util.List;

/**
 * @author wangsy
 * @date 2018/08/31
 */
@RestController
@RequestMapping("/v1/product/category")
@Api(value = "xx", description = "xx")
public class ProductCategoryController {

    @Autowired
    private ProductCategoryService services;

    @PostMapping
    @ApiOperation(value = "新增", httpMethod = "POST", response = ProductCategoryController.class, notes = "新增")
    public BaseResult createModel(ProductCategoryDto dto) {
        try {
            services.insertByDto(dto);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResult(BaseConstants.FAILED_CODE, BaseConstants.FAILED_MSG, "新增数据异常");
        }
        return new BaseResult(BaseConstants.SUCCESS_CODE, BaseConstants.SUCCESS_MSG, "SUCCESS");
    }

    @PutMapping
    @ApiOperation(value = "修改", httpMethod = "PUT", response = ProductCategoryController.class, notes = "修改")
    public BaseResult updateModel(ProductCategoryDto dto) {
        try {
            services.updateByDto(dto);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResult(BaseConstants.FAILED_CODE, BaseConstants.FAILED_MSG, "修改数据异常");
        }
        return new BaseResult(BaseConstants.SUCCESS_CODE, BaseConstants.SUCCESS_MSG, "SUCCESS");
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除", httpMethod = "DELETE", response = ProductCategoryController.class, notes = "删除")
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
    @ApiOperation(value = "根据id查询", httpMethod = "GET", response = ProductCategoryController.class, notes = "根据id查询")
    public BaseResult getById(@PathVariable Long id) {
        if(id == null || id <= 0) {
            return new BaseResult(BaseConstants.FAILED_CODE, BaseConstants.FAILED_MSG, "请求参数错误");
        }
        ProductCategory model = services.selectById(id);

        ProductCategoryVo modelVo = ProductCategoryVo.transModelToVo(model);

        return new BaseResult(BaseConstants.SUCCESS_CODE, BaseConstants.SUCCESS_MSG, modelVo);
    }

    /**
     * 根据条件查询
     * @param valid
     * @return
     */
    @GetMapping
    @ApiOperation(value = "根据condition查询", httpMethod = "GET", response = ProductCategoryController.class, notes = "根据条件查询")
    public BaseResult getById(ProductCategoryValid valid) {
        if(null == valid) {
            return new BaseResult(BaseConstants.FAILED_CODE, BaseConstants.FAILED_MSG, "请求参数错误");
        }
        List<ProductCategory> list = services.selectByConditions(valid);

        List<ProductCategoryVo> voList = ProductCategoryVo.transModelListToVoList(list);

        return new BaseResult(BaseConstants.SUCCESS_CODE, BaseConstants.SUCCESS_MSG, voList);
    }
}
