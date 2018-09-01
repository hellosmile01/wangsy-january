package smile.wangsy.january.wechat.service;

import smile.wangsy.january.wechat.model.WechatUserInfo;
import smile.wangsy.january.wechat.dto.WechatUserInfoDto;
import smile.wangsy.january.wechat.valid.WechatUserInfoValid;
import wang.smile.common.base.Service;

import java.util.List;

/**
 * @author wangsy
 * @date 2018/09/01
 */
public interface WechatUserInfoService extends Service<WechatUserInfo> {

   /**
     * 插入数据
     * @param dto
     */
    void insertByDto(WechatUserInfoDto dto);

    /**
     * 修改数据
     * @param dto
     */
    void updateByDto(WechatUserInfoDto dto)  throws Exception;

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
    WechatUserInfo selectById(Object id);

    /**
     * 根据条件查询
     * @param valid
     * @return
     */
    List<WechatUserInfo> selectByConditions(WechatUserInfoValid valid);
}
