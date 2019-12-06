package controller;/*
@author 孙朝辉
@create 2019-11-30 下午1:37
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
import java.util.List;

@WebServlet(name = "AdminShowServlet")
public class AdminShowServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Admin> list=AdminHandle.showAllAdmin();
        request.setAttribute("allAdmin",list);
        request.getRequestDispatcher("/jsp/manage/admin.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
