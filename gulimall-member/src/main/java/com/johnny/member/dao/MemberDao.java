package com.johnny.member.dao;

import com.johnny.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author johnny
 * @email johnny@qq.com
 * @date 2022-06-30 10:28:47
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
