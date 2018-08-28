package smile.wangsy.january.online.service.impl;

import smile.wangsy.january.online.mapper.MemberMapper;
import smile.wangsy.january.online.model.Member;
import smile.wangsy.january.online.service.MemberService;
import smile.wangsy.january.online.dto.MemberDto;
import smile.wangsy.january.online.valid.MemberValid;

import wang.smile.common.base.BaseService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author wangsy
 * @date 2018/08/28.
 */
@Service
@Transactional(rollbackFor = {Exception.class})
public class MemberServiceImpl extends BaseService<Member> implements MemberService {

    @Resource
    private MemberMapper memberMapper;

    @Override
    public void insertByDto(MemberDto dto) {
        Member model = MemberDto.transfer(dto);

        model.setBeenDeleted(false);
        model.setInsertTime(new Date());

        memberMapper.insert(model);
    }

    @Override
    public void updateByDto(MemberDto dto) throws Exception {
        Member model = MemberDto.transfer(dto);

        model.setUpdateTime(new Date());
        if(null == model.getId()) {
            throw new Exception("id不能为空");
        }

        memberMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public Member selectById(Object id) {
        Member model = memberMapper.selectByPrimaryKey(id);

        if (model!=null && model.getBeenDeleted()) {
            return null;
        }
        return model;
    }

    @Override
    public List<Member> selectByConditions(MemberValid valid) {

        Example example = new Example(Member.class);
        Example.Criteria criteria = example.createCriteria();
        /**
         * 查询未被删除的数据
         */
        criteria.andEqualTo("beenDeleted", false);
        return memberMapper.selectByCondition(example);
    }

    @Override
    public void deleteByUpdate(Object id) {
        Member model = memberMapper.selectByPrimaryKey(id);
        model.setBeenDeleted(true);
        model.setDeleteTime(new Date());
        memberMapper.updateByPrimaryKeySelective(model);
    }

}
