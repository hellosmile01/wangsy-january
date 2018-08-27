package smile.wangsy.january.merchant.service.impl;

import smile.wangsy.january.merchant.mapper.MerchantMapper;
import smile.wangsy.january.merchant.model.Merchant;
import smile.wangsy.january.merchant.service.MerchantService;
import smile.wangsy.january.merchant.dto.MerchantDto;
import smile.wangsy.january.merchant.valid.MerchantValid;

import wang.smile.common.base.BaseService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author wangsy
 * @date 2018/08/27.
 */
@Service
@Transactional(rollbackFor = {Exception.class})
public class MerchantServiceImpl extends BaseService<Merchant> implements MerchantService {

    @Resource
    private MerchantMapper merchantMapper;

    @Override
    public void insertByDto(MerchantDto dto) {
        Merchant model = MerchantDto.transfer(dto);

        model.setBeenDeleted(false);
        model.setInsertTime(new Date());

        merchantMapper.insert(model);
    }

    @Override
    public void updateByDto(MerchantDto dto) throws Exception {
        Merchant model = MerchantDto.transfer(dto);

        model.setUpdateTime(new Date());
        if(null == model.getId()) {
            throw new Exception("id不能为空");
        }

        merchantMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public Merchant selectById(Object id) {
        Merchant model = merchantMapper.selectByPrimaryKey(id);

        if (model!=null && model.getBeenDeleted()) {
            return null;
        }
        return model;
    }

    @Override
    public List<Merchant> selectByConditions(MerchantValid valid) {

        Example example = new Example(Merchant.class);
        Example.Criteria criteria = example.createCriteria();
        /**
         * 查询未被删除的数据
         */
        criteria.andEqualTo("beenDeleted", false);
        return merchantMapper.selectByCondition(example);
    }

    @Override
    public void deleteByUpdate(Object id) {
        Merchant model = merchantMapper.selectByPrimaryKey(id);
        model.setBeenDeleted(true);
        model.setDeleteTime(new Date());
        merchantMapper.updateByPrimaryKeySelective(model);
    }

}
