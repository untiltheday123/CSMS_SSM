package com.csms.serviceImpl;

import com.csms.dao.GoodsDao;
import com.csms.domain.GoodsByOrderId;
import com.csms.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public List<GoodsByOrderId> queryGoodsByOrderId(String order_id) {
        return goodsDao.queryGoodsByOrderId(order_id);
    }
}
