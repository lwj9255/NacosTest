package com.hhu.stock.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hhu.stock.dao.StockDao;
import com.hhu.stock.entity.StockEntity;
import com.hhu.stock.service.StockService;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl extends ServiceImpl<StockDao, StockEntity> implements StockService {
}
