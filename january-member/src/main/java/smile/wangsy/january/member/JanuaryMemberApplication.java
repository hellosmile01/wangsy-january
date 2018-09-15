package smile.wangsy.january.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author wangsy
 */
@EnableOAuth2Sso
@SpringBootApplication
@MapperScan("smile.wangsy.january.member.mapper")
public class JanuaryMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(JanuaryMemberApplication.class, args);
    }
}
