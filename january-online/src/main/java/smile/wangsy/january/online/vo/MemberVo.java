package smile.wangsy.january.online.vo;

import org.springframework.beans.BeanUtils;
import smile.wangsy.january.online.model.Member;

import java.util.List;
import java.io.Serializable;
import java.util.stream.Collectors;

import lombok.Data;

/**
 * @author wangsy
 * @date 2018/08/28.
 */
@Data
public class MemberVo implements Serializable {

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
