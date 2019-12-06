package controller;/*
@author 孙朝辉
@create 2019-11-30 下午5:03
@packName ${PACKAGE_NAME}
@sys sunchaohui
@project keShe
*/

import dao.AdminHandle;
import dao.SalHandle;
import model.Admin;
import model.SalDesc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/SalAlterFz01Servlet")
public class SalAlterFz01Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("id"));
        SalDesc sd= SalHandle.selectSal(id);
        request.setAttribute("aSal",sd);
        request.getRequestDispatcher("/jsp/manage/salAlter.jsp").forward(request,response);
    }
}
