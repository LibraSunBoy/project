package com.sunnice.portal.service;

import com.sunnice.generator.entity.UmsAdmin;

import java.util.List;

/**
 * @Author: JYD
 * @Date: 2019/4/26 17:09
 */
public interface UmsAdminService {
    /**
     * 查询后台用户列表
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<UmsAdmin> queryList(Integer pageNum,Integer pageSize);

    /**
     * 重置密码（默认为000000）
     * @param adminId
     * @return
     */
    int resetPassword(Long adminId);
}
