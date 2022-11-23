package com.csms.controller;

import com.csms.domain.GoodsByOrderId;
import com.csms.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("{order_id}")
    public Result queryGoodsByOrderId(@PathVariable String order_id){
        List<GoodsByOrderId> goodsByOrderIds = goodsService.queryGoodsByOrderId(order_id);

        return new Result(goodsByOrderIds != null ? Code.GET_OK : Code.GET_ERR,goodsByOrderIds);
    }
}
