package com.csms.service;//package com.csms.service;

import com.csms.domain.OrderBySalesman;

import java.util.List;

//
//import com.csms.domain.OrderBySalesman;
//
//import java.util.List;
//
public interface OrderService {

    /**
     * 根据ID查询订单
     * @param sale_id
     * @return
     */
    List<OrderBySalesman> queryOrderSalesman(String sale_id);
}
