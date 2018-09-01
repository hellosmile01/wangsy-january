package smile.wangsy.january.member.dto;

import org.springframework.beans.BeanUtils;
import smile.wangsy.january.member.model.Member;

import java.io.Serializable;

import lombok.Data;

/**
 * @author wangsy
 * @date 2018/09/01
 */
@Data
public class MemberDto implements Serializable {

    public static Member transfer(MemberDto dto) {

        Member model = new Member();
        BeanUtils.copyProperties(dto, model);

        return model;
    }
}
