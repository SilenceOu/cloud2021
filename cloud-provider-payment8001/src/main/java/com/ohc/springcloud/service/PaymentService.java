package com.ohc.springcloud.service;

import com.ohc.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Description:
 * @Author: SilenceOu
 * @Date: 2021/8/6 21:10
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
