package smile.wangsy.january.online.dto;

import org.springframework.beans.BeanUtils;
import smile.wangsy.january.online.model.Merchant;

import java.io.Serializable;

import lombok.Data;

/**
 * @author wangsy
 * @date 2018/08/28
 */
@Data
public class MerchantDto implements Serializable {

    public static Merchant transfer(MerchantDto dto) {

        Merchant model = new Merchant();
        BeanUtils.copyProperties(dto, model);

        return model;
    }
}
