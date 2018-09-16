package smile.wangsy.january.sso.authentication;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author wangsy
 * @Date 2018/8/30.
 */
@Component
//@ConfigurationProperties(prefix = "smile.security")
public class SecurityProperties {

    private LoginResponseType loginType = LoginResponseType.JSON;

    public LoginResponseType getLoginType() {
        return loginType;
    }

    public void setLoginType(LoginResponseType loginType) {
        this.loginType = loginType;
    }
}
