package com.csms.dao;//package com.csms.dao;

import com.csms.domain.Orders;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderDao {

    @Select("select * from orders where sale_id = #{sale_id} limit #{startPage},10")
    List<Orders> queryOrderBySalesIdByPage(@Param("sale_id") String sale_id, @Param("startPage") int startPage);


    @Select("select count(*) from orders where sale_id = #{sale_id}")
    int queryOrderBySalesId(@Param("sale_id") String sale_id);

    @Select("select count(*) from orders")
    int queryOrder();

    @Select("select * from orders limit #{startPage},10")
    List<Orders> queryOrderByPage(@Param("startPage") int startPage);

    @Delete("delete from order_pro where order_id = #{oi}")
    int deleteOrder1(@Param("oi") String oi);
    @Delete("delete from orders where order_id = #{oi}")
    int deleteOrder2(@Param("oi") String oi);

//    o00001,2022-10-01,已完成,267.91,s00001,u00001

}
