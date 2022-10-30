package com.novik;

import jakarta.servlet.*;

import java.io.IOException;

public class MyFirstFilter implements Filter {



    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("ip: " + servletRequest.getRemoteAddr());
        String s= (String) servletRequest.getServletContext().getAttribute("firstName");

        if(s=="Polina") {
            filterChain.doFilter(servletRequest,servletResponse);
            servletRequest.getRequestDispatcher("success.html").forward(servletRequest,servletResponse);
        } else {
            servletRequest.getRequestDispatcher("error.html").forward(servletRequest,servletResponse);
        }
    }
}
