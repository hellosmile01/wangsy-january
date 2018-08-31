package smile.wangsy.january.merchant.service;

import smile.wangsy.january.merchant.model.Products;
import smile.wangsy.january.merchant.dto.ProductsDto;
import smile.wangsy.january.merchant.valid.ProductsValid;
import wang.smile.common.base.Service;

import java.util.List;

/**
 * @author wangsy
 * @date 2018/08/30
 */
public interface ProductsService extends Service<Products> {

   /**
     * 插入数据
     * @param dto
     */
    void insertByDto(ProductsDto dto) throws Exception;

    /**
     * 修改数据
     * @param dto
     */
    void updateByDto(ProductsDto dto)  throws Exception;

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
    Products selectById(Object id);

    /**
     * 根据条件查询
     * @param valid
     * @return
     */
    List<Products> selectByConditions(ProductsValid valid);
}
