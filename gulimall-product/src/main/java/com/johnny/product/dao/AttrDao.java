package com.johnny.product.dao;

import com.johnny.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author johnny
 * @email johnny@qq.com
 * @date 2022-06-30 08:50:13
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
