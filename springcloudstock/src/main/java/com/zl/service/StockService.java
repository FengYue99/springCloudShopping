package com.zl.service;

import java.util.Map;

/**
 * @author fy
 */
public interface StockService {
    /**
     * 根据商品编号查询库存数量
     * @param goodId
     * @return
     */
    public int queryStock(int goodId);

    /**
     * 通过商品编码以及每次要修改的库存数改变存库的数量
     * @param goodId
     * @param stockNumber
     * @return
     */
    public int updateStock(int goodId, int stockNumber);
}
