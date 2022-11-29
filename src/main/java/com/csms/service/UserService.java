package com.csms.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.csms.domain.Salesman;
import com.csms.domain.User;

import java.util.List;

public interface UserService {

    /**
     * 根据sale_id分页查询客户
     * @param sale_id
     * @param startPage
     * @return
     */
    List<User> queryUserBySaleIdAndPage(String sale_id,int startPage);

    /**
     * 查询客户数量
     * @return
     */
    int queryUser();

    /**
     * 根据sale_id查询客户数量
     * @param sale_id
     * @return
     */
    int queryUserBySaleId(String sale_id);

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
