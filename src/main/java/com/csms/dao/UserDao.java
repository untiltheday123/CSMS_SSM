package com.csms.dao;

import com.csms.domain.Salesman;
import com.csms.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface UserDao {
    @Select("select * from user where sale_id = #{sale_id} limit #{startPage},10")
    List<User> queryUserBySaleIdAndPage(@Param("sale_id") String sale_id,@Param("startPage") int startPage);

    @Select("select * from user limit #{startPage},10")
    List<User> queryUserByPage(@Param("startPage") int startPage);

    @Select("select count(*) from user")
    int queryUser();

    @Select("select count(*) from user where sale_id = #{sale_id}")
    int queryUserBySaleId(@Param("sale_id") String sale_id);

    @Update("update user set user_name=#{un},user_username=#{uu},user_password=#{up},user_phone=#{upo},user_sex=#{us},user_address=#{ua} where user_id=#{ui}")
    int updateSalesman(@Param("un") String un,@Param("uu") String uu,@Param("up") String up,@Param("upo") String spo,@Param("us") String us,@Param("ua") String ua,@Param("ui") String ui);
}
