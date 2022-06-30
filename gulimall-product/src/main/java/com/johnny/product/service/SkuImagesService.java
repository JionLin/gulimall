package com.johnny.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johnny.common.utils.PageUtils;
import com.johnny.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author johnny
 * @email johnny@qq.com
 * @date 2022-06-30 08:50:13
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

