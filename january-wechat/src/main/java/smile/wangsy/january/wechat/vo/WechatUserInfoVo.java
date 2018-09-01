package smile.wangsy.january.wechat.vo;

import org.springframework.beans.BeanUtils;
import smile.wangsy.january.wechat.model.WechatUserInfo;

import java.util.List;
import java.io.Serializable;
import java.util.stream.Collectors;

import lombok.Data;

/**
 * @author wangsy
 * @date 2018/09/01.
 */
@Data
public class WechatUserInfoVo implements Serializable {

    public static WechatUserInfoVo transModelToVo(WechatUserInfo model) {
        WechatUserInfoVo vo = new WechatUserInfoVo();
        BeanUtils.copyProperties(model, vo);
        return vo;
    }

    /**
     * 将ModelList转换为ModelVoList
     * @param modelList
     * @return
     */
    public static List<WechatUserInfoVo> transModelListToVoList(List<WechatUserInfo> modelList) {
        List<WechatUserInfoVo> voList = modelList.stream().map(e -> transModelToVo(e)).collect(Collectors.toList());
        return voList;
    }
}
