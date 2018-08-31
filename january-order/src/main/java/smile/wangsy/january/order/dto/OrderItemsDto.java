package smile.wangsy.january.order.dto;

import org.springframework.beans.BeanUtils;
import smile.wangsy.january.order.model.OrderItems;

import java.io.Serializable;

import lombok.Data;

/**
 * @author wangsy
 * @date 2018/08/31
 */
@Data
public class OrderItemsDto implements Serializable {

    public static OrderItems transfer(OrderItemsDto dto) {

        OrderItems model = new OrderItems();
        BeanUtils.copyProperties(dto, model);

        return model;
    }
}
