package controller;/*
@author 孙朝辉
@create 2019-11-30 下午4:25
@packName ${PACKAGE_NAME}
@sys sunchaohui
@project keShe
*/

import dao.AdminHandle;
import dao.StaffHandle;
import model.Admin;
import model.StaffDesc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/StaffAlterFz01Servlet")
public class StaffAlterFz01Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("id"));
        StaffDesc sd= StaffHandle.selectAStaff(id);
        request.setAttribute("aStaff",sd);
        request.getRequestDispatcher("/jsp/manage/staffAlter.jsp").forward(request,response);
    }
}
