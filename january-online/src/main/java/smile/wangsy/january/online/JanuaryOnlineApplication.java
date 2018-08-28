package smile.wangsy.january.online;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author wangsy
 */
@SpringBootApplication
@MapperScan("smile.wangsy.january.online.mapper")
public class JanuaryOnlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(JanuaryOnlineApplication.class, args);
	}
}
