package smile.wangsy.january.merchant.util;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import smile.wangsy.january.merchant.model.Merchant;
import smile.wangsy.january.merchant.service.MerchantService;
import smile.wangsy.january.merchant.valid.MerchantValid;

import java.util.List;

/**
 * @author Juzi
 * @Date 2018/8/31.
 */
public class CommonUtil {

    public static Merchant getCurrentLogin(MerchantService merchantService) {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if(StringUtils.isEmpty(userDetails.getUsername())) {
            return null;
        }

        MerchantValid valid = new MerchantValid();
        valid.setName(userDetails.getUsername());
        List<Merchant> list = merchantService.selectByConditions(valid);

        if(CollectionUtils.isEmpty(list)) {
            return null;
        }

        return list.get(0);
    }
}
