package com.csms.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.csms.domain.Orders;
import com.csms.domain.Salesman;
import com.csms.domain.User;

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
     * @param startPage
     * @return
     */
    List<Salesman> querySalesmanByPage(int startPage);


    /**
     * 修改销售人员信息
     * @param salesman
     * @return
     */
    Boolean updateSalesman(Salesman salesman);


    /**
     * 条件查询
     * @param startPage
     * @param salesman
     * @return
     */
    IPage<Salesman> querySalesmanCondition(int startPage, Salesman salesman);


    /**
     * 条件查询
     * @param startPage
     * @param user
     * @return
     */
    IPage<User> queryClientCondition(int startPage, User user);


    /**
     * 条件查询
     * @param startPage
     * @param order
     * @return
     */
    IPage<Orders> queryOrderCondition(int startPage, Orders order);
}
