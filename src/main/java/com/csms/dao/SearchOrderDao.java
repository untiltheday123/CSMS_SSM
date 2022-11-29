package com.csms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.csms.domain.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SearchOrderDao extends BaseMapper<Orders> {
}





