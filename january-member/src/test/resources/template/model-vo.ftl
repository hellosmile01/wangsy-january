package ${basePackage}.vo;

import org.springframework.beans.BeanUtils;
import ${basePackage}.model.${modelNameUpperCamel};

/**
 * @author ${author}
 * @date ${date}.
 */
public class ${modelVoNameUpperCamel} {

    public ${modelVoNameUpperCamel} transModelToVo(${modelNameUpperCamel} model) {
        BeanUtils.copyProperties(model, this);
        return this;
    }
}
