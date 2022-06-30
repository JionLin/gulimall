package com.johnny.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johnny.common.utils.PageUtils;
import com.johnny.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author johnny
 * @email johnny@qq.com
 * @date 2022-06-30 11:14:44
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

