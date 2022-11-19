package com.csms.controller;

import com.csms.domain.OrderBySalesman;
import com.csms.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("{sale_id}")
    public Result queryOrderBySalesman(@PathVariable String sale_id){
        List<OrderBySalesman> orderBySalesmen = orderService.queryOrderSalesman(sale_id);

        return new Result(orderBySalesmen != null ? Code.GET_OK : Code.GET_ERR,orderBySalesmen);
    }
}
