package com.csms.serviceImpl;//package com.csms.service.impl;

import com.csms.dao.OrderDao;
import com.csms.domain.OrderBySalesman;
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
    public List<OrderBySalesman> queryOrderSalesman(String sale_id) {
        System.out.println(orderDao.queryOrderBySalesman(sale_id));
        return orderDao.queryOrderBySalesman(sale_id);
    }
}
