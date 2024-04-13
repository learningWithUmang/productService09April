package dev.umang.productservice09april.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfiguration {
    /*
    first object that you would want to be injectible is RestTemplate
     */

    @Bean
    public RestTemplate createRestTemplate(){
        return new RestTemplate();
    }
}
