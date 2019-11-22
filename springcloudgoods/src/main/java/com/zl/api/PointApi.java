package com.zl.api;

import com.zl.api.fallBack.PointApiFallBack;
import com.zl.pojo.Point;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author fy
 */
@FeignClient(name = "integral-server",fallback = PointApiFallBack.class)
public interface PointApi {

    /**
     * 添加积分
     * @param point
     * @return
     */
    @RequestMapping("/point/addPoint")
    public Map<String,Object> addPoint(@RequestBody Point point);
}
