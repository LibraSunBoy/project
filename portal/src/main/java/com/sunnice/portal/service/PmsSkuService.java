package com.sunnice.portal.service;

import com.sunnice.generator.entity.PmsSkuStock;

import java.util.List;

/**
 * @Author: JYD
 * @Date: 2019/4/26 11:31
 */
public interface PmsSkuService {

    List<PmsSkuStock> queryList(Integer pageNum,Integer pageSize);

    Integer queryCount(Long productId);
}
