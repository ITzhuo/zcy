package com.zcy.springboot.Filter;


import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {


    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤器");

        filterChain.doFilter(servletRequest,servletResponse);
    }
}
