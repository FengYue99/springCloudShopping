package com.zl.controller;

import com.zl.pojo.Good;
import com.zl.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author fy
 */
@Controller
@RequestMapping("/good")
public class GoodController {
    @Autowired
    private GoodService gs;

    /**
     * 查询出商品列表
     * @return
     */
    @RequestMapping("/queryGood")
    public ModelAndView queryGood(){
        ModelAndView mv = new ModelAndView();
        List<Good> goods = gs.queryGood();
        mv.addObject("goods",goods);
        mv.setViewName("goodList");
        return mv;
    }

    @RequestMapping("/buyGood")
    public ModelAndView buyGood(int id){
        System.out.println("test....");
        ModelAndView mv = new ModelAndView();
        gs.buyGood(id);
        mv.setViewName("aa");
        return mv;
    }

    @RequestMapping("/login")
    public ModelAndView login(HttpSession session){
        ModelAndView mv = new ModelAndView();
        session.setAttribute("userName","aaa");
        System.out.println("登录成功");
        mv.setViewName("queryGood");
        return mv;
    }
}
