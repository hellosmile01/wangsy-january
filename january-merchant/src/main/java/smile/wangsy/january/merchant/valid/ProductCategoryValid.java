package smile.wangsy.january.merchant.valid;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangsy
 * @date 2018/08/31
 */
@Data
public class ProductCategoryValid implements Serializable {

    /**
     * 审核状态（0：未审核，1：通过；2：不通过）
     */
    private Integer state;

    /**
     * 商户名称
     */
    private String merchantName;

    /**
     * 商户id
     */
    private Long merchantId;
    /**
     * 当前页号
     */
    private Integer pageNumber;

    /**
     * 总页数
     */
    private Integer pageSize;


}
