package com.ohc.springcloud.controller;

import com.ohc.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: SilenceOu
 * @Date: 2021/8/23 22:19
 */
@RestController
@Slf4j
public class OrderNacosController {
    //@Resource
    //private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    //@GetMapping("/consumer/payment/nacos/{id}")
    //public String paymentInfo(@PathVariable("id") Long id){
    //    return restTemplate.getForObject(serverURL+"/payment/nacos/"+id,String.class);
    //}

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/feign/nacos/{id}")
    public String paymentInfo2(@PathVariable("id") Long id){
        return paymentFeignService.getPayment(id);
    }

}
