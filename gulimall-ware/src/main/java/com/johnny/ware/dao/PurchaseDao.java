package com.johnny.ware.dao;

import com.johnny.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author johnny
 * @email johnny@qq.com
 * @date 2022-06-30 11:01:48
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
