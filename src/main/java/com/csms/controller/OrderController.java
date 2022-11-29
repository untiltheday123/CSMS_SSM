package com.csms.controller;

import com.csms.domain.Orders;
import com.csms.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;


    //    方法名不够了

    /**
     * 分页查询所有的订单
     * @param startPage
     * @return
     */
    @GetMapping("/{startPage}")
    public Result queryOrderByPage(@PathVariable int startPage){
        List<Orders> orders = orderService.queryOrderByPage(startPage);
        return new Result(orders != null ? Code.GET_OK : Code.GET_ERR,orders);
    }

    /**
     * 查询所有订单数量
     * @return
     */
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
