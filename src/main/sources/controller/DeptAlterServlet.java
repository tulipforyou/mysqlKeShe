package controller;/*
@author 孙朝辉
@create 2019-11-30 下午4:12
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

@WebServlet(urlPatterns = "/DeptAlterServlet")
public class DeptAlterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String deptName=request.getParameter("deptName");
        String deptAddr=request.getParameter("deptAddr");
        int id=Integer.parseInt(request.getParameter("deptId"));
        DeptDesc dd=new DeptDesc();
        dd.setDeptId(id);
        dd.setDeptName(deptName);
        dd.setDeptAddr(deptAddr);
        DeptHandle.alterDept(dd);
        request.getRequestDispatcher("/DeptShowServlet").forward(request,response);

    }
}
