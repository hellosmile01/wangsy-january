package ${basePackage}.dto;

import org.springframework.beans.BeanUtils;
import ${basePackage}.model.${modelNameUpperCamel};

import java.io.Serializable;

import lombok.Data;

/**
 * @author ${author}
 * @date ${date}
 */
@Data
public class ${modelDtoNameUpperCamel} implements Serializable {

    public static ${modelNameUpperCamel} transfer(${modelDtoNameUpperCamel} dto) {

        ${modelNameUpperCamel} model = new ${modelNameUpperCamel}();
        BeanUtils.copyProperties(dto, model);

        return model;
    }
}
