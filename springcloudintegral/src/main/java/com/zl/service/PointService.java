package com.zl.service;

import com.zl.pojo.Point;

/**
 * @author fy
 */
public interface PointService {
    /**
     * 根据用户下单金额添加积分
     * @param point
     * @return
     */
    public int addPoint(Point point);
}
