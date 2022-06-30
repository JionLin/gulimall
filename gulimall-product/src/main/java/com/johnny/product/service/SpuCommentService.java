package com.johnny.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johnny.common.utils.PageUtils;
import com.johnny.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author johnny
 * @email johnny@qq.com
 * @date 2022-06-30 08:50:13
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

