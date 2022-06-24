package com.example.vuquangdong.controller;

import com.example.vuquangdong.dao.PhoneDao;
import com.example.vuquangdong.entity.PhoneEntity;

import java.io.*;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ListPhone", value = "/list")
public class ListPhone extends HttpServlet {
    PhoneDao dao;

    @Override
    public void init() throws ServletException {
        super.init();
        dao = new PhoneDao();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<PhoneEntity> phones = getAllPhone();
        request.setAttribute("phones", phones);
        RequestDispatcher dispatcher = request.getRequestDispatcher("list-phone.jsp");
        dispatcher.forward(request, response);
    }

    public void destroy() {
    }
    private List<PhoneEntity> getAllPhone() {
        List<PhoneEntity> list = dao.getAllPhone();
        for (PhoneEntity p : list){
            System.out.println(p.getName());
        }
        return dao.getAllPhone();
    }
}