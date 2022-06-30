package com.johnny.product.dao;

import com.johnny.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author johnny
 * @email johnny@qq.com
 * @date 2022-06-30 08:50:13
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
