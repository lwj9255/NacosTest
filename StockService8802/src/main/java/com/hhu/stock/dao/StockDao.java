package com.hhu.stock.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hhu.stock.entity.StockEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDao extends BaseMapper<StockEntity> {
}
