package com.csms.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.csms.dao.ManagerDao;
import com.csms.dao.SearchOrderDao;
import com.csms.dao.SearchSalesmanDao;
import com.csms.dao.SearchUserDao;
import com.csms.domain.Manager;
import com.csms.domain.Orders;
import com.csms.domain.Salesman;
import com.csms.domain.User;
import com.csms.service.ManagerService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//按名称
//@Service("managerService")
//按类型
@Service
public class ManagerServiceImpl implements ManagerService {
//    ManagerDao managerDaoImpl = new ManagerDaoImpl();

//    自动装配
    @Autowired
//    使用反射里的暴力反射强行加值
//    得有无参的构造方法（默认）
//    @Qualifier("managerDaoImpl")
//    给指定的bean加值，一般不用
    private ManagerDao managerDao;
    @Autowired
    private SearchSalesmanDao searchSalesmanDao;
    @Autowired
    private SearchUserDao searchUserDao;
    @Autowired
    private SearchOrderDao searchOrderDao;

//    @Override
//    public void save1() {
//        managerDaoImpl.save1();
//    }

    @Override
    public Manager mana_login(String username, String password) {
//        return managerDao.selectUserByUsernameAndUserPwd(username,password);
        return managerDao.selectUserByUsernameAndUserPwd(username,password);
    }

    @Override
    public int querySalesman() {
//        System.out.println("数量为"+managerDao.querySalesman());
        return managerDao.querySalesman();
    }

    @Override
    public List<Salesman> querySalesmanByPage(int startPage) {

        return managerDao.querySalesmanByPage(startPage);
    }

    @Override
    public Boolean updateSalesman(Salesman salesman) {
        int flag = managerDao.updateSalesman(salesman.getSale_username(),salesman.getSale_password(),salesman.getSale_phone(),salesman.getSale_sex(),salesman.getSale_id());
        return flag > 0;
    }

    @Override
    public IPage<Salesman> querySalesmanCondition(int startPage, Salesman salesman) {
        LambdaQueryWrapper<Salesman> lqw = new LambdaQueryWrapper<Salesman>();
        lqw.like(Strings.isNotEmpty(salesman.getSale_username()),Salesman::getSale_username,salesman.getSale_username());
        lqw.like(Strings.isNotEmpty(salesman.getSale_name()),Salesman::getSale_name,salesman.getSale_name());
        lqw.like(Strings.isNotEmpty(salesman.getSale_phone()),Salesman::getSale_phone,salesman.getSale_phone());
        lqw.like(Strings.isNotEmpty(salesman.getSale_id()),Salesman::getSale_id,salesman.getSale_id());
        IPage page = new Page(startPage,10);
        searchSalesmanDao.selectPage(page,lqw);
//        System.out.println(page.getRecords());
        return page;
    }

    @Override
    public IPage<User> queryClientCondition(int startPage, User user) {
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
        lqw.like(Strings.isNotEmpty(user.getUser_username()),User::getUser_username,user.getUser_username());
        lqw.like(Strings.isNotEmpty(user.getUser_name()),User::getUser_name,user.getUser_name());
        lqw.like(Strings.isNotEmpty(user.getUser_phone()),User::getUser_phone,user.getUser_phone());
        lqw.like(Strings.isNotEmpty(user.getUser_id()),User::getUser_id,user.getUser_id());
        lqw.like(Strings.isNotEmpty(user.getSale_id()),User::getSale_id,user.getSale_id());
        IPage page = new Page(startPage,10);
        searchUserDao.selectPage(page,lqw);
//        System.out.println(page.getRecords());
        return page;
    }

    @Override
    public IPage<Orders> queryOrderCondition(int startPage, Orders order) {

        LambdaQueryWrapper<Orders> lqw = new LambdaQueryWrapper<Orders>();
        lqw.like(Strings.isNotEmpty(order.getOrder_id()), Orders::getOrder_id, order.getOrder_id());
        lqw.like(Strings.isNotEmpty(order.getOrder_state()), Orders::getOrder_state, order.getOrder_state());
        lqw.like(Strings.isNotEmpty(order.getOrder_time()), Orders::getOrder_time, order.getOrder_time());
        lqw.like(Strings.isNotEmpty(order.getUser_id()), Orders::getUser_id, order.getUser_id());
        lqw.like(Strings.isNotEmpty(order.getSale_id()), Orders::getSale_id, order.getSale_id());
        IPage page = new Page(startPage, 10);
        searchOrderDao.selectPage(page, lqw);
        System.out.println(page.getRecords());
        return page;

    }
}
