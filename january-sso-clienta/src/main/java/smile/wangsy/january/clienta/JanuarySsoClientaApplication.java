package smile.wangsy.january.clienta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@EnableOAuth2Client
@SpringBootApplication
public class JanuarySsoClientaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JanuarySsoClientaApplication.class, args);
	}
}
