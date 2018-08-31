package smile.wangsy.january.merchant.dto;

import org.springframework.beans.BeanUtils;
import smile.wangsy.january.merchant.model.ProductCategory;

import java.io.Serializable;

import lombok.Data;

/**
 * @author wangsy
 * @date 2018/08/31
 */
@Data
public class ProductCategoryDto implements Serializable {

    /**
     * 类别名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;


    public static ProductCategory transfer(ProductCategoryDto dto) {

        ProductCategory model = new ProductCategory();
        BeanUtils.copyProperties(dto, model);

        return model;
    }
}
