package smile.wangsy.january.clienta.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * https://blog.csdn.net/haoxiaoyong1014/article/details/80107550
 * @author wangsy
 * @Date 2018/9/12.
 */
@EnableOAuth2Sso
@Configuration
public class ClientaSecurityConfig extends WebSecurityConfigurerAdapter {

    private static final String[] AUTH_WHITELIST = {
            "/login",
            "/**/*.css",
            "/**/*.js",
            "/authentication/form",
            // -- swagger ui
            "/swagger-resources/**",
            "/swagger-ui.html",
            "/v2/api-docs",
            "/webjars/**",
            "/v1/merchant"
    };

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 当需要用户登录是使用表单提交
        http.formLogin()
            // 跳转到登录页面
            .loginPage("/login")
            // 自定义的登录接口
            .loginProcessingUrl("/authentication/form")
            .and().authorizeRequests()
            .antMatchers(AUTH_WHITELIST).permitAll()
            .anyRequest()
            .authenticated()
            .and()
            .csrf().disable();
    }
}
