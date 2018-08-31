package smile.wangsy.january.order.dto;

import org.springframework.beans.BeanUtils;
import smile.wangsy.january.order.model.Order;

import java.io.Serializable;

import lombok.Data;

/**
 * @author wangsy
 * @date 2018/08/31
 */
@Data
public class OrderDto implements Serializable {

    public static Order transfer(OrderDto dto) {

        Order model = new Order();
        BeanUtils.copyProperties(dto, model);

        return model;
    }
}
