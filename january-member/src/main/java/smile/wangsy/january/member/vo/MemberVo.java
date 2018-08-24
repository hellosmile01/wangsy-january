package smile.wangsy.january.member.vo;

import org.springframework.beans.BeanUtils;
import smile.wangsy.january.member.model.Member;

/**
 * @author wangsy
 * @date 2018/08/25.
 */
public class MemberVo {

    public MemberVo transModelToVo(Member model) {
        BeanUtils.copyProperties(model, this);
        return this;
    }
}
