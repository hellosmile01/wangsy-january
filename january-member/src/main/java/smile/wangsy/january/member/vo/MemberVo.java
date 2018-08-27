package smile.wangsy.january.member.vo;

import org.springframework.beans.BeanUtils;
import smile.wangsy.january.member.model.Member;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wangsy
 * @date 2018/08/25.
 */
public class MemberVo {

    public MemberVo transModelToVo(Member model) {
        BeanUtils.copyProperties(model, this);
        return this;
    }

    /**
     * 将ModelList转换为ModelVoList
     * @param memberList
     * @return
     */
    public List<MemberVo> transModelListToVoList(List<Member> memberList) {
        List<MemberVo> collect = memberList.stream().map(e -> this.transModelToVo(e)).collect(Collectors.toList());
        return collect;
    }
}
