package smile.wangsy.january.order.service;

import smile.wangsy.january.order.model.OrderItems;
import smile.wangsy.january.order.dto.OrderItemsDto;
import smile.wangsy.january.order.valid.OrderItemsValid;
import wang.smile.common.base.Service;

import java.util.List;

/**
 * @author wangsy
 * @date 2018/08/31
 */
public interface OrderItemsService extends Service<OrderItems> {

   /**
     * 插入数据
     * @param dto
     */
    void insertByDto(OrderItemsDto dto);

    /**
     * 修改数据
     * @param dto
     */
    void updateByDto(OrderItemsDto dto)  throws Exception;

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
    OrderItems selectById(Object id);

    /**
     * 根据条件查询
     * @param valid
     * @return
     */
    List<OrderItems> selectByConditions(OrderItemsValid valid);
}
