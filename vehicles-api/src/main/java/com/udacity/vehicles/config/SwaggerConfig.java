package com.udacity.vehicles.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .build()
                .useDefaultResponseMessages(false);
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Vehicles API",
                "This API serves as endpoint to track vehicle inventory. This is the project 2 of Java Web Developer Nanodegree, a course by Udacity",
                "1.0",
                "https://github.com/PaulaBuscacio",
                new Contact("Paula Buscácio", "https://github.com/PaulaBuscacio", "paulabuscacio@yahoo.com.br"),
                "License of API", "https://github.com/PaulaBuscacio", Collections.emptyList());


    }
}
