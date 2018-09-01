package smile.wangsy.january.member.vo;

import org.springframework.beans.BeanUtils;
import smile.wangsy.january.member.model.Member;

import java.util.Date;
import java.util.List;
import java.io.Serializable;
import java.util.stream.Collectors;

import lombok.Data;

/**
 * @author wangsy
 * @date 2018/09/01.
 */
@Data
public class MemberVo implements Serializable {

    private Long id;
    /**
     * 联系电话
     */
    private String mobile;
    /**
     * 用户的微笑openid
     */
    private String openid;

    /**
     * wxUserInfo表中的id
     */
    private Long wxInfoId;


    public static MemberVo transModelToVo(Member model) {
        MemberVo vo = new MemberVo();
        BeanUtils.copyProperties(model, vo);
        return vo;
    }

    /**
     * 将ModelList转换为ModelVoList
     * @param modelList
     * @return
     */
    public static List<MemberVo> transModelListToVoList(List<Member> modelList) {
        List<MemberVo> voList = modelList.stream().map(e -> transModelToVo(e)).collect(Collectors.toList());
        return voList;
    }
}
