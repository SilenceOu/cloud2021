package com.ohc.springcloud.service.impl;

import com.ohc.springcloud.dao.PaymentDao;
import com.ohc.springcloud.entities.Payment;
import com.ohc.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: SilenceOu
 * @Date: 2021/8/6 21:10
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
