package smile.wang.sso.client.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Juzi
 * @Date 2018/9/12.
 */
@EnableOAuth2Sso
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

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
//        http.antMatcher("/**")
////                .authorizeRequests()
////                .antMatchers("/", "/login**")
////                .permitAll()
////                .anyRequest()
////                .authenticated();
        http.formLogin()                                            // 当需要用户登录是使用表单提交
                .loginPage("/login")                                // 跳转到登录页面
                .loginProcessingUrl("/authentication/form")         // 自定义的登录接口
                .and()
                .authorizeRequests()
                .antMatchers(AUTH_WHITELIST).permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .csrf().disable();
    }
}
