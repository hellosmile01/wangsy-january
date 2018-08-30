package smile.wangsy.january.merchant.dto;

import org.springframework.beans.BeanUtils;
import smile.wangsy.january.merchant.model.Products;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

import javax.persistence.Column;

/**
 * @author wangsy
 * @date 2018/08/30
 */
@Data
public class ProductsDto implements Serializable {

    /**
     * 主键id
     */
    private Long id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品价格
     */
    private BigDecimal price;

    /**
     * 商品库存
     */
    @Column(name = "in_stocks")
    private Integer inStocks;

    /**
     * 描述
     */
    private String description;

    /**
     * 审核状态（0：未审核，1：通过；2：不通过）
     */
    private Integer state;

    /**
     * 分类id
     */
    @Column(name = "category_id")
    private Long categoryId;

    /**
     * 分类名称
     */
    @Column(name = "category_name")
    private String categoryName;

    /**
     * 商品图片
     */
    private String images;

    public static Products transfer(ProductsDto dto) {

        Products model = new Products();
        BeanUtils.copyProperties(dto, model);

        return model;
    }
}
