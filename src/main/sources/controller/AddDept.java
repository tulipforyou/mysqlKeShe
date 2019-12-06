package controller;/*
@author 孙朝辉
@create 2019-11-30 下午7:22
@packName ${PACKAGE_NAME}
@sys sunchaohui
@project keShe
*/

import dao.DeptHandle;
import model.DeptDesc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/AddDept")
public class AddDept extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String deptName=request.getParameter("deptName");
        String deptAddr=request.getParameter("deptAddr");
        DeptDesc dd=new DeptDesc();
        dd.setDeptName(deptName);
        dd.setDeptAddr(deptAddr);
        DeptHandle.addDept(dd);
        request.getRequestDispatcher("/DeptShowServlet").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
