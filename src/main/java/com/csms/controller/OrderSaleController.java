package com.csms.controller;

import com.csms.domain.Orders;
import com.csms.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orderSales")
public class OrderSaleController {

    @Autowired
    private OrderService orderService;

    /**
     * 根据Id分页查询订单
     * @param sale_id
     * @param startPage
     * @return
     */
    @GetMapping("/{sale_id}/{startPage}")
    public Result queryOrderBySalesIdByPage(@PathVariable String sale_id, @PathVariable int startPage){
        List<Orders> orderBySalesmen = orderService.queryOrderBySalesIdByPage(sale_id,startPage);
        return new Result(orderBySalesmen != null ? Code.GET_OK : Code.GET_ERR,orderBySalesmen);
    }

    /**
     * 根据Id查询订单数量
     * @return
     */
    @GetMapping("/{sale_id}")
    public Result queryOrderBySalesId(@PathVariable String sale_id){
        int num = orderService.queryOrderBySalesId(sale_id);
        return new Result(Code.GET_OK,num);
    }
}
