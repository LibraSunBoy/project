package com.sunnice.portal.service.Impl;

import com.github.pagehelper.PageHelper;
import com.sunnice.generator.entity.UmsAdmin;
import com.sunnice.generator.entity.UmsAdminExample;
import com.sunnice.generator.mapper.UmsAdminMapper;
import com.sunnice.portal.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: JYD
 * @Date: 2019/4/26 17:10
 */
@Service
public class UmsAdminServiceImpl implements UmsAdminService {
    @Autowired
    private UmsAdminMapper adminMapper;
    @Override
    public List<UmsAdmin> queryList(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<UmsAdmin> umsAdmins = adminMapper.selectByExample(new UmsAdminExample());
        return umsAdmins;
    }
}
