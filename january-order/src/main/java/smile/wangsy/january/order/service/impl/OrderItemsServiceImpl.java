package smile.wangsy.january.order.service.impl;

import smile.wangsy.january.order.mapper.OrderItemsMapper;
import smile.wangsy.january.order.model.OrderItems;
import smile.wangsy.january.order.service.OrderItemsService;
import smile.wangsy.january.order.dto.OrderItemsDto;
import smile.wangsy.january.order.valid.OrderItemsValid;

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
public class OrderItemsServiceImpl extends BaseService<OrderItems> implements OrderItemsService {

    @Resource
    private OrderItemsMapper orderItemsMapper;

    @Override
    public void insertByDto(OrderItemsDto dto) {
        OrderItems model = OrderItemsDto.transfer(dto);

        model.setBeenDeleted(false);
        model.setInsertTime(new Date());

        orderItemsMapper.insert(model);
    }

    @Override
    public void updateByDto(OrderItemsDto dto) throws Exception {
        OrderItems model = OrderItemsDto.transfer(dto);

        model.setUpdateTime(new Date());
        if(null == model.getId()) {
            throw new Exception("id不能为空");
        }

        orderItemsMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public OrderItems selectById(Object id) {
        OrderItems model = orderItemsMapper.selectByPrimaryKey(id);

        if (model!=null && model.getBeenDeleted()) {
            return null;
        }
        return model;
    }

    @Override
    public List<OrderItems> selectByConditions(OrderItemsValid valid) {

        Example example = new Example(OrderItems.class);
        Example.Criteria criteria = example.createCriteria();
        /**
         * 查询未被删除的数据
         */
        criteria.andEqualTo("beenDeleted", false);
        return orderItemsMapper.selectByCondition(example);
    }

    @Override
    public void deleteByUpdate(Object id) {
        OrderItems model = orderItemsMapper.selectByPrimaryKey(id);
        model.setBeenDeleted(true);
        model.setDeleteTime(new Date());
        orderItemsMapper.updateByPrimaryKeySelective(model);
    }

}
