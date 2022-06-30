package com.johnny.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johnny.common.utils.PageUtils;
import com.johnny.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author johnny
 * @email johnny@qq.com
 * @date 2022-06-30 09:05:52
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

