package com.ohc.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description:
 * @Author: SilenceOu
 * @Date: 2021/8/23 22:27
 */
@Component
@FeignClient(value = "nacos-payment-provider")
public interface PaymentFeignService {
    @GetMapping("/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Long id);
}
