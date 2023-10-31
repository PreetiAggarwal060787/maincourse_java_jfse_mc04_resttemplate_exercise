package com.stackroute.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
@Configuration("appBeanConfig")
public class BeanConfig {
    /**
     * Creates a bean for RestTemplate with the name "restTemplate".
     * @return RestTemplate bean
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}