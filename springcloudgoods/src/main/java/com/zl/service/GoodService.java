package com.zl.service;

import com.zl.pojo.Good;

import java.util.List;

/**
 * @author fy
 */
public interface GoodService {
    /**
     * 查询商品列表
     * @return
     */
    public List<Good> queryGood();

    /**
     * 购买商品
     * @return
     */
    public int buyGood(int id);
}
