package controller;/*
@author 孙朝辉
@create 2019-11-30 下午5:32
@packName ${PACKAGE_NAME}
@sys sunchaohui
@project keShe
*/

import dao.AdminHandle;
import dao.SalHandle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/AdminDelete")
public class AdminDelete extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("id"));
        AdminHandle.deleteAdmin(id);
        request.getRequestDispatcher("/AdminShowServlet").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
