package com.laymat.elasticsearch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.laymat"))
                //.paths(PathSelectors.regex("/admin/.*"))
                .build();
    }

    private ApiInfo apiInfo() {
        var contact = new Contact("elasticsearch template project","url","email");
        return new ApiInfoBuilder()
                .title("elasticsearch template project")
                .description("elasticsearch template project")
                .termsOfServiceUrl("https://github.com/laymats")
                .contact(contact)
                .version("1.0")
                .build();
    }
}
