package smile.wangsy.january.merchant.vo;

import org.springframework.beans.BeanUtils;
import smile.wangsy.january.merchant.model.Products;

import java.util.List;
import java.io.Serializable;
import java.util.stream.Collectors;

import lombok.Data;

/**
 * @author wangsy
 * @date 2018/08/30.
 */
@Data
public class ProductsVo implements Serializable {

    public static ProductsVo transModelToVo(Products model) {
        ProductsVo vo = new ProductsVo();
        BeanUtils.copyProperties(model, vo);
        return vo;
    }

    /**
     * 将ModelList转换为ModelVoList
     * @param modelList
     * @return
     */
    public static List<ProductsVo> transModelListToVoList(List<Products> modelList) {
        List<ProductsVo> voList = modelList.stream().map(e -> transModelToVo(e)).collect(Collectors.toList());
        return voList;
    }
}
