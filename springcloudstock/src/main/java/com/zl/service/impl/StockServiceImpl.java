package com.zl.service.impl;

import com.zl.dao.StockDao;
import com.zl.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fy
 */
@Service
public class StockServiceImpl implements StockService {
    @Autowired
    private StockDao sd;

    /**
     * 根据商品编号查询库存数量
     *
     * @param goodId
     * @return
     */
    @Override
    public int queryStock(int goodId) {
        return sd.queryStock(goodId);
    }

    /**
     * 通过商品编码以及每次要修改的库存数改变存库的数量
     *
     * @param goodId
     * @param stockNumber
     * @return
     */
    @Override
    public int updateStock(int goodId, int stockNumber) {
        Map<String,Integer> map = new HashMap<>();
        map.put("goodId",goodId);
        map.put("stockNumber",stockNumber);
        return sd.updateStock(map);
    }
}
