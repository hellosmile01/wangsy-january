package smile.wangsy.january.member.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author: wangsy
 * @date: 2018/9/13 22:53
 */
@Configuration
@EnableOAuth2Sso
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    private static final String[] AUTH_WHITELIST = {
            "/login",
            "/user/login",
            "/user/register",
            "/img/**",
            "/**/*.css",
            "/**/*.js",
            "/authentication/form",
            "/swagger-resources/**",
            "/swagger-ui.html",
            "/v2/api-docs",
            "/webjars/**",
            "/v1/member"
    };

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 当需要用户登录是使用表单提交
        http.formLogin().loginProcessingUrl("http://127.0.0.1:19990/login")
                // 跳转到登录页面
//                .loginPage("/login")
                // 自定义的登录接口
                .loginProcessingUrl("/authentication/form")
//                .successHandler(theAuthenticationSuccessHandler)
//                .failureHandler(theAuthenticationFailureHandler)
                .and()
                .authorizeRequests()
                .antMatchers(AUTH_WHITELIST).permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .csrf().disable();
    }

}
