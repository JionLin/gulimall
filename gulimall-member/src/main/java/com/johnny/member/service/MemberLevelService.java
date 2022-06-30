package com.johnny.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johnny.common.utils.PageUtils;
import com.johnny.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author johnny
 * @email johnny@qq.com
 * @date 2022-06-30 10:28:47
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

