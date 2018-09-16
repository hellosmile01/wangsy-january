package smile.wangsy.january.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author wangsy
 */
@SpringBootApplication
@MapperScan("smile.wangsy.january.member.mapper")
public class JanuaryMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(JanuaryMemberApplication.class, args);
    }
}
