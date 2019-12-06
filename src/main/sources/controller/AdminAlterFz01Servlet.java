package controller;/*
@author 孙朝辉
@create 2019-11-30 下午2:35
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

@WebServlet(urlPatterns = "/AdminAlterFz01Servlet")
public class AdminAlterFz01Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("id"));
        Admin ad= AdminHandle.selectAdmin(id);
        request.setAttribute("aAdmin",ad);
        request.getRequestDispatcher("/jsp/manage/adminAlter.jsp").forward(request,response);
    }
}
