package ${basePackage}.valid;

import java.io.Serializable;
import lombok.Data;

/**
 * @author ${author}
 * @date ${date}
 */
@Data
public class ${modelValidNameUpperCamel} implements Serializable {

    /**
     * 当前页号
     */
    private Integer pageNumber;

    /**
     * 总页数
     */
    private Integer pageSize;

}
