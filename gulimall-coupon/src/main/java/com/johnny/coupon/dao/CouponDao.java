package com.johnny.coupon.dao;

import com.johnny.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author johnny
 * @email johnny@qq.com
 * @date 2022-06-30 09:05:52
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
