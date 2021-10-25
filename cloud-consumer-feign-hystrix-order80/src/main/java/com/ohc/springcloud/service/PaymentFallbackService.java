package com.ohc.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: SilenceOu
 * @Date: 2021/9/25 23:57
 */
//统一为接口里面的方法进行异常处理
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService\t fallback-paymentInfo_OK----";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----PaymentFallbackService\t fallback-paymentInfo_TimeOut----";
    }
}
