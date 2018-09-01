package smile.wangsy.january.wechat.service.impl;

import smile.wangsy.january.wechat.mapper.WechatUserInfoMapper;
import smile.wangsy.january.wechat.model.WechatUserInfo;
import smile.wangsy.january.wechat.service.WechatUserInfoService;
import smile.wangsy.january.wechat.dto.WechatUserInfoDto;
import smile.wangsy.january.wechat.valid.WechatUserInfoValid;

import wang.smile.common.base.BaseService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author wangsy
 * @date 2018/09/01.
 */
@Service
@Transactional(rollbackFor = {Exception.class})
public class WechatUserInfoServiceImpl extends BaseService<WechatUserInfo> implements WechatUserInfoService {

    @Resource
    private WechatUserInfoMapper wechatUserInfoMapper;

    @Override
    public void insertByDto(WechatUserInfoDto dto) {
        WechatUserInfo model = WechatUserInfoDto.transfer(dto);

        model.setBeenDeleted(false);
        model.setInsertTime(new Date());

        wechatUserInfoMapper.insert(model);
    }

    @Override
    public void updateByDto(WechatUserInfoDto dto) throws Exception {
        WechatUserInfo model = WechatUserInfoDto.transfer(dto);

        model.setUpdateTime(new Date());
        if(null == model.getId()) {
            throw new Exception("id不能为空");
        }

        wechatUserInfoMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public WechatUserInfo selectById(Object id) {
        WechatUserInfo model = wechatUserInfoMapper.selectByPrimaryKey(id);

        if (model!=null && model.getBeenDeleted()) {
            return null;
        }
        return model;
    }

    @Override
    public List<WechatUserInfo> selectByConditions(WechatUserInfoValid valid) {

        Example example = new Example(WechatUserInfo.class);
        Example.Criteria criteria = example.createCriteria();
        /**
         * 查询未被删除的数据
         */
        criteria.andEqualTo("beenDeleted", false);
        return wechatUserInfoMapper.selectByCondition(example);
    }

    @Override
    public void deleteByUpdate(Object id) {
        WechatUserInfo model = wechatUserInfoMapper.selectByPrimaryKey(id);
        model.setBeenDeleted(true);
        model.setDeleteTime(new Date());
        wechatUserInfoMapper.updateByPrimaryKeySelective(model);
    }

}
