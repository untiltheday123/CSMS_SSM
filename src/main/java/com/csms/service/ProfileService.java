package com.csms.service;

import com.csms.domain.Profile;

import java.util.List;

public interface ProfileService {

    /**
     * 查询销售额
     * @return
     */
    List<Profile> querySaleTotal();

    /**
     * 查询销售的客户数量
     * @return
     */
    List<Profile> queryUserNum();

}
