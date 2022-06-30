package com.johnny.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johnny.common.utils.PageUtils;
import com.johnny.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author johnny
 * @email johnny@qq.com
 * @date 2022-06-30 11:01:48
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

