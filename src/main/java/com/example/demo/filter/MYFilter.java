package com.example.demo.filter;

import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import java.io.IOException;


public class MYFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("new filter is called");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}