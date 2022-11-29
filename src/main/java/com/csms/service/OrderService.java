package com.csms.service;//package com.csms.service;

import com.csms.domain.Orders;

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
     * @param startPage
     * @return
     */
    List<Orders> queryOrderBySalesIdByPage(String sale_id, int startPage);

    /**
     * 根据ID查询订单数量
     * @param sale_id
     * @return
     */
    int queryOrderBySalesId(String sale_id);

    /**
     * 查询订单数量
     * @return
     */
    int queryOrder();

    /**
     * 分页查询
     * @param startPage
     * @return
     */
    List<Orders> queryOrderByPage(int startPage);

    /**
     * 删除订单
     * @param order_id
     * @return
     */
    Boolean deleteOrder(String order_id);


}
