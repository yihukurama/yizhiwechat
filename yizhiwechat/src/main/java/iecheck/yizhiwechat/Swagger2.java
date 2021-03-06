/**
 * 功能描述: 
 * @Author:Administrator
 * @Date:2016年10月4日 下午12:31:47
 */
package iecheck.yizhiwechat;

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
 * 功能描述: 
 * @Author:Dengshuai
 * @Date:2016年10月4日 下午12:31:47
 */

@Configuration
@EnableSwagger2
public class Swagger2 {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("iecheck.yizhiwechat.framework.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger2构建RESTful APIs 文档")
                .description("定制开发接口文档")
                .termsOfServiceUrl("http://www.iecheck.com/")
                .contact("我的工作室")
                .version("1.0")
                .build();
    }
}
