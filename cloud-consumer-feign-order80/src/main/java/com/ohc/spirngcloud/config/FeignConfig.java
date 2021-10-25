package com.ohc.spirngcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: SilenceOu
 * @Date: 2021/8/22 22:12
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel() {
        //打印最详细的日志
        return Logger.Level.FULL;
    }
}
