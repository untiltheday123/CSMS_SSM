package com.csms.service;


import com.csms.domain.GoodsByOrderId;

import java.util.List;

public interface GoodsService {

    List<GoodsByOrderId> queryGoodsByOrderId(String order_id);

}
