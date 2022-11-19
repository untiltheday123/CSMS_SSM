package com.csms.dao;//package com.csms.dao;

import com.csms.domain.OrderBySalesman;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//
//import com.csms.domain.OrderBySalesman;
//
//import java.util.List;
//
@Mapper
public interface OrderDao {

    @Select("select * from orders where sale_id = #{sale_id}")
    List<OrderBySalesman> queryOrderBySalesman(@Param("sale_id") String sale_id);
}
