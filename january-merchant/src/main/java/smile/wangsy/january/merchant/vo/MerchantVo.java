package smile.wangsy.january.merchant.vo;

import io.swagger.annotations.ApiParam;
import org.springframework.beans.BeanUtils;
import smile.wangsy.january.merchant.model.Merchant;

import java.util.List;
import java.io.Serializable;
import java.util.stream.Collectors;

import lombok.Data;

/**
 * @author wangsy
 * @date 2018/08/27.
 */
@Data
public class MerchantVo implements Serializable {

    @ApiParam(value = "商户名称")
    private String name;

    @ApiParam(value = "联系电话")
    private String mobile;

    @ApiParam(value = "负责人")
    private String principalName;

    @ApiParam(value = "负责人电话")
    private String principalMobile;

    public static MerchantVo transModelToVo(Merchant model) {
        MerchantVo vo = new MerchantVo();
        BeanUtils.copyProperties(model, vo);
        return vo;
    }

    /**
     * 将ModelList转换为ModelVoList
     * @param modelList
     * @return
     */
    public static List<MerchantVo> transModelListToVoList(List<Merchant> modelList) {
        List<MerchantVo> voList = modelList.stream().map(e -> transModelToVo(e)).collect(Collectors.toList());
        return voList;
    }
}
