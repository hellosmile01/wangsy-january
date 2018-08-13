package smile.wangsy.january.merchant.service.impl;

import smile.wangsy.january.merchant.dto.MerchantDto;
import smile.wangsy.january.merchant.mapper.MerchantMapper;
import smile.wangsy.january.merchant.model.Merchant;
import smile.wangsy.january.merchant.service.MerchantService;
import smile.wangsy.january.merchant.vo.MerchantVo;
import wang.smile.common.base.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author wangsy
 * @date 2018/08/13
 */
@Service
@Transactional(rollbackFor = {Exception.class})
public class MerchantServiceImpl extends BaseService<Merchant> implements MerchantService {

    @Resource
    private MerchantMapper merchantMapper;

    @Override
    public void insertDto(MerchantDto dto) {
        Merchant merchant = new MerchantDto().transfer(dto);
        merchantMapper.insert(merchant);
    }

    @Override
    public MerchantVo selectById(Long id) {
        Merchant merchant = merchantMapper.selectByPrimaryKey(id);
        return new MerchantVo().transMerchantToVo(merchant);
    }
}
