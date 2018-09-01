package smile.wangsy.january.wechat.dto;

import lombok.Data;
import org.springframework.beans.BeanUtils;
import smile.wangsy.january.wechat.model.WechatUserInfo;

import java.io.Serializable;

/**
 * @author wangsy
 * @date 2018/09/01
 */
@Data
public class WechatUserInfoDto implements Serializable {

    /**
     * openid
     */
    private String openid;

    /**
     * session_key
     */
    private String sessionKey;

    /**
     * nickName
     */
    private String nickName;

    /**
     * 头像
     */
    private String avatarUrl;

    /**
     * country
     */
    private String country;

    /**
     * city
     */
    private String city;

    /**
     * province
     */
    private String province;

    /**
     * gender
     */
    private Integer gender;

    /**
     * language
     */
    private String language;

    public static WechatUserInfo transfer(WechatUserInfoDto dto) {

        WechatUserInfo model = new WechatUserInfo();
        BeanUtils.copyProperties(dto, model);

        return model;
    }
}
