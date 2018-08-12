package smile.wangsy.january.merchant;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author smile
 */
@SpringBootApplication
@MapperScan("smile.wangsy.january.merchant.mapper")
public class JanuaryMerchantApplication {

    public static void main(String[] args) {
        SpringApplication.run(JanuaryMerchantApplication.class, args);
    }
}
