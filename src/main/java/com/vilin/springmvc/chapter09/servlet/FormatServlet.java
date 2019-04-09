package com.vilin.springmvc.chapter09.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet(urlPatterns = "/format")
public class FormatServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Date today = new Date();
        request.setAttribute("now", today);

        RequestDispatcher rd = request.getRequestDispatcher("/jsp/chapter09/format.jsp");
        rd.forward(request, response);
    }
}
