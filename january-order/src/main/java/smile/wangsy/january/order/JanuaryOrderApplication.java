package smile.wangsy.january.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author wangsy
 */
@SpringBootApplication
@MapperScan("smile.wangsy.january.order.mapper")
public class JanuaryOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(JanuaryOrderApplication.class, args);
	}
}
