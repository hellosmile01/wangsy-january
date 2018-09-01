package smile.wangsy.january.wechat.utils;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author wangsy
 * @Date 2018/9/1.
 */
@Getter
@Component
@PropertySource("classpath:wechat.properties")
public class PropertiesValue {

    @Value("${appid}")
    private String appid;

    @Value("${appsecret}")
    private String appSecret;
}
