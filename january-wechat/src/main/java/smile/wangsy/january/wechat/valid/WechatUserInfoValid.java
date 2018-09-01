package smile.wangsy.january.wechat.valid;

import java.io.Serializable;
import lombok.Data;

/**
 * @author wangsy
 * @date 2018/09/01
 */
@Data
public class WechatUserInfoValid implements Serializable {

    /**
     * 当前页号
     */
    private Integer pageNumber;

    /**
     * 总页数
     */
    private Integer pageSize;

}
