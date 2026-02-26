package io.github.sarvis.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import io.github.sarvis.client.SarvisClient;
import io.github.sarvis.properties.SarvisProperties;

@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(SarvisProperties.class)
public class SarvisAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    @ConditionalOnMissingBean
    public SarvisClient sarvisClient(
            SarvisProperties properties,
            RestTemplate restTemplate
    ) {
        return new SarvisClient(properties, restTemplate);
    }
}