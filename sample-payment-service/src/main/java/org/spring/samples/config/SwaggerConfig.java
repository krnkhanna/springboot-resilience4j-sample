package org.spring.samples.config;

import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Configuration class for creating beans to be used by swagger.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 5/5/2020
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket swagConfig(){
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("org.spring.samples.controllers"))
                .build()
                .apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo() {
        return new ApiInfo("Payment Service",
                "Documentation for Payment Service",
                "1.0",
                "",
                new Contact("Karan Khanna","","krnkhanna1989@gmail.com"),
                "",
                "",
                new ArrayList<>()
        );
    }

}
