package com.csms.dao;

import com.csms.domain.GoodsByOrderId;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GoodsDao {

    @Select("select product.pro_name,product.pro_detail,product.pro_price,orders_pro.pro_num,orders_pro.pro_total,orders.order_state,product.pro_url from orders_pro,product,orders where orders.order_id=orders_pro.order_id and orders_pro.order_id=#{order_id} and orders_pro.pro_id=product.pro_id")
    List<GoodsByOrderId> queryGoodsByOrderId(String order_id);
}
