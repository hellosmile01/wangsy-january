package ${basePackage}.controller;

import ${basePackage}.model.${modelNameUpperCamel};
import ${basePackage}.dto.${modelDtoNameUpperCamel};
import ${basePackage}.vo.${modelVoNameUpperCamel};
import ${basePackage}.valid.${modelValidNameUpperCamel};
import ${basePackage}.service.${modelNameUpperCamel}Service;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import wang.smile.common.base.BaseConstants;
import wang.smile.common.base.BaseResult;

import java.util.List;

/**
 * @author ${author}
 * @date ${date}
 */
@RestController
@RequestMapping("/v1${baseRequestMapping}")
@Api(value = "xx", description = "xx")
public class ${modelNameUpperCamel}Controller {

    @Autowired
    private ${modelNameUpperCamel}Service services;

    @PostMapping
    @ApiOperation(value = "新增", httpMethod = "POST", response = ${modelNameUpperCamel}Controller.class, notes = "新增")
    public BaseResult createModel(${modelDtoNameUpperCamel} dto) {
        try {
            services.insertDto(dto);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResult(BaseConstants.FAILED_CODE, BaseConstants.FAILED_MSG, "新增数据异常");
        }
        return new BaseResult(BaseConstants.SUCCESS_CODE, BaseConstants.SUCCESS_MSG, "SUCCESS");
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除", httpMethod = "DELETE", response = ${modelNameUpperCamel}Controller.class, notes = "删除")
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
    @ApiOperation(value = "根据id查询", httpMethod = "GET", response = ${modelNameUpperCamel}Controller.class, notes = "根据id查询")
    public BaseResult getById(@PathVariable Long id) {
        if(id == null || id <= 0) {
            return new BaseResult(BaseConstants.FAILED_CODE, BaseConstants.FAILED_MSG, "请求参数错误");
        }
        ${modelNameUpperCamel} model = services.selectById(id);

        ${modelVoNameUpperCamel} modelVo = new ${modelVoNameUpperCamel}().transModelToVo(model);

        return new BaseResult(BaseConstants.SUCCESS_CODE, BaseConstants.SUCCESS_MSG, modelVo);
    }

    /**
     * 根据条件查询
     * @param valid
     * @return
     */
    @GetMapping
    @ApiOperation(value = "根据condition查询", httpMethod = "GET", response = ${modelNameUpperCamel}Controller.class, notes = "根据条件查询")
    public BaseResult getById(${modelValidNameUpperCamel} valid) {
        if(null == valid) {
            return new BaseResult(BaseConstants.FAILED_CODE, BaseConstants.FAILED_MSG, "请求参数错误");
        }
        List<${modelNameUpperCamel}> list = services.selectByConditions(valid);


        return new BaseResult(BaseConstants.SUCCESS_CODE, BaseConstants.SUCCESS_MSG, list);
    }
}
