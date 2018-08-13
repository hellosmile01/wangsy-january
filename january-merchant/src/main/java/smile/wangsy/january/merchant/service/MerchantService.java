package smile.wangsy.january.merchant.service;
import smile.wangsy.january.merchant.dto.MerchantDto;
import smile.wangsy.january.merchant.model.Merchant;
import smile.wangsy.january.merchant.vo.MerchantVo;
import wang.smile.common.base.Service;


/**
 *
 * @author wangsy
 * @date 2018/08/13
 */
public interface MerchantService extends Service<Merchant> {
    /**
     * 插入数据：通过dot
     * @param dto
     */
    void insertDto(MerchantDto dto);

    /**
     * 返回VO
     * @param id
     * @return
     */
    MerchantVo selectById(Long id);
}
