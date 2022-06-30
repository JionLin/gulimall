package com.johnny.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johnny.common.utils.PageUtils;
import com.johnny.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author johnny
 * @email johnny@qq.com
 * @date 2022-06-30 11:14:44
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

