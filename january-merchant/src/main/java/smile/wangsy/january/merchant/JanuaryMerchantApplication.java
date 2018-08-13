package smile.wangsy.january.merchant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

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
