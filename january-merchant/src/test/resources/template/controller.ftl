package ${basePackage}.controller;

import ${basePackage}.core.BasePageSearch;
import ${basePackage}.dto.IDValid;
import ${basePackage}.result.PageResult;
import ${basePackage}.result.Result;
import ${basePackage}.result.ResultCode;
import ${basePackage}.model.${modelNameUpperCamel};
import ${basePackage}.service.${modelNameUpperCamel}Service;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by ${author} on ${date}.
*/
@RestController
@RequestMapping("${baseRequestMapping}")
@Api(value = "xx", description = "xx")
public class ${modelNameUpperCamel}Controller {

    @Resource
    private ${modelNameUpperCamel}Service services;

    @ApiOperation(value = "获取xx列表")
    @RequestMapping(value = "/get_list", method = RequestMethod.POST)
    @ResponseBody
    public Object get_list(@RequestBody BasePageSearch<${modelNameUpperCamel}> modelValid) {
	Condition condition = new Condition(${modelNameUpperCamel}.class);
	Condition.Criteria criteria = condition.createCriteria();
	//        condition.setOrderByClause("ID DESC");

    ${modelNameUpperCamel} model = modelValid.getSearch() == null?new ${modelNameUpperCamel}():modelValid.getSearch();

	//模型判断是否等于场景使用比如 ID = 10
	//        List<${modelNameUpperCamel}> lists = services.selectForStartPage(model,modelValid.getPage(),modelValid.getLimit());
		//        long total = services.count(model);

		List<${modelNameUpperCamel}> lists = services.selectByConditionForStartPage(condition,modelValid.getPage(),modelValid.getLimit());
			long total = services.countByCondition(condition);

			return new Result(ResultCode.SUCCESS,lists,new PageResult(modelValid.getPage(),total));
    }

    @ApiOperation(value = "获取单条xx")
    @RequestMapping(value = "/get_one", method = RequestMethod.POST)
    @ResponseBody
    public Object get_one(@RequestBody IDValid valid) {
        ${modelNameUpperCamel} model = services.selectByPrimaryKey(valid.getId());
        return new Result(ResultCode.SUCCESS,model);
        }

        @ApiOperation(value = "新增单条xx")
        @RequestMapping(value = "/add_one", method = RequestMethod.POST)
        @ResponseBody
        public Object add_one(@RequestBody ${modelNameUpperCamel} model) {
        services.insertSelective(model);
        return new Result(ResultCode.SUCCESS,model.getId());
    }

    @ApiOperation(value = "新增多条xx")
    @RequestMapping(value = "/add_multiple", method = RequestMethod.POST)
    @ResponseBody
    public Object add_multiple(@RequestBody List<${modelNameUpperCamel}> model) {
        services.insertList(model);
        return new Result(ResultCode.SUCCESS);
        }

        @ApiOperation(value = "修改单条xx")
        @RequestMapping(value = "/edit_one", method = RequestMethod.POST)
        @ResponseBody
        public Object edit_one(@RequestBody ${modelNameUpperCamel} model) {
        services.updateByPrimaryKeySelective(model);
        return new Result(ResultCode.SUCCESS);
        }

        @ApiOperation(value = "删除单条xx")
        @RequestMapping(value = "/delete_one", method = RequestMethod.POST)
        @ResponseBody
        public Object delete_one(@RequestBody IDValid valid) {
        services.deleteByPrimaryKey(valid.getId());
        return new Result(ResultCode.SUCCESS);
        }

        @ApiOperation(value = "删除多条xx")
        @RequestMapping(value = "/delete_multiple", method = RequestMethod.POST)
        @ResponseBody
        //ids 1,2,3,4
        public Object delete_multiple(@RequestBody String ids) {
        services.deleteByIds(ids);
        return new Result(ResultCode.SUCCESS);
    }


}
