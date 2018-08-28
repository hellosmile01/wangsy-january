package ${basePackage}.vo;

import org.springframework.beans.BeanUtils;
import ${basePackage}.model.${modelNameUpperCamel};

import java.util.List;
import java.io.Serializable;
import java.util.stream.Collectors;

import lombok.Data;

/**
 * @author ${author}
 * @date ${date}.
 */
@Data
public class ${modelVoNameUpperCamel} implements Serializable {

    public static ${modelVoNameUpperCamel} transModelToVo(${modelNameUpperCamel} model) {
        ${modelVoNameUpperCamel} vo = new ${modelVoNameUpperCamel}();
        BeanUtils.copyProperties(model, vo);
        return vo;
    }

    /**
     * 将ModelList转换为ModelVoList
     * @param modelList
     * @return
     */
    public static List<${modelVoNameUpperCamel}> transModelListToVoList(List<${modelNameUpperCamel}> modelList) {
        List<${modelVoNameUpperCamel}> voList = modelList.stream().map(e -> transModelToVo(e)).collect(Collectors.toList());
        return voList;
    }
}
