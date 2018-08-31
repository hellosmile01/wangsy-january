package smile.wangsy.january.merchant.service;

import smile.wangsy.january.merchant.model.ProductCategory;
import smile.wangsy.january.merchant.dto.ProductCategoryDto;
import smile.wangsy.january.merchant.valid.ProductCategoryValid;
import wang.smile.common.base.Service;

import java.util.List;

/**
 * @author wangsy
 * @date 2018/08/31
 */
public interface ProductCategoryService extends Service<ProductCategory> {

   /**
     * 插入数据
     * @param dto
     */
    void insertByDto(ProductCategoryDto dto) throws Exception;

    /**
     * 修改数据
     * @param dto
     */
    void updateByDto(ProductCategoryDto dto)  throws Exception;

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
    ProductCategory selectById(Object id);

    /**
     * 根据条件查询
     * @param valid
     * @return
     */
    List<ProductCategory> selectByConditions(ProductCategoryValid valid);
}
