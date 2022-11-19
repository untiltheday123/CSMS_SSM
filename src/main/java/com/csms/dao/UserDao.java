package com.csms.dao;

import com.csms.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {
    @Select("select * from user where sale_id = #{sale_id}")
    List<User> queryUserBySaleId(@Param("sale_id") String sale_id);

}
