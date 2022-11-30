package com.csms.dao;//package com.csms.dao;

import com.csms.domain.Salesman;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//
//import com.csms.domain.Salesman;
//
//import java.util.List;
//
@Mapper
public interface SalesmanDao {


    @Select("select * from salesman where sale_username = #{username} and sale_password = #{userpwd}")
    Salesman selectUserByUsernameAndUserPwd(@Param("username") String username, @Param("userpwd") String userpwd);
//
//    int querySalesman();
//
//    List<Salesman> querySalesmanByPage(int start);
}
