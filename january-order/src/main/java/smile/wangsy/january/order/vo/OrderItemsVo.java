package smile.wangsy.january.order.vo;

import org.springframework.beans.BeanUtils;
import smile.wangsy.january.order.model.OrderItems;

import java.util.List;
import java.io.Serializable;
import java.util.stream.Collectors;

import lombok.Data;

/**
 * @author wangsy
 * @date 2018/08/31.
 */
@Data
public class OrderItemsVo implements Serializable {

    public static OrderItemsVo transModelToVo(OrderItems model) {
        OrderItemsVo vo = new OrderItemsVo();
        BeanUtils.copyProperties(model, vo);
        return vo;
    }

    /**
     * 将ModelList转换为ModelVoList
     * @param modelList
     * @return
     */
    public static List<OrderItemsVo> transModelListToVoList(List<OrderItems> modelList) {
        List<OrderItemsVo> voList = modelList.stream().map(e -> transModelToVo(e)).collect(Collectors.toList());
        return voList;
    }
}
