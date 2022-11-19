package com.csms.service;

import com.csms.domain.Salesman;

import java.util.List;

public interface ManagerService {

//    void save1();

    /**
     * 管理员登录的账号和密码
     * @param username
     * @param password
     * @return
     */
    Boolean mana_login(String username, String password);

    /**
     * 查询销售员信息数量
     * @return
     */
    int querySalesman();

    /**
     * 分页查询
     * @param StartPage
     * @return
     */
    List<Salesman> querySalesmanByPage(int StartPage);


    /**
     * 修改销售人员信息
     * @param salesman
     * @return
     */
    Boolean updateSalesman(Salesman salesman);
}
