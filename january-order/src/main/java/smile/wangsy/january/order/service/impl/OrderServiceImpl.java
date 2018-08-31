package smile.wangsy.january.order.service.impl;

import smile.wangsy.january.order.mapper.OrderMapper;
import smile.wangsy.january.order.model.Order;
import smile.wangsy.january.order.service.OrderService;
import smile.wangsy.january.order.dto.OrderDto;
import smile.wangsy.january.order.valid.OrderValid;

import wang.smile.common.base.BaseService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author wangsy
 * @date 2018/08/31.
 */
@Service
@Transactional(rollbackFor = {Exception.class})
public class OrderServiceImpl extends BaseService<Order> implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public void insertByDto(OrderDto dto) {
        Order model = OrderDto.transfer(dto);

        model.setBeenDeleted(false);
        model.setInsertTime(new Date());

        orderMapper.insert(model);
    }

    @Override
    public void updateByDto(OrderDto dto) throws Exception {
        Order model = OrderDto.transfer(dto);

        model.setUpdateTime(new Date());
        if(null == model.getId()) {
            throw new Exception("id不能为空");
        }

        orderMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public Order selectById(Object id) {
        Order model = orderMapper.selectByPrimaryKey(id);

        if (model!=null && model.getBeenDeleted()) {
            return null;
        }
        return model;
    }

    @Override
    public List<Order> selectByConditions(OrderValid valid) {

        Example example = new Example(Order.class);
        Example.Criteria criteria = example.createCriteria();
        /**
         * 查询未被删除的数据
         */
        criteria.andEqualTo("beenDeleted", false);
        return orderMapper.selectByCondition(example);
    }

    @Override
    public void deleteByUpdate(Object id) {
        Order model = orderMapper.selectByPrimaryKey(id);
        model.setBeenDeleted(true);
        model.setDeleteTime(new Date());
        orderMapper.updateByPrimaryKeySelective(model);
    }

}
