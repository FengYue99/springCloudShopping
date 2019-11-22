package com.zl.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author fy
 */
//指定用来调用什么服务
@FeignClient("stock-server")

public interface StockApi {
    /**
     * 使用跟stockController中一致的方法
     * 1. 方法的签名必须和对应服务对应接口一致
     * 2. 在方法上指定对应接口的请求全路径
     * 3. 所有的参数必须使用@RequestParam注解,尤其是多个参数的方法
     * @param goodId
     * @return
     */
    @RequestMapping("/stock/queryStock")
    public String queryStock(@RequestParam("goodId") int goodId);

    /**
     * 使用跟stockController中一致的方法
     * @param goodId
     * @param stockNumber
     * @return
     */
    @RequestMapping("/stock/updateStock")
    public Map<String,Object> updateStock(@RequestParam("goodId") int goodId,@RequestParam("stockNumber") int stockNumber);
}
