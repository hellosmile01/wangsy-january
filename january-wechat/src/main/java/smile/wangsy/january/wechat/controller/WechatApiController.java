package smile.wangsy.january.wechat.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import smile.wangsy.january.wechat.dto.WechatDataDto;
import smile.wangsy.january.wechat.utils.HttpRequest;
import smile.wangsy.january.wechat.utils.PropertiesValue;
import wang.smile.common.base.BaseConstants;
import wang.smile.common.base.BaseResult;

/**
 * @author wangsy
 * @Date 2018/9/1.
 */
@RestController
@RequestMapping(value = "/v1/wechat/api")
public class WechatApiController {

    @Autowired
    private PropertiesValue propertiesValue;

    /**
     * 临时登录凭证code 换取 用户唯一标识openid 和 会话密钥session_key
     * @param code
     * @return
     */
    @RequestMapping(value = "getOpenId")
    public BaseResult getOpenId(String code) {

        String appid = "openid";

        String apiUrl = "https://api.weixin.qq.com/sns/jscode2session";

        String json = HttpRequest.sendGet(apiUrl, "appid="+propertiesValue.getAppid()+"&secret="+propertiesValue.getAppSecret()+"&js_code="+code+"&grant_type=authorization_code");

        if(!json.contains(appid)) {
            return new BaseResult(BaseConstants.FAILED_CODE, BaseConstants.FAILED_MSG, json);
        }
        WechatDataDto dto = JSON.parseObject(json, WechatDataDto.class);

        return new BaseResult(BaseConstants.SUCCESS_CODE, BaseConstants.SUCCESS_MSG, dto);
    }
}
