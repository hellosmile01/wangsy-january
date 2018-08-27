package ${basePackage}.service;

import ${basePackage}.model.${modelNameUpperCamel};
import ${basePackage}.dto.${modelDtoNameUpperCamel};
import ${basePackage}.valid.${modelValidNameUpperCamel};
import wang.smile.common.base.Service;

import java.util.List;

/**
 * @author ${author}
 * @date ${date}
 */
public interface ${modelNameUpperCamel}Service extends Service<${modelNameUpperCamel}> {

   /**
     * 插入数据
     * @param dto
     */
    void insertDto(${modelDtoNameUpperCamel} dto);

    /**
     * 非物理删除
     * @param id
     */
    void deleteByUpdate(Object id);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    ${modelNameUpperCamel} selectById(Object id);

    /**
     * 根据条件查询
     * @param valid
     * @return
     */
    List<${modelNameUpperCamel}> selectByConditions(${modelValidNameUpperCamel} valid);
}
