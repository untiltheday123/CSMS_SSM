package com.csms.controller;


import com.csms.domain.User;
import com.csms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

//    /**
//     * 根据sale_id查询客户
//     * @param sale_id
//     * @return
//     */
//    @GetMapping("/{sale_id}")
//    public Result queryUserBySaleId(@PathVariable String sale_id){
//        List<User> users = userService.queryUserBySaleId(sale_id);
//        return new Result(users != null ? Code.GET_OK : Code.GET_ERR,users);
//    }

//    方法名不够了
    @GetMapping("/{startPage}")
    public Result queryUserByPage(@PathVariable int startPage){
        List<User> users = userService.queryUserByPage(startPage);
        return new Result(users != null ? Code.GET_OK : Code.GET_ERR,users);
    }

    @GetMapping
    public Result queryUser(){
        int num = userService.queryUser();
        return new Result(Code.GET_OK,num);
    }

    @PutMapping
    public Result updateUser(@RequestBody User user){
//        System.out.println(user);
        Boolean flag = userService.updateUser(user);

        return new Result(flag?Code.UPDATE_OK:Code.UPDATE_ERR);
    }
}
