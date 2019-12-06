package controller;/*
@author 孙朝辉
@create 2019-11-30 下午2:20
@packName ${PACKAGE_NAME}
@sys sunchaohui
@project keShe
*/

import dao.AdminHandle;
import model.Admin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "AdminAlterServlet")
public class AdminAlterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String password=request.getParameter("adminPassword");
        String name=request.getParameter("adminName");
        int id=Integer.parseInt(request.getParameter("adminId"));
        Admin ad=new Admin();
        ad.setAdminName(name);
        ad.setAdminPassword(password);
        ad.setAdminId(id);
        AdminHandle.alterAdmin(ad);
        request.getRequestDispatcher("/AdminShowServlet").forward(request,response);
    }
}
