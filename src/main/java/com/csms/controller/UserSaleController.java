package com.csms.controller;


import com.csms.domain.User;
import com.csms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userSales")
public class UserSaleController {

    @Autowired
    private UserService userService;


    /**
     * 根据sale_id分页查询客户
     * @param sale_id
     * @param startPage
     * @return
     */
    @GetMapping("/{sale_id}/{startPage}")
    public Result queryUserBySaleIdAndPage(@PathVariable String sale_id,@PathVariable int startPage){
        List<User> users = userService.queryUserBySaleIdAndPage(sale_id,startPage);
        return new Result(users != null ? Code.GET_OK : Code.GET_ERR,users);
    }


    /**
     * 根据sale_id查询客户数量
     * @param sale_id
     * @return
     */
    @GetMapping("/{sale_id}")
    public Result queryUserBySaleId(@PathVariable String sale_id){
        int num = userService.queryUserBySaleId(sale_id);
        return new Result(Code.GET_OK,num);
    }

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    @PutMapping
    public Result updateUser(@RequestBody User user){
//        System.out.println(user);
        Boolean flag = userService.updateUser(user);

        return new Result(flag?Code.UPDATE_OK:Code.UPDATE_ERR);
    }
}
