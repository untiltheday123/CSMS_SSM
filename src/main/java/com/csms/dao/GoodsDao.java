package com.csms.dao;

import com.csms.domain.GoodsByOrderId;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GoodsDao {

    @Select("select product.pro_name,product.pro_detail,product.pro_price,order_pro.pro_num,order_pro.pro_total,orders.order_state,product.pro_url from order_pro,product,orders where orders.order_id=order_pro.order_id and order_pro.order_id=#{order_id} and order_pro.pro_id=product.pro_id")
    List<GoodsByOrderId> queryGoodsByOrderId(String order_id);
}
