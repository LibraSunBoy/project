package com.sunnice.portal.service;

import com.sunnice.generator.entity.UmsAdmin;

import java.util.List;

/**
 * @Author: JYD
 * @Date: 2019/4/26 17:09
 */
public interface UmsAdminService {
    List<UmsAdmin> queryList(Integer pageNum,Integer pageSize);
}
