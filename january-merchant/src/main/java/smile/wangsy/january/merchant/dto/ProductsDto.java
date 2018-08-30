package smile.wangsy.january.merchant.dto;

import org.springframework.beans.BeanUtils;
import smile.wangsy.january.merchant.model.Products;

import java.io.Serializable;

import lombok.Data;

/**
 * @author wangsy
 * @date 2018/08/30
 */
@Data
public class ProductsDto implements Serializable {

    public static Products transfer(ProductsDto dto) {

        Products model = new Products();
        BeanUtils.copyProperties(dto, model);

        return model;
    }
}
