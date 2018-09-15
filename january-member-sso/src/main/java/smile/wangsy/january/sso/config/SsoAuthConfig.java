package smile.wangsy.january.sso.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

/**
 * @author: wangsy
 * @date: 2018/9/13 21:34
 */
@Configuration
@EnableAuthorizationServer
public class SsoAuthConfig extends AuthorizationServerConfigurerAdapter {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                // *************************************************`会员用户(买家)`****************************************************
                .withClient("member_client")
                .secret(passwordEncoder.encode("member_client_secret"))
                // 授权方式只有下面两种
                .authorizedGrantTypes("authorization_code", "refresh_token")
                .scopes("all")
                .redirectUris("http://127.0.0.1:19992/login")
                .autoApprove(true)


        ;

    }

    /**
     * 配置生成令牌
     */
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) {
        endpoints.tokenStore(jwtTokenStore()).accessTokenConverter(jwtAccessTokenConverter());
    }

    /**
     * 认证服务器安全配置
     */
    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) {
        // 访问服务器的tokenKey(下面的wangsy)时候需要身份认证
        security.tokenKeyAccess("isAuthenticated()");
    }

    @Bean
    protected TokenStore jwtTokenStore() {
        return new JwtTokenStore(jwtAccessTokenConverter());
    }

    @Bean
    public JwtAccessTokenConverter jwtAccessTokenConverter() {
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
        // 用字符串wangsy 作为jwt字符串的签名
        converter.setSigningKey("wangsy");

        return converter;
    }
}
