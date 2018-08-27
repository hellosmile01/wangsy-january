package ${basePackage}.service.impl;

import ${basePackage}.mapper.${modelNameUpperCamel}Mapper;
import ${basePackage}.model.${modelNameUpperCamel};
import ${basePackage}.service.${modelNameUpperCamel}Service;
import ${basePackage}.dto.${modelDtoNameUpperCamel};
import ${basePackage}.valid.${modelValidNameUpperCamel};

import wang.smile.common.base.BaseService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author ${author}
 * @date ${date}.
 */
@Service
@Transactional(rollbackFor = {Exception.class})
public class ${modelNameUpperCamel}ServiceImpl extends BaseService<${modelNameUpperCamel}> implements ${modelNameUpperCamel}Service {

    @Resource
    private ${modelNameUpperCamel}Mapper ${modelNameLowerCamel}Mapper;

    @Override
    public void insertDto(${modelDtoNameUpperCamel} dto) {
        ${modelNameUpperCamel} model = new ${modelDtoNameUpperCamel}().transfer(dto);

        model.setBeenDeleted(false);
        model.setInsertTime(new Date());

        ${modelNameLowerCamel}Mapper.insert(model);
    }

    @Override
    public ${modelNameUpperCamel} selectById(Object id) {
        ${modelNameUpperCamel} model = ${modelNameLowerCamel}Mapper.selectByPrimaryKey(id);
        return model;
    }

    @Override
    public List<${modelNameUpperCamel}> selectByConditions(${modelValidNameUpperCamel} valid) {

        Example example = new Example(${modelNameUpperCamel}.class);
        Example.Criteria criteria = example.createCriteria();
        /**
         * 查询未被删除的数据
         */
        criteria.andEqualTo("beenDeleted", false);
        return ${modelNameLowerCamel}Mapper.selectByCondition(example);
    }

    @Override
    public void deleteByUpdate(Object id) {
        ${modelNameUpperCamel} model = ${modelNameLowerCamel}Mapper.selectByPrimaryKey(id);
        model.setBeenDeleted(true);
        model.setDeleteTime(new Date());
        ${modelNameLowerCamel}Mapper.updateByPrimaryKeySelective(model);
    }

}
