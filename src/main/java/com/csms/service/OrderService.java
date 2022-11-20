package com.csms.service;//package com.csms.service;

import com.csms.domain.Order;
import com.csms.domain.User;

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
    List<Order> queryOrderSalesman(String sale_id);

    /**
     * 查询客户数量
     * @return
     */
    int queryOrder();

    /**
     * 分页查询
     * @param startPage
     * @return
     */
    List<Order> queryOrderByPage(int startPage);

    /**
     * 删除订单
     * @param order_id
     * @return
     */
    Boolean deleteOrder(String order_id);
}
