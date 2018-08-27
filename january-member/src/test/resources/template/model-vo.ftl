package ${basePackage}.vo;

import org.springframework.beans.BeanUtils;
import ${basePackage}.model.${modelNameUpperCamel};

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ${author}
 * @date ${date}.
 */
public class ${modelVoNameUpperCamel} {

    public ${modelVoNameUpperCamel} transModelToVo(${modelNameUpperCamel} model) {
        BeanUtils.copyProperties(model, this);
        return this;
    }

    /**
     * 将ModelList转换为ModelVoList
     * @param memberList
     * @return
     */
    public List<${modelVoNameUpperCamel}> transModelListToVoList(List<${modelNameUpperCamel}> memberList) {
        List<${modelVoNameUpperCamel}> collect = memberList.stream().map(e -> this.transModelToVo(e)).collect(Collectors.toList());
        return collect;
    }
}
