package com.csms.serviceImpl;//package com.csms.service.impl;

import com.csms.dao.SalesmanDao;
import com.csms.domain.Salesman;
import com.csms.service.SalesmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//
//import com.csms.dao.SalesmanDao;
//import com.csms.dao.impl.SalesmanDaoImpl;
//import com.csms.service.SalesmanService;
//import com.csms.domain.Salesman;
//
//import java.util.List;
//
@Service
public class SalesmanServiceImpl implements SalesmanService {

//    SalesmanDao salesmanDao = new SalesmanDaoImpl();
//


    @Autowired
    private SalesmanDao salesmanDao;


    @Override
    public Salesman sale_login(String username, String userpwd) {
        return salesmanDao.selectUserByUsernameAndUserPwd(username, userpwd);
    }
//
//    @Override
//    public int querySalesman() {
//        System.out.println("SalesmanServiceImpl.querySalesman");
//        return salesmanDao.querySalesman();
//    }
//
//    @Override
//    public List<Salesman> querySalesmanByPage(int start) {
//        return salesmanDao.querySalesmanByPage(start);
//    }
}
