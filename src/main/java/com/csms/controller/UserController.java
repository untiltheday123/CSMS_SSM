package com.csms.controller;


import com.csms.domain.User;
import com.csms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{sale_id}")
    public Result queryUserBySaleId(@PathVariable String sale_id){
        List<User> users = userService.queryUserBySaleId(sale_id);
        return new Result(users != null ? Code.GET_OK : Code.GET_ERR,users);
    }
}
