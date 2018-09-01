package smile.wangsy.january.wechat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author wangsy
 */
@SpringBootApplication
@MapperScan("smile.wangsy.january.wechat.mapper")
public class JanuaryWechatApplication {

	public static void main(String[] args) {
		SpringApplication.run(JanuaryWechatApplication.class, args);
	}
}
