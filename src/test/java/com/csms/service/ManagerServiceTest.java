package com.csms.service;






//需要4.12或更高版本的Junit

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ManagerServiceTest {

    @Autowired
    private ManagerService managerService;

    @Test
    public void login(){
        System.out.println("11111111111");
        System.out.println(managerService.mana_login("zzy","123"));
//        return managerService.mana_login("zzy","123");
    }


}
