package smile.wangsy.january.online.service;

import smile.wangsy.january.online.model.Member;
import smile.wangsy.january.online.dto.MemberDto;
import smile.wangsy.january.online.valid.MemberValid;
import wang.smile.common.base.Service;

import java.util.List;

/**
 * @author wangsy
 * @date 2018/08/28
 */
public interface MemberService extends Service<Member> {

   /**
     * 插入数据
     * @param dto
     */
    void insertByDto(MemberDto dto);

    /**
     * 修改数据
     * @param dto
     */
    void updateByDto(MemberDto dto)  throws Exception;

    /**
     * 非物理删除
     * @param id
     */
    void deleteByUpdate(Object id);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Member selectById(Object id);

    /**
     * 根据条件查询
     * @param valid
     * @return
     */
    List<Member> selectByConditions(MemberValid valid);
}
