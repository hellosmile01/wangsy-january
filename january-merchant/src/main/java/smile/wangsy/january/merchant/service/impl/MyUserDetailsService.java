package smile.wangsy.january.merchant.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import smile.wangsy.january.merchant.mapper.MerchantMapper;
import smile.wangsy.january.merchant.model.Merchant;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author: wangsy
 * @date: 2018/8/29 22:29
 */
@Service("myUserDetailsService")
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private MerchantMapper merchantMapper;


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Example example = new Example(Merchant.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("mobile", s);

        if(StringUtils.isEmpty(s)) {
            throw new UsernameNotFoundException("手机号码不能为空");
        }
        List<Merchant> merchants = merchantMapper.selectByCondition(example);

        if(CollectionUtils.isEmpty(merchants) || merchants.size()>1) {
            throw new UsernameNotFoundException("不存在该用户");
        }

        User user = new User(merchants.get(0).getMobile(), merchants.get(0).getPassword(),
                AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));

        return user;
    }
}
