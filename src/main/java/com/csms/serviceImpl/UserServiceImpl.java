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
}
