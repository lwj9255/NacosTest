package com.hhu.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hhu.order.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
}
