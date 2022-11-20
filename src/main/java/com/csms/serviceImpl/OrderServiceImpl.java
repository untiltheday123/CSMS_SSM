package com.csms.serviceImpl;//package com.csms.service.impl;

import com.csms.dao.OrderDao;
import com.csms.domain.Order;
import com.csms.domain.User;
import com.csms.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//
//import com.csms.dao.OrderDao;
//import com.csms.dao.impl.OrderDaoImpl;
//import com.csms.service.OrderService;
//import com.csms.domain.OrderBySalesman;
//
//import java.util.List;
//
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public List<Order> queryOrderSalesman(String sale_id) {
        System.out.println(orderDao.queryOrderBySalesman(sale_id));
        return orderDao.queryOrderBySalesman(sale_id);
    }

    @Override
    public int queryOrder() {
        return orderDao.queryOrder();
    }

    @Override
    public List<Order> queryOrderByPage(int startPage) {
//        System.out.println(orderDao.queryOrderByPage(startPage));
        return orderDao.queryOrderByPage(startPage);
    }

    @Override
    public Boolean deleteOrder(String order_id){
        int deleteOrder1 = orderDao.deleteOrder1(order_id);
        int deleteOrder2 = orderDao.deleteOrder2(order_id);
        return deleteOrder1*deleteOrder2 != 0;
    }
}
