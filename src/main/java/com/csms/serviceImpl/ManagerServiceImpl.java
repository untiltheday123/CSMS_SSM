package com.csms.serviceImpl;

import com.csms.dao.ManagerDao;
import com.csms.domain.Salesman;
import com.csms.service.ManagerService;
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


//    @Override
//    public void save1() {
//        managerDaoImpl.save1();
//    }

    @Override
    public Boolean mana_login(String username, String password) {
        int num = managerDao.selectUserByUsernameAndUserPwd(username,password);
//        return managerDao.selectUserByUsernameAndUserPwd(username,password);
        return num > 0;
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


}
