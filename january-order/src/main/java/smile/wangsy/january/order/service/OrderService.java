package smile.wangsy.january.order.service;

import smile.wangsy.january.order.model.Order;
import smile.wangsy.january.order.dto.OrderDto;
import smile.wangsy.january.order.valid.OrderValid;
import wang.smile.common.base.Service;

import java.util.List;

/**
 * @author wangsy
 * @date 2018/08/31
 */
public interface OrderService extends Service<Order> {

   /**
     * 插入数据
     * @param dto
     */
    void insertByDto(OrderDto dto);

    /**
     * 修改数据
     * @param dto
     */
    void updateByDto(OrderDto dto)  throws Exception;

    /**
     * 非物理删除
     * @param id
     */
    void deleteByUpdate(Object id);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Order selectById(Object id);

    /**
     * 根据条件查询
     * @param valid
     * @return
     */
    List<Order> selectByConditions(OrderValid valid);
}
