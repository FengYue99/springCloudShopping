package com.zl.dao;

import com.zl.pojo.Point;

/**
 * @author fy
 */
public interface PointDao {
    /**
     * 根据用户下单金额添加积分
     * @param point
     * @return
     */
    public int addPoint(Point point);
}
