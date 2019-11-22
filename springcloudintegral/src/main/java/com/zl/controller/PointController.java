package com.zl.controller;

import com.zl.pojo.Point;
import com.zl.service.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fy
 */
@Controller
@RequestMapping("/point")
public class PointController {
    @Autowired
    private PointService ps;

    @RequestMapping("/addPoint")
    @ResponseBody
    public Map<String,Object> addPoint(@RequestBody Point point){
        int flag = ps.addPoint(point);
        Map<String,Object> map = new HashMap<>();
        map.put("flag",flag);
        return map;
    }
}
