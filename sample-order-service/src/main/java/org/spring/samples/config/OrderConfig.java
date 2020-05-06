package org.spring.samples.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.client.RootUriTemplateHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriTemplateHandler;

/**
 * Configuration class for creating bean objects to be used by other classes.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 5/5/2020
 */
@Configuration
public class OrderConfig {

    @Bean()
    RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();

    }
}
