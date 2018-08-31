package smile.wangsy.january.merchant.valid;

import java.io.Serializable;
import lombok.Data;

/**
 * @author wangsy
 * @date 2018/08/30
 */
@Data
public class ProductsValid implements Serializable {

    /**
     * 当前页号
     */
    private Integer pageNumber;

    /**
     * 总页数
     */
    private Integer pageSize;

}
