package com.sunnice.portal.dao;

import org.apache.ibatis.annotations.Param;


/**
 * @Author: JYD
 * @Date: 2019/4/26 14:34
 */
public interface PmsSkuDao {
    Integer queryCount(@Param("id") Long productId);
}
