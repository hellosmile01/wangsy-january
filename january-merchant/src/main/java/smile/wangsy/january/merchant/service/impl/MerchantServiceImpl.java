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
import java.util.Date;

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
        merchant.setIsValid(true);
        merchant.setBeenDeleted(false);
        merchant.setInsertTime(new Date());
        // 0: 未审核
        merchant.setState(0);
        merchantMapper.insert(merchant);
    }

    @Override
    public MerchantVo selectById(Long id) {
        Merchant merchant = merchantMapper.selectByPrimaryKey(id);
        return new MerchantVo().transMerchantToVo(merchant);
    }

    @Override
    public void deleteByUpdate(Long id) {
        Merchant merchant = merchantMapper.selectByPrimaryKey(id);
        merchant.setBeenDeleted(true);
        merchant.setDeleteTime(new Date());
        merchantMapper.updateByPrimaryKeySelective(merchant);
    }
}
