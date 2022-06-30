package com.johnny.ware.dao;

import com.johnny.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author johnny
 * @email johnny@qq.com
 * @date 2022-06-30 11:01:48
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
