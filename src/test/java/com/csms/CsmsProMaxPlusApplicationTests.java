package com.csms;

import com.csms.dao.ManagerDao;
import com.csms.service.ManagerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CsmsProMaxPlusApplicationTests {

    @Autowired
    private ManagerDao managerDao ;

    @Test
    void contextLoads() {
//        managerDao.selectById();
    }

}
