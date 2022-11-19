package com.csms.service;

import com.csms.domain.User;

import java.util.List;

public interface UserService {

    List<User> queryUserBySaleId(String sale_id);
}
