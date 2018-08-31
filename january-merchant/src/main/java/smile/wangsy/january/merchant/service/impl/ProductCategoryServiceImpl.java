package smile.wangsy.january.merchant.service.impl;

import smile.wangsy.january.merchant.mapper.ProductCategoryMapper;
import smile.wangsy.january.merchant.model.ProductCategory;
import smile.wangsy.january.merchant.service.ProductCategoryService;
import smile.wangsy.january.merchant.dto.ProductCategoryDto;
import smile.wangsy.january.merchant.valid.ProductCategoryValid;

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
public class ProductCategoryServiceImpl extends BaseService<ProductCategory> implements ProductCategoryService {

    @Resource
    private ProductCategoryMapper productCategoryMapper;

    @Override
    public void insertByDto(ProductCategoryDto dto) {
        ProductCategory model = ProductCategoryDto.transfer(dto);

        model.setBeenDeleted(false);
        model.setInsertTime(new Date());

        productCategoryMapper.insert(model);
    }

    @Override
    public void updateByDto(ProductCategoryDto dto) throws Exception {
        ProductCategory model = ProductCategoryDto.transfer(dto);

        model.setUpdateTime(new Date());
        if(null == model.getId()) {
            throw new Exception("id不能为空");
        }

        productCategoryMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public ProductCategory selectById(Object id) {
        ProductCategory model = productCategoryMapper.selectByPrimaryKey(id);

        if (model!=null && model.getBeenDeleted()) {
            return null;
        }
        return model;
    }

    @Override
    public List<ProductCategory> selectByConditions(ProductCategoryValid valid) {

        Example example = new Example(ProductCategory.class);
        Example.Criteria criteria = example.createCriteria();
        /**
         * 查询未被删除的数据
         */
        criteria.andEqualTo("beenDeleted", false);
        return productCategoryMapper.selectByCondition(example);
    }

    @Override
    public void deleteByUpdate(Object id) {
        ProductCategory model = productCategoryMapper.selectByPrimaryKey(id);
        model.setBeenDeleted(true);
        model.setDeleteTime(new Date());
        productCategoryMapper.updateByPrimaryKeySelective(model);
    }

}
