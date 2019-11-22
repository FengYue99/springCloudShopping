package com.zl.api.fallBack;

import com.zl.api.PointApi;
import com.zl.pojo.Point;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author fy
 */
@Component
public class PointApiFallBack implements PointApi {
    /**
     * 添加积分
     *
     * @param point
     * @return
     */
    @Override
    public Map<String, Object> addPoint(Point point) {
        System.out.println("执行备用程序");
        System.out.println("积分已添加至redis数据库中");

        return null;
    }
}
