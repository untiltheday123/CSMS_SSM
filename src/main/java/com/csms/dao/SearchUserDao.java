package com.csms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.csms.domain.User;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface SearchUserDao extends BaseMapper<User>{
}
