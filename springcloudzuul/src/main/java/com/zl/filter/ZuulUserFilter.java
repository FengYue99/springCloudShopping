package com.zl.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author fy
 */
@Component
public class ZuulUserFilter extends ZuulFilter {
    /**
     * pre:前置调用,post:后置调用
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤器执行的顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 2;
    }

    /**
     * 判断当前请求是否拦截，拦截为true，否则false
     * @return
     */
    @Override
    public boolean shouldFilter() {
        RequestContext rc = RequestContext.getCurrentContext();
        HttpServletRequest request = rc.getRequest();
        //当前请求的路径
        String path = request.getServletPath();
        System.out.println("拦截到的请求："+path);
        HttpSession session = request.getSession();
        String userName = (String) session.getAttribute("userName");
        System.out.println(userName+"....");
        if ("/gateway/good/login".equals(path) || userName != null){
            return false;
        }
        return true;
    }

    /**
     * 拦截到的请求怎么处理
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext rc=RequestContext.getCurrentContext();
        rc.setSendZuulResponse(false);
        rc.setResponseStatusCode(401);
        return null;
    }
}
