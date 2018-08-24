package smile.wangsy.january.member.dto;

import org.springframework.beans.BeanUtils;
import smile.wangsy.january.member.model.Member;

/**
 * @author wangsy
 * @date 2018/08/25
 */
public class MemberDto {

    public Member transfer(MemberDto dto) {

        Member model = new Member();
        BeanUtils.copyProperties(dto, model);

        return model;
    }
}
