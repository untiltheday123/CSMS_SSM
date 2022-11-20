package com.csms.service;

import com.csms.domain.Salesman;
import com.csms.domain.User;

import java.util.List;

public interface UserService {

    List<User> queryUserBySaleId(String sale_id);

    /**
     * 查询客户数量
     * @return
     */
    int queryUser();

    /**
     * 分页查询
     * @param startPage
     * @return
     */
    List<User> queryUserByPage(int startPage);


    /**
     * 修改客户信息
     * @param user
     * @return
     */
    Boolean updateUser(User user);
}
