package smile.wangsy.january.merchant.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author wangsy
 * @Date 2018/8/29.
 */
@Configuration
@EnableWebSecurity
@SuppressWarnings("all")
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin().loginPage("/login").loginProcessingUrl("/login").permitAll();
        http.logout().logoutUrl("/logout");
        http.csrf().disable();

        http.headers().frameOptions().disable();

        http.authorizeRequests().antMatchers("/**/ui/**", "/**/*.css", "/**/*.js").permitAll();

        http.authorizeRequests().antMatchers("/**").authenticated();

        http.httpBasic();
    }
}
