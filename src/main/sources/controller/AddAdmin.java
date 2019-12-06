package controller;/*
@author 孙朝辉
@create 2019-11-30 下午7:37
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

@WebServlet(urlPatterns = "/AddAdmin")
public class AddAdmin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String adminName=request.getParameter("adminName");
        String adminPassword=request.getParameter("adminPassword");
        Admin ad=new Admin();
        ad.setAdminName(adminName);
        ad.setAdminPassword(adminPassword);
        long millis=System.currentTimeMillis();
        ad.setAdminSignDate(new Date(millis));
        AdminHandle.addAdmin(ad);
        request.getRequestDispatcher("/AdminShowServlet").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
