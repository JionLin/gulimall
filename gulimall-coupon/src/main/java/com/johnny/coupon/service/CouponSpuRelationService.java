package com.johnny.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johnny.common.utils.PageUtils;
import com.johnny.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author johnny
 * @email johnny@qq.com
 * @date 2022-06-30 09:05:52
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

