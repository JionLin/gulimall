package com.johnny.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johnny.common.utils.PageUtils;
import com.johnny.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author johnny
 * @email johnny@qq.com
 * @date 2022-06-30 08:50:13
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

