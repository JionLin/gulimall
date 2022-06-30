package com.johnny.order.dao;

import com.johnny.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author johnny
 * @email johnny@qq.com
 * @date 2022-06-30 11:14:44
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
