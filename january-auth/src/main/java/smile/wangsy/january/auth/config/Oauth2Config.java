package smile.wangsy.january.auth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.provider.error.WebResponseExceptionTranslator;

import javax.sql.DataSource;

/**
 * @author Juzi
 * @Date 2018/9/11.
 */
@Configuration
@EnableAuthorizationServer
public class Oauth2Config extends AuthorizationServerConfigurerAdapter {

    private AuthenticationManager authenticationManager;

    private WebResponseExceptionTranslator webResponseExceptionTranslator;

    private DataSource dataSource;

    private RedisConnectionFactory redisConnectionFactory;


}
