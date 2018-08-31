package smile.wangsy.january.merchant.vo;

import org.springframework.beans.BeanUtils;
import smile.wangsy.january.merchant.model.ProductCategory;

import java.util.List;
import java.io.Serializable;
import java.util.stream.Collectors;

import lombok.Data;

/**
 * @author wangsy
 * @date 2018/08/31.
 */
@Data
public class ProductCategoryVo implements Serializable {

    private Long id;
    /**
     * 类别名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 审核状态（0：未审核，1：通过；2：不通过）
     */
    private Integer state;

    public static ProductCategoryVo transModelToVo(ProductCategory model) {
        ProductCategoryVo vo = new ProductCategoryVo();
        BeanUtils.copyProperties(model, vo);
        return vo;
    }

    /**
     * 将ModelList转换为ModelVoList
     * @param modelList
     * @return
     */
    public static List<ProductCategoryVo> transModelListToVoList(List<ProductCategory> modelList) {
        List<ProductCategoryVo> voList = modelList.stream().map(e -> transModelToVo(e)).collect(Collectors.toList());
        return voList;
    }
}
