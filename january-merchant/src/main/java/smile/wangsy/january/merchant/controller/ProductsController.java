package smile.wangsy.january.merchant.controller;

import smile.wangsy.january.merchant.model.Products;
import smile.wangsy.january.merchant.dto.ProductsDto;
import smile.wangsy.january.merchant.vo.ProductsVo;
import smile.wangsy.january.merchant.valid.ProductsValid;
import smile.wangsy.january.merchant.service.ProductsService;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import wang.smile.common.base.BaseConstants;
import wang.smile.common.base.BaseResult;

import java.util.List;

/**
 * @author wangsy
 * @date 2018/08/30
 */
@RestController
@RequestMapping("/v1/products")
@Api(value = "ProductsController", description = "商品信息Api")
public class ProductsController {

    @Autowired
    private ProductsService services;

    @PostMapping
    @ApiOperation(value = "新增", httpMethod = "POST", response = ProductsController.class, notes = "新增")
    public BaseResult createModel(ProductsDto dto) {
        try {
            services.insertByDto(dto);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResult(BaseConstants.FAILED_CODE, BaseConstants.FAILED_MSG, "新增数据异常");
        }
        return new BaseResult(BaseConstants.SUCCESS_CODE, BaseConstants.SUCCESS_MSG, "SUCCESS");
    }

    @PutMapping
    @ApiOperation(value = "修改", httpMethod = "PUT", response = ProductsController.class, notes = "修改")
    public BaseResult updateModel(ProductsDto dto) {
        try {
            services.updateByDto(dto);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResult(BaseConstants.FAILED_CODE, BaseConstants.FAILED_MSG, "修改数据异常");
        }
        return new BaseResult(BaseConstants.SUCCESS_CODE, BaseConstants.SUCCESS_MSG, "SUCCESS");
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除", httpMethod = "DELETE", response = ProductsController.class, notes = "删除")
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
    @ApiOperation(value = "根据id查询", httpMethod = "GET", response = ProductsController.class, notes = "根据id查询")
    public BaseResult getById(@PathVariable Long id) {
        if(id == null || id <= 0) {
            return new BaseResult(BaseConstants.FAILED_CODE, BaseConstants.FAILED_MSG, "请求参数错误");
        }
        Products model = services.selectById(id);

        ProductsVo modelVo = ProductsVo.transModelToVo(model);

        return new BaseResult(BaseConstants.SUCCESS_CODE, BaseConstants.SUCCESS_MSG, modelVo);
    }

    /**
     * 根据条件查询
     * @param valid
     * @return
     */
    @GetMapping
    @ApiOperation(value = "根据condition查询", httpMethod = "GET", response = ProductsController.class, notes = "根据条件查询")
    public BaseResult getById(ProductsValid valid) {
        if(null == valid) {
            return new BaseResult(BaseConstants.FAILED_CODE, BaseConstants.FAILED_MSG, "请求参数错误");
        }
        List<Products> list = services.selectByConditions(valid);

        List<ProductsVo> voList = ProductsVo.transModelListToVoList(list);

        return new BaseResult(BaseConstants.SUCCESS_CODE, BaseConstants.SUCCESS_MSG, voList, 1);
    }
}
