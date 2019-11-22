package com.zl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author fy
 */
@Controller
public class TestRestFul {
    @RequestMapping(value="/emp",method = RequestMethod.POST)
    public String addEmp(){
        System.out.println("这是添加方法...");
        return "main";
    }
    @RequestMapping(value="/emp/{id}",method = RequestMethod.DELETE)
    public String deleteEmp(@PathVariable("id") int id){
        System.out.println("这是删除方法...接受到的id是:"+id);
        return "main";
    }
    @RequestMapping(value="/emp/{title}/{birdate}",method = RequestMethod.PUT)
    public String updateEmp(@PathVariable("title") String title,@PathVariable("birdate") String birdate){
        System.out.println("这是修改方法..."+title+","+birdate);
        return "main";
    }
    @RequestMapping(value="/emp",method = RequestMethod.GET)
    public String queryEmp(){
        System.out.println("这是查询方法...");
        return "/main";
    }
}
