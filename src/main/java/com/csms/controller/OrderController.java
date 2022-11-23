package com.csms.controller;

import com.csms.domain.Order;
import com.csms.domain.User;
import com.csms.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("{sale_id}")
    public Result queryOrderBySalesman(@PathVariable String sale_id){
        List<Order> orderBySalesmen = orderService.queryOrderSalesman(sale_id);
        return new Result(orderBySalesmen != null ? Code.GET_OK : Code.GET_ERR,orderBySalesmen);
    }

    //    方法名不够了
    @GetMapping("/{startPage}/{ccc}")
    public Result queryOrderByPage(@PathVariable int startPage,@PathVariable String ccc){
        List<Order> orders = orderService.queryOrderByPage(startPage);
        return new Result(orders != null ? Code.GET_OK : Code.GET_ERR,orders);
    }

    @GetMapping
    public Result queryOrder(){
        int num = orderService.queryOrder();
        return new Result(Code.GET_OK,num);
    }

    @DeleteMapping("/{order_id}")
    public Result deleteOrder(@PathVariable String order_id){

        Boolean flag = orderService.deleteOrder(order_id);
        return new Result(flag?Code.DELETE_OK:Code.DELETE_ERR,flag);
    }

}
