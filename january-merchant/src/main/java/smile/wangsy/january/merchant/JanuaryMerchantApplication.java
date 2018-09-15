package smile.wangsy.january.merchant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.context.properties.ConfigurationProperties;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author wangsy
 */
@SpringBootApplication
@MapperScan("smile.wangsy.january.merchant.mapper")
public class JanuaryMerchantApplication {

    public static void main(String[] args) {
        SpringApplication.run(JanuaryMerchantApplication.class, args);
    }
}
