package smile.wangsy.january.sso.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.Resource;

/**
 * @author: wangsy
 * @date: 2018/9/13 22:53
 */
@Configuration
@Order(100)
public class SsoSecurityConfig extends WebSecurityConfigurerAdapter {

    @Resource
    private SsoUserDetailsService ssoUserDetailsService;

    @Autowired
    private TheAuthenticationSuccessHandler theAuthenticationSuccessHandler;

    @Autowired
    private TheAuthenticationFailureHandler theAuthenticationFailureHandler;

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
        http.formLogin()
                // 跳转到登录页面
                .loginPage("/login")
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

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(ssoUserDetailsService).passwordEncoder(passwordEncoder());
    }

    @Bean
    public static PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
