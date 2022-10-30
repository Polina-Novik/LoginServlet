package com.novik;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
@WebServlet("/hello")
public class MyFirstServlet extends HttpServlet {
      @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        resp.setContentType("text/html");


        String firstName = req.getParameter("first_name");
        String password = req.getParameter("password");

//        if (firstName.equals("Polina") && password.equals("Novik")) {
//            getServletContext().setAttribute("firstName", firstName);
//            System.out.println("My attribute: " + firstName);
//
//        }
    }
    @Override
    public void destroy() {
        System.out.println("Server destroyed");
    }

}