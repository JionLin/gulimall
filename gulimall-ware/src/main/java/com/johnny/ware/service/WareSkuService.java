package com.johnny.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johnny.common.utils.PageUtils;
import com.johnny.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author johnny
 * @email johnny@qq.com
 * @date 2022-06-30 11:01:48
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

