package com.csms.serviceImpl;

import com.csms.dao.UserDao;
import com.csms.domain.User;
import com.csms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> queryUserBySaleId(String sale_id) {

        return userDao.queryUserBySaleId(sale_id);
    }

    @Override
    public int queryUser() {
        return userDao.queryUser();
    }

    @Override
    public List<User> queryUserByPage(int startPage) {
        System.out.println(userDao.queryUserByPage(startPage));
        return userDao.queryUserByPage(startPage);
    }

    @Override
    public Boolean updateUser(User user) {
        int flag = userDao.updateSalesman(user.getUser_name(),user.getUser_username(),user.getUser_password(),user.getUser_phone(),user.getUser_sex(),user.getUser_address(),user.getUser_id());
        return flag > 0;
    }
}
