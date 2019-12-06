package controller;/*
@author 孙朝辉
@create 2019-11-30 下午3:49
@packName ${PACKAGE_NAME}
@sys sunchaohui
@project keShe
*/

import dao.AdminHandle;
import dao.DeptHandle;
import model.Admin;
import model.DeptDesc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/DeptAlterFz01Servlet")
public class DeptAlterFz01Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("id"));
        DeptDesc deptDesc= DeptHandle.selectDept(id);
        request.setAttribute("aDept",deptDesc);
        request.getRequestDispatcher("/jsp/manage/deptAlter.jsp").forward(request,response);
    }
}
