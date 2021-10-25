package com.ohc.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Description:
 * @Author: SilenceOu
 * @Date: 2021/8/22 20:12
 */
public interface LoadBalancer {
    //传入具体实例的集合，返回选中的实例
    ServiceInstance instances(List<ServiceInstance> serviceInstance);
}
