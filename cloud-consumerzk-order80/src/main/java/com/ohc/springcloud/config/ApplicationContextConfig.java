package com.ohc.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Author: SilenceOu
 * @Date: 2021/8/12 19:11
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced       //负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
