package com.zl.service.impl;

import com.zl.api.PointApi;
import com.zl.api.StockApi;
import com.zl.dao.GoodDao;
import com.zl.pojo.Good;
import com.zl.pojo.Point;
import com.zl.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author fy
 */
@Service
public class GoodServiceImpl implements GoodService {
    @Autowired
    private GoodDao gd;
    @Autowired
    private StockApi sa;
    @Autowired
    private PointApi pa;
    /**
     * 查询商品列表
     * @return
     */
    @Override
    public List<Good> queryGood() {
        return gd.queryGood();
    }

    /**
     * 购买商品
     *
     * @param id
     * @return
     */
    @Override
    public int buyGood(int id) {
        //查询库存
        String result = sa.queryStock(id);
        System.out.println("result:"+result);
        //减去购买数量
        Map<String,Object> map = sa.updateStock(id,10);
        System.out.println(map.get("flag")+"减数量");
        //购买商品添加积分
        Point p = new Point();
        p.setUserId(1);
        p.setPointNumber(200);
        p.setPointType(2);
        p.setPointDate(new Date());
        Map<String,Object> map1 = pa.addPoint(p);
        if (map1 != null){
            System.out.println(map1.get("flag")+"......map1.....");
        }else {
            System.out.println("备用程序执行完成");
        }
        return 1;
    }
}
