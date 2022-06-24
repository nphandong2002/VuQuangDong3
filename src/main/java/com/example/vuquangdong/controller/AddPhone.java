package com.example.vuquangdong.controller;

import com.example.vuquangdong.dao.PhoneDao;
import com.example.vuquangdong.entity.PhoneEntity;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddPhone", value = "/add")
public class AddPhone extends HttpServlet {
    PhoneDao dao;

    @Override
    public void init() throws ServletException {
        super.init();
        dao = new PhoneDao();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("add-phone.jsp");
        dispatcher.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String brand = req.getParameter("brand");
        String price = req.getParameter("price");
        String description = req.getParameter("description");
        PhoneEntity phone = new PhoneEntity(name,brand,price,description);
        dao.insertPhone(phone);
        RequestDispatcher dispatcher = req.getRequestDispatcher("list-phone.jsp");
        dispatcher.forward(req, resp);
    }
}
