package smile.wangsy.january.merchant.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import smile.wangsy.january.merchant.authentication.TheAuthenticationFailureHandler;
import smile.wangsy.january.merchant.authentication.TheAuthenticationSuccessHandler;
import smile.wangsy.january.merchant.service.impl.MyUserDetailsService;

/**
 * @author wangsy
 * @Date 2018/8/29.
 */
@Configuration
@EnableWebSecurity
@SuppressWarnings("all")
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private MyUserDetailsService myUserDetailsService;

    @Autowired
    private TheAuthenticationSuccessHandler theAuthenticationSuccessHandler;

    @Autowired
    private TheAuthenticationFailureHandler theAuthenticationFailureHandler;

    @Bean
    public static NoOpPasswordEncoder passwordEncoder() {
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }

    private static final String[] AUTH_WHITELIST = {
            "/login",
            "/register",
            "/img/**",
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

        http.formLogin()                                            // 当需要用户登录是使用表单提交
                .loginPage("/login")                                // 跳转到登录页面
                .loginProcessingUrl("/authentication/form")         // 自定义的登录接口
                .successHandler(theAuthenticationSuccessHandler)
                .failureHandler(theAuthenticationFailureHandler)
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
        auth.userDetailsService(this.myUserDetailsService);
    }

}
