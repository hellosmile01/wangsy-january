package ${basePackage}.dto;

import org.springframework.beans.BeanUtils;
import ${basePackage}.model.${modelNameUpperCamel};

/**
 * @author ${author}
 * @date ${date}
 */
public class ${modelDtoNameUpperCamel} {

    public ${modelNameUpperCamel} transfer(${modelDtoNameUpperCamel} dto) {

        ${modelNameUpperCamel} model = new ${modelNameUpperCamel}();
        BeanUtils.copyProperties(dto, model);

        return model;
    }
}
