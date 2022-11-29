package com.csms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.csms.domain.Salesman;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SearchSalesmanDao extends BaseMapper<Salesman> {
}
