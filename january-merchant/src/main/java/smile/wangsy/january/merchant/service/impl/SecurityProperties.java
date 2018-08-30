package smile.wangsy.january.merchant.service.impl;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import smile.wangsy.january.merchant.authentication.LoginResponseType;

/**
 * @author wangsy
 * @Date 2018/8/30.
 */
@Component
@ConfigurationProperties(prefix = "smile.security")
public class SecurityProperties {

    private LoginResponseType loginType = LoginResponseType.JSON;

    public LoginResponseType getLoginType() {
        return loginType;
    }

    public void setLoginType(LoginResponseType loginType) {
        this.loginType = loginType;
    }
}
