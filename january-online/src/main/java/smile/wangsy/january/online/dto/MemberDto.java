package smile.wangsy.january.online.dto;

import org.springframework.beans.BeanUtils;
import smile.wangsy.january.online.model.Member;

import java.io.Serializable;

import lombok.Data;

/**
 * @author wangsy
 * @date 2018/08/28
 */
@Data
public class MemberDto implements Serializable {

    public static Member transfer(MemberDto dto) {

        Member model = new Member();
        BeanUtils.copyProperties(dto, model);

        return model;
    }
}
