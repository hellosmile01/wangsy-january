package smile.wangsy.january.merchant.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author: wangsy
 * @date: 2018/8/12 21:07
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("smile.wangsy.january.merchant.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("在线餐厅订座系统")
                .description("在线餐厅订座系统")
                .termsOfServiceUrl("https://smilewangsy.github.io")
                .contact("smilewangsy@outlook.com")
                .version("v1.0")
                .build();
    }
}
