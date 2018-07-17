package org.shancm.swagger.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author shancm
 * @pachage org.shancm.swagger.bean
 * @description:
 * @date 2018/6/12
 */
@EnableSwagger2
@Configuration
public class SwaggerConfig extends WebMvcConfigurerAdapter {


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars*")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //扫描com路径下的api文档
                .apis(RequestHandlerSelectors.basePackage("org.shancm.swagger"))
                //路径判断
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("《----我是title-----》")
                .description("《-----我是描述----》：http://www.google.com.hk")
                //（不可见）条款地址
                .termsOfServiceUrl("http://www.google.com.hk")
                //作者信息
                .contact(new Contact("zz","google.com.hk","123@qq.com"))
                .version("6.6.6")
                .build();
    }
}
