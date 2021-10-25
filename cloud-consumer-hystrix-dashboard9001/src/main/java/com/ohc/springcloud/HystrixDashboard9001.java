package com.ohc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Description:
 * @Author: SilenceOu
 * @Date: 2021/10/22 9:34
 */
@EnableHystrixDashboard //启用Hystrix仪表板
@SpringBootApplication
public class HystrixDashboard9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard9001.class, args);
    }
}
