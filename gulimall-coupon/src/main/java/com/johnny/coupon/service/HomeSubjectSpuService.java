package com.johnny.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johnny.common.utils.PageUtils;
import com.johnny.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author johnny
 * @email johnny@qq.com
 * @date 2022-06-30 09:05:52
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

