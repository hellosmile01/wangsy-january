package smile.wangsy.january.merchant.service.impl;

import smile.wangsy.january.merchant.mapper.MerchantMapper;
import smile.wangsy.january.merchant.model.Merchant;
import smile.wangsy.january.merchant.service.MerchantService;
import wang.smile.common.base.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by wangsy on 2018/08/13.
 */
@Service
@Transactional
public class MerchantServiceImpl extends BaseService<Merchant> implements MerchantService {
    @Resource
    private MerchantMapper merchantMapper;

}
