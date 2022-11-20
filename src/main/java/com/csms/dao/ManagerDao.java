package com.csms.dao;

import com.csms.domain.Salesman;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


//TODO 添加@Mapper
@Mapper
public interface ManagerDao {

//    void save1();

//    @Select("select count(*) from manager where mana_username = #{username} and mana_password = #{userpwd}")
//    int selectUserByUsernameAndUserPwd(@Param("username") String username, @Param("userpwd") String userpwd);


    @Select("select count(*) from manager where mana_username = #{username} and mana_password = #{userpwd}")
    int selectUserByUsernameAndUserPwd(@Param("username") String username, @Param("userpwd") String userpwd);

    @Select("select count(*) from salesman")
    int querySalesman();

    @Select("select * from salesman limit #{startPage},10")
    List<Salesman> querySalesmanByPage(@Param("startPage") int startPage);

    @Update("update salesman set sale_username=#{su},sale_password=#{sp},sale_phone=#{spo},sale_sex=#{ss} where sale_id=#{si}")
    int updateSalesman(@Param("su") String su,@Param("sp") String sp,@Param("spo") String spo,@Param("ss") String ss,@Param("si") String si);
}
