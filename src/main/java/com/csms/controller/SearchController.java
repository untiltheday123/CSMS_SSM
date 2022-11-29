package com.csms.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.csms.domain.Orders;
import com.csms.domain.Salesman;
import com.csms.domain.User;
import com.csms.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class SearchController {

    @Autowired
    private ManagerService managerService;

//    @RequestMapping("")
    @RequestMapping(path = "/querySalesman/{currentPage}",method = RequestMethod.GET)
    public Result querySalesmanCondition(@PathVariable int currentPage,  Salesman salesman){
//        System.out.println(salesman);
        IPage<Salesman> salesmanIPage = managerService.querySalesmanCondition(currentPage, salesman);
//        System.out.println(salesmanIPage);
        return new Result(salesmanIPage!=null?Code.GET_OK:Code.GET_ERR,salesmanIPage);
    }

    @RequestMapping(path = "/queryClient/{currentPage}",method = RequestMethod.GET)
    public Result queryClientCondition(@PathVariable int currentPage,  User user){
//        System.out.println(salesman);
        IPage<User> userIPage = managerService.queryClientCondition(currentPage, user);
//        System.out.println(salesmanIPage);
        return new Result(userIPage!=null?Code.GET_OK:Code.GET_ERR,userIPage);
    }

    @RequestMapping(path = "/queryOrder/{currentPage}",method = RequestMethod.GET)
    public Result queryOrderCondition(@PathVariable int currentPage,  Orders order){
        System.out.println(order);
        IPage<Orders> orderIPage = managerService.queryOrderCondition(currentPage, order);
//        System.out.println(salesmanIPage);
        return new Result(orderIPage!=null?Code.GET_OK:Code.GET_ERR,orderIPage);
    }
}
