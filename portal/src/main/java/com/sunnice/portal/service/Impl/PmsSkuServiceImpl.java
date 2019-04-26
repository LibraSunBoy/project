package com.sunnice.portal.service.Impl;

import com.github.pagehelper.PageHelper;
import com.sunnice.generator.entity.PmsSkuStock;
import com.sunnice.generator.entity.PmsSkuStockExample;
import com.sunnice.generator.mapper.PmsSkuStockMapper;
import com.sunnice.portal.dao.PmsSkuDao;
import com.sunnice.portal.service.PmsSkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: JYD
 * @Date: 2019/4/26 11:49
 */
@Service
public class PmsSkuServiceImpl implements PmsSkuService {

    @Autowired
    private PmsSkuStockMapper skuStockMapper;
    @Autowired
    private PmsSkuDao skuDao;

    @Override
    public List<PmsSkuStock> queryList(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        PmsSkuStockExample example = new PmsSkuStockExample();
        return skuStockMapper.selectByExample(example);
    }

    @Override
    public Integer queryCount(Long productId) {
        return skuDao.queryCount(productId);
    }
}
