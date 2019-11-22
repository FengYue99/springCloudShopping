package com.zl.dao;

import com.zl.pojo.Good;

import java.util.List;

/**
 * @author fy
 */
public interface GoodDao {
    /**
     * 查询商品列表
     * @return
     */
    public List<Good> queryGood();
}
