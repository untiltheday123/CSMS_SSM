package com.csms.controller;


import com.csms.domain.Salesman;
import com.csms.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/managers")
public class ManagerController {
    @Autowired
    private ManagerService managerService;

    /**
     * 查询人数
     * @return
     */
    @GetMapping
    public Result querySalesman(){
        int salesman_num = managerService.querySalesman();
        return new Result(Code.GET_OK,salesman_num);
    }

    /**
     * 分页查询
     * @param page
     * @return
     */
    @GetMapping("/{page}")
    public Result querySalesmanByPage(@PathVariable int page){
//        int startPage = (page - 1) * 10;
        List<Salesman> salesmenByPage = managerService.querySalesmanByPage(page);
        return new Result(salesmenByPage != null ? Code.GET_OK : Code.GET_ERR,salesmenByPage);
    }

    /**
     * 修改销售人员信息
     * @param salesman
     * @return
     */
    @PutMapping
    public Result updateSalesman(@RequestBody Salesman salesman){
        Boolean flag = managerService.updateSalesman(salesman);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR);
    }
}
