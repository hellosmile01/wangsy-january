package smile.wangsy.january.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

/**
 * https://www.jianshu.com/p/d94bb118aa43
 * https://github.com/eugenp/tutorials/tree/master/spring-security-sso
 * https://blog.csdn.net/huhanguang89/article/details/62045095
 *
 * https://www.cnblogs.com/cjsblog/p/9296361.html
 */
@SpringBootApplication
public class JanuaryAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(JanuaryAuthApplication.class, args);
	}
}
