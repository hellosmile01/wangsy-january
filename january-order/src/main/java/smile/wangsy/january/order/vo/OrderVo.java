package smile.wangsy.january.order.vo;

import org.springframework.beans.BeanUtils;
import smile.wangsy.january.order.model.Order;

import java.util.List;
import java.io.Serializable;
import java.util.stream.Collectors;

import lombok.Data;

/**
 * @author wangsy
 * @date 2018/08/31.
 */
@Data
public class OrderVo implements Serializable {

    public static OrderVo transModelToVo(Order model) {
        OrderVo vo = new OrderVo();
        BeanUtils.copyProperties(model, vo);
        return vo;
    }

    /**
     * 将ModelList转换为ModelVoList
     * @param modelList
     * @return
     */
    public static List<OrderVo> transModelListToVoList(List<Order> modelList) {
        List<OrderVo> voList = modelList.stream().map(e -> transModelToVo(e)).collect(Collectors.toList());
        return voList;
    }
}
