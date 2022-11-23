package com.csms.dao;//package com.csms.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

//
//import com.csms.domain.Salesman;
//
//import java.util.List;
//
@Mapper
public interface SalesmanDao {


    @Select("select sale_id from salesman where sale_username = #{username} and sale_password = #{userpwd}")
    String selectUserByUsernameAndUserPwd(@Param("username") String username, @Param("userpwd") String userpwd);
//
//    int querySalesman();
//
//    List<Salesman> querySalesmanByPage(int start);
}
