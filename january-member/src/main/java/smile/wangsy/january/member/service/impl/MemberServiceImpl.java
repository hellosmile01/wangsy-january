package smile.wangsy.january.member.service.impl;

import smile.wangsy.january.member.mapper.MemberMapper;
import smile.wangsy.january.member.model.Member;
import smile.wangsy.january.member.service.MemberService;
import smile.wangsy.january.member.dto.MemberDto;
import smile.wangsy.january.member.valid.MemberValid;

import wang.smile.common.base.BaseService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author wangsy
 * @date 2018/08/25.
 */
@Service
@Transactional(rollbackFor = {Exception.class})
public class MemberServiceImpl extends BaseService<Member> implements MemberService {

    @Resource
    private MemberMapper memberMapper;

    @Override
    public void insertDto(MemberDto dto) {
        Member model = new MemberDto().transfer(dto);

        model.setBeenDeleted(false);
        model.setInsertTime(new Date());

        memberMapper.insert(model);
    }

    @Override
    public Member selectById(Object id) {
        Member model = memberMapper.selectByPrimaryKey(id);
        return model;
    }

    @Override
    public List<Member> selectByConditions(MemberValid valid) {

        Condition condition = new Condition(Member.class);
        Example.Criteria criteria = condition.createCriteria();

        return memberMapper.selectByCondition(criteria);
    }

    @Override
    public void deleteByUpdate(Object id) {
        Member model = memberMapper.selectByPrimaryKey(id);
        model.setBeenDeleted(true);
        model.setDeleteTime(new Date());
        memberMapper.updateByPrimaryKeySelective(model);
    }

}
