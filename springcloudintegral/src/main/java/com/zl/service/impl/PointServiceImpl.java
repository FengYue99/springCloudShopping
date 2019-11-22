package com.zl.service.impl;

import com.zl.dao.PointDao;
import com.zl.pojo.Point;
import com.zl.service.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fy
 */
@Service
public class PointServiceImpl implements PointService {
    @Autowired
    private PointDao pd;
    /**
     * 根据用户下单金额添加积分
     *
     * @param point
     * @return
     */
    @Override
    public int addPoint(Point point) {
        return pd.addPoint(point);
    }
}
