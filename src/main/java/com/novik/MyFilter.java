package com.novik;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;



    public class MyFilter implements Filter {



        public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
            System.out.println("ip: " + servletRequest.getRemoteAddr());
           HttpServletRequest req= (HttpServletRequest) servletRequest;
        String s= (String) req.getSession().getAttribute("firstName");

        if(s=="Polina") {
            filterChain.doFilter(servletRequest,servletResponse);

        } else {
          req.getRequestDispatcher("error.html").forward(servletRequest,servletResponse);

        }
        }
    }


