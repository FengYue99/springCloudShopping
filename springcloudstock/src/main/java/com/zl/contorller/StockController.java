package com.zl.contorller;

import com.zl.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fy
 */
@Controller
@RequestMapping("/stock")
public class StockController {
    @Autowired
    private StockService ss;

    @ResponseBody
    @RequestMapping("/queryStock")
    public Map<String,Object> queryStock(@RequestParam("goodId") int goodId){
        Map<String,Object> map = new HashMap<>();
        int stock = ss.queryStock(goodId);
        map.put("code",200);
        map.put("stock",stock);
        map.put("message","处理完成");
        return map;
    }

    @ResponseBody
    @RequestMapping("/updateStock")
    public Map<String,Object> updateStock(@RequestParam("goodId") int goodId,@RequestParam("stockNumber") int stockNumber){
        Map<String,Object> map = new HashMap<>();
        int flag = ss.updateStock(goodId,stockNumber);
        map.put("flag",flag);
        return map;
    }
}
