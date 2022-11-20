package com.csms.dao;//package com.csms.dao;

import com.csms.domain.Order;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderDao {

    @Select("select * from orders where sale_id = #{sale_id}")
    List<Order> queryOrderBySalesman(@Param("sale_id") String sale_id);

    @Select("select count(*) from orders")
    int queryOrder();

    @Select("select * from orders limit #{startPage},10")
    List<Order> queryOrderByPage(@Param("startPage") int startPage);

    @Delete("delete from orders_pro where order_id = #{oi}")
    int deleteOrder1(@Param("oi") String oi);
    @Delete("delete from orders where order_id = #{oi}")
    int deleteOrder2(@Param("oi") String oi);

//    o00001,2022-10-01,已完成,267.91,s00001,u00001

}
