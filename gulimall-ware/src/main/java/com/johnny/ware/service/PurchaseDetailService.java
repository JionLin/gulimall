package com.johnny.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johnny.common.utils.PageUtils;
import com.johnny.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author johnny
 * @email johnny@qq.com
 * @date 2022-06-30 11:01:48
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

