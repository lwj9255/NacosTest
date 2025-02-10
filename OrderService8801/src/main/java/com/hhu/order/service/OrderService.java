package com.hhu.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hhu.order.entity.OrderEntity;

public interface OrderService extends IService<OrderEntity> {
    String create();
}
